import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FactoryColumn extends UnicastRemoteObject implements FactoryColumnInterface {
    public FactoryColumn() throws RemoteException {
            super() ;
    }
    public Column createColumn(int[] column,int taille) throws RemoteException{
        return new Column(column,taille);
    }
}