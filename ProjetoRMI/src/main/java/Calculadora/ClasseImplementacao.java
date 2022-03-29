/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClasseImplementacao extends UnicastRemoteObject implements MetodoRemotoInt{

    //stub (antigamente usava o comando rmic)
    public ClasseImplementacao() throws RemoteException{
        super();
    }

    @Override
    public int somar(int valor1, int valor2) throws RemoteException {
 return valor1+valor2; 
    }

    @Override
    public int subtrair(int valor1, int valor2) throws RemoteException {
     return valor1-valor2; 
    }

    @Override
    public int multiplicar(int valor1, int valor2) throws RemoteException {
      return valor1*valor2; 
    }

    @Override
    public int dividir(int valor1, int valor2) throws RemoteException {
       return valor1/valor2; 
    }
    
    

}
