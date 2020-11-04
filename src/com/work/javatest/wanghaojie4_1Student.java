package com.work.javatest;

public class wanghaojie4_1Student {
    private int age;
    private String name;

    public wanghaojie4_1Student() {
    }

    public wanghaojie4_1Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("姓名"+this.getName()+"年龄"+this.getAge());
    }
}
