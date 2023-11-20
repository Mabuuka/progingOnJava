import java.util.NoSuchElementException;
public class ArrayQueueModule<T> extends AbstractQueue<T> {
    private static final int DEFAULT_CAPACITY = 10;

    private T[] elements;
    private int head;
    private int tail;

    @SuppressWarnings("unchecked")
    public ArrayQueueModule() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public ArrayQueueModule(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        elements = (T[]) new Object[capacity];
    }

    private int nextIndex(int index) {
        return (index + 1) % elements.length;
    }

    @Override
    protected void enqueueImplementation(T element) {
        if (size == elements.length) {
            resizeArray();
        }
        elements[tail] = element;
        tail = nextIndex(tail);
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
    protected T dequeueImplementation() {
        T element = elements[head];
        elements[head] = null;
        head = nextIndex(head);
        return element;
    }

    @Override
    public T element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements[head];
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