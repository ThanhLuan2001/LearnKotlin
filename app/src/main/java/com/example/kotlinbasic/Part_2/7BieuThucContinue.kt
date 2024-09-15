package com.example.kotlinbasic.Part_2

fun main(){
    for (i in 1..5){
        println("$i nằm trong khoảng 1..5")
        if (i>1 && i<5){
            continue
        }
        println("$i không thỏa mãn điều kiện")

    }
}