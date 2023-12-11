public class OrderManagerTest { //test2
    public static void main(String[] args) {
        // Создание объекта OrderManager
        OrderManager orderManager = new OrderManager();

        // Создание двух объектов RestaurantOrder
        Order order1 = new RestaurantOrder();
        Order order2 = new RestaurantOrder();

        // Создание трех объектов MenuItem
        Item item1 = new MenuItem("Item 1", 10.5);
        Item item2 = new MenuItem("Item 2", 15.75);
        Item item3 = new MenuItem("Item 3", 20.0);

        // Добавление товаров к заказам
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item2);
        order2.addItem(item3);

        // Добавление заказов к OrderManager по разным адресам
        orderManager.addOrder("Address 1", order1);
        orderManager.addOrder("Address 2", order2);

        // Получение заказа по адресу и вывод общего количества товаров
        Order retrievedOrder = orderManager.getOrder("Address 1");
        if (retrievedOrder != null) {
            System.out.println("Total count of Order 1: " + retrievedOrder.getTotalCount());
        }

        // Добавление товара к существующему заказу и вывод обновленного общего количества товаров
        orderManager.addItemToOrder("Address 1", item3);
        retrievedOrder = orderManager.getOrder("Address 1");
        if (retrievedOrder != null) {
            System.out.println("Total count of Order 1 after adding item 3: " + retrievedOrder.getTotalCount());
        }

        // Получение массива интернет-заказов и вывод их общего количества
        Order[] internetOrders = orderManager.getInternetOrders();
        System.out.println("Total internet orders: " + internetOrders.length);

        // Получение и вывод общей стоимости интернет-заказов
        double totalPrice = orderManager.getTotalPriceOfInternetOrders();
        System.out.println("Total price of internet orders: " + totalPrice);

        // Получение и вывод общего количества товаров с определенным названием в интернет-заказах
        int totalItemCount = orderManager.getTotalItemCountOfDish("Item 2");
        System.out.println("Total count of Item 2 in all orders: " + totalItemCount);

        // Удаление заказа по адресу и вывод сообщения об успешном удалении
        orderManager.removeOrder("Address 1");
        retrievedOrder = orderManager.getOrder("Address 1");
        if (retrievedOrder == null) {
            System.out.println("Order 1 removed successfully");
        }
    }
}
