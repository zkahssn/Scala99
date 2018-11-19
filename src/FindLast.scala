 class FindLast {

val x: List[Int] = List(1, 1, 2, 3, 5, 8);

def findLast():Int={
  return x.reverse.head
}

def  findPenultimate():Int={
return x.reverse.tail.head
}

}
