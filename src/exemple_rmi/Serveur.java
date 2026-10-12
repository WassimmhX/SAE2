package exemple_rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public static void main(String[] args) throws Exception {
        Hello hello = new HelloImpl();

        LocateRegistry.createRegistry(1099);
        Naming.rebind("HelloService", hello);
        System.out.println("Serveur prêt!");
    }
}