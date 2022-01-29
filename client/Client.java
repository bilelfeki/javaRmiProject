
      import java.net.MalformedURLException;
      import java.rmi.Naming;
      import java.rmi.NotBoundException;
      import java.rmi.Remote;
      import java.rmi.RemoteException;
      
      public class Client {
      
        public static void main(String[] args) {
          System.out.println("Lancement du client");
         
          try {

            Remote r = Naming.lookup("rmi://127.0.1.1:1099/factoryMatrice");            
            System.out.println(r) ;
          } catch (MalformedURLException e) {
            e.printStackTrace();
          } catch (RemoteException e) {
            e.printStackTrace();
          } catch (NotBoundException e) {
            e.printStackTrace();
          }
          System.out.println("Fin du client");
        }
      }