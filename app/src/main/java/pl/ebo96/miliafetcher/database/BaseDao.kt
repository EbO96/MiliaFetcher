package pl.ebo96.miliafetcher.database

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(data: T): Long

    @Delete
    fun delete(data: T): Int

    @Update
    fun update(data: T): Int
}