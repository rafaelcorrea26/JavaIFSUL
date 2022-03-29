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

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClasseImplementacao extends UnicastRemoteObject implements MetodoRemotoInt{

    //stub (antigamente usava o comando rmic)
    public ClasseImplementacao() throws RemoteException{
        super();
    }
   private double total;
   
   
    @Override
    public double saque(double valor) throws RemoteException {
        
        if (total > valor){
       total = total - valor;
        }
        
        return total;
    }

    @Override
    public double deposito(double valor) throws RemoteException {
       total = total + valor;
       return total;
    }

    @Override
    public double getTotalConta() throws RemoteException{
      return total;  
    }  

}
