package com.KiraYagamov.DaryaLessons;

public class Round extends Shape {
    private float radius;
    public Round(float h, float w){
        height = h;
        width = w;
        radius = height/2;
    }
    public Round(){
        height = 1;
        width = 1;
        radius = height/2;
    }
    public void draw(){
        System.out.println(Math.PI * radius * radius);
    }

    @Override
    public void hello() {
        System.out.println("Hello world");
    }

    public void length(){
        System.out.println(2 * Math.PI * radius);
    }
}