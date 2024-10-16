/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_laure;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class TP2_convertisseurObjet_Laure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Convertisseur convertisseur1=new Convertisseur();

        int choix;
        do {
            System.out.println("\n--- Menu de Conversion ---");
            System.out.println("1. Convertir Celsius en Kelvin");
            System.out.println("2. Convertir Fahrenheit en Celsius");
            System.out.println("3. Convertir Celsius en Fahrenheit");
            System.out.println("4. Convertir Kelvin en Fahrenheit");
            System.out.println("5. Convertir Fahrenheit en Kelvin");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez la température en Celsius : ");
                    double celsius = scanner.nextDouble();
                    double kelvin = convertisseur1.celciusVersKelvin(celsius);
                    System.out.printf("%.2f °C = %.2f K\n", celsius, kelvin);
                    break;

                case 2:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    double farenheit = scanner.nextDouble();
                    double celsiusFromFarenheit = convertisseur1.farenheitVersCelcius(farenheit);
                    System.out.printf("%.2f °F = %.2f °C\n", farenheit, celsiusFromFarenheit);
                    break;

                case 3:
                    System.out.print("Entrez la température en Celsius : ");
                    double celsiusToFarenheit = scanner.nextDouble();
                    double farenheitFromCelsius = convertisseur1.celciusVersFarenheit(celsiusToFarenheit);
                    System.out.printf("%.2f °C = %.2f °F\n", celsiusToFarenheit, farenheitFromCelsius);
                    break;

                case 4:
                    System.out.print("Entrez la température en Kelvin : ");
                    double kelvinInput = scanner.nextDouble();
                    double farenheitFromKelvin = convertisseur1.kelvinVersFarenheit(kelvinInput);
                    System.out.printf("%.2f K = %.2f °F\n", kelvinInput, farenheitFromKelvin);
                    break;

                case 5:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    double farenheitToKelvin = scanner.nextDouble();
                    double kelvinFromFarenheit = convertisseur1.farenheitVersKelvin(farenheitToKelvin);
                    System.out.printf("%.2f °F = %.2f K\n", farenheitToKelvin, kelvinFromFarenheit);
                    break;

                case 6:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        } while (choix != 6);

        // Afficher le nombre de conversions effectuées par le convertisseur
        System.out.println(convertisseur1);

        scanner.close();
        
    }
    
}
