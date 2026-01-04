/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Savinthi Minaya
 */
public class RabbitProblem {

    /**
     * @param args the command line arguments
     */
        static int rabbits(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return rabbits(n - 1) + rabbits(n - 2);
        }
    }


    public static void main(String[] args) {
        // TODO code application logic here
        int months = 6;

        System.out.println("Rabbit pairs after " + months + " months:");
        for (int i = 0; i <= months; i++) {
            System.out.println("Month " + i + ": " + rabbits(i));
        }

    }
    
}
