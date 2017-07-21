package com.moonji.yedarmattendance;

import android.content.Context;
import android.os.Environment;

import com.moonji.yedarmattendance.model.Member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by 5CLASS-184 on 2017-07-20.
 */

public class Common {

    public static void getmListFromResource(Context context, ArrayList<Member> mList,int resourceId) throws IOException {
        //메모장을 읽기
        InputStream inputStream = context.getResources().openRawResource(resourceId);
        InputStreamReader inputreader = new InputStreamReader(inputStream);
        BufferedReader br = null;
        try {
            br = new BufferedReader(inputreader);
            String line;
            String[] strArr;
            while((line = br.readLine())!=null){
                strArr = line.split(",");
                //번호,이름,나이,폰
                mList.add(new Member(
                        strArr[0],
                        strArr[1],
                        strArr[2],
                        strArr[3]
                ));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void getmListFromExternalFile(ArrayList<Member> mList,String filename){
        //메모장을 읽기
        File sdcard = Environment.getExternalStorageDirectory();
        File file = new File(sdcard,filename);

        StringBuilder text = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            String[] strArr;
            while((line = br.readLine())!=null){
                strArr = line.split(",");
                //번호,이름,나이,폰
                mList.add(new Member(
                        strArr[0],
                        strArr[1],
                        strArr[2],
                        strArr[3]
                ));
                /*text.append(line);
                text.append('\n');*/
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
