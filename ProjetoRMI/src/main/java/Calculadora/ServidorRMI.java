/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Calculadora;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;



public class ServidorRMI {
    
    public ServidorRMI(){
        
        try {
            System.setProperty("java.rmi.server.hostname", "localhost");
            LocateRegistry.createRegistry(1099);
            ClasseImplementacao objetoComMetodoRemoto = new ClasseImplementacao();
            Naming.bind("RMIService", objetoComMetodoRemoto);
             System.out.println("Servidor ouvindo");
            
        } catch (MalformedURLException | AlreadyBoundException | RemoteException ex) {
            System.out.println("erro ao subir o servidor RMI");
        }
        
       
        
    }
    
    public static void main(String[] args) {
        ServidorRMI servidor = new ServidorRMI();
                
    }
}
