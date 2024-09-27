/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_laure;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Tp1_stats_laure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double [] Tab =new Double[6];
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random(); // Initialiser le générateur aléatoire

        System.out.print("Saisissez une valeur (m) : ");
        double m = sc.nextInt(); // Lire la valeur de m
        for (int i=0;i<m;i++){
            int alea= generateurAleat.nextInt(6);
            Tab[alea]= Tab[alea]+1; // incrémenter la case correspondant dans le tableau
        }
        System.out.println("Tableau des occurences"+Tab);
    }
    
}
