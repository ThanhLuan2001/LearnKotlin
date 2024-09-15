package com.example.kotlinbasic.Part_4

fun main() {
    val mathTeacher = MathTeacher(22, "Luan")
    mathTeacher.teachMaths()

    println()

    val footballer = Footballer(29, "Christiano")
    footballer.playFootball()
}

open class Personn(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }
}

class MathTeacher(age: Int, name: String): Personn(age, name) {

    fun teachMaths() {
        println("I teach in primary school.")
    }
}

class Footballer(age: Int, name: String): Personn(age, name) {
    fun playFootball() {
        println("I play for LA Galaxy.")
    }
}
