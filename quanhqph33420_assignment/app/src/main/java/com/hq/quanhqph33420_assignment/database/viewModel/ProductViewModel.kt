package com.hq.quanhqph33420_assignment.database.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hq.quanhqph33420_assignment.database.entities.Products
import com.hq.quanhqph33420_assignment.database.repository.ProductRepository
import kotlinx.coroutines.launch

class ProductViewModel(private val productRepository: ProductRepository) : ViewModel() {

    val getAllProduct: LiveData<List<Products>> = productRepository.getAllProduct
    fun getItemProduct(id: Int) = productRepository.getItemProduct(id)

    fun addProduct(products: Products) {
        viewModelScope.launch {
            productRepository.addProduct(products)
        }
    }
}