/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_laure;

/**
 *
 * @author lenovo
 */
public class Voiture {
    String modele;
    String marque;
    int puissanceCV;
    Personne Proprietaire ;


    public Voiture(String modele, String marque, int puissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.puissanceCV = puissanceCV;
        this.Proprietaire= null;// Initialement, la voiture n'a pas de propriétaire
    }
    // Méthode pour définir le propriétaire de la voiture
    //public void setProprietaire(Personne proprietaire) {
       // this.Proprietaire = proprietaire;
   // }

  // Méthode toString() pour afficher les informations de la voiture
    //@Override
    //public String toString() {
      //  String infoProprietaire = (Proprietaire != null) ? Proprietaire.getPrenom() + " " + Proprietaire.getNom() : "aucun propriétaire";
        //return "Voiture {" +
             //  "Modèle = '" + modele + '\'' +
              // ", Marque = '" + marque + '\'' +
              // ", Puissance (en CV) = " + puissanceCV +
              // ", Propriétaire = " + infoProprietaire +
              // '}';
    
     @Override
    public String toString() {
        String proprietaireNom = (Proprietaire != null) ? Proprietaire.toString() : "Aucun";
        return "Voiture {Modèle = '" + modele + "', Marque = '" + marque + "', Puissance (en CV) = " + puissanceCV + ", Propriétaire = " + proprietaireNom + "}";
    }
    }

    //public String getModele() {
        //return modele;
    //}

   
    

