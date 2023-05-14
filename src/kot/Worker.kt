package kot

import java.util.Calendar

class Worker(val name: String, val post : String, val year: Int) {

    val experience: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - year

    fun printWork(){
        println()
    }
}