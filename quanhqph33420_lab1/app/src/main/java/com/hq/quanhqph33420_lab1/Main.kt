package com.hq.quanhqph33420_lab1

fun main() {
    Bai1()
    Bai2()
}

fun Bai2() {
    print("a = ")
    var a = readLine()?.toDouble();
    print("b = ")
    var b = readLine()?.toDouble()

    println("$a + $b = ${a?.plus(b!!)}")
    println("$a - $b = ${a?.minus(b!!)}")
    println("$a x $b = ${a?.times(b!!)}")
    println("$a / $b = ${a?.div(b!!)}")
}

fun Bai1() {
    println("Hoàng Quốc Quân PH33420")
    println("Quanh năm buôn bán ở nom sông")
    println("Nuôi đủ một con với một chồng")
    println("\tlặn lội thân cò khi quãng vắng")
    println("\teo sèo mặt nước buổi đò đồng")
    println("Một duyên hai nợ âu đành phận")
    println("Năm nắng mười mưa há chẳng công")
    println("\tCha mẹ thói đời \"ăn ở bạc\"")
    println("\tCó chồng hờ hững cũng như không")
}
