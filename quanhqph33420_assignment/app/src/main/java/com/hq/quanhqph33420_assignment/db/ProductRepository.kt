package com.hq.quanhqph33420_assignment.db

import com.hq.quanhqph33420_assignment.model.ProductModel

class ProductRepository(private val productDao: ProductDao) {
    val allProduct: List<ProductModel> = productDao.getAllProduct()

    suspend fun addProduct(productModel: ProductModel) {
        productDao.addProduct(productModel)
    }
}