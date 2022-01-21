package edu.knoldus

object Tester extends App {
  //val stack = new StackImpl(3)
  val newStack = new StackImpl[Int](List(2, 3, 4))
  //println(stack)
  println(newStack)
  //println(newStack.push(1))
  //println(newStack.pop)
  val result = List(2, 3, 4) == newStack.list
  println(newStack.pop.pop)
  //println(newStack(5))
}
