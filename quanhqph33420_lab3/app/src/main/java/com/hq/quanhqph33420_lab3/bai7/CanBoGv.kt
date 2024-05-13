package com.hq.quanhqph33420_lab3.bai7

class CanBoGv(
    val luongCung: Int,
    val luongThuong: Int,
    val tienPhat: Int,
    val luongThuc: Int,
    hoten: String,
    tuoi: Int,
    quequan: String,
    masogv: String,
) : Nguoi(hoten, tuoi, quequan, masogv) {
    var printCanBoGv = {
        "Ma so: $masogv Hoten: $hoten Tuoi: $tuoi Que quan: $quequan\n" +
                "Luong cung: $luongCung Luong Thuong: $luongThuong Tien Phat: $tienPhat Luong Thuc: $luongThuc\n" +
                "------------------------------"
    }

}