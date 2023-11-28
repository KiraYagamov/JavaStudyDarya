package com.KiraYagamov.DaryaLessons.FirstLessons;

public class Square extends Shape {
    public Square (float w, float h){
        height = h;
        width = w;
    }
    public Square (){
        height = 1;
        width = 1;
    }
    public void draw(){
        System.out.println(height * width);
    }

    @Override
    public void hello() {
        System.out.println("Hi");
    }
}
