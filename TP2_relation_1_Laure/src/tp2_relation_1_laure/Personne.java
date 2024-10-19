/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_laure;

/**
 *
 * @author lenovo
 */
public class Personne {
    String nom;
    String prenom;
    Voiture[] liste_voitures; // Tableaux des voitures, maximum 3
    int nbVoitures; // Nombre de voitures possédées

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.liste_voitures = new Voiture[3]; // Tableau de 3 voitures max
        this.nbVoitures = 0; // Pas de voitures au début
    }
    // Méthode pour ajouter une voiture à la personne
    //public void ajouterVoiture(Voiture voiture) {
        //if (nbVoitures < 3) {
          //  liste_voitures[nbVoitures] = voiture;
           // nbVoitures++;
           // voiture.setProprietaire(this); // On définit la personne comme propriétaire de la voiture
        //} else {
          //  System.out.println("Impossible d'ajouter plus de 3 voitures.");
       // }
    //}

  // @Override
   // public String toString() {
     //   StringBuilder sb = new StringBuilder();
       // sb.append("Personne {Nom = '").append(nom).append("', Prénom = '").append(prenom).append("', Voitures possédées = ");
       // for (int i = 0; i < nbVoitures; i++) {
         //   sb.append(liste_voitures[i].getModele()).append(" ");
    
     // Méthode pour ajouter une voiture
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        // Vérifier si la voiture a déjà un propriétaire
        if (voiture_a_ajouter.Proprietaire != null) {
            System.out.println("Erreur : la voiture appartient déjà à quelqu'un.");
            return false; // La voiture est volée ou déjà possédée par quelqu'un
        }

        // Vérifier si la personne possède déjà 3 voitures
        if (this.nbVoitures >= 3) {
            System.out.println("Erreur : " + this.nom + " possède déjà 3 voitures.");
            return false; // Le tableau est plein
        }

        // Ajouter la voiture dans la première case libre
        this.liste_voitures[this.nbVoitures] = voiture_a_ajouter;
        this.nbVoitures++; // Incrémenter le nombre de voitures

        // Assigner le propriétaire à la voiture
        voiture_a_ajouter.Proprietaire = this;

        // Retourner true pour indiquer que tout s'est bien passé
        return true;
    }
     @Override
    public String toString() {
        return prenom + " " + nom;
    }
}
        
        //return sb.toString();
   // }
     // Accesseurs pour nom et prénom
   // public String getNom() {
     //   return nom;
   // }

   // public String getPrenom() {
    //    return prenom;
   // }
    

