package com.KiraYagamov.DaryaLessons;

public class Main {

    public static void main(String[] args){
        Bird bird = new Crow();
        bird.getType();
        bird.setType("Гусь");
        bird.getType();
    }
//    public static void main(String[] args) {
//        Lesson1HW lesson = new Lesson1HW();
//        lesson.Start();
//    }
//        public static void main(String[] args) {
//            for(int n = 0; n < 100; n++) {
//                String r = Integer.toBinaryString(n);
//                int sum = 0;
//                for (int i = 0; i < r.length(); i++) {
//                    char digit = r.charAt(i);
//                    if (digit == '1') {
//                        sum += 1;
//                    }
//                }
//                if (sum % 2 != 0) {
//                    r = r + "11";
//                } else {
//                    r = r + "00";
//                }
//                int rDec = Integer.parseInt(r, 2);
//                if(rDec > 114) {
//                    System.out.println(rDec);
//                    break;
//                }
//            }
//        }
}
