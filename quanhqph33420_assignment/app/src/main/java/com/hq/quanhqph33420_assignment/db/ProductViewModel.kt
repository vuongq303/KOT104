package com.hq.quanhqph33420_assignment.db

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hq.quanhqph33420_assignment.model.ProductModel
import kotlinx.coroutines.launch

class ProductViewModel(private val productRepository: ProductRepository) : ViewModel() {
    val allProduct = productRepository.allProduct
    fun addProduct(productModel: ProductModel) = viewModelScope.launch {
        productRepository.addProduct(productModel)
    }

}