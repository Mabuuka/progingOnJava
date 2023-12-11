import java.util.HashMap;
import java.util.Map;

// Класс, управляющий заказами
public class OrderManager {
    // Хранение заказов в виде карты, где ключ - адрес, значение - заказ
    private Map<String, Order> orders;

    // Конструктор класса
    public OrderManager() {
        orders = new HashMap<>();
    }

    // Метод для добавления заказа по адресу
    public void addOrder(String address, Order order) {
        orders.put(address, order);
    }

    // Метод для получения заказа по адресу
    public Order getOrder(String address) {
        return orders.get(address);
    }

    // Метод для удаления заказа по адресу
    public void removeOrder(String address) {
        orders.remove(address);
    }

    // Метод для добавления товара к заказу по адресу
    public void addItemToOrder(String address, Item item) {
        Order order = orders.get(address);
        if (order != null) {
            try {
                order.addItem(item);
            } catch (OrderAlreadyAddedException e) {
                System.out.println("Item is already added to the order.");
            }
        }
    }

    // Метод для получения массива интернет-заказов
    public Order[] getInternetOrders() {
        return orders.values().toArray(new Order[0]);
    }

    // Метод для получения общей стоимости интернет-заказов
    public double getTotalPriceOfInternetOrders() {
        double totalPrice = 0;
        for (Order order : orders.values()) {
            totalPrice += order.getTotalPrice();
        }
        return totalPrice;
    }

    // Метод для получения общего количества товаров с определенным названием в интернет-заказах
    public int getTotalItemCountOfDish(String dishName) {
        int totalCount = 0;
        for (Order order : orders.values()) {
            totalCount += order.getCount(dishName);
        }
        return totalCount;
    }
}
