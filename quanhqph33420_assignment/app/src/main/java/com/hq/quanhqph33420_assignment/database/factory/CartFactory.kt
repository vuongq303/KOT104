package com.hq.quanhqph33420_assignment.database.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hq.quanhqph33420_assignment.database.repository.CartRepository
import com.hq.quanhqph33420_assignment.database.viewModel.CartViewModel

class CartFactory(private val cartRepository: CartRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CartViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return CartViewModel(cartRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}