package com.arin.roomexample.data.dao

import androidx.room.*
import com.arin.roomexample.data.model.Person

@Dao
interface PersonDao {
    @Query("SELECT * from Person")
    fun all() : List<Person>

    @Query("SELECT * FROM Person WHERE id = :id LIMIT 1")
    fun findById(id: Int): Person

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(person: Person)

    @Update
    fun update(person: Person)

    @Delete
    fun delete(person: Person)

}