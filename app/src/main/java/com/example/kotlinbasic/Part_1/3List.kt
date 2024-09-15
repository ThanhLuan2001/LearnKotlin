package com.example.kotlinbasic.Part_1

fun main() {
    /* List  là một collection có thứ tự với quyền truy cập vào các phần tử theo chỉ số – số nguyên
    phản ánh vị trí của chúng.Các phần tử có thể xuất hiện nhiều lần trong một danh sách.Ví dụ điển
    hình về danh sách là một câu: đó là một nhóm từ,thứ tự của chúng mang ý nghĩa quan trọng và chúng
    có thể lặp lại.Nói chung list có thể chứa 1 danh sách các phần tử, các phần tử có thể giống nhau */


    val arrayList: ArrayList<Int> =
        arrayListOf(1, 2, 3, 4, 5, 6) //có thể sử dụng mutableListOf cũng giống arrayListOf
    arrayList.apply {
        add(1)
        add(2)
        add(3)
        remove(6) // xóa phần tử có giá trị 6
        removeAt(0) // xóa phần tử ở vị trí 0
    }
    println("ArrayList Size = ${arrayList.size}")
    println("ArrayList[0] = ${arrayList[0]}")
    println("ArrayList = $arrayList")
    println(arrayList.contains(10)) //kiểm tra list có tồn tại phần tử 10 hay không
}