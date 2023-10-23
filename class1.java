class CircularQueue {
    private int maxSize;
    private int[] queue;
    private int front = -1;
    private int rear = -1;

    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public void initializeQueue() {
        front = -1;
        rear = -1;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Cola Vacía");
            return;
        }

        int i = front;
        do {
            System.out.print(queue[i] + " ");
            i = (i + 1) % maxSize;
        } while (i != (rear + 1) % maxSize);
        System.out.println();
    }

    public boolean isFull() {
        return (front == 0 && rear == maxSize - 1) || (front == rear + 1);
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void insertElement(int element, boolean insertAtFront) {
        if (isFull()) {
            System.out.println("La cola está llena");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (insertAtFront) {
            front = (front - 1 + maxSize) % maxSize;
        } else {
            rear = (rear + 1) % maxSize;
        }

        queue[insertAtFront ? front : rear] = element;
    }

    public void deleteElement(boolean deleteFromFront) {
        if (isEmpty()) {
            System.out.println("Cola Vacía");
            return;
        }

        if (front == rear) {
            initializeQueue();
        } else if (deleteFromFront) {
            front = (front + 1) % maxSize;
        } else {
            rear = (rear - 1 + maxSize) % maxSize;
        }
    }
}
