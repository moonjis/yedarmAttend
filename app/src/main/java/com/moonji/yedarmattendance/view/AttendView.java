package com.moonji.yedarmattendance.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.moonji.yedarmattendance.R;

import java.util.zip.Inflater;

/**
 * Created by 5CLASS-184 on 2017-07-19.
 */

public class AttendView extends LinearLayout {

    private TextView txtName;
    private TextView txtAge;
    private CheckBox chkAttend;

    public AttendView(Context context) {
        super(context);
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.m_attend_item,this,true);
        txtName = (TextView) findViewById(R.id.txtName);
        txtAge = (TextView) findViewById(R.id.txtAge);
        chkAttend = (CheckBox) findViewById(R.id.chk_attend);
//        txtName = findViewById()
    }

    public TextView getTxtName() {
        return txtName;
    }

    public void setTxtName(String name) {
        txtName.setText(name);
    }

    public TextView getTxtAge() {
        return txtAge;
    }

    public void setTxtAge(String age) {
        txtAge.setText(age);
    }

    public CheckBox getChkAttend() {
        return chkAttend;
    }

    public void setChkAttend(boolean check) {
        chkAttend.setChecked(check);
    }
}
