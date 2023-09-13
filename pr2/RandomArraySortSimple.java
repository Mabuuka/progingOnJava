import java.util.Arrays; // пакет для работы с массивами(используется для преобразования массива в строку для вывода на экран)
import java.util.Random; // пакет для генерации случайных чисел

public class RandomArraySortSimple {
    public static void main(String[] args) {
        // Генерируем случайный массив
        int[] array = generateRandomArray(10, 1, 100);

        // Выводим исходный массив на экран с использованием метода Arrays.toString
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Сортируем массив по возрастанию
        Arrays.sort(array);

        // Выводим отсортированный массив на экран с использованием метода Arrays.toString
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    // Метод для генерации случайного массива целых чисел
    public static int[] generateRandomArray(int length, int minValue, int maxValue) {
        int[] array = new int[length]; // Создаем новый массив

        Random random = new Random(); // Создаем объект для генерации случайных чисел

        for (int i = 0; i < length; i++) {
            // Заполняем массив случайными числами в заданном диапазоне
            array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }

        return array; // Возвращаем сгенерированный массив
    }
}
