package com.example.kotlinbasic.Part_3

fun main() {
    val number = 4

    val result: Long = factorial(number)
    println("Factorial of $number = $result")
}

fun factorial(n: Int): Long {
    return if (n == 1) {
        n.toLong()
    } else {
        n*factorial(n - 1)
    }
}
/*
factorial(4)              // 1st function call. Argument: 4
4*factorial(3)            // 2nd function call. Argument: 3
4*(3*factorial(2))        // 3rd function call. Argument: 2
4*(3*(2*factorial(1)))    // 4th function call. Argument: 1
4*(3*(2*1))
24
*/