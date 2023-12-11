import java.util.Arrays;

// Интерфейс представляющий заказ
public interface Order {
    // Добавляет элемент в заказ
    boolean addItem(Item item);

    // Удаляет элемент из заказа по его имени
    boolean removeItem(String itemName);

    // Удаляет все элементы с заданным именем и возвращает их количество
    int removeAll(String itemName);

    // Возвращает общее количество элементов в заказе
    int getTotalCount();

    // Возвращает массив элементов заказа
    Item[] getItems();

    // Возвращает общую стоимость заказа
    double getTotalPrice();

    // Возвращает количество элементов с заданным именем в заказе
    int getCount(String itemName);

    // Возвращает массив названий заказанных элементов
    String[] getOrderedItems();

    // Возвращает массив элементов заказа, отсортированный по убыванию цены
    Item[] getSortedItems();
}

// Реализация интерфейса Order
class RestaurantOrder implements Order {
    private Item[] items;  // Массив элементов заказа
    private int size;       // Текущий размер заказа
    private final int MAX_SIZE = 100;  // Максимальный размер заказа

    // Конструктор, инициализирующий массив и размер заказа
    public RestaurantOrder() {
        items = new Item[MAX_SIZE];
        size = 0;
    }

    // Добавляет элемент в заказ, возвращает true если успешно, иначе false
    @Override
    public boolean addItem(Item item) {
        if (size < MAX_SIZE) {
            items[size] = item;
            size++;
            return true;
        } else {
            return false;
        }
    }

    // Удаляет элемент из заказа по его имени, возвращает true если успешно, иначе false
    @Override
    public boolean removeItem(String itemName) {
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    // Удаляет все элементы с заданным именем и возвращает их количество
    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[size - 1] = null;
                size--;
                count++;
            }
        }
        return count;
    }

    // Возвращает общее количество элементов в заказе
    @Override
    public int getTotalCount() {
        return size;
    }

    // Возвращает массив элементов заказа
    @Override
    public Item[] getItems() {
        return Arrays.copyOf(items, size);
    }

    // Возвращает общую стоимость заказа
    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < size; i++) {
            totalPrice += items[i].getPrice();
        }
        return totalPrice;
    }

    // Возвращает количество элементов с заданным именем в заказе
    @Override
    public int getCount(String itemName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                count++;
            }
        }
        return count;
    }

    // Возвращает массив названий заказанных элементов
    @Override
    public String[] getOrderedItems() {
        String[] orderedItems = new String[size];
        for (int i = 0; i < size; i++) {
            orderedItems[i] = items[i].getName();
        }
        return orderedItems;
    }

    // Возвращает массив элементов заказа, отсортированный по убыванию цены
    @Override
    public Item[] getSortedItems() {
        Item[] sortedItems = Arrays.copyOf(items, size);
        Arrays.sort(sortedItems, (item1, item2) -> Double.compare(item2.getPrice(), item1.getPrice()));
        return sortedItems;
    }
}

// Интерфейс представляющий элемент заказа
interface Item {
    String getName();
    double getPrice();
}

// Абстрактный класс для представления блюд
abstract class Dish implements Item {
    private String name;
    private double price;

    // Дополненный конструктор, проверяющий валидность параметров
    public Dish(String name, double price, String description) {
        if (name == null || name.isEmpty() || price < 0) {
            throw new IllegalArgumentException("Invalid Dish parameters");
        }
        this.name = name;
        this.price = price;
    }

    // Остальная часть класса остается без изменений
}

// Абстрактный класс для представления напитков
abstract class Drink implements Item {
    private String name;
    private double price;

    // Дополненный конструктор, проверяющий валидность параметров
    public Drink(String name, double price, String description) {
        if (name == null || name.isEmpty() || price < 0) {
            throw new IllegalArgumentException("Invalid Drink parameters");
        }
        this.name = name;
        this.price = price;
    }

    // Остальная часть класса остается без изменений
}

// Класс для представления пункта меню
class MenuItem implements Item {
    private String name;
    private double price;

    // Конструктор, проверяющий валидность параметров
    public MenuItem(String name, double price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.name = name;
        this.price = price;
    }

    // Возвращает имя элемента
    @Override
    public String getName() {
        return name;
    }

    // Возвращает цену элемента
    @Override
    public double getPrice() {
        return price;
    }
}
