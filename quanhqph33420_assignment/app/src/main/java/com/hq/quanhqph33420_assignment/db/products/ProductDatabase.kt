package com.hq.quanhqph33420_assignment.db.products

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.hq.quanhqph33420_assignment.database.dao.ProductDao
import com.hq.quanhqph33420_assignment.model.entities.Products

@Database(entities = [Products::class], version = 1, exportSchema = false)
abstract class ProductDatabase() : RoomDatabase() {
    companion object {
        @Volatile
        private var INSTANCE: ProductDatabase? = null
        fun getDatabase(context: Context): ProductDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ProductDatabase::class.java,
                    "item_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }

    abstract fun productDao(): ProductDao
}