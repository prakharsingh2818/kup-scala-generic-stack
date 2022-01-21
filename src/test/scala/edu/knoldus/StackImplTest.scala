package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec


class StackImplTest extends AnyFlatSpec {

  behavior of "StackImplTest"

  val emptyStack = new StackImpl[Int]()
  val stack = new StackImpl[Int](List(1, 2, 3))

  "top" should "return the last element" in {
    assertResult(1)(stack.top)
  }

  "isEmpty" should "be true" in {
    assert(emptyStack.isEmpty)
  }

  "push" should "add element to the top" in {
    val element = 4
    val updatedStack = new StackImpl[Int](List(1, 2, 3, 4))
    assertResult(updatedStack.printElements)(stack.push(element).printElements)
  }

  "pop" should "remove element from the top" in {
    val updatedStack = new StackImpl[Int](List(1, 2))
    assert(updatedStack.printElements == stack.pop.printElements)
  }
  it should "throw an error for empty stack" in {
    val error = intercept[Exception] {
      emptyStack.pop
    }
    assert(error.getMessage.equals("Empty Stack"))
  }

}
