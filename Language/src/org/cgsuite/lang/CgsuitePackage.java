/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cgsuite.lang;

import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.filesystems.LocalFileSystem;

/**
 *
 * @author asiegel
 */
public class CgsuitePackage implements FileChangeListener
{
    public final static CgsuitePackage ROOT_PACKAGE = new CgsuitePackage("");
    public final static List<CgsuitePackage> ROOT_IMPORT = Collections.singletonList(ROOT_PACKAGE);
    
    private final static Map<String,CgsuitePackage> PACKAGE_LOOKUP = new HashMap<String,CgsuitePackage>();

    static
    {
        PACKAGE_LOOKUP.put("", ROOT_PACKAGE);
        try
        {
            ROOT_PACKAGE.addFolder(new File("C:/Users/asiegel/Documents/NetBeansProjects/CGSuite/cglib/"));
        }
        catch (IOException exc)
        {
            throw new RuntimeException(exc);
        }
    }

    private String packageName;
    private List<FileObject> folders;
    private Map<String,CgsuitePackage> subpackages;
    private Map<String,CgsuiteClass> classes;

    public CgsuitePackage(String packageName)
    {
        this.packageName = packageName;
        this.folders = new ArrayList<FileObject>();
        this.subpackages = new HashMap<String,CgsuitePackage>();
        this.classes = new HashMap<String,CgsuiteClass>();
    }

    public void addFolder(File file) throws IOException
    {
        try
        {
            LocalFileSystem fs = new LocalFileSystem();
            fs.setRootDirectory(file);
            addFolder(fs.getRoot());
        }
        catch (PropertyVetoException exc)
        {
            throw new RuntimeException(exc);
        }
    }

    public void addFolder(FileObject folder)
    {
        if (this.folders.contains(folder))
            return;

        this.folders.add(folder);
        folder.addFileChangeListener(this);

        for (FileObject fo : folder.getChildren())
        {
            if (fo.isFolder())
            {
                addSubpackage(fo);
            }
            else if ("text/x-cgscript".equals(fo.getMIMEType()))
            {
                addClass(fo);
            }
        }
    }

    private void addSubpackage(FileObject node)
    {
        String subpackageName = packageName + (packageName.isEmpty() ? "" : ".") + node.getName();
        if (!PACKAGE_LOOKUP.containsKey(subpackageName))
            PACKAGE_LOOKUP.put(subpackageName, new CgsuitePackage(subpackageName));
        PACKAGE_LOOKUP.get(subpackageName).addFolder(node);
    }

    private void addClass(FileObject node)
    {
        if (classes.containsKey(node.getName()))
        {
            classes.get(node.getName()).setFileObject(node, this);
        }
        else if ("Object".equals(node.getName()))
        {
            CgsuiteClass.OBJECT.setFileObject(node, this);
            classes.put("Object", CgsuiteClass.OBJECT);
        }
        else if ("Class".equals(node.getName()))
        {
            CgsuiteClass.CLASS.setFileObject(node, this);
            classes.put("Class", CgsuiteClass.CLASS);
        }
        else
        {
            classes.put(node.getName(), new CgsuiteClass(node, this));
        }
    }

    public static CgsuiteClass forceLookupClass(String name)
    {
        return forceLookupClass(name, ROOT_IMPORT);
    }

    public static CgsuiteClass forceLookupClass(String name, List<CgsuitePackage> packages)
    {
        CgsuiteClass type = lookupClass(name, packages);
        if (type == null)
        {
            throw new CgsuiteException("Class not found: " + name);
        }
        return type;
    }

    public static CgsuiteClass lookupClass(String name, List<CgsuitePackage> packages) throws CgsuiteException
    {
        CgsuiteClass type = null;

        for (CgsuitePackage pkg : packages)
        {
            CgsuiteClass t = pkg.lookupClassInPackage(name);
            if (t != null)
            {
                if (type != null)
                    throw new CgsuiteException("Ambiguous class name: " + name);
                type = t;
            }
        }

        return type;
    }

    public static CgsuitePackage getRootPackage()
    {
        return ROOT_PACKAGE;
    }

    public static CgsuitePackage lookupPackage(String packageName)
    {
        return PACKAGE_LOOKUP.get(packageName);
    }

    public static void refreshAll()
    {
        for (FileObject fo : ROOT_PACKAGE.folders)
        {
            fo.refresh();
        }
    }

    public CgsuiteClass forceLookupClassInPackage(String name)
    {
        CgsuiteClass type = lookupClassInPackage(name);
        if (type == null)
        {
            throw new CgsuiteException("Class not found: " + name);
        }
        return type;
    }

    public CgsuiteClass lookupClassInPackage(String name)
    {
        return classes.get(name);
    }

    public String getName()
    {
        return packageName;
    }

    public String toString()
    {
        return "Package[" + packageName + "]";
    }

    @Override
    public void fileFolderCreated(FileEvent fe)
    {
        addSubpackage(fe.getFile());
    }

    @Override
    public void fileDataCreated(FileEvent fe)
    {
        if ("text/x-cgscript".equals(fe.getFile().getMIMEType()))
        {
            addClass(fe.getFile());
        }
    }

    @Override
    public void fileChanged(FileEvent fe)
    {
    }

    @Override
    public void fileDeleted(FileEvent fe)
    {
        // XXX Implement
    }

    @Override
    public void fileRenamed(FileRenameEvent fre)
    {
        // XXX Implement
    }

    @Override
    public void fileAttributeChanged(FileAttributeEvent fae)
    {
    }
}
