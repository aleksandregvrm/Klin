
val myName = "hello there kotlin"
val myBirth: Boolean = false
var myString: String? = "asdasda"

var myArr: Array<String> = arrayOf("asda","asdas")
var myList: List<String> = listOf("firstElement","secondElement")

var itteratedList = myList.forEach { list ->
    println(list + 1)
}

fun nothingReturner():Unit{ // returns nothing
}

fun main() {
    itteratedList
    val person = Person(_firstName = "gela", _LastName = "khasia")
    person.gelasGamosaxva()
    val multitudePersons = MultitudeOfPersons(personClass = person)
    multitudePersons.personShow()
}



