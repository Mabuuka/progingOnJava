// Абстрактный родительский класс Shape
abstract class Shape {
    private String color;
    private boolean filled;

    // Конструкторы
    public Shape() {
        this.color = "неизвестен";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Геттеры и сеттеры
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Абстрактные методы
    abstract double getArea();
    abstract double getPerimeter();

    // Переопределенный метод toString() с модификатором доступа public
    @Override
    public String toString() {
        return "Фигура{" +
                "цвет='" + color + '\'' +
                ", заполнен=" + filled +
                '}';

    }
}

// Дочерний класс Circle, наследующийся от Shape
class Circle extends Shape {
    private double radius;

    // Конструкторы
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Переопределенные методы
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Круг{" +
                "радиус=" + radius +
                ", цвет='" + getColor() + '\'' +
                ", заполнен=" + isFilled() +
                '}';
    }
}

// Дочерний класс Rectangle, наследующийся от Shape
class Rectangle extends Shape {
    private double width;
    private double length;

    // Конструкторы
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Геттеры и сеттеры
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Переопределенные методы
    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Прямоугольник{" +
                "ширина=" + width +
                ", длина=" + length +
                ", цвет='" + getColor() + '\'' +
                ", заполнен=" + isFilled() +
                '}';
    }
}

// Дочерний класс Square, наследующийся от Rectangle
class Square extends Rectangle {
    private double side;

    // Конструкторы
    public Square() {
        this.side = 1.0;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    // Геттеры и сеттеры
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Переопределенные методы
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Квадрат{" +
                "Сторона=" + side +
                ", Цвет='" + getColor() + '\'' +
                ", Заполнен=" + isFilled() +
                '}';
    }
}

// Класс для тестирования
public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "Красный", true);
        Shape rectangle = new Rectangle(4.0, 6.0, "Синий", false);
        Shape square = new Square(3.0, "Зелёный", true);

        System.out.println(circle);
        System.out.println("Площадь: " + circle.getArea() + ", Периметр: " + circle.getPerimeter());

        System.out.println(rectangle);
        System.out.println("Площадь: " + rectangle.getArea() + ", Периметр: " + rectangle.getPerimeter());

        System.out.println(square);
        System.out.println("Площадь: " + square.getArea() + ", Периметр: " + square.getPerimeter());
    }
}

//Полиморфизм позволяет объектам разных классов быть обработанными общим способом через их общий суперкласс (Shape в данном случае).

//Ошибка возникает, когда пытаемся вызвать методы, которые определены только в классах-потомках (Circle, Rectangle, Square),
//но не определены в суперклассе (Shape). Переменная типа Shape не имеет доступа к методам, определенным только в подклассах.

//Низходящее приведение должно быть осуществлено только к тем типам, которые объект действительно имеет.
//Попытка привести объект к неверному типу приведет к ошибке компиляции
