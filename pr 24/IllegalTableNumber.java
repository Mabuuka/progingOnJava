// Исключение, представляющее некорректный номер стола
public class IllegalTableNumber extends RuntimeException {
    // Конструктор, принимающий сообщение об ошибке
    public IllegalTableNumber(String message) {
        super(message);
    }
}
