package com.KiraYagamov.DaryaLessons.FirstLessons;

public abstract class Shape {
    float height;
    float width;
    public void draw(){
        System.out.println("Стандартный вывод");
    }
    public abstract void hello();
}