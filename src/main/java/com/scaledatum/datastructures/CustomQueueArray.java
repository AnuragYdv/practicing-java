package com.scaledatum.datastructures;

public class CustomQueueArray {
    private static int front, rear, length;
    private static int queue[];

    CustomQueueArray(int size) {
        front = rear = 0;
        length = size;
        queue = new int[length];

    }

    static void queueEnqueue(int item) {
        // check if the queue is full
        if (length == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        } else {
            queue[rear] = item;
            rear++;
        }
        return;

    }
    static void queueDequeue()  {
        // check if queue is empty
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        }

        // shift elements to the right by one place uptil rear
        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }


            // set queue[rear] to 0
            if (rear < length)
                queue[rear] = 0;

            // decrement rear
            rear--;
        }
        return;
    }

}

