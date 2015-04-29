package org.cgsuite.lang.parser

import org.antlr.runtime.{ANTLRInputStream, CharStream, CommonTokenStream, ANTLRStringStream}
import java.io.{ByteArrayInputStream, InputStream}


object ParserUtil {

  def parseExpression(str: String) = parse(new ByteArrayInputStream(str.getBytes)) { _.expression }
  def parseStatement(str: String) = parse(new ByteArrayInputStream(str.getBytes)) { _.statement }
  def parseCU(in: InputStream) = parse(in) { _.compilationUnit }

  def charStreamToParser(input: CharStream) = {

    val lexer = new CgsuiteLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new CgsuiteParser(tokens)
    parser.setTreeAdaptor(new CgsuiteTreeAdaptor())
    parser

  }

  private def parse(in: InputStream)(fn: CgsuiteParser => { def getTree(): Object }) = {

    val stream = new ANTLRInputStream(in)
    val lexer = new CgsuiteLexer(stream)
    val tokens = new CommonTokenStream(lexer)
    val parser = new CgsuiteParser(tokens)
    parser.setTreeAdaptor(new CgsuiteTreeAdaptor())

    val tree = fn(parser).getTree.asInstanceOf[CgsuiteTree]

    if (!lexer.getErrors.isEmpty) {
      sys.error(lexer.getErrors.toString)
    } else if (!parser.getErrors.isEmpty) {
      sys.error(parser.getErrors.toString)
    } else {
      tree
    }

  }

}
