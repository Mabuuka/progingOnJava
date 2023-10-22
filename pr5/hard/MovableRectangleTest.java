// Интерфейс Movable
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

// Класс MovablePoint реализует интерфейс Movable
class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    // Конструктор
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Переопределенные методы интерфейса Movable
    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    // Геттеры для скорости
    public int getXSpeed() {
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    // Метод toString() для вывода информации о точке
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// Класс MovableCircle реализует интерфейс Movable
class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    // Конструктор
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // Переопределенные методы интерфейса Movable
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    // Метод toString() для вывода информации о круге
    @Override
    public String toString() {
        return "Центр: " + center + ", Радиус: " + radius;
    }
}

// Класс MovableRectangle реализует интерфейс Movable
class MovableRectangle implements Movable {
    private MovablePoint topLeft;  // Верхняя левая точка
    private MovablePoint bottomRight;  // Нижняя правая точка

    // Конструктор
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        // Проверяем, что скорости верхней левой и нижней правой точек одинаковы
        if (!checkSpeeds()) {
            throw new IllegalArgumentException("Скорости верхней левой и нижней правой точек должны быть одинаковыми.");
        }
    }

    // Метод для проверки одинаковости скоростей двух точек
    private boolean checkSpeeds() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed() && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    // Переопределенные методы интерфейса Movable
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    // Метод toString() для вывода информации о прямоугольнике
    @Override
    public String toString() {
        return "Верхняя левая точка: " + topLeft + ", Нижняя правая точка: " + bottomRight;
    }
}

// Пример использования
public class MovableRectangleTest {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 2);
        System.out.println("Исходная точка: " + point);
        point.moveUp();
        System.out.println("Точка после перемещения вверх: " + point);

        MovableCircle circle = new MovableCircle(1, 1, 1, 1, 3);
        System.out.println("Исходный круг: " + circle);
        circle.moveRight();
        System.out.println("Круг после перемещения вправо: " + circle);

        MovableRectangle rectangle = new MovableRectangle(0, 0, 2, 2, 1, 1);
        System.out.println("Исходный прямоугольник: " + rectangle);
        rectangle.moveDown();
        System.out.println("Прямоугольник после перемещения вниз: " + rectangle);
    }
}
