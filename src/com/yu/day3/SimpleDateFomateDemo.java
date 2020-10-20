package com.yu.day3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFomateDemo {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        SimpleDateFormat si=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String f = si.format(d);
        System.out.println(f);
        System.out.println("------------");
        String s="2020/03/08 12:34:45";
        Date parse = si.parse(s);
        System.out.println(parse);
    }
}
