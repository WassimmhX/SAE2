package exemple_rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);

        Hello hello = (Hello) registry.lookup("HelloService");

        String resultat = hello.sayHello("Wassim");
        System.out.println(resultat);
    }
}