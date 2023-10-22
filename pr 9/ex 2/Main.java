// Интерфейс Priceable с методом getPrice()
interface Priceable {
    double getPrice();
}

// Пример реализации интерфейса для класса "Товар"
class Product implements Priceable {
    private String name;
    private double price;

    // Конструктор класса
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Реализация метода из интерфейса Priceable
    @Override
    public double getPrice() {
        return price;
    }

    // Геттер для имени товара
    public String getName() {
        return name;
    }
}

// Пример реализации интерфейса для класса "Услуга"
class Service implements Priceable {
    private String description;
    private double hourlyRate;

    // Конструктор класса
    public Service(String description, double hourlyRate) {
        this.description = description;
        this.hourlyRate = hourlyRate;
    }

    // Реализация метода из интерфейса Priceable
    @Override
    public double getPrice() {
        // Для услуги возвращаем общую стоимость на основе почасовой ставки
        // (предполагаем, что услуга длится 1 час)
        return hourlyRate;
    }

    // Геттер для описания услуги
    public String getDescription() {
        return description;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты и вызываем метод getPrice() для каждого объекта
        Priceable product = new Product("Ноутбук", 800);
        Priceable service = new Service("Ремонт компьютера", 500);

        // Выводим цены объектов
        System.out.println("Цена товара " + ((Product) product).getName() + ": $" + product.getPrice());
        System.out.println("Цена услуги \"" + ((Service) service).getDescription() + "\": $" + service.getPrice());
    }
}

