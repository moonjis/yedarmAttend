package com.moonji.yedarmattendance;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 5CLASS-184 on 2017-07-20.
 */

public class DataBaseHelper extends SQLiteOpenHelper{

    private static DataBaseHelper mInstance;
    private static SQLiteDatabase db;

    private DataBaseHelper(final Context context){
        super(context,context.getString(R.string.db_name),null,
                context.getResources().getInteger(R.integer.db_version));
    }

    public static final DataBaseHelper getInstance(Context context){
        if(mInstance == null){
            mInstance = new DataBaseHelper(context);
        }
        db = mInstance.getWritableDatabase();
        return mInstance;
    }

    public long insert(String table, ContentValues values){
        return db.insert(table,null,values);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        DatabaseCreator mCreator = new DatabaseCreator();
        String[] tableCreateStmt = mCreator.getCreateTablesStmt();
        //최초, 테이블 만들기!
        for(String stmt : tableCreateStmt){
            db.execSQL(stmt);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
