package com.work.javatest;

import java.lang.String;

public class wanghaojie5_1 {
    public static void main(String[] args) {
        String str = "Hello World";
        String a = " ";
        int len = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));//逆序输出
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {//大写换小写，小写换大写
            a = String.valueOf(str.charAt(i));
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                System.out.print(a.toLowerCase());
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                System.out.print(a.toUpperCase());
            else System.out.print(str.charAt(i));
        }
        System.out.println();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++)  {
            buffer.append(str.charAt(i));
        }
//        buffer.append("h");
//        buffer.toString();
        System.out.println(buffer.toString());
    }
}
