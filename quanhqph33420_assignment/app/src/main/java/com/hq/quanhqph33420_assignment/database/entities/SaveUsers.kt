package com.hq.quanhqph33420_assignment.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SaveUsers(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val email: String
)