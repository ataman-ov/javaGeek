public class dz2 {
    public static void main(String[] args) {
        /*
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]
         *С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */

            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }

        /*
         * 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         */
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
            System.out.println(arr2[i]);
        }

        /*
         * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                System.out.println(arr3[i] * 2);
            }
        }

        /*
         *4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */

        int[][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                arr4[i][i] = 1;
                System.out.print(arr4[i][j]);
            }
            System.out.println();

        }

        /*
         * Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
         */
        int[] a = new int[]{1, 5, 3, 2, 11, 22, 12, 50, 4, 8, 9, 84};
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}