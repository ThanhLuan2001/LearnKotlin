package com.example.kotlinbasic.Part_1

fun main() {

    val a = 5
    val b = 3
    val c = 4

    var result: Boolean

    result = a > b || a < c
    println(result)

    result = a > b && a < c
    println(result)

}