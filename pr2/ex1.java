public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Используем цикл for для вычисления суммы
        int sumFor = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumFor += numbers[i];
        }
        System.out.println("Сумма элементов массива (for): " + sumFor);

        // Используем цикл while для вычисления суммы
        int sumWhile = 0;
        int indexWhile = 0;
        while (indexWhile < numbers.length) {
            sumWhile += numbers[indexWhile];
            indexWhile++;
        }
        System.out.println("Сумма элементов массива (while): " + sumWhile);

        // Используем цикл do-while для вычисления суммы
        int sumDoWhile = 0;
        int indexDoWhile = 0;
        do {
            sumDoWhile += numbers[indexDoWhile];
            indexDoWhile++;
        } while (indexDoWhile < numbers.length);
        System.out.println("Сумма элементов массива (do-while): " + sumDoWhile);
    }
}
