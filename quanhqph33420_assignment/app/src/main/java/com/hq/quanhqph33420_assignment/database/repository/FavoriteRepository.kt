package com.hq.quanhqph33420_assignment.database.repository

import com.hq.quanhqph33420_assignment.database.dao.FavoriteDao
import com.hq.quanhqph33420_assignment.database.entities.Favorites

class FavoriteRepository(private val favoriteDao: FavoriteDao) {
    suspend fun addToFavorite(favorites: Favorites) {
        favoriteDao.addToFavorite(favorites)
    }

    suspend fun removeFromFavorite(favorites: Favorites) {
        favoriteDao.removeFromFavorite(favorites)
    }

    fun getAllFavorites(email: String) = favoriteDao.getAllFavorite(email)
}