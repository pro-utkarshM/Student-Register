package com.example.studentregister.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface StudentDao {
    @Insert //will run on a coroutiens
    suspend fun insertStudent(student: Student)
    @Update
    suspend fun updateStudent(student: Student)
    @Delete
    suspend fun deleteStudent(student: Student)

    @Query("SELECT * FROM Student_data_table")
    fun getAllStudents():LiveData<List<Student>>
}