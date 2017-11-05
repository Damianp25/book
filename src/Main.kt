fun main(args: Array<String>) {
    val t1 = MathTeacher(26, "Damian")
    t1.teachMaths()
    t1.walk()

    println()

    val f1 = Fotballer(33, "Zbyszek", 44)
    f1.playFootball()
    f1.walk()
}

open class Person(age: Int, name: String) {
    init {
        println("Mam na imię $name.")
        println("Mój wiek to $age.")
    }

    open fun walk() {
        println("Idę")
    }
}

class MathTeacher(age: Int, name: String): Person(age, name) {
    fun teachMaths() {
        println("Uczę matematyki.")
    }
}

class Fotballer(age: Int, name: String, private val mecze:Int): Person(age, name) {
    init {
        println("Mecze $mecze.")
    }
    fun playFootball() {
        println("Gram w piłkę nożną")
        println("Rozegrałem $mecze meczy.")
    }

    override fun walk() {
        println("Idę sobie pograć w piłkę")
    }
}
