package com.yu.day3;

import java.util.Date;

public class DateDemo {


    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);


        d.setTime( System.currentTimeMillis());
        System.out.println(d);
    }
}
