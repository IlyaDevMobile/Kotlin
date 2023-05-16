package kot

class Address(val city: String,val street: String,val numberOfHouse: Int ){

    fun copy( city: String = this.city ,street: String = this.street,numberOfHouse: Int = this.numberOfHouse  ) : Address {
        return Address(city,street,numberOfHouse)

    }


    operator fun component1() {

    }

    operator fun component2() {

    }

    operator fun component3() {

    }
}