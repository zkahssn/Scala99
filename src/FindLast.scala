class FindLast {

  val x: List[Int] = List(1, 1, 2, 3, 5, 8);
  val y: List[Int] = List(1, 2, 3, 2, 1);

  def findLast(): Int = {
    return x.reverse.head
  }

  def findPenultimate(): Int = {
    return x.reverse.tail.head
  }

  def numOfElements(): Int = {
    return x.length
  }

  def reverseList(): List[Int] = {
    return x.reverse
  }

  def isPalindrome(): Boolean = {
  if(y == y.reverse){
    return true
  }
    return  false
  }
}
