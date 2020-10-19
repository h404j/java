package com.yu.day1;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator an=new AnimalOperator();
        an.jump(new Animaljump() {
            @Override
            public void jump() {
                System.out.println("鱼会跳水");
            }
        });
    }
}
