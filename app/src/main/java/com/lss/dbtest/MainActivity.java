package com.lss.dbtest;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lss.dbtest.db.PersonContract;
import com.lss.dbtest.db.SQLiteOpenHelperDemo;

public class MainActivity extends AppCompatActivity {
    private SQLiteOpenHelperDemo mOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mOpenHelper=new SQLiteOpenHelperDemo(this);
        ContentValues values = new ContentValues();
        values.put(PersonContract.Person.COLUMNS_NAME,"11");
        values.put(PersonContract.Person.COLUMNS_NUMBER,"222");
        SQLiteDatabase database = mOpenHelper.getWritableDatabase();
        //nullColumnHack参数意思为允许数据库表里可以插入空值
        database.insert(PersonContract.Person.TABLE_NAME,null,values);
    }
}
