package com.hq.myapplication1.data

import androidx.lifecycle.LiveData

class UserReponsitory(private val userDao: UserDao) {
    val getAllUser: LiveData<List<User>> = userDao.getAllUser()

    suspend fun updateUser(user: User) {
        userDao.updateUser(user)
    }

    suspend fun deleteUser(user: User) {
        userDao.deleteUser(user)
    }

    suspend fun addUser(user: User) {
        userDao.addUser(user)
    }
}