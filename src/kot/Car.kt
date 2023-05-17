package kot

class Car(override var name: String = "Машина"): Transport(name) {
    override fun drive() {
        println("Едет $name")
    }
    fun startEngine() : Boolean{
        println("Запуск двигателя...")
        return true
    }
}