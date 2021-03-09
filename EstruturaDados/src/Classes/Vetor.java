package Classes;

import java.util.Arrays;
import javax.swing.JTextPane;


public class Vetor {

    private final int MAX = 5;
    private int tamanho = 0;
    private Produto[] produtos = new Produto[MAX];

    public void adiciona(Produto produto) throws Exception {
        if (tamanho == MAX) {
            throw new Exception("Vetor Cheio");
        }
        produtos[tamanho] = produto;
        tamanho++;
    }

    public void Listar(JTextPane pTable) throws Exception {
        Boolean PrimeiraLinha = true;
        pTable.setText("");

        for (int i = 0; i < 10; i++) {
            if (produtos[i] != null) {
                if (PrimeiraLinha) {
                    pTable.setText(pTable.getText() + produtos[i]);
                    PrimeiraLinha = false;
                } else {
                    pTable.setText(pTable.getText() + "\n" + produtos[i]);
                }

            }
        }

    }

    ;


    public void adiciona(int indice, Produto aluno) throws Exception {
        if (tamanho == MAX) {
            throw new Exception("Vetor Cheio");
        }
        if (indice < 0 || indice > tamanho) {
            throw new Exception("Indice Invalido");
        }
        for (int i = tamanho; i > indice; i--) {
            produtos[i] = produtos[i - 1];
        }
        produtos[indice] = aluno;
        tamanho++;
    }

    public Produto pega(int indice) throws Exception {
        if (indice >= tamanho) {
            throw new Exception("Indice invalido");
        }

        if (indice < 0) {
            throw new Exception("Indice invalido");
        }
        return produtos[indice];
    }

    public void remove_ultimo() {
        tamanho--;
        produtos[tamanho] = null;
    }

    public void remove(int indice) throws Exception {
        if (indice < 0 || indice >= tamanho || tamanho == 0) {
            throw new Exception("Indice invalido");
        }

        for (int i = indice; i < tamanho - 1; i++) {
            produtos[i] = produtos[i + 1];
        }
        tamanho--;
        produtos[tamanho] = null;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        return Arrays.toString(produtos);
    }

    private void replace(char c, char c0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
