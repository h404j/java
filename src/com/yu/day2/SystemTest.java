package com.yu.day2;

public class SystemTest {
    public static void main(String[] args) {
        System.out.println("开始");
       // System.exit(0);
        int time= (int) (System.currentTimeMillis()*1.0/1000/60/60/24/365);
        int day=(int)(System.currentTimeMillis()*1.0/1000/60/60/24);
        System.out.println(1970+time);
    }
}
