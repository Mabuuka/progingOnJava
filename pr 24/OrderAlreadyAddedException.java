// Исключение, представляющее ситуацию, когда заказ уже был добавлен
public class OrderAlreadyAddedException extends RuntimeException {
    // Конструктор, принимающий сообщение об ошибке
    public OrderAlreadyAddedException(String message) {
        super(message);
    }
}
