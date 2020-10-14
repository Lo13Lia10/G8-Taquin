/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8taquin;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author lo
 */
public class Grille {
    //Attributs
    int taille=0;
    Case [][] ensCase;
    HashSet<Integer> ensNumBloc;
    
    //Constructeur
    public Grille(int t){
        /*
        constructeur de case : coords, num du bloc, booleen en bas à droite
        */        
        this.taille = t;
        this.ensCase = new Case[taille][taille];
        this.ensNumBloc=remplissageNumBloc();
        //Création du tableau de Cases
        
        for (int i=0 ; i<this.taille ; i++){
            
            for (int j=0 ; j<this.taille ; j++){
                //Initialisation du booléen vide pour mettre à vide la case en bas à droite du puzzle
                boolean vide = false;
                if (i==this.taille-1 && j==this.taille-1){
                    vide = true;
                }
                //Tirage au sort du num du bloc
                Iterator it = ensNumBloc.iterator();
               
                while (  it.hasNext()){
                    //Copie du numéro courant                    
                    int num = (int) it.next();
                    System.out.println(num);
                    //Création de la case
                    ensCase[i][j] = new Case (i, j, vide, num);
                    this.ensNumBloc.remove( num);
                    
                }
            }
        }
    }
    
    public void setTaille (int newTaille) {
    //Initialisation de l'attribut taille
        //Si la valeur de taille est nulle, cela veut dire qu'on ne l'a jamais initialisé donc il faut le faire
        if (this.taille == 0){
            this.taille = newTaille;
        }
    }
    
    public int getTaille () {
        return this.taille;
    }
    
    /*
    Remplissage de l'ensemble avec tous les numéros des blocs possibles
    */
    private HashSet remplissageNumBloc() {
        HashSet numBloc = new HashSet();
        for (int i=0 ; i<this.taille*taille; i++){
            int num = this.taille*taille - i;
            numBloc.add(num);
        }
        return numBloc;
    }
    
    private void inversionCoord(int num_bloc_x, int num_bloc_y, Case caseVide, char d){
        //Récupérer les coordonnées des deux blocs dans des variables
        /*
        var tempx = coordx_num1
        var tempy = coordy_num1
        */
        
        
        /*
        //Le bloc prend de nouvelles coordonnées
        //Déplacement vers la gauche
        if (d ='q') {
            //le bloc prend coordy - 1, coordx inchangée
        }
        /Déplacement vers le bas
        else if (d='s') {
            
        }
        //Déplacement vers la droite
        else if (d='d') {
            
        }
        //Déplacement vers le haut
        else if (d='z') {
            
        }
        
        //Nouvelle coordonnées pour la case vide
        on prend la case avec les coordonnées initial du bloc qu'on a déplacé
        et à ses coordonnées on met le booléen VIDE = TRUE
        on met au nouvelle coordonnée du bloc déplacé VIDE = FALSE
        */
    }
    
