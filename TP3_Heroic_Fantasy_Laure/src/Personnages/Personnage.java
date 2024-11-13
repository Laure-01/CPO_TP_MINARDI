/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import java.util.ArrayList;
import Armes.Arme;
/**
 *
 * @author lenovo
 */
public abstract class Personnage {
    private String nom;
    private int niveauVie;
    private ArrayList <Arme> inventaireArmes;
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.inventaireArmes = new ArrayList<> ();
    }

    public int getNiveauVie(){
      return niveauVie;
}
    public String getNom() {
        return nom;
    }
    
    public void ajouterArme(Arme arme){
        if (inventaireArmes.size()<5){
            inventaireArmes.add(arme);
            System.out.println("L'arme " + arme.getNom() + " a été ajoutée à l'inventaire.");
        } else {
            System.out.println("Inventaire plein ! Le personnage ne peut pas porter plus de 5 armes.");
        }
    }
  
     // Méthode toString pour afficher les informations du personnage et des armes dans l'inventaire
    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Nom: ").append(nom).append(", Niveau de vie: ").append(niveauVie);
        description.append("\nArmes dans l'inventaire: \n");

        for (Arme arme : inventaireArmes) {
            description.append(" - ").append(arme.toString()).append("\n");
        }

        return description.toString();
    }   
   
}
