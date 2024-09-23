/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_exo_convertisseur_laure;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Tp1_exo_convertisseur_Laure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
    System.out.println("Bonjour, saisissez une valeur : ");
    double nombre1=sc.nextDouble();
    System.out.println("\nSaisissez la conversion que vous souhaiter effectuer :" + "\n1) De Celcius vers Kelvin");
    System.out.println("\n2) De Kelvin vers Celcius"+ "\n3) De Farenheit vers Celcius" + "\n4) De Celcius vers Farenheit");
    System.out.println("\n5) De Kelvin vers Farenheit "+ "\n6) De Farenheit vers Kelvin ");
    System.out.println("choisi une conversion: ");
    int choix= sc.nextInt();
    if (choix==1){
        System.out.println(CelciusVersKelvin(nombre1));
    }
    if (choix==2){
        double res;
        res=FarenheitVersCelcius(KelvinVersFarenheit(nombre1));
        System.out.println(res);
    }
    if (choix==3){
       System.out.println(FarenheitVersCelcius(nombre1)); 
    }
    if(choix==4){
        System.out.println(CelciusVersFarenheit (nombre1));
    }
    if (choix==5){
        System.out.println(KelvinVersFarenheit (nombre1));  
    }
    if(choix==6){
        System.out.println(FarenheitVersKelvin(nombre1));
    }
 }
    
    
    public static double CelciusVersKelvin (Double tCelcius){
       return (tCelcius+273.15);
    }
    public static double FarenheitVersCelcius(Double tFarenheit) {
       return (tFarenheit - 32) * 5.0 / 9;
    }
    public static double CelciusVersFarenheit (Double tCelcius) {
       return (tCelcius *9.0/5)+ 32;
    }
    public static double KelvinVersFarenheit (Double tKelvin) {
       return (tKelvin - 273.15) * 9.0 / 5 + 32;
    }
    public static double FarenheitVersKelvin(Double tFarenheit) {
       return (tFarenheit - 32) * 5.0 / 9 + 273.15;
    }
    
}


   