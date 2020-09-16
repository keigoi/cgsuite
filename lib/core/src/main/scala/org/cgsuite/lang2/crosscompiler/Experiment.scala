package org.cgsuite.lang2.crosscompiler

import ch.qos.logback.classic.{Level, Logger}
import org.cgsuite.core.{DyadicRationalNumber, RationalNumber}
import org.cgsuite.lang2.Node.treeToRichTree
import org.cgsuite.lang2.parser.ParserUtil
import org.cgsuite.lang2.{CgscriptClass, CgscriptPackage, CompileContext, ElaborationDomain, StatementSequenceNode}
import org.slf4j.LoggerFactory

import scala.language.implicitConversions
import scala.tools.nsc.Settings
import scala.tools.nsc.interpreter.IMain

object Experiment {

  val settings = new Settings
  settings.usejavacp.value = true
  settings.deprecation.value = true

  val eval = new IMain(settings)
  val domain = new ElaborationDomain(CgscriptPackage.root, None)
  eval.interpret("import org.cgsuite.dsl._")
  eval.interpret("import org.cgsuite.lang2.crosscompiler.ExperimentImplicits._")

  def testCC(str: String): Unit = {
    LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME).asInstanceOf[Logger].setLevel(Level.DEBUG)
    CgscriptClass.Object.ensureDeclared()
    val tree = ParserUtil.parseScript(str)
    val node = StatementSequenceNode(tree.children.head, topLevel = true)
    node.ensureElaborated(domain)
    node.mentionedClasses foreach { _.ensureCompiled(eval) }
    Thread.sleep(50)
    println(node.elaboratedType)
    println(node.mentionedClasses)
    val code = node.toScalaCodeWithVarDecls(new CompileContext())
    code foreach println
    code foreach { case (line, varName) => eval.interpret(line) }
  }

}

object ExperimentImplicits extends ExperimentLowPriorityImplicits {

  // TODO Intelligent type conversion with good error messages

  implicit def rationalToDyadicRational(x: RationalNumber): DyadicRationalNumber = x.asInstanceOf[DyadicRationalNumber]

}

trait ExperimentLowPriorityImplicits {

  implicit def rationalToInteger(x: RationalNumber): org.cgsuite.core.Integer = x.asInstanceOf[org.cgsuite.core.Integer]

}
