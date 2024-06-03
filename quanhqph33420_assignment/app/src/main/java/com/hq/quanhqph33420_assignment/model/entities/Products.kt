package com.hq.quanhqph33420_assignment.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Products(
    @PrimaryKey
    val id: String,
    val nameProduct: String,
    val imgProduct: String,
    val priceProduct: Int,
    val rate: Int
) {}