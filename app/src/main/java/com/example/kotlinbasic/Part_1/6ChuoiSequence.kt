package com.example.kotlinbasic.Part_1

fun main() {

    //Để tạo một chuỗi, hãy gọi hàm sequenceOf() liệt kê các phần tử làm đối số của nó.
    val numbersSequence = sequenceOf("four", "three", "two", "one")


    /*    Nếu bạn đã có một đối tượng Iterable (chẳng hạn như List hoặc Set),
         bạn có thể tạo một chuỗi từ nó bằng cách gọi hàm asSequence().*/

    val numbers = listOf("one", "two", "three", "four")

    val listToSequence = numbers.asSequence()

    println(listToSequence.count()) // in ra số lượng phần tử trong chuỗi

    for (item in listToSequence) {
        println(item)
    }

    /*   Một cách nữa để tạo một chuỗi là xây dựng nó bằng một hàm tính toán các phần tử của nó.Để xây
         dựng một chuỗi dựa trên một hàm, hãy gọi hàm generateSequence() này làm đối số.Bạn có thể tùy ý
         chỉ định phần tử đầu tiên dưới dạng giá trị rõ ràng hoặc dưới dạng kết quả của một lệnh gọi hàm.
         Quá trình tạo chuỗi dừng lại khi hàm được cung cấp trả về null. Vì vậy, chuỗi trong ví dụ dưới đây là vô hạn.*/

    val oddNumbers = generateSequence(5) { it + 2 } // `it` is the previous element
    println(oddNumbers.take(3).toList())

    //ể tạo một chuỗi hữu hạn với createSequence(), hãy cung cấp một hàm trả về null sau phần tử cuối cùng bạn cần.
    val oddNumbersLessThan10 = generateSequence(1) { if (it + 2 < 10) it + 2 else null }
    println("Danh sách : ${oddNumbersLessThan10.toList()} có ${oddNumbersLessThan10.count()} phần tử")

    /*    Cuối cùng, có một hàm cho phép bạn tạo ra từng phần tử chuỗi một hoặc từng phần có kích thước
         tùy ý – đó là hàm sequence(). Hàm này nhận một biểu thức lambda chứa các lệnh gọi hàm yield()và yieldAll().
         Chúng trả lại một phần tử cho người tiêu dùng chuỗi và tạm dừng việc thực hiện hàm sequence()
         cho đến khi phần tử tiếp theo được người tiêu dùng yêu cầu. Hàm yield()lấy một phần tử duy nhất làm đối số;
         hàm yieldAll()có thể lấy một đối tượng Iterable, một trình lặp hoặc một đối tượng khác chuỗi.
         Một đối số chuỗi của hàm yieldAll()có thể là vô hạn.Tuy nhiên, những lệnh gọi hàm như vậy phải
         là lệnh gọi cuối cùng:tất cả các lệnh gọi hàm tiếp theo sẽ không bao giờ được thực hiện.*/

    val oddNumbers2 = sequence {
        yield(1)
        yieldAll(listOf(3, 5))
        yieldAll(generateSequence(7) { it + 2 })
    }
    println(oddNumbers2.take(5).toList())

    /*    Giả sử rằng bạn có một danh sách các từ. Đoạn code dưới đây lọc ra các từ dài hơn ba ký tự
         và in độ dài của bốn từ đầu tiên đáp ứng tiêu đó (dài hơn 3 kí tự).*/

    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    val lengthsList = words.filter { println("filter: $it"); it.length > 3 }
        .map { println("length: ${it.length}"); it.length }
        .take(4)

    println("Lengths of first 4 words longer than 3 chars:")
    println(lengthsList)
}