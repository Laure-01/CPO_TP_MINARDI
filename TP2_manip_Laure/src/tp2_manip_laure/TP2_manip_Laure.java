/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_laure;

/**
 *
 * @author lenovo
 */
public class TP2_manip_Laure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        

        // Affichage des calories pour assiette2 et assiette3
        System.out.println("Nombre de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("Nombre de calories de Assiette 2 : " + assiette2.nbCalories);
        
        // Incrémenter les calories de assiette2
        assiette2.nbCalories += 100;

        // Affichage après modification
        System.out.println("Après modification :");
        System.out.println("Nombre de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("Nombre de calories de Assiette 1 : " + assiette2.nbCalories);
        
        Tartiflette temp =assiette1;
        assiette1=assiette2;
        assiette2= temp;
        
        // Afficher les calories après l'inversion
        System.out.println("Après l'échange :");
        System.out.println("Calories de assiette1 : " + assiette1.nbCalories);
        System.out.println("Calories de assiette2 : " + assiette2.nbCalories);
        
        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ;
        // Une référence objet qui annonce référencer un type d’objet ne peut pas en référencer un autre s'il n'y a aucune relation entre les deux types 
//Si Moussaka et Tartiflette sont des classes complètement indépendantes, elles ne peuvent pas se référencer l'une l'autre.

       // Création d'un tableau de 10 références de type Moussaka
        Moussaka[] tableauMoussaka = new Moussaka[10];
        // Boucle pour initialiser chaque élément du tableau avec un objet Moussaka
        for (int i = 0; i < tableauMoussaka.length; i++) {
            tableauMoussaka[i] = new Moussaka(i * 100);
        }
        for (int i=0; i<tableauMoussaka.length; i++) {
            System.out.println("Moussaka"+i+ " : " + tableauMoussaka[i].nbCalories + " calories.");
        }
    }
    
}
