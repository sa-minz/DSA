/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Savinthi Minaya
 */
public class LinkedListFIFOQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front, rear;

    
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

  
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Dequeued: " + front.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListFIFOQueue queue = new LinkedListFIFOQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        queue.dequeue();
        queue.display();
    }
}
