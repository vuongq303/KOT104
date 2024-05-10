package com.hq.quanhqph33420_lab2.example

data class SinhVien(
    val tenSinhVien: String,
    val maSinhVien: String,
    val diemTrungBinh: Float,
    val daTotNghiep: Boolean?,
    val tuoi: Int?
) {
    constructor(tenSinhVien: String, maSinhVien: String, diemTrungBinh: Float) : this(
        tenSinhVien,
        maSinhVien,
        diemTrungBinh,
        null,
        null
    )

    fun convertToString(): String {
        if (daTotNghiep == null && tuoi == null)
            return "(tenSinhVien='$tenSinhVien', maSinhVien='$maSinhVien', diemTrungBinh=$diemTrungBinh)"
        return "(tenSinhVien='$tenSinhVien', maSinhVien='$maSinhVien', diemTrungBinh=$diemTrungBinh, daTotNghiep=$daTotNghiep, tuoi=$tuoi)"
    }

}