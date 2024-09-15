package com.example.kotlinbasic.Part_1

fun main() {
    /* Map (hoặc từ điền ) là một collection các cặp key- value. Các key là duy nhất và mỗi key ánh xạ
      đến chính xác một value. Các value có thể trùng lặp. Map rất hữu ích để lưu trữ các kết nối logic
      giữa các đối tượng, ví dụ, ID của nhân viên và vị trí của họ */

    val map: MutableMap<String, Int> = mutableMapOf(
        "a" to 1,
        "b" to 2,
        "c" to 3
    ) //mapOf sẽ không thể thêm hoặc xóa phần tử sau khi tạo
    map.apply {
        this["d"] = 4
        this["e"] = 5
        this["f"] = 6
    }
    println("Map = ${map.size}")

    for ((key, value) in map) {
        println("Key: $key, Value: $value")
    }
    println("-----------------")
    for (entry in map.entries) {
        val key = entry.key
        val value = entry.value
        println("Key: $key, Value: $value")
    }
    println("-----------------")

}