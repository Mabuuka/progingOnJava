public interface Queue<T> {
    void enqueue(T element); // добавить элемент в очередь
    T element(); // первый элемент в очереди
    T dequeue(); // удалить и вернуть первый элемент в очереди
    int size(); // текущий размер очереди
    boolean isEmpty(); // является ли очередь пустой
    void clear(); // удалить все элементы из очереди
}
