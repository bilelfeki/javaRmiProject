import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Column extends UnicastRemoteObject implements ColumnInterface {
    private int[] column ;
    private int taille  ; 

    public Column( int[] column,int taille ) throws RemoteException {
        super() ;
        this.column=column ; 
        this.taille=taille ; 
    }

    public int[] getColumn() {
        return column;
    }
    public int getTaille(){
        return taille ; 
    }
    public void setColumn(int[] column) {
        this.column = column;
    }
    public void setVal(int place,int val){
        this.column[place]=val ; 
    }
    public void setTaille(int t){
        this.taille =t ; 
    }
    

}
