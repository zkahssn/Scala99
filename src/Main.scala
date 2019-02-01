object Main extends App {
  val x: List[Int] = List(1, 1, 2, 3, 5, 8);
  val y: List[Int] = List(1, 2, 3, 2, 1);
  val z: List[Int] = List(1, 1);
  val b: List[Int] = List(2,3);
  val c: List[Int] = List(5,8);
  val toFlatten : List[Seq[Int]] = List(z,b,c);
  var duplicate : List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)


  val listClass = new FindLast;
  println(listClass.findLast(x))
  println(listClass.findPenultimate(x))
  println(listClass.numOfElements(x))
  println(listClass.reverseList(x))
  println(listClass.isPalindrome(y))
  println(listClass.flattenList(toFlatten))
  println(listClass.compress(duplicate))
  println(listClass.pack(duplicate))
  println(listClass.encode(duplicate))
  println(listClass.encodeDirect(duplicate))
  println(listClass.decode(listClass.encode(duplicate)))

}