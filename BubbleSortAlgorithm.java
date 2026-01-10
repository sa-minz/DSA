/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Savinthi Minaya
 */
public class BubbleSortAlgorithm {

    /**
     * @param args the command line arguments
     */

    static void bubbleSort(int[] a) {
        int n = a.length;

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < n - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    static void display(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO code application logic here
         int[] a = {5, 1, 4, 2, 8};

        System.out.print("Before sorting: ");
        display(a);

        bubbleSort(a);

        System.out.print("After sorting: ");
        display(a);
    }
    
}
