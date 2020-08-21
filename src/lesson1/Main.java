package lesson1;

public class Main {
    public static void main(String[] args) {
// byte, short, int, long, float, double, char, boolean  изученные типы переменных, которые нужно инициализировать
        byte a = 2;
        short b = 3;
        int c = 445;
        long f = 23333L;
        float d = 123.12f;
        char j = 12;
        boolean k = true;
        System.out.println(calculate(20, 50, 100, 20));
        System.out.println(task(5, 7));
        isPlusOrMinus(-50);
        System.out.println(isMinus(-10));
        greetings("Владислав");
    }

    // 3 задание. Написать метод, возвращающий результат a * (b + (c / d))

    public static int calculate(int a, int b, int c, int d) {

        return a * (b + (c / d));
    }

//Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;


    public static boolean task(int a, int b) {

        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;


        } else {

            return false;
        }

    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void isPlusOrMinus(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean isMinus(int x) {
        if (x <= 0) {
            return true;
        } else {
            return false;
        }

    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    public static void greetings(String name) {
        System.out.println("Привет, " + name);
    }
}

