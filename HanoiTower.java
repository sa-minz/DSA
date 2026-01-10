/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author Savinthi Minaya
 */
public class HanoiTower {

    /**
     * @param args the command line arguments
     */
    static void hanoi(int N, char source, char aux, char destination) {
        if (N == 1) {
            System.out.println(source + " -> " + destination);
        } else {
            hanoi(N - 1, source, destination, aux);
            hanoi(1, source, aux, destination);
            hanoi(N - 1, aux, source, destination);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
         int N = 3;
        hanoi(N, 'A', 'B', 'C');
    }
    
}
