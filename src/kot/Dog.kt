package kot

class Dog {

    var name: String = " "
        get() = field.lowercase().capitalize()
    var age = 0
        set(value) {
            if (value <= 0) {
                ""
            } else {
                field = value
            }
        }
    var weight: Int = 0
        set(value) {
            if (value <= 0) {
                ""
            } else {
                field = value
            }
        }
}