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
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ObjetoCliente {
    
    public static void main(String[] args) {
        try {
            MetodoRemotoInt objeto = (MetodoRemotoInt) Naming.lookup("rmi://localhost:1099/RMIService");
            
            
           while (true) {
                String menu = JOptionPane.showInputDialog(
                    "APP Bancário RMI     \n" +
                    "1 - Saque            \n" +
                    "2 - Deposito         \n" +
                    "3 - Ver saldo        \n" +                
                    "Clique em 'Cancelar' para Sair");
                switch (menu) {
                    case "1":
                        {
                            double x = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor para saque:"));
                            if(objeto.getTotalConta() > x){
                                JOptionPane.showMessageDialog(null, "Novo saldo:" +objeto.saque(x));                           
                            } else{
                                JOptionPane.showMessageDialog(null, "Desculpe você não tem saldo suficiente!!!!");
                            }                            
                            break;
                        }
                    case "2":
                        {
                            double x = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor para deposito:"));
                                JOptionPane.showMessageDialog(null, "Novo saldo:" +objeto.deposito(x));     
                            break;
                        }
                    case "3":
                        {
                                JOptionPane.showMessageDialog(null, "Seu saldo é:" +objeto.getTotalConta());     
                            break;
                        }
                       default:
                        break;
 
        }}} catch (RemoteException ex) {
            System.out.println("aqui é algum erro em nivel de rede (seguranca ou conexao)");
            Logger.getLogger(ObjetoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ObjetoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }}
   

