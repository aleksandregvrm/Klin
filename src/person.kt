open class Person(_firstName: String, _LastName: String) {
    val firstName: String
    val lastName: String
    val quote: String = "gelas gamosaxva zogadad kargi saqmea";
    val quoter: String? = null

    init{
        this.firstName = _firstName
        this.lastName = _LastName
    }
    open fun displayName(){
        (quoter as String).uppercase()
        println("${this.firstName}, ${this.lastName}, ${this.quote}")
    }
}

interface multitudeOfPersons {
    val onePerson:Person
    val listOfPersons: List<String>
    val personMap: List<Map<String, String>>
    fun personShow():Unit
    fun declaration(name: String, surname: String):Unit

}
class MultitudeOfPersons:Person("gela","donadze") {
    val onePerson: Person = Person("hello","there")
    val listOfPersons: List<String> = listOf("asda","dasda")
    val personMap: List<Map<String,String>> =  listOf(mapOf("asdfas" to "dasda"))

    fun personShow(){
        println(this.onePerson.displayName())
    }

    override fun displayName(){

    }

    fun gelasGamosaxva(name:String, surname:String){
        println(this.onePerson.lastName)
        println()
    }
    fun greatThings(){
        println("great thing are going to happen")
    }
}