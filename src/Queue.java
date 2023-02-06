public class Queue {
    int[] arr;
    int topOfTheQueue;
    int beginningOfTheQueue;

    public Queue(int size) {
        this.arr = new int[size];
        this.topOfTheQueue = -1;
        this.beginningOfTheQueue = -1;
        System.out.println("The Queue is successfully created with size of: " + size);
    }

    public boolean isFull() {
        return topOfTheQueue == arr.length - 1;
    }

    public boolean isEmpty() {
        return beginningOfTheQueue == -1 || beginningOfTheQueue == arr.length;
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is full");
        } else if (isEmpty()) {
            beginningOfTheQueue = 0;
            topOfTheQueue++;
            arr[topOfTheQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        } else {
            topOfTheQueue++;
            arr[topOfTheQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            return -1;
        } else {
            int result = arr[beginningOfTheQueue];
            beginningOfTheQueue++;
            if (beginningOfTheQueue > topOfTheQueue) {
                beginningOfTheQueue = topOfTheQueue = -1;
            }
            return result;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[beginningOfTheQueue];
        } else {
            System.out.println("The Queue is empty");
            return -1;
        }
    }

    public void delete() {
        arr = null;
        System.out.println("The Queue is successfully deleted!");
    }
}
