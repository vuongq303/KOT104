package com.hq.quanhqph33420_assignment.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.hq.quanhqph33420_assignment.database.entities.Users

@Dao
interface UserDao {
    @Insert
    suspend fun userSignUp(users: Users)

    @Query("select * from Users where email = :email and password=:password")
    fun userSignIn(email: String, password: String): LiveData<List<Users>>

    @Query("select *from  Users where email = :email")
    fun getUser(email: String): LiveData<Users>
}