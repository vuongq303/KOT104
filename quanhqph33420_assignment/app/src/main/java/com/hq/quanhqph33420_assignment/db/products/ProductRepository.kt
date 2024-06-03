package com.hq.quanhqph33420_assignment.db.products

import com.hq.quanhqph33420_assignment.database.dao.ProductDao
import com.hq.quanhqph33420_assignment.model.entities.Products

class ProductRepository(private val productDao: ProductDao) {
    val allProduct: List<Products> = productDao.getAllProduct()

    suspend fun addProduct(products: Products) {
        productDao.addProduct(products)
    }
}