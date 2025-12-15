/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Savinthi Minaya
 */
public class QueueStackPopFriendly {
    
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        q1.add(x);
        System.out.println(x + " pushed");

        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }

    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.remove();
    }

    public void display() {
        System.out.println("Stack elements: " + q1);
    }

    public static void main(String[] args) {
         // TODO code application logic here
        QueueStackPopFriendly stack = new QueueStackPopFriendly();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped: " + stack.pop());
        stack.display();

        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}
