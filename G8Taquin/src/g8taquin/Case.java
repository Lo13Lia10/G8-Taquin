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
    et vlaaaaaaaaaaaaa
    private int x; 
    private int y;
    private boolean vide;
    private Bloc b;
    
    //consctructeur de la classe 
    //crée un carte qui pour coordonees abs et ord
    public Case(int abs, int ord){
        this.x=abs; 
        this.y=ord; 
        this.vide=true;
    }

    //renvoie l'attribut x 
    public int getCoordx(){    
       return this.x; 
    }
    
    //renvoie l'attribut y
    public int getCoordy(){    
       return this.y; 
    }
    
    //retourne la valuer d'une case
    public boolean getVide(){
        return this.vide; 
    }
    
    //modifie le x par la valeur newx 
    public void setCoordx (int newx){
        this.x=newx; 
    }
    
    //modifie le y par la valeur newy 
    public void setCoordy(int newy){
        this.y=newy; 
    }
    
    /*
    methode qui modifie l'attribut vide avec la valeur v en parametre
    */
    public void setVide(boolean v){
        this.vide=v;
    }

    @Override
    public String toString() {
        if (this.getVide()){
            return "[ ]";
        }
        else{
        return "["+ this.b.getNumBloc() +']';
        }
    }
    
    
    
}

