package com.work.javatest;

public class wanghaojie3_1test {
    public static void main(String[] args) {
        wanghaojie3_1Student student = new wanghaojie3_1Student();
        student.setName("王豪杰");
        student.setChengji(100);
        System.out.println("姓名:"+student.getName()+" 成绩:"+student.getChengji());
        wanghaojie3_1Student student1 = new wanghaojie3_1Student("王豪",100);
        System.out.println("姓名:"+student1.getName()+" 成绩:"+student1.getChengji());
    }
}
