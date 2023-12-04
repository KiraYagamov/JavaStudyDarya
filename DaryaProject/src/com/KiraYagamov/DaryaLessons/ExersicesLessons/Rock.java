package com.KiraYagamov.DaryaLessons.ExersicesLessons;

import java.util.Random;

public class Rock {
    boolean isLucky;
    int index;

    public Rock(int index){
        this.index = index;
        Random random = new Random();
        isLucky = random.nextBoolean();
    }
}
