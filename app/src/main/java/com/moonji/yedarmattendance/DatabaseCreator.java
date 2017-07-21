package com.moonji.yedarmattendance;

/**
 * Created by 5CLASS-184 on 2017-07-20.
 */

public class DatabaseCreator {
    private final String ATTEND_TABLE_CREATE = "CREATE TABLE "
            +AttendTableSchema.TABLE_NAME + " ( "
            +AttendTableSchema.COLUMN_MONTH + " INTEGER NOT NULL, " +
            AttendTableSchema.COLUMN_WEEK + " INTEGER NOT NULL, " +
            AttendTableSchema.COLUMN_M_NUM + " INTEGER NOT NULL, " +
            AttendTableSchema.COLUMN_ATTEND_CHK + " INTEGER NOT NULL DEFAULT 1);";

    public String[] getCreateTablesStmt(){
        return new String[]{ATTEND_TABLE_CREATE};
    }

}
