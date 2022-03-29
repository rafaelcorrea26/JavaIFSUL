/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author aluno
 */
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
            ex.getStackTrace();
        }
        
      
        
    }
    
    public static void main(String[] args) {
        ServidorRMI servidor = new ServidorRMI();
                
    }
}

