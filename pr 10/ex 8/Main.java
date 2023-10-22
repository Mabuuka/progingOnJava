//8. Палиндром
//Палиндром - это слово, фраза, число или другая последовательность символов, которая читается одинаково вперед и назад
public class Main {
    public static void main(String[] args) {
        String word = "radar"; // Входное слово
        String result = isPalindrome(word) ? "YES" : "NO";
        System.out.println(result);
    }

    // Рекурсивная функция для проверки, является ли слово палиндромом
    private static boolean isPalindrome(String word) {
        // Базовый случай: если длина слова меньше или равна 1, это палиндром
        if (word.length() <= 1) {
            return true;
        }

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        // Если первый и последний символы не совпадают, это не палиндром
        if (firstChar != lastChar) {
            return false;
        }

        // Рекурсивно проверяем подстроку между первым и последним символами
        return isPalindrome(word.substring(1, word.length() - 1));
    }
}
