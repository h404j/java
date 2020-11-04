package com.work.javatest;

import java.util.Scanner;

public class wanghaojie3_2 {
    public static int fe(int a){
        if (a==0){
            return 0;
        }
        if (a==1){
            return 1;
        }
        return fe(a-1)+fe(a-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n");
        int a=scanner.nextInt();
        System.out.println(fe(n));

    }
}
