package org.cgsuite.lang

import org.cgsuite.core._
import org.cgsuite.lang.parser.ParserUtil

object Loader {

  val systemClasses: Map[String, Option[Class[_]]] = Map(
    "cgsuite.lang.Object" -> None,
    "cgsuite.lang.Class" -> None,
    "game.Game" -> Some(classOf[Game]),
    "game.Integer" -> Some(classOf[Integer]),
    "game.Player" -> Some(classOf[Player])
  )

  def declareSystemResources() {

    systemClasses foreach { case (name, scalaClass) =>
      declareSystemClass(name, scalaClass)
    }

  }

  private def declareSystemClass(name: String, scalaClass: Option[Class[_]]) {

    val path = name.replace('.', '/')
    val url = getClass.getResource(s"resources/$path.cgs")
    val components = name.split("\\.").toSeq
    val pkg = Package.root.lookup(components.dropRight(1)).getOrElse {
      sys.error("Cannot find package: " + components.dropRight(1))
    }
    pkg.declareClass(components.last, url, scalaClass)

  }

}
