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
public class Livros {

    public Livros(String Descricao, String Tipo) {
        this.ID = Livros.contador;
        this.Descricao = Descricao;
        this.Tipo = Tipo;
        Livros.contador++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    private int ID;
    private String Descricao;
    private String Tipo;
    private static int contador = 1;
}
