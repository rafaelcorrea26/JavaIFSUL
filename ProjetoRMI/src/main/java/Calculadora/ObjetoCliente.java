/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

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
                    "Calculadora RMI     \n" +
                    "1 - Soma            \n" +
                    "2 - Subtração       \n" +
                    "3 - Multiplicação   \n" +
                    "4 - Divisão         \n" +
                    "Clique em 'Cancelar' para Sair");
                switch (menu) {
                    case "1":
                        {
                            int x = Integer.parseInt(JOptionPane.showInputDialog("Escreva o primeiro número:"));
                            int y = Integer.parseInt(JOptionPane.showInputDialog("Escreva o segundo número:"));
                            JOptionPane.showMessageDialog(null, "A soma é: " +objeto.somar(x,y));
                            break;
                        }
                    case "2":
                        {
                            int x = Integer.parseInt(JOptionPane.showInputDialog("Escreva o primeiro número:"));
                            int y = Integer.parseInt(JOptionPane.showInputDialog("Escreva o segundo número:"));
                            JOptionPane.showMessageDialog(null, "A Subtração é: " +objeto.subtrair(x,y));
                            break;
                        }
                    case "3":
                        {
                          int x = Integer.parseInt(JOptionPane.showInputDialog("Escreva o primeiro número:"));
                         int y = Integer.parseInt(JOptionPane.showInputDialog("Escreva o segundo número:"));
                            JOptionPane.showMessageDialog(null, "A Multiplicação é: " +objeto.multiplicar(x,y));
                            break;
                        }
                    case "4":
                        {
                           int x = Integer.parseInt(JOptionPane.showInputDialog("Escreva o primeiro número:"));
                           int y = Integer.parseInt(JOptionPane.showInputDialog("Escreva o segundo número:"));
                        JOptionPane.showMessageDialog(null, "A divisão é: " +objeto.dividir(x,y));
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
   
