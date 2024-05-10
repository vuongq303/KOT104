package com.hq.quanhqph33420_lab2.lab

fun main() {
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readlnOrNull()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readlnOrNull()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0) {
        println("Phương trình vô số nghiệm")
    } else if (a == 0.0 && b != 0.0) {
        println("Phương trình vô nghiệm")
    } else {
        val x = -b / a
        println("No x=$x")
    }
}