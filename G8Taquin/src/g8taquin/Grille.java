/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8taquin;

/**
 *
 * @author nci
 */
public class Grille {
     public Grille(){
        
    }
    public boolean verifDeplacement(){
        return false; 
             
    }
    public void inversionCoord(){
        
    }
    public int deplacement (int x){
        //cette methode appelle verif deplacement et inversioncoord 
        verifDeplacement (); 
        inversionCoord(); 
        return x; 
    }
}
