package com.KiraYagamov.DaryaLessons.ElevenDecember;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
    public void start(){
        try {
            ArrayList<String> list = null;
            list.add("sdf");
        }
        catch (NullPointerException ex){
            throw ex;
        }
    }
}