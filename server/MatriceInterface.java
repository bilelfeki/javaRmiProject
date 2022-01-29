import java.rmi.*;
public interface MatriceInterface extends  Remote {
    public void insererLigne(int[] l,int numLigne) throws RemoteException ; 
    public Column matricefoisColumn(Column c) throws RemoteException ; 

}
