package com.yu.day1;

public abstract class Animal {
    String specie;
    int high;

    public Animal() {
    }

    public Animal(String specie, int high) {
        this.specie = specie;
        this.high = high;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public abstract void eat();
    public abstract void run();
    public void die(){
        System.out.println("死亡");
    }
}
