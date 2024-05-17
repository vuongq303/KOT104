package com.hq.quanhqph33420_lab3.bai8


class TheMuon(
    val maPhieuMuon: String, val ngayMuon: String?, val ngayTra: String?,
    val soHieuSach: Int, hoten: String, tuoi: Int, lop: String
) : SinhVien(hoten, tuoi, lop) {

    var printThongTin = {
        "Ma phieu muon: $maPhieuMuon, Ngay Muon: $ngayMuon, Ngay Tra: $ngayTra, So Hieu Sach: $soHieuSach\n" +
                "Ho ten: $hoten, Tuoi: $tuoi, Lop: $lop\n" +
                "--------------------------------------------"
    }
}
