object Main extends App {
  val listClass = new FindLast;
  listClass.findLast();
  println(listClass.findLast())
  println(listClass.findPenultimate())
  println(listClass.numOfElements())
  println(listClass.reverseList())
  print(listClass.isPalindrome())
}