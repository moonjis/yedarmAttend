package com.moonji.yedarmattendance.model;

/**
 * Created by 5CLASS-184 on 2017-07-19.
 */

public class Member {
    String num;
    String name;
    String age;
    String phone;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Member(String num, String name, String age, String phone) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    public Member(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Member(String num, String name, String age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }
}
