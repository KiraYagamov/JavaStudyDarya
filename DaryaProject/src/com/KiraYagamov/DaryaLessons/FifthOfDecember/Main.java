package com.KiraYagamov.DaryaLessons.FifthOfDecember;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.draw(100);
    }

    public void start(int num){
        switch (num){
            case 5: System.out.println("Пятерка"); break;
            case 10: System.out.println("Десятка"); break;
            default: System.out.println(num); break;
        }
    }

    public String toTrinary(int num){
        String result = "";
        while(num > 0){
            result = num%3 + result;
            num /= 3;
        }
        return result;
    }

    public void draw(int size){
        int pos1 = size/2;
        int pos2 = size/2;
        if(size%2 == 0){
            pos1--;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(j == pos1 || j == pos2 || i == size/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            pos1--;
            pos2++;
            System.out.println();
        }
    }
}
