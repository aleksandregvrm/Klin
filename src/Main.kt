
val myName = "hello there kotlin"
val myBirth: Boolean = false
var myString: String? = "asdasda"

var myArr: Array<String> = arrayOf("asda","asdas")
var myList: List<String> = listOf("firstElement","secondElement")

var itteratedList = myList.forEach { list ->
    println(list + 1)
}

fun nothingReturner(name: String, vararg stringol: String):Unit{ // returns nothing
}

fun main() {
    val myArr = arrayOf("sadas","dasdasd","dasdsad")
    nothingReturner("asdas",*myArr)
    println(myName.length)
}



