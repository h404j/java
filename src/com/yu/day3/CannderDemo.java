package com.yu.day3;

import java.util.Calendar;

public class CannderDemo {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(2021,03, 11);
        c.add(Calendar.YEAR,+10);
        System.out.println(c);
        int year=c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int weekOfYear = Calendar.WEEK_OF_YEAR;
        System.out.println(year+":"+month);
        System.out.println();

    }
}
