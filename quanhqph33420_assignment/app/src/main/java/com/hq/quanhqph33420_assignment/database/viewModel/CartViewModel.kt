package com.hq.quanhqph33420_assignment.database.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hq.quanhqph33420_assignment.database.entities.Carts
import com.hq.quanhqph33420_assignment.database.repository.CartRepository
import kotlinx.coroutines.launch

class CartViewModel(private val cartRepository: CartRepository) : ViewModel() {
    fun addToCart(carts: Carts) {
        viewModelScope.launch {
            cartRepository.addToCart(carts)
        }
    }

    fun removeFromCart(carts: Carts) {
        viewModelScope.launch {
            cartRepository.addToCart(carts)
        }
    }

    fun getItemInCart(email: String):
            LiveData<List<Carts>> =
        cartRepository.getItemInCart(email)

}