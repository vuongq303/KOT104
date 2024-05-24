package com.hq.quanhqph33420_assignment.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.hq.quanhqph33420_assignment.model.ProductModel

@Dao
interface ProductDao {
    @Query("select * from Product")
    fun getAllProduct(): List<ProductModel>

    @Insert
    fun addProduct(productModel: ProductModel)

    @Query("select * from Product where id= :id")
    fun getItemProduct(id: String): ProductModel
}