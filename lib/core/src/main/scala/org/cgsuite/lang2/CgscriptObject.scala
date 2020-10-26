package org.cgsuite.lang2

import org.cgsuite.output.{Output, OutputTarget, StyledTextOutput}

trait CgscriptObject extends OutputTarget {

  def _class: CgscriptClass

  override def toOutput: Output = new StyledTextOutput(toString)

}

trait SystemExtensionObject extends CgscriptObject {

  def _instance: Any

  override def toOutput: org.cgsuite.output.Output = org.cgsuite.lang2.CgscriptClass.instanceToOutput(_instance)

}
