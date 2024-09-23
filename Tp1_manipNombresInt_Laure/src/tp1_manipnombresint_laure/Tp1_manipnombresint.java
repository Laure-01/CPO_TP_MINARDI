/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_manipnombresint_laure;

import java.util.Scanner;

/**
 *23/09/2024
 * @author Laure
 */
public class Tp1_manipnombresint {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bonjour, saisissez une valeur : ");
    int var1 = sc.nextInt(); 
    System.out.println("Bonjour, saisissez une valeur : ");
    int var2 = sc.nextInt(); 
    System.out.println(var1);
    System.out.println(var2);
    System.out.println("la somme des deux valeurs est"+ var1+var2);
    System.out.println("la différence des deux valeurs est"+ (var1-var2));
    System.out.println("leur produit est"+ var1*var2);
    int quotient= var1/var2;
    System.out.println("le quotient est : ");
    int reste= var1%var2;
    System.out.println("le reste est : ");
    }
}

