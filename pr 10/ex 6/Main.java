//6. Проверка числа на простоту
//Простые числа меньше 100 включают: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 и 97.
public class Main {
    public static void main(String[] args) {
        int n = 31; // Проверяемое число

        String result = isPrime(n, 2) ? "YES" : "NO";
        System.out.println("Число " + n + " " + result);
    }

    // Рекурсивная функция для проверки числа на простоту
    private static boolean isPrime(int n, int divisor) {
        // Базовый случай: если делитель стал больше квадратного корня из n, число простое
        if (divisor * divisor > n) {
            return true;
        }

        // Если n делится на divisor без остатка, число составное
        if (n % divisor == 0) {
            return false;
        }

        // Рекурсивно проверяем следующий делитель
        return isPrime(n, divisor + 1);
    }
}
