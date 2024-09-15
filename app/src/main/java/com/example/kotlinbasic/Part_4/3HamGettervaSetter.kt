package com.example.kotlinbasic.Part_4

fun main (){

    val p = Person()
    p.name = "jack"
    println(p.name)
    println("--------------------")
    val maria = Girl()
    maria.actualAge = 15
    maria.age = 15
    println("Maria: actual age = ${maria.actualAge}")
    println("Maria: pretended age = ${maria.age}")

    val angela = Girl()
    angela.actualAge = 35
    angela.age = 35
    println("Angela: actual age = ${angela.actualAge}")
    println("Angela: pretended age = ${angela.age}")
}

class Person {
    var name: String = "defaultValue"

        get() = field

        set(value) {
            field = value
        }
}

class Girl {
    var age: Int = 0
        get() = field
        set(value) {
            field = if (value < 18)
                18
            else if (value >= 18 && value <= 30)
                value
            else
                value-3
        }

    var actualAge: Int = 0
}