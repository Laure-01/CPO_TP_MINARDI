/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_exo2_;
import java.util.Scanner;
/**
 *
 * @author Laure
 */
public class TP0_Exo2_ {

    /**
     * MINARDI Laure
     * 21/09/2024
     */
     public static void main(String[] args) {
        int nb;
        int result;     
        Scanner sc = new Scanner (System.in);
        System.out.println("\nEntrer le nombre : ");
        nb = sc.nextInt();      
        int ind;
        
        result = 0;
        
        ind  = 1;
        while (ind <= nb){
 
            result = result+ind;
            ind = ind + 1;
        }
        System.out.println();
        System.out.println("La somme des " + nb + "entiers est: " +result);
}
}
