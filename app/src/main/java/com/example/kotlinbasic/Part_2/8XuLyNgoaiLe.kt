package com.example.kotlinbasic.Part_2

fun main(){
    try{
        println("Nhập tuổi : ")
        val age = readln().toInt()
        println("Tuổi vừa nhập : $age")
    }catch (e : Exception){
        print("Vui lòng nhập số")
    }

    println("----------------------")
    try {
        // Thử thực hiện một hoạt động có thể ném ra ngoại lệ
        val result = divide(10, 0)
        println("Result: $result")
    } catch (e: Exception) {
        // Bắt ngoại lệ khi chia cho 0
        println("Error: ${e.message}")
    } finally {
        // Mã này sẽ được thực hiện dù có ngoại lệ hay không
        println("Finally block is always executed.")
    }
}

fun divide(a: Int, b: Int): Int {
    return a / b
}
