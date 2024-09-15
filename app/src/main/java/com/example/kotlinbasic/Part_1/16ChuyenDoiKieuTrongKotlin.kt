package com.example.kotlinbasic.Part_1

fun main() {
    val number1: Int = 9999999
    val number2 = number1.toLong() // Chuyển đổi kiểu Int sang kiểu Long
    println(number2)
    val number3 = number1.toByte()
    println(number3) // output : 127, bởi vì kiểu dữ liệu Byte có độ lớn từ -128 đến 127 nên khi ép kiểu sẽ bị
    // cắt bớt giá trị từ 9999999 xuống còn 127
    val number4 = number1.toShort()
    println(number4) // tương tự trường hợp 3

    val number5 = number1.toDouble()
    println(number5)


}