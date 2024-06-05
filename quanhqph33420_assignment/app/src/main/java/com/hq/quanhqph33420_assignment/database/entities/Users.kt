package com.hq.quanhqph33420_assignment.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Users(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val email: String,
    val name: String,
    val password: String
)