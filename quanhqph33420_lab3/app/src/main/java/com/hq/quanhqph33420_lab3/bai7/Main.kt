package com.hq.quanhqph33420_lab3.bai7

var danhSachGv = mutableListOf<CanBoGv>()
fun main() {
    var key = true
    do {
        println("--------Menu-------")
        println("1. Xem danh sach")
        println("2. Them giao vien")
        println("3. Xoa giao vien theo ma")
        println("5. Thoat")
        println("--------------------")
        var selected = readlnOrNull()
        when (selected) {
            "1" -> {
                danhSachGv.forEach { e ->
                    println(e.printCanBoGv())
                }
            }

            "2" -> {
                danhSachGv.add(themGiaoVien())
            }

            "3" -> {
                print("Ma so giao vien: ")
                var ms = readln()
                danhSachGv = danhSachGv.filter { e -> e.masogv != ms } as MutableList<CanBoGv>
            }

            "4" -> {
                key = false
            }

            else -> {
                println("Error")
            }
        }
    } while (key)
}

fun themGiaoVien(): CanBoGv {
    do {
        try {
            print("Ma giao vien: ")
            var magv = readln()
            print("Ho ten: ")
            var hoten = readln()
            print("Tuoi: ")
            var tuoi = readln().toInt()
            print("Que quan: ")
            var quequan = readln()
            print("Luong cung: ")
            var luongcung = readln().toInt()
            print("Luong thuong: ")
            var luongthuong = readln().toInt()
            print("Tien phat: ")
            var tienphat = readln().toInt()

            return CanBoGv(
                luongcung,
                luongthuong,
                tienphat,
                luongthuong + luongcung - tienphat,
                hoten,
                tuoi,
                quequan,
                magv
            )
        } catch (e: NumberFormatException) {
            println("Error ${e.message}")
        }
    } while (true)
}


