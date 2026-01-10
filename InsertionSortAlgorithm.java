/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Savinthi Minaya
 */
public class InsertionSortAlgorithm {

    /**
     * @param args the command line arguments
     */
     
    void insertionSort(int arr[], int n) {
        int i, key, j;

        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }

    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        InsertionSortAlgorithm obj = new InsertionSortAlgorithm();

        int arr[] = {12, 11, 13, 5, 6};
        int n = arr.length;

        System.out.print("Before sorting: ");
        obj.printArray(arr, n);

        obj.insertionSort(arr, n);

        System.out.print("After sorting: ");
        obj.printArray(arr, n);
    }
}
