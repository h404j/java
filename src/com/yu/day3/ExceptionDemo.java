package com.yu.day3;

import java.util.Scanner;

public class ExceptionDemo {
    public  static void score(int x) throws ScoreException {
        if(x<0||x>100){
            throw new ScoreException("你输入的成绩不在正常范围内");
        }else {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        x = sc.nextInt();
        try {
            score(x);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
