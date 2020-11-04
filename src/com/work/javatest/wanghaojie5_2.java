package com.work.javatest;

import java.util.Random;

public class wanghaojie5_2 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i <5; i++) {
            int a=20+random.nextInt(10);
            System.out.println("第"+(i+1)+"个随机数"+a);
        }
    }
}
