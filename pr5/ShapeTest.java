// Абстрактный родительский класс Shape
abstract class Shape {
    abstract void draw();
}

// Дочерний класс Circle, наследующийся от Shape
class Circle extends Shape {  //extends - ключевое слово в Java, используемое для наследования
    @Override
    void draw() {
        System.out.println("Рисуем круг");
    }
}

// Дочерний класс Rectangle, наследующийся от Shape
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Рисуем прямоугольник");
    }
}

// Дочерний класс Square, наследующийся от Shape
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Рисуем квадрат");
    }
}

// Класс для тестирования
public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();

        circle.draw(); // Выводит: Рисуем круг
        rectangle.draw(); // Выводит: Рисуем прямоугольник
        square.draw(); // Выводит: Рисуем квадрат
    }
}

//В этом примере создается абстрактный класс Shape и его дочерние классы Circle, Rectangle и Square.
//Класс ShapeTest содержит метод main, который создает объекты каждого типа и вызывает их метод draw(), чтобы продемонстрировать полиморфизм в Java.


