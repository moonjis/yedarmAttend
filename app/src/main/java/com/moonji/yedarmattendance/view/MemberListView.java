package com.moonji.yedarmattendance.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.moonji.yedarmattendance.R;

/**
 * Created by 5CLASS-184 on 2017-07-19.
 */

public class MemberListView extends LinearLayout {

    private TextView txtName;
    private TextView txtAge;
    private ImageButton btn_call;

    public MemberListView(Context context) {
        super(context);
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.m_member_item,this,true);
        txtName = (TextView) findViewById(R.id.txtName);
        txtAge = (TextView) findViewById(R.id.txtAge);
        btn_call = (ImageButton) findViewById(R.id.btn_call);
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

    public ImageButton getImageButton() {
        return btn_call;
    }


}
