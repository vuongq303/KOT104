package com.hq.quanhqph33420_lab1

infix fun Int.add(num: Int) = this + num
infix fun String.onto(str: String) = Pair(this, str)
operator fun String.get(range: IntRange) = substring(range)
fun main() {
    //1
    println(8 add 5)
    //2
    println("str1" onto "str2")
    //3
    val str = "1234567890abcdef123"
    println(str[0..7])
    //4
    var list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -5, -6, -7)
    for (e in list) {
        print("$e _")
    }
    println("")
    //5
    list.forEach { e ->
        println("phan tu thu $e")
    }
    //6
    var negative = list.filter { e -> e < 0 }
    println(negative)
    //7
    var doubled = list.map { e -> e * 2 }
    println(doubled)
    //8
    var anyNegative = list.any { e -> e < 0 }
    println(anyNegative)
    //9
    var countNegative = list.count { e -> e < 0 }
    println(countNegative)
    //10
    var sorted = list.sortedBy { -it }
    println(sorted)
}