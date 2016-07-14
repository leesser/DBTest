package com.lss.dbtest.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by shuai on 16-7-14.
 */
public class SQLiteOpenHelperDemo extends SQLiteOpenHelper {
    public SQLiteOpenHelperDemo(Context context) {
        super(context, "person", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+ PersonContract.Person.TABLE_NAME+
                " ("+PersonContract.Person._ID
                +" integer primary key autoincrement,"+
                PersonContract.Person.COLUMNS_NAME+" varchar(20),"+
                PersonContract.Person.COLUMNS_NUMBER+" varchar(20)" +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
