/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Savinthi Minaya
 */
public class CircularDoublyLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = this;
            this.next = this;
        }
    }

    Node head;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head.prev;

        newNode.next = head;
        newNode.prev = last;

        head.prev = newNode;
        last.next = newNode;

        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head.prev;

        last.next = newNode;
        newNode.prev = last;

        newNode.next = head;
        head.prev = newNode;
    }

    // Insert at specific position
    void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
            if (temp == head) {
                System.out.println("Position out of range");
                return;
            }
        }

        Node newNode = new Node(data);
        Node nextNode = temp.next;

        temp.next = newNode;
        newNode.prev = temp;

        newNode.next = nextNode;
        nextNode.prev = newNode;
    }

    // Delete from beginning
    void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        Node last = head.prev;
        head = head.next;

        head.prev = last;
        last.next = head;
    }

    // Delete from end
    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        Node last = head.prev;
        Node secondLast = last.prev;

        secondLast.next = head;
        head.prev = secondLast;
    }

    // Delete from specific position
    void deleteFromPosition(int position) {
        if (head == null || position <= 0) {
            System.out.println("Invalid operation");
            return;
        }

        if (position == 1) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
            if (temp == head) {
                System.out.println("Position out of range");
                return;
            }
        }

        Node prevNode = temp.prev;
        Node nextNode = temp.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("List: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();

        list.insertAtBeginning(5);
        list.display();

        list.insertAtPosition(15, 3);
        list.display();

        list.deleteFromBeginning();
        list.display();

        list.deleteFromEnd();
        list.display();

        list.deleteFromPosition(2);
        list.display();
    }
}
