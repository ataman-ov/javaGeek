public class dz3 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doTesk(numbers);
        printArray(numbers);
    }

    static void doTesk(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
        }
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("[" + i + "] => " + a[i]);

        }
    }
}

