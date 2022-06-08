package StackPackage
// Implementation stack using linked list
class Node(var data: Int,
           var next: Node)

class StackProgram(var last: Node, var count: Int)
{
  def this()
  {
    this(null, 0)
  }
  def size(): Int = count
  def empty(): Boolean =if (count > 0) false else true

  def push(data: Int): Unit = {   // Make a new stack node And set as top
    last = new Node(data, last)
    count += 1
  }

  def pop(): Int = {
    var temp = 0
    if (empty() == false)
    {
      temp = last.data
      last = last.next
      count -= 1
    }
     temp
  }

  def top(): Int = {
    if (empty()==false) last.data
    else 0
  }
}

object Main extends App {
    var stackProgram: StackProgram = new StackProgram()
//   println("Is empty : " + stackProgram.empty())
    stackProgram.push(1)
    stackProgram.push(2)
    stackProgram.push(3)
/*
    println("Last element  : " + stackProgram.top())
    println("Size :" + stackProgram.size())
    println("Is empty : " + stackProgram.empty())
    println("Pop element " + stackProgram.pop())
    println("Last element  : " + stackProgram.top())

 */
}