public class Number3 {
    private final int[] queue;
    private int head;
    private int tail;
    private int size;
    private final int capacity;

    
    public Number3(int k) {
        capacity = k;
        queue = new int[capacity];
        head = -1;
        tail = -1;
        size = 0;
    }

    
    public boolean enqueue(int value) {
        if (isFull()) {
            return false; 
        }
        if (isEmpty()) {
            head = 0; 
        }
        tail = (tail + 1) % capacity; 
        queue[tail] = value;
        size++;
        return true;
    }

    
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty"); 
        }
        int value = queue[head];
        if (head == tail) { 
            head = -1;
            tail = -1;
        } else {
            head = (head + 1) % capacity; 
        }
        size--;
        return value;
    }

   
    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty"); 
        }
        return queue[head];
    }

   
    public int rear() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty"); 
        }
        return queue[tail];
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

    
    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Number3 q = new Number3(3);
        System.out.println(q.enqueue(1)); // True
        System.out.println(q.enqueue(2)); // True
        System.out.println(q.enqueue(3)); // True
        System.out.println(q.dequeue());  // 1
        System.out.println(q.enqueue(4)); // True
        System.out.println(q.front());    // 2
        System.out.println(q.rear());     // 4
    }
}
