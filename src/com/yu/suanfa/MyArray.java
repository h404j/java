package com.yu.suanfa;

public class MyArray {
    private  int[] array;
    private  int size;

    public MyArray(int cap) {
        this.array = new int[cap];
        size = 0;
    }
    public void insert(int index,int element)throws Exception{
        if (index<0||index>size){
            throw new IndexOutOfBoundsException("超过数组实际元素范围");
        }
        for (int i=size-1;i>=index;i--){
            array[i+1]=array[i];
        }
        array[index]=element;
        size++;
    }
    public  void output(){
        for (int i = 0; i <size ; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        MyArray myArray=new MyArray(10);
        myArray.insert(0,3);

       myArray.insert(1,7);
       myArray.insert(2,9);


      
 

    }
}
