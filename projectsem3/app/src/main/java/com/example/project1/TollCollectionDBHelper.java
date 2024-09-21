package com.example.project1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TollCollectionDBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "toll_collection.db";
    private static final int DATABASE_VERSION = 1;

    public TollCollectionDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE users (id INTEGER PRIMARY KEY, username TEXT, password TEXT, phone TEXT, email TEXT,vehicleno TEXT,vehicletype TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS users");
        onCreate(db);
    }
}