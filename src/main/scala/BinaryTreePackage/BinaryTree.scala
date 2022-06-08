package BinaryTreePackage

class Node(var data: Int, var left: Node, var right: Node)
{
  def this(data: Int)
  {
    this(data, null, null)
  }
}
class BinaryTree(var root: Node)
{
  def this()
  {
    this(null)
  }
  def inOrder(node: Node): Unit = {
    if (node != null)
    {
      inOrder(node.left)
      print("  " + node.data)
      inOrder(node.right)
    }
  }
  def preOrder(node: Node): Unit = {
    if (node != null)
    {
      print("  " + node.data)
      preOrder(node.left)
      preOrder(node.right)
    }
  }
  def postOrder(node: Node): Unit = {
    if (node != null)
    {
      postOrder(node.left)
      postOrder(node.right)
      print("  " + node.data)
    }
  }
  def tree(arr: Array[Int], size: Int,
           location: Int): Node = {
    if (location >= size)
    {
      return null
    }
    var head: Node = new Node(arr(location))
    head.left = tree(arr, size, (location * 2) + 1)
    head.right = tree(arr, size, (location * 2) + 2)
    head
  }
}
object Main extends App {
    var binarytree: BinaryTree = new BinaryTree()
    var arr: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var size: Int = arr.length
    binarytree.root = binarytree.tree(arr, size, 0)
 //   print("\nIn-order Data   :")
    binarytree.inOrder(binarytree.root)
  //  print("\nPre-order Data  :")
    binarytree.preOrder(binarytree.root)
  //  print("\nPost-order Data :")
    binarytree.postOrder(binarytree.root)
}

