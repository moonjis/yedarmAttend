package com.moonji.yedarmattendance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.moonji.yedarmattendance.model.Member;
import com.moonji.yedarmattendance.view.MemberListView;

import java.io.IOException;
import java.util.ArrayList;

public class MemberListActivity extends AppCompatActivity {

    ArrayList<Member> mList;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_list);
        final ListView listView = (ListView)findViewById(R.id.listView);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        mList = new ArrayList<>();
        try {
            Common.getmListFromResource(getApplicationContext(),mList,R.raw.file);
        } catch (IOException e) {
            e.printStackTrace();
            Common.getmListFromExternalFile(mList,"file.txt");//R.raw.file이 없을 경우 external에 존재하는 파일 가져오기..
        }

        MemberAdapter adapter = new MemberAdapter();
        listView.setAdapter(adapter);
    }


    public class MemberAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return mList.size();
        }

        @Override
        public Member getItem(int position) {
            return mList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            MemberListView view;
            if(convertView != null){
                view = (MemberListView) convertView;
            }else {
                view = new MemberListView(getApplicationContext());
            }
            view.getTxtName().setText(mList.get(position).getName());
            view.getTxtAge().setText("("+mList.get(position).getAge()+")");
            if(mList.get(position).getPhone() == null || mList.get(position).getPhone().equals("")){
                view.getImageButton().setVisibility(View.INVISIBLE);
            }
            view.getImageButton().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),mList.get(position).getNum()+" 통화 띄우기",Toast.LENGTH_SHORT).show();
                }
            });
            return view;
        }
    }



}
