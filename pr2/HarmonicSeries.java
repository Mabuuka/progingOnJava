public class HarmonicSeries {
    public static void main(String[] args) {
        int n = 10; // Количество чисел в ряду

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        for (int i = 1; i <= n; i++) {
            double harmonicNumber = 1.0 / i; // Расчет очередного числа гармонического ряда
            System.out.println(harmonicNumber);
        }
    }
}
