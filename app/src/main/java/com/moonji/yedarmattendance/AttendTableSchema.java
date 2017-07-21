package com.moonji.yedarmattendance;

/**
 * Created by 5CLASS-184 on 2017-07-20.
 */

public class AttendTableSchema {
    public static final String TABLE_NAME = "attend";
    public static final String COLUMN_MONTH = "month";
    public static final String COLUMN_WEEK = "week";
    public static final String COLUMN_M_NUM = "m_num";
    public static final String COLUMN_ATTEND_CHK = "a_check";

    public String[] getColumnNames(){
        String[] columnNames = {COLUMN_MONTH,COLUMN_WEEK,COLUMN_M_NUM,COLUMN_ATTEND_CHK};
        return columnNames;
    }
}
