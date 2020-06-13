import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 11;
        byte bb = 127;
        short s = 32;
        long l = 99;
        float f = 2.23f;
        double dd = 3.30d;
        char cr = 'c';
        boolean True = true;
        boolean False = false;
        System.out.println(i + ", " + bb + ", " + s + ", " + l + ", " + f + ", " + dd + ", " + cr + ", " + True + ", " + False);

        int call = calculate(5, 4, 10, 15);
        System.out.println(call);

        System.out.println(task10and20(8, 19)); //boolean task = task10and20(8, 19);

        isPositiveOrNegative(28); // примененние без переменных

        System.out.println(isNegative(57)); //boolean numbool = isNegative(57);

        greetings("Марк");

        System.out.println(eighth(2012, 2016, 2020, 2024));


    }

    public static int calculate(int a, int b, int c, int d) {
        int sum = (a * (b + (c / d)));
        return sum;
    }

    public static boolean task10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x % 2 != 0) {
            System.out.println("Отрицательное число " + x);
        } else {
            System.out.println("Положитльное число " + x);
        }
    }

    public static boolean isNegative(int x) {
        if (x % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void greetings(String name) {
        System.out.println(name);
    }

//    public static void year(int x) {
//        if (x  2 == 4 ) {
//            System.out.println("Невисокосный год " + x);
//        } else {
//            System.out.println("Високосный год " + x);
//        }
//    }

//    public static boolean eighth(int year){
//        return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
//    }
//}

}

