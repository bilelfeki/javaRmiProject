import java.io.Serializable;
import java.rmi.* ; 
public class Matrice implements MatriceInterface ,Serializable{
    private int matrice[][] ;
    private int n ; 
    private int p ; 

    public Matrice(int n,int p,int matrice[][]){
       this.n=n ; 
       this.p=p ;
       this.matrice=matrice ;  
    }
    public void insererLigne(int[] l,int numLigne) throws RemoteException {

        for(int i=0;i<l.length;i++){
            matrice[numLigne][i]=l[i] ; 
        }
    }
    /*
     *produit de la matrice par une colonne 
    */
    public Column matricefoisColumn(Column c) throws RemoteException {
        int somme=0 ;
        int[] x= new int[n] ;
        Column result = new Column(x,n) ;  
        /**
         * resultat de la matrice est de taille (n,1) 
         */
        if(c.getTaille()==this.n){
            for(int i=0;i<n;i++){
                for(int j=0;j<p;j++){
                    somme+=this.matrice[i][j]*c.getColumn()[j] ;
                }
                result.setVal(i,somme) ; 
            }
        }
        return result ; 
            
        }
    /*getters*/ 
    public int getNbLigne(){
        return this.n ; 
    }
    public int getNbColonne(){
        return this.p; 
    }
    public int[][] getMatrice(){
        return this.matrice ;  
    }
    /*setters*/ 
    public void setMatrice(int[][] matrice){
        this.matrice=matrice ; 
    }
    public void setNbColonne(int n){
        this.n=n ; 
    }
    public void setNbLigne(int p){
        this.p=p; 
    }

}
