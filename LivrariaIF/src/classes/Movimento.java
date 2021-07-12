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
public class Movimento {


    public Movimento(int id_Aluno, int id_Livro, String DataRetirada, String DataDevolver) {
        this.ID = Movimento.contador;
        this.ID_Aluno = id_Aluno;
        this.ID_Livro = id_Livro;
        this.DataRetirada = DataRetirada;
        this.DataDevolver = DataDevolver;
        Movimento.contador++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_Aluno() {
        return ID_Aluno;
    }

    public void setID_Aluno(int ID_Aluno) {
        this.ID_Aluno = ID_Aluno;
    }

    public int getID_Livro() {
        return ID_Livro;
    }

    public void setID_Livro(int ID_Livro) {
        this.ID_Livro = ID_Livro;
    }

    public String getDataRetirada() {
        return DataRetirada;
    }

    public void setDataRetirada(String DataRetirada) {
        this.DataRetirada = DataRetirada;
    }

    public String getDataDevolver() {
        return DataDevolver;
    }

    public void setDataDevolver(String DataDevolver) {
        this.DataDevolver = DataDevolver;
    }
    private int ID;
    private int ID_Aluno;
    private int ID_Livro;
    private String DataRetirada;
    private String DataDevolver;
    private static int contador = 1;
}
