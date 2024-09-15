package com.example.kotlinbasic.Part_1

fun main() {
    /*Set là một collection các phần tử duy nhất.Nó phản ánh tính trừu tượng toán học của collection:
      một nhóm các đối tượng không lặp lại.Nói chung, thứ tự của các phần tử trong set không có nhiều
      ý nghĩa.Ví dụ, một bảng chữ cái là một set gồm các chữ cái.Nói chung set có thể chứa 1 danh sách
      các phần tử, các phần tử không được giống nhau,ví dụ : bảng chữ cái */


    val set: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5, 6)
    set.apply { //setOf sẽ không thể thêm hoặc xóa phần tử sau khi tạo
        add(7)
        add(8)
        add(1) // vì 1 đã tồn tại trong set, nên dù có add vào cũng không được tính là phần tử mới
    }
    println("Set = ${set.size}")

}