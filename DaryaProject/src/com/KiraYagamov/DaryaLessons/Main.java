package com.KiraYagamov.DaryaLessons;

public class Main {

    public static void main(String[] args) {
        long num = (long) (3 * Math.pow(125, 6) + 2 * Math.pow(25, 9) + Math.pow(5, 12) - 625);
        String newNum = Lesson1HW.toAnotherSystem(num, 5);
        System.out.println(Lesson1HW.zeroCount(newNum));
    }











//    public static void main(String[] args) {
//        for(int n = 100; n < 1000; n++){
//            String bin = Lesson1HW.toBin(n);
//            bin = Lesson1HW.editBin(bin);
//            bin = Lesson1HW.editBin(bin);
//            bin = Lesson1HW.editBin(bin);
//            // перевод из двоичной системы в десятичую
//            int result = Integer.parseInt(bin, 2);
//            if(result % 4 == 0){
//                System.out.println(n);
//                break;
//            }
//        }
//    }

//    public static void main(String[] args){
////        int targetResult = 1418;
////        int result;
////
////        for (int i = 1000; i < 10000; i++) {
////
////            String strNum = String.valueOf(i);
////            char[] chars = new char[4];
////            chars[0] = strNum.charAt(0);
////            chars[1] = strNum.charAt(1);
////            chars[2] = strNum.charAt(2);
////            chars[3] = strNum.charAt(3);
////
////            // вычисляем суммы
////            int firstSum = Integer.parseInt(String.valueOf(chars[0])) + Integer.parseInt(String.valueOf(chars[1]));
////            int secondSum = Integer.parseInt(String.valueOf(chars[1])) + Integer.parseInt(String.valueOf(chars[2]));
////            int thirdSum = Integer.parseInt(String.valueOf(chars[2])) + Integer.parseInt(String.valueOf(chars[3]));
////
////            // находим два наибольших значения сумм
////            int max1 = Math.max(Math.max(firstSum, secondSum),thirdSum);
////            int max2;
////
////            if (max1 == firstSum ){ // Если max1 равно значению firstSum, это означает, что первая сумма
////                // (сумма первой и второй цифры) является наибольшей суммой.
////                max2 = Math.max(secondSum,thirdSum);
////            } else if(max1 == secondSum) { // Если max1 равно значению secondSum, это означает, что вторая сумма
////                // (сумма второй и третьей цифры) является наибольшей суммой.
////                max2 = Math.max(firstSum, thirdSum);
////            } else{ // В противном случае (когда max1 равно значению thirdSum), третья сумма
////                // (сумма третьей и четвертой цифры) является наибольшей суммой.
////                max2 = Math.max(firstSum, secondSum);
////            }
////            // складываем наибольшие суммы
////
////            result = Integer.parseInt((String.valueOf(max2) + String.valueOf(max1)));
////
////            if (targetResult == result) {
////                System.out.println(i);
////                break;
////            }
//        }
//    }
////    public static void main(String[] args) {
////        Lesson1HW lesson = new Lesson1HW();
////        lesson.Start();
////    }
////        public static void main(String[] args) {
////            for(int n = 0; n < 100; n++) {
////                String r = Integer.toBinaryString(n);
////                int sum = 0;
////                for (int i = 0; i < r.length(); i++) {
////                    char digit = r.charAt(i);
////                    if (digit == '1') {
////                        sum += 1;
////                    }
////                }
////                if (sum % 2 != 0) {
////                    r = r + "11";
////                } else {
////                    r = r + "00";
////                }
////                int rDec = Integer.parseInt(r, 2);
////                if(rDec > 114) {
////                    System.out.println(rDec);
////                    break;
////                }
////            }
//            }
}
