package com.example.studentregister.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Student_data_table")
data class Student (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Student_id")
    var id:Int,
    @ColumnInfo(name = "Student_name")
    var name:String,
    @ColumnInfo(name = "Student_email")
    var email: String
    )