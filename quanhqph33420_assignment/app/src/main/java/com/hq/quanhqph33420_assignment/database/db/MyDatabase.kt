package com.hq.quanhqph33420_assignment.database.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.hq.quanhqph33420_assignment.database.dao.ProductDao
import com.hq.quanhqph33420_assignment.database.dao.UserDao
import com.hq.quanhqph33420_assignment.model.entities.Users

@Database(entities = [Users::class], version = 1, exportSchema = false)
abstract class MyDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun productDao(): ProductDao

    companion object {
        @Volatile
        private var INSTANCE: MyDatabase? = null
        fun getDatabase(context: Context): MyDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(context, MyDatabase::class.java, "item_database")
                    .build()
                    .also { INSTANCE = it }
            }
        }
    }
}