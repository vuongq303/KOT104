package com.hq.quanhqph33420_lab2.lab

fun main() {
    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s = readlnOrNull()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s = readlnOrNull()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s = readlnOrNull()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")
}