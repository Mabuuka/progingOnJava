public class QueueTests {
    public static void main(String[] args) {
        testArrayQueueModule();
        testArrayQueueADT();
        testLinkedQueue();
        testArrayQueue();
    }


    private static void testArrayQueueModule() {
        System.out.println("Testing ArrayQueueModule...");
        Queue<Integer> queue = new ArrayQueueModule<>();

        System.out.println("Is Queue Empty: " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Is Queue Empty: " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Queue First Element: " + queue.element());

        int dequeuedValue = queue.dequeue();

        System.out.println("Dequeued Value: " + dequeuedValue);
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Queue First Element: " + queue.element());

        queue.clear();

        System.out.println("Is Queue Empty: " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());
    }

    private static void testArrayQueueADT() {
        System.out.println("Testing ArrayQueueADT...");
        Queue<Integer> queue = new ArrayQueueADT<>();

        System.out.println("Is Queue Empty: " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Is Queue Empty: " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Queue First Element: " + queue.element());

        int dequeuedValue = queue.dequeue();

        System.out.println("Dequeued Value: " + dequeuedValue);
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Queue First Element: " + queue.element());

        queue.clear();

        System.out.println("Is Queue Empty: " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());
    }

    private static void testLinkedQueue() {
        System.out.println("Testing LinkedQueue...");
        Queue<Integer> queue = new LinkedQueue<>();

        System.out.println("Is Queue Empty: " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Is Queue Empty: " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Queue First Element: " + queue.element());

        int dequeuedValue = queue.dequeue();

        System.out.println("Dequeued Value: " + dequeuedValue);
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Queue First Element: " + queue.element());

        queue.clear();

        System.out.println("Is Queue Empty: " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());
    }

    private static void testArrayQueue() {
        System.out.println("Testing ArrayQueue...");
        Queue<Integer> queue = new ArrayQueue<>();

        System.out.println("Is Queue Empty: " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Is Queue Empty: " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Queue First Element: " + queue.element());

        int dequeuedValue = queue.dequeue();

        System.out.println("Dequeued Value: " + dequeuedValue);
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Queue First Element: " + queue.element());

        queue.clear();

        System.out.println("Is Queue Empty: " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());
    }
}