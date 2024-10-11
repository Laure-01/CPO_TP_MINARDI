package tp2_bieres_laure;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class BouteilleBiere {
    public String nom;
    public double degreAlcool;
    public String brasserie;
    public boolean ouverte;
   public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;
}
public BouteilleBiere(String unNom, double unDegre, String uneBrasserie){
 nom = unNom;
 degreAlcool= unDegre;
 brasserie= uneBrasserie;
 ouverte=false;
  
}
  public boolean Décapsuler(){
      if (!ouverte) {
            ouverte = true;  // Ouvre la bière
            System.out.println("La bière " + nom + " est maintenant ouverte.");
            return true;
      }else {
          System.out.println("Erreur : bière déjà ouverte.");
          return false;
      }
  }
  @Override
  public String toString(){
      String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) | Ouverte ? ";
        if (ouverte) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
  }
}


