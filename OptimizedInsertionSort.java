/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Savinthi Minaya
 */
public class OptimizedInsertionSort {

    /**
     * @param args the command line arguments
     */
     static void insertionSort(int[] arr) {
        int n = arr.length;
        boolean shifted;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            shifted = false;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                shifted = true;
            }

            if (!shifted) {
                break;
            }

            arr[j + 1] = key;
        }
    }

    static void display(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO code application logic here
    
        int[] arr = {3,2,1,4,5};

        display(arr);
        insertionSort(arr);
        display(arr);
    }
}
