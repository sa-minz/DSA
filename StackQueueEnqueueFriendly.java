/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Savinthi Minaya
 */
public class StackQueueEnqueueFriendly {

    /**
     * @param args the command line arguments
     */

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void enqueue(int x) {
        q1.add(x);
        System.out.println(x + " enqueued");
    }

    public int dequeue() {
        if (q1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int dequeued = q1.remove();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return dequeued;
    }

    public void display() {
        System.out.println("Queue elements: " + q1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    
        StackQueueEnqueueFriendly queue = new StackQueueEnqueueFriendly();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
    }
}
