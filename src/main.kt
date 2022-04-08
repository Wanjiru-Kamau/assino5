fun main() {
    oddNumbers()
    var name = names(arrayOf("Maureen", "Chris", "Queen", "Kamau", "Agnes", "Cate"))
    println(name)
    party(12)
    party(4)
    party(120)
    numbers()
}
fun oddNumbers() {
    for (number in 1..100)
        if (number % 2 !== 0)
            println(number)
}

fun names(students: Array<String>): Int {
    var number = 0
    students.forEach { student ->
        if (student.length > 5)
            number++
    }
    return number
}

fun party(age: Int) {
    if (age < 6) {
        println("A glass of milk")
    } else if (age < 15 && age > 6) {
        println("A bottle of fanta orange")
    } else
        println("A bottle of cocacola")
}


fun numbers() {
    for (nums in 1..100)
        if (nums % 3 == 0 && nums % 5 == 0)
            println("Fizbuzz")
        else if (nums % 3 == 0)
            println("Fizz")
        else if (nums % 5 == 0)
            println("Buzz")
        else
            println(nums)
}