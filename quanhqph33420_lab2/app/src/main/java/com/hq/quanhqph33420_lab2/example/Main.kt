package com.hq.quanhqph33420_lab2.example

import kotlin.NumberFormatException

var listSinhVien = mutableListOf<SinhVien>()
lateinit var sinhVien: SinhVien

fun main() {
    var key = true;
    do {
        println("---------Menu-----------")
        println("1. Xem danh sach sinh vien")
        println("2. Them sinh vien")
        println("3. Xoa sinh vien")
        println("4. Thoat")
        println("------------------------")
        var selected = readln()
        when (selected) {
            "1" -> {
                for (e in listSinhVien) {
                    var index = listSinhVien.indexOf(e)
                    println("Sinh vien $index ${e.convertToString()}")
                }

            }

            "2" -> {
                nhapSinhVien()
                listSinhVien.add(sinhVien)
            }

            "3" -> {
                println("Vi tri can xoa 0 -> ${listSinhVien.size - 1}")
                var index = readln().toInt()
                listSinhVien.removeAt(index)
            }

            "4" -> {
                key = false
            }

            else -> println("Error")
        }
    } while (key)
}

fun nhapSinhVien(): SinhVien {
    while (true) {
        try {
            print("Ten sinh vien: ")
            var tenSinhVien = readln()

            print("Ma sinh vien: ")
            var maSinhVien = readln()

            print("Diem trung binh: ")
            var diemTrungBinh = readln().toFloat()

            print("Da tot nghiep (1=true, 0=false) ")
            var daTotNghiep = readln()

            print("Tuoi: ")
            var tuoi = readln()

            if (daTotNghiep == "" && tuoi == "")
                sinhVien = SinhVien(
                    tenSinhVien,
                    maSinhVien,
                    diemTrungBinh
                )
            else sinhVien = SinhVien(
                tenSinhVien,
                maSinhVien,
                diemTrungBinh,
                totNghiep(daTotNghiep.toInt())!!,
                tuoi.toInt()
            )
            return sinhVien
        } catch (err: NumberFormatException) {
            println("Error ${err.message}, nhap lai")
        } catch (err: IllegalArgumentException) {
            println("Error ${err.message}, nhap lai")
        }
    }
}

fun totNghiep(input: Int?): Boolean? {
    if (input == 1) return true
    else if (input == 0) return false
    return null
}
