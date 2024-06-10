package com.hq.quanhqph33420_assignment.database.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hq.quanhqph33420_assignment.database.repository.FavoriteRepository
import com.hq.quanhqph33420_assignment.database.viewModel.FavoriteViewModel

class FavoriteFactory(private val favoriteRepository: FavoriteRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FavoriteViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return FavoriteViewModel(favoriteRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}