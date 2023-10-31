package com.KiraYagamov.DaryaLessons;

public class TestObject {
    int size = 5;
    String color = "Red";

    public void getSize(){
        System.out.println(size);
    }
    public void setSize(int s){
        size = s;
    }

    public static void hello(int num){
        System.out.println();
    }
    public int square(int num){
        return num*num;
    }
    public boolean chet(int num){
        return num%2 == 0;
    }
}