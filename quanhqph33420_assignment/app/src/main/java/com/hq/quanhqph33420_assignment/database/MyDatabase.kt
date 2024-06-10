package com.hq.quanhqph33420_assignment.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.hq.quanhqph33420_assignment.database.dao.CartDao
import com.hq.quanhqph33420_assignment.database.dao.FavoriteDao
import com.hq.quanhqph33420_assignment.database.dao.ProductDao
import com.hq.quanhqph33420_assignment.database.dao.SaveUserDao
import com.hq.quanhqph33420_assignment.database.dao.UserDao
import com.hq.quanhqph33420_assignment.database.entities.Carts
import com.hq.quanhqph33420_assignment.database.entities.Favorites
import com.hq.quanhqph33420_assignment.database.entities.Products
import com.hq.quanhqph33420_assignment.database.entities.SaveUsers
import com.hq.quanhqph33420_assignment.database.entities.Users
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(
    entities = [
        Users::class,
        Products::class,
        Carts::class,
        SaveUsers::class,
        Favorites::class
    ],
    version = 1,
    exportSchema = false
)
abstract class MyDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun productDao(): ProductDao
    abstract fun cartDao(): CartDao
    abstract fun saveUserDao(): SaveUserDao
    abstract fun favoriteDao(): FavoriteDao

    companion object {
        @Volatile
        private var INSTANCE: MyDatabase? = null
        fun getDatabase(context: Context, scope: CoroutineScope): MyDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context,
                    MyDatabase::class.java,
                    "item_database"
                ).addCallback(ProductDatabaseCallback(scope))
                    .build()
                    .also { INSTANCE = it }
            }
        }

        class ProductDatabaseCallback(private val scope: CoroutineScope) : Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                INSTANCE?.let { database ->
                    scope.launch {
                        populateDatabase(productDao = database.productDao())
                    }
                }
            }

            suspend fun populateDatabase(productDao: ProductDao) {
                val products1 = Products(
                    id = 1,
                    "san pham 1",
                    "https://www.researchgate.net/publication/353422038/figure/fig2/AS:1048906112700416@1627090113328/Image-7-4-3-2-5-9-3-11-45-3-0-2-4-0-1-7.ppm",
                    5,
                    2
                )
                val products2 = Products(
                    id = 2,
                    "san pham 2",
                    "https://d3phaj0sisr2ct.cloudfront.net/site/images/tools/thumbnails/reviewed/Text+to+image.png",
                    6,
                    5
                )
                val products3 = Products(
                    id = 3,
                    "san pham 3",
                    "https://flutter.github.io/assets-for-api-docs/assets/widgets/owl.jpg",
                    6,
                    4
                )
                val products4 = Products(
                    id = 4,
                    "san pham 4",
                    "https://cdn.pixabay.com/photo/2024/02/27/00/13/heliconia-8599119_1280.jpg",
                    5,
                    1
                )
                val products5 = Products(
                    id = 5,
                    "san pham 5",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGAHoaE6P3fDdx5gwT6nPz0mK_em4pDLpC0Q&s",
                    5,
                    2
                )
                val products6 = Products(
                    id = 6,
                    "san pham 6",
                    "https://res.cloudinary.com/demo/image/upload/w_500,f_auto/sample.jpg",
                    8,
                    3
                )
                productDao.addProduct(products1)
                productDao.addProduct(products2)
                productDao.addProduct(products3)
                productDao.addProduct(products4)
                productDao.addProduct(products5)
                productDao.addProduct(products6)
            }
        }
    }
}