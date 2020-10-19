package com.yu.day1;

public class cat extends Animal implements Animaljump,CatchMouse {
    public cat() {
        super();
    }
    public cat(String specie, int high) {
        super(specie, high);
    }

    @Override
    public void jump() {
        System.out.println("猫会跳水");
    }

    @Override
    public void eat() {
        System.out.println("猫吃食物");
    }

    @Override
    public void run() {
        System.out.println("小猫在树上快速的奔跑");
    }

    @Override
    public void catchmouse() {
        System.out.println("小花猫捉老鼠");
    }
}
