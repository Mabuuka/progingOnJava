// Интерфейс Nameable с методом getName()
interface Nameable {
    String getName();
}

// Пример реализации интерфейса для класса "Планета"
class Planet implements Nameable {
    private String name;

    // Конструктор класса
    public Planet(String name) {
        this.name = name;
    }

    // Реализация метода из интерфейса Nameable
    @Override
    public String getName() {
        return name;
    }
}

// Пример реализации интерфейса для класса "Машина"
class Car implements Nameable {
    private String name;

    // Конструктор класса
    public Car(String name) {
        this.name = name;
    }

    // Реализация метода из интерфейса Nameable
    @Override
    public String getName() {
        return name;
    }
}

// Пример реализации интерфейса для класса "Животное"
class Animal implements Nameable {
    private String name;

    // Конструктор класса
    public Animal(String name) {
        this.name = name;
    }

    // Реализация метода из интерфейса Nameable
    @Override
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты и вызываем метод getName() для каждого объекта
        Nameable planet = new Planet("Земля");
        Nameable car = new Car("Toyota");
        Nameable animal = new Animal("Лев");

        // Выводим имена объектов
        System.out.println("Название планеты: " + planet.getName());
        System.out.println("Марка машины: " + car.getName());
        System.out.println("Вид животного: " + animal.getName());
    }
}
