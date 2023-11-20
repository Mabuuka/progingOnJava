import java.util.NoSuchElementException;
public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size; // текущий размер очереди

    @Override
    public void enqueue(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }
        enqueueImplementation(element);
        size++;
    }

    protected abstract void enqueueImplementation(T element);

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T element = dequeueImplementation();
        size--;
        return element;
    }

    protected abstract T dequeueImplementation();

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}