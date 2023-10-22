// Класс, описывающий модель окружности
class Circle {
    private double radius; // радиус окружности

    // Конструктор для создания объекта окружности с указанным радиусом
    public Circle(double radius) {
        this.radius = radius;
    }

    // Метод для получения радиуса окружности
    public double getRadius() {
        return radius;
    }

    // Метод для изменения радиуса окружности
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Метод для вычисления площади окружности
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Класс для тестирования класса Circle
public class CircleTest {
    public static void main(String[] args) {
        // Создаем объект окружности с радиусом 5
        Circle circle = new Circle(5);

        // Выводим радиус и площадь окружности
        System.out.println("Радиус окружности: " + circle.getRadius());
        System.out.println("Площадь окружности: " + circle.calculateArea());

        // Изменяем радиус окружности
        circle.setRadius(7);

        // Выводим обновленный радиус и площадь окружности
        System.out.println("Новый радиус окружности: " + circle.getRadius());
        System.out.println("Новая площадь окружности: " + circle.calculateArea());
    }
}
