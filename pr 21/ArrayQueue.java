public class ArrayQueue<T> implements Queue<T> {
    private ArrayQueueADT<T> queue;

    public ArrayQueue() {
        queue = ArrayQueueADT.create(10); // default capacity
    }

    public ArrayQueue(int capacity) {
        queue = ArrayQueueADT.create(capacity);
    }

    @Override
    public void enqueue(T element) {
        queue.enqueue(element);
    }

    @Override
    public T element() {
        return queue.element();
    }

    @Override
    public T dequeue() {
        return queue.dequeue();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void clear() {
        queue.clear();
    }
}