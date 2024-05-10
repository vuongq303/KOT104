package com.hq.quanhqph33420_lab2.lab

fun main() {
    var month = 0
    println("Nhập tháng:")
    val s: String? = readlnOrNull()
    if (s != null) month = s.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng $month thuộc quý 1")
        4, 5, 6 -> println("Tháng $month thuộc quý 2")
        7, 8, 9 -> println("Tháng $month thuộc quý 3")
        10, 11, 12 -> println("Tháng $month thuộc quý 4")
        else -> println("Tháng $month không hợp lệ")
    }
}