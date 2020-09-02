package lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lesson2 {

    public static void main(String[] args) {

// Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;Вывод для удобства восприятия.
   /*     int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;

        }
        System.out.println(Arrays.toString(arr));

        //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;Вывод для удобства восприятия, когда делал.
        int[] arr2 = new int[8];
        int j = 0;
        for (int i = 0; i < arr2.length; i++, j = j + 3) {
            arr2[i] = j;
        }
        System.out.println(Arrays.toString(arr2));
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2; Вывод для удобства восприятия, когда делал.
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] = arr3[i] * 2;
        }
        System.out.println(Arrays.toString(arr3));
*/
        // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][5 - i - 1] = 1;


        }
        for (int b = 0; b < 5; b++) {                  //выводить не надо было.
            for (int k = 0; k < 5; k++) {
                System.out.print(arr4[b][k] + " ");
            }
            System.out.println();
        }

        int[] arr5 = {1, 2, 3, 4, 5};
        System.out.println(arr5[4]);
        System.out.println(arr5[3]);
        System.out.println(arr5[2]);
        System.out.println(arr5[1]);
        System.out.println(arr5[0]);
        System.out.println();
        for (int i = arr5.length; i > 0; i--) {
            //       System.out.println(arr5[(arr5.length -1 -i)]);
            System.out.println(arr5[i - 1]);
        }
    }
}





