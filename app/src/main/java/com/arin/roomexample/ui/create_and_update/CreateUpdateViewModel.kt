package com.arin.roomexample.ui.create_and_update

import androidx.lifecycle.ViewModel
import com.arin.roomexample.data.db.AppDatabase
import com.arin.roomexample.data.model.Person


class CreateUpdateViewModel (private val appDatabase: AppDatabase) : ViewModel(){
    fun insert(name: String, email: String, nim: String) = appDatabase.personDao().insert(Person(name = name, email = email, nim = nim))
    fun update(id: Int, name: String, email: String, nim: String) = appDatabase.personDao().insert(Person(id,name, email, nim))
    fun findById(id: Int) = appDatabase.personDao().findById(id)
    fun delete(person: Person) = appDatabase.personDao().delete(person)
}