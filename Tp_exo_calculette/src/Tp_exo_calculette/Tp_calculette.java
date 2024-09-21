/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tp_exo_calculette;

import java.util.Scanner;
/**
 *21/09/2024
 * @author laure
 */
public class Tp_calculette {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
    
    String operateur;
    Scanner sc0 = new Scanner(System.in);
    System.out.println("\n Entrer l'operateur :");
    operateur=sc0.nextLine();
    
    
    int operande1;
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer le nombre :");
    operande1=sc.nextInt();
    System.out.println("Vous avez saisis" +operande1);
    
    int operande2;
    Scanner sc1 = new Scanner(System.in);
    System.out.println("\n Entrer le nombre :");
    operande2=sc1.nextInt();
    System.out.println("Vous avez saisis" +operande2);
    
    int res;
    if (!operateur.equals("add") &&
        !operateur.equals("multiply") &&
        !operateur.equals("divide") &&
        !operateur.equals("modulo") &&
        !operateur.equals("susbtract")){
            
        System.out.println("Votre saisis est incorrect");
        System.exit(0);
    }
    
    if (operateur == "add"){
        res = operande1 + operande2;
        System.out.println("La valeur est de : " +res);
    }
    if (operateur == "substract"){
        res = operande1 - operande2;
        System.out.println("La valeur est de : " +res);
    }
    if (operateur == "multiply"){
        res = operande1 * operande2;
        System.out.println("La valeur est de : " +res);
    }
    if (operateur == "divide"){
        res = operande1 / operande2;
        System.out.println("La valeur est de : " +res);
    }
    if (operateur == "modulo"){
        res = operande1 % operande2;
        System.out.println("La valeur est de : " +res);
    }
    
   }
    
}