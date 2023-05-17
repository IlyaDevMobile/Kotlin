package kot

fun main() {
  val car: Transport = Car()
  val bicycle: Transport = Bicyclist()
  if (car !is Car) return
    car.name = "Машина 2"
  println(car.name)

}




