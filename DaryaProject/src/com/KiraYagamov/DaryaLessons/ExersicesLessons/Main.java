package com.KiraYagamov.DaryaLessons.ExersicesLessons;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
    public void start(){
        System.out.println("Hi");
    }









    public void binNums(){
        int num = 1;
        while(num < 1000){
            System.out.print(num + " ");
            num *= 2;
        }
    }

    public void rocksVoid(){
        List<Rock> rocks = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            rocks.add(new Rock(i));
        }
        for (Rock rock: rocks) {
            System.out.println(rock.index + " " + rock.isLucky);
        }
        for(int i = 0; i < rocks.size(); i++){
            if(rocks.get(i).isLucky){
                System.out.println(rocks.get(i).index);
                break;
            }
        }
    }
}