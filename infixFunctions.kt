fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(5 times "IAHUL!   ")
    
    val pair = "Gustavo" to "Hb20"
    println(pair)
    
    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "Lorena" onto "Fiestinha"
    println(myPair)
    
    val guga = Person("Guga")
    val lorena = Person("Lorena")
    guga Likes lorena
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun Likes(other: Person) { likedPeople.add(other)}
}

