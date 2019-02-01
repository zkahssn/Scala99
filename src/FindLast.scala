
import scala.collection.mutable.ListBuffer

class FindLast {

  val y: List[Int] = List(1, 2, 3, 2, 1);
  val z: List[Int] = List(1, 1);
  val b: List[Int] = List(2, 3);
  val c: List[Int] = List(5, 8);
  val a: List[List[Int]] = List(z, b);
  val toFlatten: List[Seq[Int]] = List(z, b, c);
  var duplicate: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  //1
  def findLast(list: List[Int]): Int = {
    return list.reverse.head
  }

  //2
  def findPenultimate(list: List[Int]): Int = {
    return list.reverse.tail.head
  }

  //3 not complete
  //4
  def numOfElements(list: List[Int]): Int = {
    return list.length
  }

  //5
  def reverseList(list: List[Int]): List[Int] = {
    return list.reverse
  }

  //6
  def isPalindrome(list: List[Int]): Boolean = {
    if (list == list.reverse) {
      return true
    }
    return false
  }

  //7
  def flattenList(flatten: List[Seq[Int]]): List[Int] = {
    return flatten.flatten
  }

  //8
  def compress(duplicate: List[Symbol]): List[Symbol] = {
    var distinct: ListBuffer[Symbol] = ListBuffer(duplicate.head)
    for (d <- duplicate) {
      if (!distinct.last.equals(d)) {
        distinct += d
      }
    }
    return distinct.toList
  }

  //9
  def pack(duplicate: List[Symbol]): List[List[Symbol]] = {
    val distinctOrder: List[Symbol] = compress(duplicate)
    val packedOrders: ListBuffer[List[Symbol]] = ListBuffer()
    val lastElement: Int = duplicate.lastIndexOf(duplicate.last)
    var repeat: ListBuffer[Symbol] = ListBuffer()
    duplicate.zipWithIndex.foreach { case (x, y) =>
      if (y.equals(0)) {
        repeat += x
      }
      else if (x.equals(repeat.last)) {
        repeat += x
      }
      if (!x.equals(repeat.last) || (y == (lastElement))) {
        packedOrders.append(repeat.toList)
        repeat = ListBuffer(x)
      }
    }

    return packedOrders.toList
  }

  //10
  def encode(encodeList: List[Symbol]): List[(Int, Symbol)] = {
    val packedList = pack(encodeList)
    var encodedList: ListBuffer[(Int, Symbol)] = ListBuffer()
    packedList.foreach(item => {
      val itemSize: Int = item.size
      encodedList.append((itemSize, item.last))
    }
    )
    return encodedList.toList

  }

  //11
  def encodeDirect(duplicates: List[Symbol]): List[Any] = {
    val packedList = pack(duplicates)
    var encodedList: ListBuffer[Any] = ListBuffer()
    packedList.foreach(item => {
      if (item.size == 1) {
        encodedList.append(item.last)
      }
      else {
        encodedList.append((item.size, item.last))
      }

    })
    return encodedList.toList
  }

  //12

  def decode(encoded: List[(Int, Symbol)]): List[Symbol] = {
    var decodedList: ListBuffer[List[Symbol]] = ListBuffer();
    encoded.foreach(item => {
      val currentList: List[Symbol] = List.fill(item._1)(item._2)
      decodedList += List.fill(item._1)(item._2)
    })


    return decodedList.toList.flatten
  }

  //13
  def directEncode(list: List[Any]): List[(Int, Symbol)] = {

    list.foreach(item => {

    })

    return null
  }


}
