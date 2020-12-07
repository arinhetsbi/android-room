package com.arin.roomexample.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.arin.roomexample.data.dao.PersonDao
import com.arin.roomexample.data.model.Person


@Database(entities = [Person::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun personDao(): PersonDao
}