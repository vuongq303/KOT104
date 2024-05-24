package com.hq.quanhqph33420_assignment.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Product")
data class ProductModel(
    @PrimaryKey
    val id: String,
    val nameProduct: String,
    val imgProduct: String,
    val priceProduct: Int,
    val rate: Int
) {}