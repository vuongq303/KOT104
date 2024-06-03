package com.hq.quanhqph33420_lab7.ui.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    private val _username = MutableLiveData<String>()
    val username: LiveData<String> = _username
    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password
    private val _rememberMe = MutableLiveData<Boolean>()
    val rememberMe: LiveData<Boolean> = _rememberMe
    private val _isAuthenticated = MutableLiveData<Boolean?>()
    val isAuthenticated: LiveData<Boolean?> = _isAuthenticated

    fun login(username: String, password: String, rememberMe: Boolean) {
        _isAuthenticated.value = username == "admin" && password == "123"
    }

    fun resetAuthenticationState() {
        _isAuthenticated.value = null
    }
}