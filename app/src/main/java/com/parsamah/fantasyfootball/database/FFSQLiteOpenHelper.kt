package com.parsamah.fantasyfootball.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class FFSQLiteOpenHelper(context: Context) : SQLiteOpenHelper(context, null, null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE team (_id INTEGER PRIMARY KEY AUTOINCREMENT, position INTEGER, playerNumber INTEGER)")
        db?.execSQL("CREATE TABLE players (_id INTEGER PRIMARY KEY AUTOINCREMENT, name nvarchar(50) NOT NULL, position INTEGER NOT NULL, playerNumber INTEGER NOT NULL)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}