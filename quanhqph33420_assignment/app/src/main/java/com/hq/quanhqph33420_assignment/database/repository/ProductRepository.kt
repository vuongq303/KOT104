package com.hq.quanhqph33420_assignment.database.repository

import androidx.lifecycle.LiveData
import com.hq.quanhqph33420_assignment.database.dao.ProductDao
import com.hq.quanhqph33420_assignment.database.entities.Products

class ProductRepository(private val productDao: ProductDao) {
    val getAllProduct: LiveData<List<Products>> = productDao.getAllProduct()
    fun getItemProduct(id: Int): LiveData<Products> = productDao.getItemProduct(id)
    suspend fun addProduct(products: Products) {
        productDao.addProduct(products)
    }
}