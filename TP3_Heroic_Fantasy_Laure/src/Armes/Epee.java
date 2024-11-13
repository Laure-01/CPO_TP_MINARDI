/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author lenovo
 */
public class Epee extends Arme {
    int indiceFinesse;
    
 public Epee(String nom, int niveauAttaque, int indiceFinesse){
     super(nom, niveauAttaque);  // Appelle le constructeur de la classe parente Arme
     if (indiceFinesse<100){
         this.indiceFinesse = indiceFinesse;
     }else{
         this.indiceFinesse=100;
     }
     
 }   
  
 @Override
    public String toString() {
        return super.toString() + ", Indice de finesse: " + indiceFinesse;
    }
    
}
