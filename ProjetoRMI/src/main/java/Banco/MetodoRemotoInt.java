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

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface MetodoRemotoInt extends Remote{
    public double saque(double valor) throws RemoteException;
    public double deposito(double valor) throws RemoteException;
    public double getTotalConta() throws RemoteException;
    
}
