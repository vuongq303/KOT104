package com.hq.myapplication1.data


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(private val userReponsitory: UserReponsitory) : ViewModel() {
    val getAllUser: LiveData<List<User>> = userReponsitory.getAllUser

    fun addUser(user: User) {
        viewModelScope.launch {
            userReponsitory.addUser(user)
        }
    }

    fun updateUser(user: User) {
        viewModelScope.launch {
            userReponsitory.updateUser(user)
        }
    }

    fun deleteUser(user: User) {
        viewModelScope.launch {
            userReponsitory.deleteUser(user)
        }
    }
}