package com.KiraYagamov.DaryaLessons.ElevenDecember;

public class Crow implements IBird {
    @Override
    public void fly() {
        System.out.println("Ворона летит");
    }

    @Override
    public void doSound() {

    }
    public void jump(){
        System.out.println("Jump");
    }
}