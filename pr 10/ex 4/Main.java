//4. Заданная сумма цифр
public class Main {
    public static void main(String[] args) {
        int k = 3; // Количество цифр в числе
        int s = 15; // Сумма цифр

        int count = countNumbersWithSum(k, s);
        System.out.println("Количество " + k + "-значных чисел, сумма цифр которых равна " + s + ": " + count);
    }

    // Рекурсивная функция для подсчета чисел
    private static int countNumbersWithSum(int k, int s) {
        // Базовый случай: если k равно 1, то у нас только одна цифра
        if (k == 1) {
            // Проверяем, что s находится в диапазоне от 1 до 9 (включительно)
            if (s >= 1 && s <= 9) {
                return 1; // Найдено одно подходящее число
            } else {
                return 0; // Нет подходящих чисел для этой суммы
            }
        }

        int count = 0;
        // Рекурсивно перебираем цифры от 0 до 9
        for (int i = 0; i <= 9; i++) {
            // Проверяем, что оставшаяся сумма (s - i) больше либо равна 0 и вызываем функцию для (k - 1) цифры
            if (s - i >= 0) {
                count += countNumbersWithSum(k - 1, s - i);
            }
        }

        return count;
    }
}
