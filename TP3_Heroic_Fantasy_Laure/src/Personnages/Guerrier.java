/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Personnages.Personnage;
/**
 *
 * @author lenovo
 */
public class Guerrier extends Personnage {
    private boolean aCheval;
    
 public Guerrier (String nom, int niveauDeVie, boolean aCheval){
     super(nom, niveauDeVie);  // Appel du constructeur de la classe parente
        this.aCheval = aCheval;
    }
 
  //Getter pour savoir si le guerrier est à cheval
    public boolean estACheval() {
        return aCheval;
    }

    // Setter pour modifier la propriété aCheval
    public void setACheval(boolean aCheval) {
        
   
this.aCheval = aCheval;
    }
 }   
    

