package com.moonji.yedarmattendance;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.moonji.yedarmattendance.model.Member;
import com.moonji.yedarmattendance.view.AttendView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Member> mList;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attend_list);
        final ListView listView = (ListView)findViewById(R.id.listView);
        FloatingActionButton fButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        mList = new ArrayList<>();
        mList.add(new Member("1","moon","09"));
        mList.add(new Member("2","ji","04"));
        mList.add(new Member("3","hyeon","05"));
        mList.add(new Member("4","remo","09"));

        AttendAdapter adapter = new AttendAdapter();
        listView.setAdapter(adapter);

        //floating 버튼 누르면 서버로 출석체크 전송
        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AttendView tmpView;
                for(int i = 0 ; i < listView.getChildCount() ; i++){
                    tmpView = (AttendView) listView.getChildAt(i);
                    if(tmpView.getChkAttend().isChecked()){
                        //체크된 경우
                        Log.d("check!","num : " + mList.get(i).getNum());
                    }
                }
            }
        });
        Intent intent = new Intent(this,MemberListActivity.class);
        startActivity(intent);
    }


    class AttendAdapter extends BaseAdapter{

        /*ArrayList<Member> mList;
        protected AttendAdapter(ArrayList<Member> list){
            mList = list;
        }*/

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
        public AttendView getView(int position, View convertView, ViewGroup parent) {
            Log.e("getView ","getView called");
            AttendView view;
            if(convertView != null) {
                view = (AttendView) convertView;
            } else {
                view = new AttendView(getApplicationContext());
            }
            view.setTxtAge("("+mList.get(position).getAge()+")");
            view.setTxtName(mList.get(position).getName());

            return view;
        }
    }
}
