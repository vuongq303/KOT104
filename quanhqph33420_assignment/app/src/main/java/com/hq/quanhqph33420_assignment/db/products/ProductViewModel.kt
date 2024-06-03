package com.hq.quanhqph33420_assignment.db.products

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hq.quanhqph33420_assignment.model.entities.Products
import kotlinx.coroutines.launch

class ProductViewModel(private val productRepository: ProductRepository) : ViewModel() {
    val allProduct = productRepository.allProduct
    fun addProduct(products: Products) = viewModelScope.launch {
        productRepository.addProduct(products)
    }

}