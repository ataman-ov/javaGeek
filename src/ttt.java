public class ttt {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        checkArray(array);
//        System.out.println(array);
        printArray(array);
    }

    static void checkArray(int[] array) {
        int sum_part_left = 0;
        int sum_part_right = 0;
        for (int i = 0; i < array.length; i++) {
            sum_part_left += array[i];
            for (int j = 1; j < array[i]; j++) {
                sum_part_right += array[j];
            }
            if (sum_part_left == sum_part_right) {

            }
        }
    }

    static void printArray (int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("[" + i + "] => " + a[i]);
        }
    }

}
//
//            if (i == 0) {
//                sum_part_left = a[i];
//                System.out.println("sum_part_left");
//                System.out.println(a[i]);
//            } else if  (i == a.length -1) {
//                sum_part_right = a[i];
//                System.out.println("sum_part_right");
//                System.out.println(a[i]);
//            }
//            for (int j = 1; j < i ; j++) {
//
//            }






            // вычеслить кол-во цыклов суммы правых элементов тип значений int
            // создать цинкл на кол-во циклов i
            // что нужно понять программе то ей нужно пробидаться по остальным элементам - нужно пройтись по 8 элемента -1 первый
            // обявляем путсую переменную
            // фор от 1 до 7 i.length
//          a[1:]
