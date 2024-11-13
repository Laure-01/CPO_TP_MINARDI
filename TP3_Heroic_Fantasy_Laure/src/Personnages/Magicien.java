package Personnages;
import Personnages.Personnage;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Magicien extends Personnage {
    private boolean confirme;
    
    public Magicien (String nom, int niveauDeVie, boolean confirme){
        super (nom, niveauDeVie);
        this.confirme=confirme;
    }

    @Override
    public String toString() {
        return super.toString()+ "confirme=" + confirme + '}';
    }
   
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
}


