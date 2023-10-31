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
    public String toBin(int num){
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
}
