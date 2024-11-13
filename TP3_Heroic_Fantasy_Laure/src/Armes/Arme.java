/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author lenovo
 */
public abstract class Arme {
    String nom;
    int niveauAttaque;
    
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque<=100){
            this.niveauAttaque = niveauAttaque;
        }else{
            this.niveauAttaque = 100;
        }
         
    
    }
    // Méthode pour obtenir le niveau d'attaque
    public int getniveauAttaque() {
        return niveauAttaque;
    }

    // Méthode pour obtenir le nom de l'arme
    public String getNom() {
        return nom;
    }
    public String toString() {
        return "Arme: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }
}
    
    

