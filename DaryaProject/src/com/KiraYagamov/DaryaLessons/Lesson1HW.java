package com.KiraYagamov.DaryaLessons;

public class Lesson1HW {
    public void Start(){
        for(int i = 0; i < 100; i++) {
            String bin = toBin(i);
            if (binCount(bin) % 2 == 0) {
                bin += "00";
            } else {
                bin += "11";
            }
            int result = Integer.parseInt(bin, 2);
            if(result > 114) {
                System.out.println(result);
                break;
            }
        }
    }
    // для перевода в двочиную запись
    public static String toBin(int num){
        String bin = "";
        while (num > 0){
            bin = (num % 2) + bin;
            num = (int) num / 2;
        }
        return bin;
    }
    public int binCount(String bin){
        int count = 0;
        for(int i = 0; i < bin.length(); i++){
            if(bin.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    // изменение двоичного числа в зависимоти от количества в нем нулей и единиц
    public static String editBin(String bin){
        int oneCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < bin.length(); i++){
            char sim = bin.charAt(i);
            if(sim == '0'){
                zeroCount++;
            }
            else{
                oneCount++;
            }
        }
        if(oneCount == zeroCount){
            bin += bin.charAt(bin.length()-1);
        }
        else if(oneCount > zeroCount){
            bin += '0';
        }
        else{
            bin += '1';
        }
        return bin;
    }

    // Для 14 задания
    public static String toAnotherSystem(long num, int system){
        String newNum = "";
        while (num > 0){
            newNum = (num % system) + newNum;
            num = (long) num / system;
        }
        return newNum;
    }
    public static int zeroCount(String strNum){
        int count = 0;
        int notZeroIndex = -1;

        // ищем первый символ не 0
        for(int i = 0; i < strNum.length(); i++){
            if(strNum.charAt(i) != '0'){
                notZeroIndex = i;
                break;
            }
        }

        // считаем количество значащих нулей
        if(notZeroIndex != -1) {
            for (int i = notZeroIndex; i < strNum.length(); i++) {
                if(strNum.charAt(i) == '0'){
                    count++;
                }
            }
        }
        return count;
    }
}
