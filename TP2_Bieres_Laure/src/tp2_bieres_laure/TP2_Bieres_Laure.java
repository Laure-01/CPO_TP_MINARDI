/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_laure;

//import BouteilleBiere.

/**
 *
 * @author lenovo
 */
public class TP2_Bieres_Laure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //BouteilleBiere uneBiere = new BouteilleBiere() ;
   //uneBiere.nom = "Cuvée des trolls";
   //uneBiere.degreAlcool = 7.0;
   //uneBiere.brasserie = "Dubuisson";
   //uneBiere.ouverte= false ;
   //uneBiere.lireEtiquette();
   BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
7.0 ,"Dubuisson") ;
    System.out.println(uneBiere) ;
    uneBiere.Décapsuler();
    System.out.println(uneBiere);
   //BouteilleBiere secondBiere = new BouteilleBiere() ;
   //secondBiere.nom = " Leffe";
  // secondBiere.degreAlcool = 6.6;
   //secondBiere.brasserie = "Abbaye de Leffe";
   //secondBiere.ouverte= false ;
   //secondBiere.lireEtiquette();
   BouteilleBiere secondBiere = new BouteilleBiere("Leffe",
6.6,"Abbaye de Leffe") ;
   System.out.println(secondBiere) ;
   secondBiere.Décapsuler();
   System.out.println(secondBiere);
   
    }
}
