import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FactoryColumnInterface extends Remote{
    public Column createColumn(int[] column,int taille) throws RemoteException ; 

}
