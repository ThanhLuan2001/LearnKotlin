package com.example.kotlinbasic.Part_2

fun main(){
    var number : Int
    do {
        println("Nhập vào một số trong khoảng từ 0 đến 10")
        number = readln().toInt()

    }while (number !in 0..10)
    println("Đã nhập số hợp lệ")
}