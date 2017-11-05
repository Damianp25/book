fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message)}
    printMessage("helo")

    val sumA = {x: Int, y: Int -> x + y }
    println(sumA(5, 8))

    val sumB : (Int, Int) -> Int = {x,y -> x+y}
    println(sumB(5, 8))
}