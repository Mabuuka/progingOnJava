//5. Сумма цифр числа
public class Main {
    public static void main(String[] args) {
        int N = 123456789; // Натуральное число

        int sum = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна: " + sum);
    }

    // Рекурсивная функция для вычисления суммы цифр числа
    private static int sumOfDigits(int num) {
        // Базовый случай: если число состоит из одной цифры, возвращаем это число
        if (num < 10) {
            return num;
        }

        // Выделяем последнюю цифру числа
        int lastDigit = num % 10;

        // Рекурсивно вызываем функцию для оставшейся части числа и прибавляем последнюю цифру
        return lastDigit + sumOfDigits(num / 10);
    }
}
