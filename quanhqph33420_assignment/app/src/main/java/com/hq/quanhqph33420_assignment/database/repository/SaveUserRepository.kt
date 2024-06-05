package com.hq.quanhqph33420_assignment.database.repository

import androidx.lifecycle.LiveData
import com.hq.quanhqph33420_assignment.database.dao.SaveUserDao
import com.hq.quanhqph33420_assignment.database.entities.SaveUsers

class SaveUserRepository(private val saveUserDao: SaveUserDao) {
    suspend fun addUser(saveUsers: SaveUsers) {
        saveUserDao.addUser(saveUsers)
    }

    suspend fun deleteUser(saveUsers: SaveUsers) {
        saveUserDao.deleteUser(saveUsers)
    }

    val getUser: LiveData<SaveUsers> = saveUserDao.getUser()
}