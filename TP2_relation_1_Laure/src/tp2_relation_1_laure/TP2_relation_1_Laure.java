/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_laure;

/**
 *
 * @author lenovo
 */
public class TP2_relation_1_Laure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Création des objets Voiture
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        
        // Création des objets Personne
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        // Attribution directe : Bob est propriétaire d'une Clio
        //bob.liste_voitures[0] = uneClio; // Bob possède la Clio
        //bob.nbVoitures = 1;              // Il a maintenant 1 voiture
        //uneClio.setProprietaire(bob);     // La Clio a Bob comme propriétaire
        
       // bob.liste_voitures[1] = uneMicra;    // Seconde voiture de Bob : Micra
       // bob.nbVoitures = 2;                  // Bob possède maintenant 2 voitures
        //uneMicra.setProprietaire(bob);       // La Micra a Bob comme propriétaire

        // reno.liste_voitures[0] = uneAutreClio;  // Première voiture de Reno : Autre Clio
        //reno.nbVoitures = 1;                    // Reno possède 1 voiture
        //uneAutreClio.setProprietaire(reno);     // L'autre Clio a Reno comme propriétaire

        //reno.liste_voitures[1] = une2008;       // Seconde voiture de Reno : 2008
        //reno.nbVoitures = 2;                    // Reno possède maintenant 2 voitures
        //une2008.setProprietaire(reno);          // La 2008 a Reno comme propriétaire
        
        
        // Test de l'ajout de voitures à Bob
        System.out.println("Ajout d'une Clio à Bob : " + bob.ajouter_voiture(uneClio));
        System.out.println("Ajout d'une Micra à Bob : " + bob.ajouter_voiture(uneMicra));
        System.out.println("Ajout d'une 2008 à Bob : " + bob.ajouter_voiture(une2008)); // Doit échouer car Bob a déjà 2 voitures

        // Test de l'ajout de voitures à Reno
        System.out.println("Ajout d'une autre Clio à Reno : " + reno.ajouter_voiture(uneAutreClio));
        System.out.println("Ajout d'une 2008 à Reno : " + reno.ajouter_voiture(une2008));

        // Affichage des voitures de Bob
        System.out.println("Les voitures de Bob sont :");
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println(bob.liste_voitures[i]);
        }

        // Affichage des voitures de Reno
        System.out.println("Les voitures de Reno sont :");
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println(reno.liste_voitures[i]);
        }
        
       
    }
    
}
