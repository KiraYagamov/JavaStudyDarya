package com.KiraYagamov.DaryaLessons;

public class Duck extends Bird{
    public Duck() {
        type = "Утка";
    }
    @Override
    public void fly() {
        System.out.println("Медленный полёт");
    }
}
