package com.hq.quanhqph33420_lab3

import com.hq.quanhqph33420_lab3.bai8.TheMuon

var danhSachPhieuMuon = mutableListOf<TheMuon>()
fun main() {
    var key = true
    do {
        println("---------Menu---------")
        println("1. Xem danh sach")
        println("2. Them phieu muon")
        println("3. Xoa phieu muon theo ma")
        println("4. Thoat")
        var seleted = readln()
        when (seleted) {
            "1" -> {
                danhSachPhieuMuon.forEach { e -> println(e.printThongTin()) }
            }

            "2" -> {
                danhSachPhieuMuon.add(themPhieuMuon())
            }

            "3" -> {
                println("Ma phieu muon: ")
                var select = readln()
                danhSachPhieuMuon =
                    danhSachPhieuMuon.filter { e -> e.maPhieuMuon != select } as MutableList<TheMuon>
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

fun themPhieuMuon(): TheMuon {
    do {
        try {
            print("Ma phieu muon: ")
            var maPhieuMuon = readln()
            print("Ngay muon: ")
            var ngayMuon = readln()
            print("Ngay tra: ")
            var ngayTra = readln()
            print("So hieu sach: ")
            var soHieuSach = readln().toInt()
            print("Ho ten: ")
            var hoTen = readln()
            print("Tuoi: ")
            var tuoi = readln().toInt()
            print("Lop: ")
            var lop = readln()
            return TheMuon(maPhieuMuon, ngayMuon, ngayTra, soHieuSach, hoTen, tuoi, lop)
        } catch (e: NumberFormatException) {
            println("Error: ${e.message}")
        }
    } while (true)
}
