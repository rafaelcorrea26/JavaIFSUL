/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author rafae
 */
public class Aluno {

    public Aluno(String nome, String cpf, String fone) {
        this.ID = Aluno.contador;
        this.Nome = nome;
        this.CPF = cpf;
        this.Fone = fone;
        Aluno.contador++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getFone() {
        return Fone;
    }

    public void setFone(String Fone) {
        this.Fone = Fone;
    }
    private int ID;
    private String Nome;
    private String CPF;
    private String Fone;
    private static int contador = 1;

}
