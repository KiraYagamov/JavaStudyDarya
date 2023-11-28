package com.KiraYagamov.DaryaLessons.FirstLessons;

public abstract class Bird {
    protected String type;
    public abstract void fly();
    public void setType(String t){
        type = t;
    }
    public void getType(){
        System.out.println(type);
    }
}