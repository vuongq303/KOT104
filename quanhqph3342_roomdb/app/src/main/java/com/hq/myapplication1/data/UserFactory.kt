package com.hq.myapplication1.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class UserFactory(private val repository: UserReponsitory) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return UserViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
