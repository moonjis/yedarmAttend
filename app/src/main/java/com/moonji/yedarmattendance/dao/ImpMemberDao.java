package com.moonji.yedarmattendance.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.moonji.yedarmattendance.AttendTableSchema;
import com.moonji.yedarmattendance.DataBaseHelper;
import com.moonji.yedarmattendance.model.Member;

/**
 * Created by 5CLASS-184 on 2017-07-20.
 */

public class ImpMemberDao implements MemberDao {
    private DataBaseHelper dataBaseHelper;
    public ImpMemberDao(Context context){
        dataBaseHelper = DataBaseHelper.getInstance(context);
    }
    @Override
    public void insertMember(Member member,ContentValues values) {

        dataBaseHelper.insert(AttendTableSchema.TABLE_NAME,values);
    }

}
