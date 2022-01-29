import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String args[]){
       /*try{
           if(System.getSecurityManager()==null){
               System.setSecurityManager(new SecurityManager());
           }
       }catch(Exception e){
           e.printStackTrace(); 
       }*/

       try{
            LocateRegistry.createRegistry(1099);
            String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/factoryMatrice";
            String _url= "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/factoryColumn";
            FactoryMatrice mf=new FactoryMatrice() ; 
            FactoryColumn  cf=new FactoryColumn() ;
            Naming.rebind(url,mf);
            Naming.rebind(_url,cf) ;
            System.out.println("en attende de clients");
       }catch(Exception e){
           e.printStackTrace();
       }
   
    
}
}
