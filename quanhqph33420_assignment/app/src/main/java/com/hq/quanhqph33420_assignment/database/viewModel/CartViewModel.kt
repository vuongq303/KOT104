package com.hq.quanhqph33420_assignment.database.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hq.quanhqph33420_assignment.database.entities.Carts
import com.hq.quanhqph33420_assignment.database.repository.CartRepository
import kotlinx.coroutines.launch

class CartViewModel(private val cartRepository: CartRepository) : ViewModel() {
    private val _totalPrice = MutableLiveData<Int>()
    val totalPrice: LiveData<Int> get() = _totalPrice
    fun addToCart(carts: Carts) {
        viewModelScope.launch {
            cartRepository.addToCart(carts)
        }
    }

    fun removeFromCart(carts: Carts) {
        viewModelScope.launch {
            cartRepository.removeFromCart(carts)
        }
    }

    fun updateInCart(carts: Carts) {
        viewModelScope.launch {
            cartRepository.updateInCart(carts)
        }
    }


    fun getItemInCart(email: String):
            LiveData<List<Carts>> =
        cartRepository.getItemInCart(email)

    fun getTotalPrice(email: String) {
        cartRepository.getItemInCart(email).observeForever { listItem ->
            var total = 0
            for (item in listItem) {
                total += item.priceProduct * item.quantity
            }
            Log.e("cart", total.toString())
            _totalPrice.value = total
        }

    }
}