package com.KiraYagamov.DaryaLessons.FirstLessons;

/** Автомат обрабатывает натуральное число N по следующему алгоритму:
 1.Строится двоичная запись числа N.
 2.В конец двоичной записи добавляются две первые цифры этой записи в обратном порядке.
 3.Результат переводится в десятичную систему и выводится на экран.
 Пример.Дано число N = 11. Алгоритм работает следующим образом:
 1.Двоичная запись числа N: 1011.
 2.В конец записи добавляются цифры 01 - первые две цифры в обратном порядке (сначала вторая, затем первая), получается 101101.
 3.На экран выводится число 45.
 При каком наименьшем исходном N результат на экране автомата будет больше 74?
 *
 */

public class HW0511 {
    public static void Start() {

        int smallestN = -1; // Инициализируем переменную, чтобы хранить наименьшее N


        for( int n = 1; n < 1000; n++) {

            String toBin = Integer.toBinaryString(n); // для получения двоичной записи числа n
            String result;

            if (toBin.length() >= 2) {
                String firstTwoDigits = toBin.substring(0, 2);// Получаем первые две цифры
                String reverseDigits = new StringBuilder(firstTwoDigits).reverse().toString();// Переворачиваем их

                result = toBin + reverseDigits; // Добавляем перевернутые цифры в конец


                int resultToDecimal = Integer.parseInt(result, 2);// преобразуем  рез-тат в десятичное число

                if (resultToDecimal > 74) {
                    smallestN = n;// Обновляем наименьшее значение N
                    break; // Выходим из цикла, так как условие выполнено
                }
            }
        }
        if (smallestN != -1) {
            System.out.println("Наименьшее N, при котором результат > 74: " + smallestN);
        } else {
            System.out.println("Результат не может быть больше 74 для всех N < 1000.");
        }



    }







}