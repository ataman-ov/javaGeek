import java.util.Random;
import java.util.Scanner;

public class GameRiddle {
    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 9");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строчкой ниже");
        int s = sc.nextInt();
        Random random = new Random();
        int[] x = new int[1];
        int max = 3;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(10);
            if (s == x[i]) {
                System.out.println("Поздравляю вы угадали число!");
            } else if (s > x[i]) {
                System.out.println("Введенно число больше загаданного");
            } else {
                System.out.println("Введенное число меньше загаданного");
            }
        sc.close();
        }

    }

}
