package com.work.javatest;

public class wanghaojie4_1Undergraduate extends wanghaojie4_1Student {
    private String degree;

    public void degree(String name, int age, String degree) {
        this.setAge(age);
        this.setName(name);
        this.degree = degree;
    }

    public void show() {
        System.out.println("姓名:" + getName() + " 年龄:" + getAge() + " 学位:" + degree);
    }

    public static void main(String[] args) {
        wanghaojie4_1Student Student = new wanghaojie4_1Student();
        wanghaojie4_1Undergraduate undergraduate = new wanghaojie4_1Undergraduate();
        undergraduate.degree("王豪杰", 18, "博士");
        Student.show();
        undergraduate.show();
    }
}
