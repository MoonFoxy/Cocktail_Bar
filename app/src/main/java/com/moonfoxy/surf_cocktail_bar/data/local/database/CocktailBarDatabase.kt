package com.moonfoxy.surf_cocktail_bar.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.moonfoxy.surf_cocktail_bar.data.local.dao.CocktailDao
import com.moonfoxy.surf_cocktail_bar.data.local.models.CocktailEntity
import com.moonfoxy.surf_cocktail_bar.data.local.util.LocalConstants

@Database(
    entities = [CocktailEntity::class],
    version = CocktailBarDatabase.VERSION,
    exportSchema = false
)
abstract class CocktailBarDatabase : RoomDatabase() {

    abstract fun getCocktailDao(): CocktailDao

    companion object {
        const val VERSION = 1

        @Volatile
        private var INSTANCE: CocktailBarDatabase? = null

        fun getInstance(context: Context): CocktailBarDatabase = INSTANCE ?: synchronized(this) {
            INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            CocktailBarDatabase::class.java,
            LocalConstants.DB_NAME
        ).build()
    }
}
