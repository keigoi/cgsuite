package org.cgsuite.lang2

import org.antlr.runtime.tree.Tree

import scala.collection.mutable

object AssignmentDeclType extends Enumeration {
  val Ordinary, VarDecl, ClassVarDecl = Value
}

case class AssignToNode(tree: Tree, idNode: IdentifierNode, expr: EvalNode, declType: AssignmentDeclType.Value) extends EvalNode {

  val varName = idNode.id.name

  override def elaborateImpl(domain: ElaborationDomain) = {

    val exprType = expr.ensureElaborated(domain)

    // If we're package-external (Worksheet/REPL scope) and scopeStack has size one (we're not
    // in any nested subscope), then we treat idNode as a dynamic var.
    if (declType == AssignmentDeclType.VarDecl || domain.isToplevelWorksheet) {
      domain.insertId(idNode.id, exprType)
    }

    exprType

  }

  override def toScalaCode(context: CompileContext) = {

    val exprCode = expr.toScalaCode(context)
    declType match {
      case AssignmentDeclType.VarDecl | AssignmentDeclType.ClassVarDecl =>
        s"var $varName: ${elaboratedType.scalaTypeName} = $exprCode; $varName;"
      case AssignmentDeclType.Ordinary =>
        s"{ $varName = $exprCode; $varName }"
    }

  }

  override def collectMentionedClasses(classes: mutable.HashSet[CgscriptClass]): Unit = {
    addTypeToClasses(classes, elaboratedType)
    expr.collectMentionedClasses(classes)
  }

  // TODO Catch illegal assignment to temporary loop variable (during elaboration)
  // TODO Catch illegal assignment to immutable object member (during elaboration)
  // TODO Catch illegal assignment to constant
  override val children = Seq(idNode, expr)

  def toNodeStringPrec(enclosingPrecedence: Int) = {
    val varStr = if (declType != AssignmentDeclType.Ordinary) "var " else ""
    val assignStr = s"$varStr${idNode.toNodeString} := ${expr.toNodeStringPrec(OperatorPrecedence.Assign)}"
    if (OperatorPrecedence.Assign <= enclosingPrecedence)
      assignStr
    else
      s"($assignStr)"
  }

}
