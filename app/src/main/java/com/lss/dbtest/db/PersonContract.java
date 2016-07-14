package com.lss.dbtest.db;

import android.provider.BaseColumns;

/**
 * Created by shuai on 16-7-14.
 */
public class PersonContract {
    public static class Person implements BaseColumns{
        public static final String TABLE_NAME="person";
        public static final String COLUMNS_NAME="name";
        public static final String COLUMNS_NUMBER="number";
    }
}
