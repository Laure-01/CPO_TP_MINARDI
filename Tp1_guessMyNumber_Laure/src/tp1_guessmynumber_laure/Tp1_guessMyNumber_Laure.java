/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 package tp1_guessmynumber_laure;
/**
 *
 * @author Yohanann Andrianasolo 23/09/2024
 */
import java.util.Random;
import java.util.Scanner;
public class Tp1_guessMyNumber_Laure{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Difficult\u00e9
                            Facile
                            Dur""");
        String Difficulte = sc.nextLine();
         int tent = 0;
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(101);  // Génération d'un nombre entre 0 et 100

        if (Difficulte.equals("Facile")) {
            System.out.println("Saisissez un nombre entre 0 et 100 :");
            int var = sc.nextInt(); // Lecture du premier nombre

            // Boucle de jeu (illimité)
            while (var != n) {
                tent++;
                if (var > n) {
                    System.out.println("Trop grand");
                } else {
                    System.out.println("Trop petit");
                }
                System.out.println("Saisissez un autre nombre :"); // Demander un nouveau nombre
                var = sc.nextInt(); // Mise à jour de la valeur var pour éviter la boucle infinie
            }

            // Nombre trouvé
            System.out.println("Trouvé ! Vous avez fait " + tent + " tentatives.");
        }

        if (Difficulte.equals("Dur")) {
            int tentmax = 5; // 5 tentatives maximum
            System.out.println("Saisissez un nombre entre 0 et 100 :");
            int var = sc.nextInt(); // Lecture du premier nombre

            // Boucle de jeu (limité à 5 tentatives)
            while (var != n && tentmax > 0) {
                tent++;
                tentmax--;
                if (var > n) {
                    System.out.println("Trop grand");
                } else {
                    System.out.println("Trop petit");
                }
                if (tentmax > 0) {
                    System.out.println("Saisissez un autre nombre :"); // Demander un nouveau nombre
                    var = sc.nextInt(); // Mise à jour de la valeur var pour éviter la boucle infinie
                }
            }

            // Vérification si gagné ou perdu
            if (var == n) {
                System.out.println("Trouvé ! Vous avez fait " + tent + " tentatives.");
            } else {
                System.out.println("Vous avez perdu. Le nombre était : " + n);
            }
        }

        sc.close(); // Fermeture du scanner
    }
}