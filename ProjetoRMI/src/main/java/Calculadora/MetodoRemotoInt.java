/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Calculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface MetodoRemotoInt extends Remote{
    public int somar(int valor1, int valor2) throws RemoteException;
    public int subtrair(int valor1, int valor2) throws RemoteException;
     public int multiplicar(int valor1, int valor2) throws RemoteException;
    public int dividir(int valor1, int valor2) throws RemoteException;  
}
