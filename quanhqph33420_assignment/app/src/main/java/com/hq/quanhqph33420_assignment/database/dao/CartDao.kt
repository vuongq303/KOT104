package com.hq.quanhqph33420_assignment.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.hq.quanhqph33420_assignment.database.entities.Carts

@Dao
interface CartDao {
    @Insert
    suspend fun addToCart(carts: Carts)

    @Delete
    suspend fun removeFromCart(carts: Carts)

    @Query("select * from Carts where email = :email")
    fun getItemInCart(email: String): LiveData<List<Carts>>
}