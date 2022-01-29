import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FactoryMatriceInterface extends Remote{
    public Matrice createMatrice(int n,int p, int[][]m) throws RemoteException ; 

}
