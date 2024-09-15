package com.example.kotlinbasic.Part_1

fun main() {
    val number1 = 15.5
    val number2 = 7.5

    var result: Double = 0.0

    result = number1.plus(number2)
    println("number1 + number2 = $result")

    result = number1.minus(number2)
    println("number1 - number2 = $result")

    result = number1.times(number2)
    println("number1 * number2 = $result")

    result = number1.div(number2)
    println("number1 / number2 = $result")

    result = number1.mod(number2)
    println("number1 % number2 = $result")

    val name1: String = "Hello"
    val name2: String = " Every one"
    val name3: String = ", My Name is Luan"
    val nameAll = name1.plus(name2).plus(name3)

    println(nameAll)
}