import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine()); // Здесь выбирается число, для которого мы хотим вычислить факториал
        long factorial = calculateFactorial(number); // Вызываем метод calculateFactorial и сохраняем результат в переменной factorial

        System.out.println("Факториал числа " + number + " равен " + factorial); // Выводим результат на экран
    }

    // Метод для вычисления факториала с использованием цикла
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел."); // Проверяем, что число неотрицательное
        }

        long result = 1; // Инициализируем результат факториала как 1

        // Используем цикл for для вычисления факториала
        for (int i = 1; i <= n; i++) {
            result *= i; // Умножаем текущий результат на текущее число i
        }

        return result; // Возвращаем вычисленный факториал
    }
}

//!!  код использует тип long для хранения результата факториала,
//!!  и он ограничен значением Long.MAX_VALUE, которое равно 2^63 - 1 (приблизительно 9.2 * 10^18).
//!!  Факториал числа 26 уже больше этого значения и приводит к переполнению.
