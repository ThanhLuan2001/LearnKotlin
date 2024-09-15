package com.example.kotlinbasic.Part_2

fun main() {

    val number = 10

    //cách sử dụng thông thường của if else
    if (number > 0) {
        println("Positive number")
    } else {
        println("Negative number")
    }

    //đối với biểu thức if
    val result = if (number > 0) {
        "Positive number"
    } else {
        "Negative number"
    }
    println(result)

    /*  Bắt buộc phải sử dụng nhánh else khi sử dụng if với tư cách là một biểu thức.
     Không bắt buộc phải sử dụng các dấu ngoặc nhọn nếu phần thân của if chỉ có một câu lệnh. Ví dụ*/

    val result2 = if (number > 0) "Positive number" else "Negative number"
    println(result2)

    /*    Nếu khối câu lênh trong nhánh if chứa nhiều hơn một biểu thức,
        biểu thức cuối cùng được trả về là giá trị của khối câu lệnh đó.*/

    val a = -9
    val b = -11

    val max = if (a > b) {
        println("$a is larger than $b.")
        println("max variable holds value of a.")
        a
    } else {
        println("$b is larger than $a.")
        println("max variable holds value of b.")
        b
    }
    println("max = $max")

    /*    Có thể trả về một khối câu lệnh trong số nhiều khối câu lệnh trong Kotlin bằng Cấu trúc rẽ nhánh
        if..else..if.*/
    val number3 = 0

    val result3 =
        if (number3 > 0)
            "positive number"
        else if (number3 < 0)
            "negative number"
        else
            "zero"

    println("number is $result3")

}
