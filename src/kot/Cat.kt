package kot

class Cat(val name: String, val age: Int, val weight: Float = 0f ) {

    val isOld = age >= 12

    fun printInfo() {
        println("Кличка: $name Возраст: $age Вес: $weight")
    }
}