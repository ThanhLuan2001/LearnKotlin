package com.example.kotlinbasic.Part_2

fun main(){
    for (number in 1..10){
        println(number)
    }
    println("1--------------------")
    for (number in 10 downTo 1){
        println(number)
    }
    println("2--------------------")
    for (i in 1..10 step 2){
        println(i)
    }
    println("3--------------------")
    for (i in 10 downTo 1 step 3){
        println(i)
    }
    println("4--------------------")
    var listNumber = arrayListOf(1,2,3,4,5)
    for (item in listNumber){
        println(item)
    }
    println("5--------------------")
    var language = arrayOf("Ruby", "Koltin", "Python", "Java")

    for (item in language.indices) {

        // printing array elements having even index only
        if (item%2 == 0)
            println(language[item])
    }
    println("6--------------------")

    var text= "Kotlin"

    for (letter in text) {
        println(letter)
    }

    println("6--------------------")

    var text2 = "Nguyen Thanh Luan"

    for (item in text2.indices){
        if (item%3==0){
            println(text2[item])
        }
    }
}