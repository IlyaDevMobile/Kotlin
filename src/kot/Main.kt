package kot


fun main() {
  val student1 = Student("Иван", "Иванов","123")
  val student2 = Student("Иван", "Иванов","123")
  println(student1)
  println(student2)
  println(student1.hashCode())
  println(student2.hashCode())
  println(student1 == student2)
  println(student1 === student2)
}






