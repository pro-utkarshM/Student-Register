package com.example.studentregister.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Student::class], version = 1, exportSchema = false)//exportSchema help us export data in .json file at compile time

abstract class StudentDatabase : RoomDatabase() {
    abstract fun studentDao():StudentDao
    //have only one instance of database as it is very resource consuming

    companion object{ // same as static in java, helps in making single instance
        @Volatile // write to this field will be immediately visible to other threads
        private var INSTANCE:StudentDatabase?=null
        fun getInstance(context: Context):StudentDatabase{
            synchronized(this){
                var instance= INSTANCE
                if(instance==null){
                    instance= Room.databaseBuilder(
                        context.applicationContext,
                        StudentDatabase::class.java,
                        "student_data_database"
                    ).build()
                }
                return instance
            }
        }
    }
}