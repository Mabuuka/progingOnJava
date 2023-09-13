public class Ball {
    // Поля для хранения координат шара
    double x = 0.0, y = 0.0;

    // Конструктор, который принимает начальные координаты x и y
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Пустой конструктор, инициализирует координаты по умолчанию (0, 0)
    public Ball() { }

    // Геттер для получения значения x
    public double getX() {
        return x;
    }

    // Сеттер для установки значения x
    public void setX(double x) {
        this.x = x;
    }

    // Геттер для получения значения y
    public double getY() {
        return y;
    }

    // Сеттер для установки значения y
    public void setY(double y) {
        this.y = y;
    }

    // Метод для установки новых координат x и y одновременно
    public void setXY(double x, double y){
        setX(x);
        setY(y);
    }

    // Метод для перемещения шара на указанное смещение(displacement) по x и y
    public void move(double xDisp, double yDisp){
        setX(x + xDisp);
        setY(y + yDisp);
    }

    // Переопределение метода toString() для удобного вывода информации о шаре
    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
