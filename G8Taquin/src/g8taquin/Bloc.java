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
public class Bloc {
   
    int x; 
    int y; 
    int n; 
    public Bloc (int x, int num,int y ){
    //constructeur de la classe 
        this.x=x; 
        this.y=y; 
        this.n=num; 
        
}
    
    public void setCoordx (int x){
        this.x=x; 
    }
    public void setCoordy(int y){
        this.y=y; 
    }

    public void setNum(int num){
        this.n=num; 
    }
    
    public int  getCoordx (){
        return x; 
    }
    public int  getCoordy (){
        return y; 
    }
    public int  getNumBloc (){
        return n; 
    }
}
