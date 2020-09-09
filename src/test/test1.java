package test;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {
    public static void main(String args[]) {
//Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        /*int[] arr = new int[8];
        int j = 0;
        for (int i = 0; i < arr.length; i++, j = j + 2) {
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));*/

        int[] arr2 = {1, 3, 2, 4, 9, 6, 8, 7, 5};
        for (int i = 0; i < arr2.length; i++) {
            int max = arr2[0];
            int min = arr2[0];
            if (arr2[i] > max) {
                max = arr2[i];
            }if (arr2[i]<min){
                min = arr2[i];
            }System.out.println(max + " " + min);
        }



      /*  System.out.println(revenge(10, 20));
        System.out.println(second(20, 30));
        plusOrMinus((-5));
        System.out.println(ifMinus(-6));*/
//Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

      /*  int[] arr2 = {1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 1) {
                arr2[i] = 0;
            } else {
                arr2[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr2));*/

        //   Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        /*int[] arr = new int[9];
        int j = 0;
        for (int i = 0; i < arr.length; i++, j = j + 3) {
            arr[i] = j;
            System.out.println(j);
        }*/
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
      /*  int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));*/
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
       /* int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][5 - i - 1] = 1;
        }
        for (int b = 0; b < 5; b++) {                  //выводить не надо было.
            for (int k = 0; k < 5; k++) {
                System.out.print(arr[b][k] + " ");
            }
            System.out.println();
        }*/
    }

    /*public static int revenge(int a, int b) {
        return a + b;
    }

    // Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean second(int a, int b) {
        if ((a + b) > 10 && (a + b) < 20) {
            return true;
        } else {
            return false;
        }

    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void plusOrMinus(int a) {
        if (a >= 0) {
            System.out.println("Plus");
        } else {
            System.out.println("Minus");
        }
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean ifMinus(int a) {
        return a < 0;
    }*/
}

