package edu.knoldus


class StackImpl[A](val list: List[A]) extends Stack[A] {
  def this(element: A) = {
    this(List(element))
  }

  def this() = {
    this(Nil)
  }

  override def push[B >: A](element: B): Stack[B] = {
    if (list.isEmpty) new StackImpl[B](element)
    else new StackImpl(list :+ element)
  }

  override def pop[B >: A]: Stack[B] = {
    if (this.isEmpty) throw new Exception("Empty Stack")
    else {
      list match {
        case Nil => new StackImpl[B](Nil)
        case _ => new StackImpl[B](list.take(list.size - 1))
      }
    }
  }

  override def top: A = list.head

  override def isEmpty: Boolean = list.isEmpty

  def apply(list: List[A]): Stack[A] = new StackImpl[A](this.list ::: list)

  def apply(element: A): Stack[A] = new StackImpl[A](this.list :+ element)

  def apply(): Stack[A] = new StackImpl[A](Nil)

  override def printElements: String = list.mkString("--->")

  override def toString: String = list.toString
}
