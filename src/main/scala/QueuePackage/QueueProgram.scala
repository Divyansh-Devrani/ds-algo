package QueuePackage
//  Implement queue using linked list
class Node(var data: Int, var next: Node)
{
  def this(value: Int)
  {
    this(value, null)
  }
}

class MyQueue(var head: Node, var tail: Node, var count: Int)
{
  def this()
  {
    this(null, null, 0)
  }
  def size(): Int = count
  def empty(): Boolean =if (count > 0) false else true

  def enqueue(value: Int): Unit = {
    var node: Node = new Node(value)
    if (head == null)
      head = node
    else
      tail.next = node
    count += 1
    tail = node
  }

  def dequeue(): Int = {
    if (head == null)
    {
      println("Queue is Empty")
      return -1
    }
    var temp: Node = head
    head = head.next
    count -= 1
    if (head == null)
      tail = null
    temp.data
  }

  def headElement(): Int = {
    if (head == null)
    {
      println("Queue is Empty")
      return -1
    }
     head.data
  }
}

object Main extends App {
    var task: MyQueue = new MyQueue()
//    println("Is Empty : " + task.empty())
    task.enqueue(1)
    task.enqueue(2)
    task.enqueue(3)
  /*
    println("size : " + task.size())
    println("Head : " + task.headElement())
    println("dequeue : " + task.dequeue())
    println("Head : " + task.headElement())
    println("size : " + task.size())

   */
}