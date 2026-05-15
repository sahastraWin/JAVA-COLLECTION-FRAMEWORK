package collectionFramework.queue;

import java.util.Scanner;

class Queue {
    private int[] queue;
    private int front, rear, size, capacity;

    //initializing the size of queue
    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full , cannot enqueue more elements");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty , cannot dequeue more elements");
            return -1;
        }
        int element = queue[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue Elements are : ");
        for (int i = 0; i < size; i++) {
            System.out.println(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }


}

public class queueMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the queue");
        int capacity = sc.nextInt();
        Queue queue = new Queue(capacity);

        while (true) {
            System.out.println("*****Queue Menu*****");
            System.out.println("1 Enqueue");
            System.out.println("2 Dequeue");
            System.out.println("3 Display Queue");
            System.out.println("4 Exit");
            System.out.println("Enter your choice :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to enqueue");
                    int element = sc.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    int dequeuedElement = queue.dequeue();
                    if (dequeuedElement != 1) {
                        System.out.println("Dequeued Element : " + dequeuedElement);
                    }
                    break;
                case 3:
                    queue.display();
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Enter valid choice ");
                    break;
            }
        }
    }
}
