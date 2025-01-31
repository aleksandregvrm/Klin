class Person(_firstName: String, _LastName: String) {
    val firstName: String
    val lastName: String
    val quote: String = "gelas gamosaxva zogadad kargi saqmea";

    init{
        this.firstName = _firstName
        this.lastName = _LastName
    }
    fun gelasGamosaxva(){
        println("${this.firstName}, ${this.lastName}, ${this.quote}")
    }
}

interface multitudeOfPersons {
    fun personShow():Unit
    fun declaration(name: String, surname: String):Unit

}
class MultitudeOfPersons:multitudeOfPersons (personClass:Person){
    val onePerson: Person

    init {
        this.onePerson = personClass
    }
    override fun personShow(){
        println(this.onePerson.gelasGamosaxva())
    }

    override fun declaration(name:String, surname:String){
        println(this.onePerson.lastName)
    }
}