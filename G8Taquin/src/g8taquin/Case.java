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
public class Case {
    //consctructeur de la classe 
    //crée un carte qui pour coordonees x y 
    int x; 
    int y; 
    public Case(int abs, int ord){
        this.x=abs; 
        this.y=ord; 
    }
   public int getCoordx(){
       //renvoie l'attribut coordx
       return this.x; 
    }
   public int getCoordy(){
         //renvoie l'attribut coordy
       return this.y; 
    }
   public boolean getVide(){
        return false; 
    }
    public void setCoordx (int x){
        //si le mouvement est vertical change la coordx pour x 
        this.x=x; 
    }
    public void setCoordy(int y){
        //si le mouvement est horizontal change la coordy pour y 
        this.y=y; 
    }
    public void setVide(boolean v){
        
    }
    
    
}

