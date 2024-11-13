/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_laure;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class TP3_Heroic_Fantasy_Laure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Création de 2 épées avec des paramètres différents
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
       

        // Création de 2 bâtons avec des paramètres différents
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);
        
        Magicien gandalf = new Magicien("Gandalf", 65, true);  // Confirmé
        Magicien garcimore = new Magicien("Garcimore", 44, false);  // non confirmé
        
        Guerrier guerrier1=new Guerrier ("Conan", 78, false);// A pied
        Guerrier guerrier2=new Guerrier ("Lannister", 45,true); // a cheval
        
         // Utilisation de l'ArrayList pour stocker les armes
        ArrayList<Arme> listeArmes = new ArrayList<>();

        // Ajout des armes dans la liste dynamique
        listeArmes.add(excalibur);
        listeArmes.add(durandal);
        listeArmes.add(chene);
        listeArmes.add(charme);
       for (Arme arme : listeArmes) {
            System.out.println(arme);
        }
       // Création d'un ArrayList pour stocker les personnages
        ArrayList<Personnage> Personnages = new ArrayList<> ();

        
        Personnages.add(gandalf);
        Personnages.add(garcimore);
        Personnages.add(guerrier1);
        Personnages.add(guerrier2);
        for (Personnage personnage : Personnages){
            System.out.println(personnage);
        }
        
        
    }
    
}
