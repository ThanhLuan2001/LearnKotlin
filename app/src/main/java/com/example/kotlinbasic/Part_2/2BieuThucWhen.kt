package com.example.kotlinbasic.Part_2

fun main() {

    /*Cho 2 số , nhập vào phép tính để tính kết quả 2 số */

    val a = 10
    val b = 5

    print("Nhập vào một phép tính : ")
    val operator = readlnOrNull()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "phép tính ko hợp lệ"
    }

    println("result = $result")


}