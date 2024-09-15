package com.example.kotlinbasic.Part_4

fun main(){
    val persion = Persion("luận", 22)
    println("${persion.firstName} - ${persion.age}")
}

class Persion(var firstName : String, var age: Int){

    init {
        firstName = firstName.capitalize()

        println("First Name = $firstName")
        println("Age = $age")
    }
}
