package com.hq.quanhqph33420_assignment.database.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hq.quanhqph33420_assignment.database.repository.UserRepository
import com.hq.quanhqph33420_assignment.database.entities.Users
import kotlinx.coroutines.launch

class UserViewModel(private val userRepository: UserRepository) : ViewModel() {
    fun userSignIn(email: String, password: String)
            : LiveData<List<Users>> =
        userRepository.userSignIn(email, password)


    fun userSignUp(users: Users) {
        viewModelScope.launch {
            userRepository.userSignUp(users)
        }
    }
}