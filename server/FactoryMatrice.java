import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class FactoryMatrice extends UnicastRemoteObject implements FactoryMatriceInterface {
    public FactoryMatrice() throws RemoteException {
            super() ;
    }
    public Matrice createMatrice(int n,int p,int[][]m){
        return new Matrice(n,p,m); 
    }
}