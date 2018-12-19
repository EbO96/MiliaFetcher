package pl.ebo96.miliafetcher.dependency

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import pl.ebo96.miliafetcher.database.MiliaDatabase
import pl.ebo96.miliafetcher.database.MyImageDao
import javax.inject.Singleton

const val DATABASE_NAME = "milia database"

@Module
class DatabaseModule(private val context: Context) {

    @Singleton
    @Provides
    fun miliaDatabase() = Room.databaseBuilder(context, MiliaDatabase::class.java, DATABASE_NAME)
        .fallbackToDestructiveMigrationOnDowngrade()
        .build()

    @Singleton
    @Provides
    fun myImageDao(database: MiliaDatabase): MyImageDao = database.myImageDao()
}