import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Simple Calculator App")
    println("Enter the first number:")
    val num1 = scanner.nextDouble()

    println("Enter the operator (+, -, *, /):")
    val operator = scanner.next()

    println("Enter the second number:")
    val num2 = scanner.nextDouble()

    val result = calculate(num1, num2, operator)
    println("Result: $result")
}

fun calculate(num1: Double, num2: Double, operator: String): Double {
    return when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> throw IllegalArgumentException("Invalid operator")
    }
}
