package lesson3;

import java.util.Random;
import java.util.Scanner;


// Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
public class lesson3 {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Игра: Отгадай число");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        do{
        int count = 0;
        int playerAnswer = -1;
        int compNumber = random.nextInt(10);
         while (count < 3 && playerAnswer != compNumber) {
                System.out.print("Введите число от 0 до 9: ");
                playerAnswer = sc.nextInt();
                if (compNumber != playerAnswer) {
                    System.out.println("Your number is " +
                            ((playerAnswer > compNumber) ? "greater" : "less"));
                    count++;
                }
            }
            System.out.println("You " +
                    ((playerAnswer == compNumber) ? "WIN!" : "Lose: " + compNumber));

            System.out.println("Repeat game? Yes - 1, No - 0");
        } while (sc.nextInt() == 1);


    }
}

