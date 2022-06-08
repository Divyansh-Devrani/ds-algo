package LinkedListPackage   // taken help from other place

trait ListTrait[value] {
  def insert(index:Int,data:value):Unit
  def remove(index:Int):value
}

class LinkedListProgram[value] extends ListTrait[value]{
   private class Node(var data: value,var next: Node)
   private var head:Node =null

  def insert(index:Int,data:value):Unit={
    require(index >=0)
    if(index == 0)
     head = new Node(data,head)
    else {
      var a = head
      for(i<-0 until index-1) {
        a=a.next
        a.next=new Node(data,a.next)
      }
    }
  }

  def remove(index:Int):value={
    require(index >=0)
    if(index == 0) {
    val a=head.data
      head=head.next
      a
    }
    else {
      var a = head
      for (i <- 0 until index - 1) a = a.next
      val b = a.next.data
      a.next=a.next.next
      b
    }
  }
}

