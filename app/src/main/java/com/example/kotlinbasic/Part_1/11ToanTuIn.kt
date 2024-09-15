package com.example.kotlinbasic.Part_1

fun main() {
    val numbers = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    if (6 in numbers) {
        println("6 có trong mảng")
    } else {
        println("6 không có trong mảng")
    }
}