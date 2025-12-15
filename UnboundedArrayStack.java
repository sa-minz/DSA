/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;
/**
 *
 * @author Savinthi Minaya
 */

public class UnboundedArrayStack {

    /**
     * @param args the command line arguments
     */
    
    private int[] stack;
    private int top;
    private int capacity;

    public UnboundedArrayStack() {
        capacity = 2;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int x) {

        if (top == capacity - 1) {
            resize(capacity * 2);
        }

        stack[++top] = x;
        System.out.println(x + " pushed (Capacity: " + capacity + ")");
    }

    public int pop() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        int popped = stack[top--];

        if (top + 1 > 0 && top + 1 <= capacity / 4) {
            resize(capacity / 2);
        }

        return popped;
    }

    private void resize(int newCapacity) {

        if (newCapacity < 2) return;

        int[] newStack = new int[newCapacity];
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
        capacity = newCapacity;
    }

    public void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println("(Capacity: " + capacity + ")");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        UnboundedArrayStack stack = new UnboundedArrayStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        System.out.println("Popped: " + stack.pop());
        stack.display();

        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}
