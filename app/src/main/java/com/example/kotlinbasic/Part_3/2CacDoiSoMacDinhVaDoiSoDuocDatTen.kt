package com.example.kotlinbasic.Part_3

fun main(){
    println("Không truyền kết quả, lấy giá trị mặc định")
    disPlay()
    println("------------------------------------------")
    println("Truyền 1 giá trị")
    disPlay("b")
    println("------------------------------------------")
    println("Đối số được đặt tên")
    disPlay(number = 20)
    println("------------------------------------------")
    println("Truyền giá trị đầy đủ")
    disPlay("c",5)
    println("------------------------------------------")
}


fun disPlay(text: String = "a", number: Int = 10){
    for (i in 1..number){
        print(" $text")
    }
    println()
}