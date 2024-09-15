package com.example.kotlinbasic.Part_1

fun main() {
    val a = 8
    val b = 5

    val max: Int = if (a > b) a else b

    println("Số lớn nhất là $max")

    val number1 = 42341
    val number2 = 62322
    if (number1 > number2) {
        println("Hey")
    } else {
        println("Hello")
    }
}