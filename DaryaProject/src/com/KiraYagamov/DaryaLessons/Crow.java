package com.KiraYagamov.DaryaLessons;

public class Crow extends Bird{
    public Crow() {
        type = "Ворона";
    }

    @Override
    public void fly() {
        System.out.println("Полёт");
    }
}
