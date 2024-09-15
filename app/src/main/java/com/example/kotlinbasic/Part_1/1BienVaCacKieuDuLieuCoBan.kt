package com.example.kotlinbasic.Part_1

fun main() {
    //Kiểu dữ liệu Byte có thể chứa các giá trị từ -128 đến 127
    var range: Byte = -128

    //Kiểu dữ liệu Short có thể có các giá trị từ -32768 đến 32767
    var short: Short = -32768

    //Kiểu dữ liệu Int có thể có các giá trị từ -2^31 đến 2^31-1
    val score: Int = 10000000

    /* Lưu ý :Nếu bạn gán một số nguyên trong khoảng từ -2^31 đến 2^31-1 cho một biến mà không chỉ định
     rõ kiểu dữ liệu của nó,mặc định biến đó sẽ thuộc kiểu Int
    Ví dụ */
    val abc = 5000

    //Kiểu dữ liệu Long có thể có các giá trị từ -2^63  đến 2^63-1
    val highestScore: Long = 999999999

    /* Nếu bạn gán một giá trị số nguyên lớn hơn 2^31-1 hoặc nhỏ hơn -2^31  cho một biến
    (mà không chỉ định rõ kiểu dữ liệu của nó), biến sẽ có kiểu Long */
    val distance = 10000000000

    //Tương tự, bạn có thể sử dụng chữ in hoa L để xác định rằng biến thuộc kiểu dữ liệu Long. Ví dụ
    val distance2 = 100L    // distance value of type Long

    //Kiểu dữ liệu double là dấu phẩy động 64 bit chính xác kép. Thí dụ:
    val db = 999.5

    //Kiểu dữ liệu Float là một điểm nổi 32 bit có độ chính xác đơn
    val fl = 19.5F

    //Để thể hiện một kí tự trong Kotlin, ta sử dụng kiểu Char.
    val letter: Char = 'k'

    //Kiểu dữ liệu Boolean  có thể có hai giá trị,  true hoặc  false.
    val bl = true
}