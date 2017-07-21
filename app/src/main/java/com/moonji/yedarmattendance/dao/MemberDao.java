package com.moonji.yedarmattendance.dao;

import android.content.ContentValues;

import com.moonji.yedarmattendance.model.Member;

/**
 * Created by 5CLASS-184 on 2017-07-20.
 */

public interface MemberDao {
    public void insertMember(Member member,ContentValues values);
}
