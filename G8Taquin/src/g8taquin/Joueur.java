/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8taquin;

import java.util.Scanner;

/**
 *
 * @author nci
 */
public class Joueur {
    private String pseudo="";  // represente le pseudo du joueur 
    
     public void setPseudo(){
  //jai repris notre ancienne fonction chez sahzamm 
        Scanner sc = new Scanner(System.in);  //Initialisation du scanner
        System.out.println("\nNouveau Joueur, entre ton pseudo : "); 
        String ps = sc.nextLine();   //Saisie par le joueur
        //Test si la saisie est valide
        if ("".equals(ps.trim())){
            System.out.println("Ton pseudo n'est pas valide, recommence.");
            this.setPseudo(); 
        } 
        this.pseudo = ps;
    }
     public String getPseudo(){
         //getteur du pseudo 
     return pseudo;   
} 
}
