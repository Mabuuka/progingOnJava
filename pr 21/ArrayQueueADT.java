import java.util.NoSuchElementException;
public class ArrayQueueADT<T> implements Queue<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] elements;
    private int head;
    private int tail;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayQueueADT() {
        elements = (T[]) new Object[DEFAULT_CAPACITY]; // DEFAULT_CAPACITY should be the initial size of your array.
    }
    @SuppressWarnings("unchecked")
    public static <T> ArrayQueueADT<T> create(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        ArrayQueueADT<T> queue = new ArrayQueueADT<>();
        queue.elements = (T[]) new Object[capacity];
        return queue;
    }

    private int nextIndex(int index) {
        return (index + 1) % elements.length;
    }

    @Override
    public void enqueue(T element) {
        if (size == elements.length) {
            resizeArray();
        }
        elements[tail] = element;
        tail = nextIndex(tail);
        size++;
    }

    private void resizeArray() {
        int newCapacity = elements.length * 2;
        T[] newElements = (T[]) new Object[newCapacity];
        int index = 0;
        while (!isEmpty()) {
            newElements[index++] = dequeue();
        }
        elements = newElements;
        size = index;
        head = 0;
        tail = index;
    }

    @Override
    public T element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements[head];
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T element = elements[head];
        elements[head] = null;
        head = nextIndex(head);
        size--;
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
    }
}