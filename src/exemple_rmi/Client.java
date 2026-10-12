package exemple_rmi;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) throws Exception {
        Hello hello = (Hello) Naming.lookup("HelloService");

        String resultat = hello.sayHello("Wassim");
        System.out.println(resultat);
    }
}