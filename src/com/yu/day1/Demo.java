package com.yu.day1;

public class Demo {
    public static void main(String[] args) {
        cat a=new cat("猫",12);
        a.eat();
        a.jump();
        a.run();
        a.die();
        System.out.println( a.getSpecie()+a.getHigh());
        a.setSpecie("狗");
        a.setHigh(190);
        System.out.println( a.getSpecie()+a.getHigh());
        a.catchmouse();
    }
}
