#! /bin/bash

# Create a read-only disk image of the contents of a folder
#
# Usage: make-diskimage <image_file>
#                       <src_folder>
#                       <volume_name>
#                       <applescript>
#                       <artpath>
#                       <eula_resource_file>

set -e;

function pure_version() {
  echo '1.0.0.2'
}

function version() {
  echo "create-dmg $(pure_version)"
}

function usage() {
  version
  echo "Creates a fancy DMG file."
  echo "Usage:  $(basename $0) options... image.dmg source_folder"
  echo "All contents of source_folder will be copied into the disk image."
  echo "Options:"
  echo "  --volname name"
  echo "      set volume name (displayed in the Finder sidebar and window title)"
  echo "  --background pic.png"
  echo "      set folder background image (provide png, gif, jpg)"
  echo "  --window-pos x y"
  echo "      set position the folder window"
  echo "  --window-size width height"
  echo "      set size of the folder window"
  echo "  --icon-size icon_size"
  echo "      set window icons size (up to 128)"
  echo "  --icon file_name x y"
  echo "      set position of the file's icon"
  echo "  --custom-icon file_name custom_icon_or_sample_file x y"
  echo "      set position and custom icon"
  echo "  --version         show tool version number"
  echo "  -h, --help        display this help"
  exit 0
}

WINX=10
WINY=60
WINW=600
WINH=400
ICON_SIZE=128

while test "${1:0:1}" = "-"; do
  case $1 in
    --volname)
      VOLUME_NAME="$2"
      shift; shift;;
    --background)
      BACKGROUND_FILE="$2"
      BACKGROUND_FILE_NAME="$(basename $BACKGROUND_FILE)"
      BACKGROUND_CLAUSE="set background picture of opts to file \".background:$BACKGROUND_FILE_NAME\""
      shift; shift;;
    --icon-size)
      ICON_SIZE="$2"
      shift; shift;;
    --window-pos)
      WINX=$2; WINY=$3
      shift; shift; shift;;
    --window-size)
      WINW=$2; WINH=$3
      shift; shift; shift;;
    --icon)
      POSITION_CLAUSE="${POSITION_CLAUSE}set position of item \"$2\" to {$3, $4}
"
      shift; shift; shift; shift;;
    --custom-icon)
      shift; shift; shift; shift; shift;;
    -h | --help)
      usage;;
    --version)
      version; exit 0;;
    --pure-version)
      pure_version; exit 0;;
    -*)
      echo "Unknown option $1. Run with --help for help."
      exit 1;;
  esac
done

test -z "$2" && {
  echo "Not enough arguments. Invoke with --help for help."
  exit 1
}

DMG_PATH="$1"
DMG_DIRNAME="$(dirname "$DMG_PATH")"
DMG_DIR="$(cd $DMG_DIRNAME > /dev/null; pwd)"
DMG_NAME="$(basename "$DMG_PATH")"
DMG_TEMP_NAME="$DMG_DIR/rw.${DMG_NAME}"
SRC_FOLDER="$(cd "$2" > /dev/null; pwd)"
test -z "$VOLUME_NAME" && VOLUME_NAME="$(basename "$DMG_PATH" .dmg)"

AUX_PATH="$(cd "$(dirname $0)"; pwd)/support"

test -d "$AUX_PATH" || {
  echo "Cannot find support directory: $AUX_PATH"
  exit 1
}

# Create the image
echo "Creating disk image..."
test -f "${DMG_TEMP_NAME}" && rm -f "${DMG_TEMP_NAME}"
hdiutil create -srcfolder "$SRC_FOLDER" -volname "${VOLUME_NAME}" -fs HFS+ -fsargs "-c c=64,a=16,e=16" -format UDRW -size 500m "${DMG_TEMP_NAME}"

# mount it
echo "Mounting disk image..."
MOUNT_DIR="/Volumes/${VOLUME_NAME}"
echo "Mount directory: $MOUNT_DIR"
DEV_NAME=$(hdiutil attach -readwrite -noverify -noautoopen "${DMG_TEMP_NAME}" | egrep '^/dev/' | sed 1q | awk '{print $1}')
echo "Device name:     $DEV_NAME"

#cp RightDS_Store "/Volumes/${VOLUME_NAME}/.DS_Store"

if ! test -z "$BACKGROUND_FILE"; then
  echo "Copying background file..."
  test -d "$MOUNT_DIR/.background" || mkdir "$MOUNT_DIR/.background"
  cp "$BACKGROUND_FILE" "$MOUNT_DIR/.background/$BACKGROUND_FILE_NAME"
fi

sleep 3
# run applescript
APPLESCRIPT=$(mktemp -t createdmg)
cat "$AUX_PATH/template.applescript" | sed -e "s/WINX/$WINX/g" -e "s/WINY/$WINY/g" -e "s/WINW/$WINW/g" -e "s/WINH/$WINH/g" -e "s/BACKGROUND_CLAUSE/$BACKGROUND_CLAUSE/g" -e "s/ICON_SIZE/$ICON_SIZE/g" | perl -pe  "s/POSITION_CLAUSE/$POSITION_CLAUSE/g" >"$APPLESCRIPT"

echo "Running Applescript: osascript \"${APPLESCRIPT}\" process_disk_image \"${VOLUME_NAME}\""
"osascript" "${APPLESCRIPT}" process_disk_image "${VOLUME_NAME}" || true
echo "Done running the applescript..."
sleep 4

# make sure it's not world writeable
echo "Fixing permissions..."
chmod -Rf go-w "${MOUNT_DIR}" || true
echo "Done fixing permissions."

# make the top window open itself on mount:
if [ -x /usr/local/bin/openUp ]; then
    echo "Applying openUp..."
    /usr/local/bin/openUp "${MOUNT_DIR}"
fi

# unmount
echo "Unmounting disk image..."
hdiutil detach "${DEV_NAME}"

# compress image
echo "Compressing disk image..."
hdiutil convert "${DMG_TEMP_NAME}" -format UDZO -imagekey zlib-level=9 -o "${DMG_DIR}/${DMG_NAME}"
rm -f "${DMG_TEMP_NAME}"

# adding EULA resources
if [ ! -z "${EULA_RSRC}" -a "${EULA_RSRC}" != "-null-" ]; then
        echo "adding EULA resources"
        hdiutil unflatten "${DMG_DIR}/${DMG_NAME}"
        /Developer/Tools/ResMerger -a "${EULA_RSRC}" -o "${DMG_DIR}/${DMG_NAME}"
        hdiutil flatten "${DMG_DIR}/${DMG_NAME}"
fi

echo "Disk image done"
exit 0
