//7. Разложение на множители
public class Main {
    public static void main(String[] args) {
        int n = 110; // Проверяемое число
        System.out.println("Простые множители числа " + n + ":");
        primeFactors(n, 2); // Начинаем с делителя 2
    }

    // Рекурсивная функция для вывода всех простых множителей числа n в порядке не убывания
    private static void primeFactors(int n, int divisor) {
        // Базовый случай: если n стало меньше или равно 1, завершаем рекурсию
        if (n <= 1) {
            return;
        }

        // Если n делится на divisor, выводим divisor и продолжаем с n / divisor
        if (n % divisor == 0) {
            System.out.println(divisor);
            primeFactors(n / divisor, divisor);
        }
        // Если n не делится на divisor, увеличиваем divisor и продолжаем
        else {
            primeFactors(n, divisor + 1);
        }
    }
}
