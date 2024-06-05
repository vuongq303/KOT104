package com.hq.quanhqph33420_assignment.database.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hq.quanhqph33420_assignment.database.repository.SaveUserRepository
import com.hq.quanhqph33420_assignment.database.viewModel.SaveUserViewModel

class SaveUserFactory(private val saveUserRepository: SaveUserRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SaveUserViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return SaveUserViewModel(saveUserRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}