package com.hq.myapplication1.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class UserDb : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: UserDb? = null
        fun getDatabase(context: Context): UserDb {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(context, UserDb::class.java, "item_database")
                    .build()
                    .also { INSTANCE = it }
            }
        }
    }
}