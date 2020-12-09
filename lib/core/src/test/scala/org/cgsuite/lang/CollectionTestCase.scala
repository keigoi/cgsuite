package org.cgsuite.lang

object CollectionTestCase {

  val instances = Seq(

    CollectionTestCase(
      "[]", "[]",
      exists = "false",
      forall = "true",
      head = "!!empty.head",
      isEmpty = "true",
      max = "!!That `Collection` is empty.",
      mex = "0",
      min = "!!That `Collection` is empty.",
      size = "0",
      tail = "!!empty.tail",
      toList = "[]",
      toSet = "{}"
    ),

    CollectionTestCase(
      "[0,1,3,9,7,5]", "[0,1,3,9,7,5]",
      exists = "true",
      forall = "false",
      head = "0",
      isEmpty = "false",
      max = "9",
      mex = "2",
      min = "0",
      size = "6",
      tail = "[1,3,9,7,5]",
      toList = "[0,1,3,9,7,5]",
      toSet = "{0,1,3,5,7,9}"
    ),

    CollectionTestCase(
      """{3 => "three", 5 => "five", 19 => "nineteen"}""",
      """{3 => "three", 5 => "five", 19 => "nineteen"}""",
      exists = "false",
      forall = "false",
      head = """3 => "three"""",
      isEmpty = "false",
      max = null,
      mex = null,
      min = null,
      size = "3",
      tail = """{5 => "five", 19 => "nineteen"}""",
      toList = """[3 => "three",5 => "five",19 => "nineteen"]""",
      toSet = """{3 => "three",5 => "five",19 => "nineteen"}"""
    )

    // TODO Add more

  )

}

case class CollectionTestCase(
  x: String,
  xOut: String,
  exists: String,
  forall: String,
  head: String,
  isEmpty: String,
  max: String,
  mex: String,
  min: String,
  size: String,
  tail: String,
  toList: String,
  toSet: String
  ) {

  def toTests = Seq(
    (x, xOut),
    (s"($x).Exists(x -> x == 7)", exists),
    (s"($x).ForAll(x -> x == 7)", forall),
    (s"($x).Head", head),
    (s"($x).IsEmpty", isEmpty),
//    (s"($x).Max", max),
//    (s"($x).Mex", mex),
//    (s"($x).Min", min),
    (s"($x).Size", size),
    (s"($x).Tail", tail),
    (s"($x).ToList", toList),
    (s"($x).ToSet", toSet)
  ) map { case (expr, result) => (expr, expr, result) }

}