    protected boolean deplacement (char direction){
    //permet le déplacement d'une case dans la direction souhaitée si c'est possible
        //Récupération des coordonnées de la case vide
        Case caseVide = trouveCaseVide();
        int casevide_x = caseVide.getCoordx();
        int casevide_y = caseVide.getCoordy();
        
        //Initialisation du num_bloc
        int num_bloc_x = -1;    //Initialisation à une coordonnée impossible
        int num_bloc_y = -1;    //Initialisation à une coordonnée impossible
        
        //Initialisation du booléen pour savoir si on peut vérifier le déplacement
        boolean deplacement_ok = true;
        
        //Déplacement vers la gauche
        if (direction=='q' && casevide_y!=taille-1) {
            //le bloc prend y-1, x+0
            //this.getNumBlocByCoord(casevide_x, casevide_y-1);
            num_bloc_x = casevide_x;
            num_bloc_y = casevide_y-1;
        }
        //Déplacement vers le bas
        else if (direction=='s' && casevide_x!=0) {
            //le bloc prend y+0, x+1
            //this.getNumBlocByCoord(casevide_x+1, casevide_y);
            num_bloc_x = casevide_x+1;
            num_bloc_y = casevide_y;
        }
        //Déplacement vers la droite
        else if (direction=='d' && casevide_y!=0) {
            //le bloc prend y+1, x+0
            //this.getNumBlocByCoord(casevide_x, casevide_y+1);
            num_bloc_x = casevide_x;
            num_bloc_y = casevide_y+1;
        }
        //Déplacement vers le haut
        else if (direction=='z' && casevide_x!=taille-1) {
            //le bloc prend y+0, x-1
            //this.getNumBlocByCoord(casevide_x-1, casevide_y);
            num_bloc_x = casevide_x-1;
            num_bloc_y = casevide_y;
        }
        else {
            //le déplacement n'est pas possible
            deplacement_ok = false;
        }
        
        
        //Vérifie si le déplacement est possible
        if (deplacement_ok){
            //Si oui alors on inverse les coordonnées des cases adjacentes
            //9999 A REMPLACER PAR LE NUMERO DE LA CASE VIDE OU AUTRE JE SAIS PAS COMMENT ON DECIDE
            inversionCoord(num_bloc_x, num_bloc_y, caseVide, direction); 
            //On met la bonne case à VIDE
        }
        
        return deplacement_ok; 
    }
    
    private boolean verifVictoire () {
        int temp_num_bloc = 0;  //variable temp pour le num du bloc précédent
        boolean ordonne = true; //TRUE si les blocs sont dans l'ordre
        
        /*
        temp_num_bloc prend les coordonnées de la cas 0;0
        
        while (ordonne) {
            for (int i=1 ; i=taille ; i++) {
                for (int j=0 ; j=taille ; j++) {
                    num_bloc =  le numéro du bloc au coordonnée i;j
                    if (num_bloc != temp_num_bloc+1){
                        ordonne = false;
                    }
                    temp_num_bloc = num_bloc trouvé
                }
            }
        }
        */
        
        return false;
    }
    
    /*
    Trouve la case vide et en renvoie une copie
    */
    private Case trouveCaseVide() {
        Case c = null;
        //Parcours de l'ensemble des cases
        for (int i=0 ; i==taille ; i++){
            for (int j=0 ; j==taille ; j++){
                //Si la case est vide on la récupère
                if (this.ensCase[i][j].getVide()){
                    c = this.ensCase[i][j];
                }
            }
        }
        //Renvoie la case vide
        return c;
    }
    
    /*
    x : coordonnée en x du bloc voulu
    y : coordonnée en y du bloc voulu
    Parcours le HashSet de Bloc pour trouver le bloc qui a pour coord x et y et renvoie son numéro
    */
    private int getNumBlocByCoord(int x, int y) {
        /*
        //Déclaration et Initialisation
        int numbloc = 0;
        //Copie du HashSet de Bloc
        HashSet copieEnsBloc = ensBloc;
        //Parcours du HashSet
        Iterator it = copieEnsBloc.iterator();
        while (it.hasNext()){
            //Copie du bloc courant
            Bloc bloctemp = (Bloc) it.next();
            //Si c'est le bloc qu'on cherche alors on récupère son numéro
            if (bloctemp.getCoordx()==x && bloctemp.getCoordy()==y){
                numbloc = bloctemp.getNumBloc();
            }
        }
        
        //Retourne le numéro du bloc
        return numbloc;
        //pomme 
        */
        return 0;
    }
    
    
    /*
    Permet de retourner la grille en chaine de caractère
    */
    @Override
    public String toString () {
        String grilleString = "";
        //Parcours de l'ensemble de cases
        for (int i=0 ; i<this.taille ; i++){            
            for (int j=0 ; j<this.taille ; j++){
                grilleString = grilleString + " " + ensCase[i][j].toString();
            }
            grilleString = grilleString + "\n";
        }
        return grilleString;
    }
    
    public static void main(String[] args) {
        Grille g = new Grille(3);        
        System.out.println(g);
        
    }
}
