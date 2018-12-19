package pl.ebo96.miliafetcher.database

import androidx.room.Database
import androidx.room.RoomDatabase
import pl.ebo96.miliafetcher.MyImage

@Database(entities = [MyImage::class], version = 1)
abstract class MiliaDatabase : RoomDatabase() {

    abstract fun myImageDao(): MyImageDao
}