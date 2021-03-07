/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafae
 */
public class Conexao {

    private Connection ConexaoBanco;

    public void ConectaBancoDados() {
        Connection Conexao = null;  // Conexao
        PreparedStatement ps = null; // Operação
        ResultSet rs = null;         // Dados
        String ip = "jdbc:postgresql://localhost:5432/mercado";
        String username = "postgres";
        String password = "server";

        //Conectar
        try {
            Class.forName("org.postgresql.Driver");
            Conexao = DriverManager.getConnection(ip, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("ERRO Banco de Dados");
            System.exit(-1); //Fecha o programa
        }
        ConexaoBanco = Conexao;
    }



    public void Inserir(String pDescricao, String pQtde, String pValor) {
        try {
            String sql = "INSERT INTO PRODUTO (DESCRICAO, QTDE, VALOR) VALUES ('" + pDescricao + "', " + pQtde + ", " + pValor + ")";
            PreparedStatement ps = ConexaoBanco.prepareStatement(sql);
            ps.execute();
            System.out.println("Produto incluido.");

        } catch (SQLException ex) {
            System.out.println("Erro incluir os produtos.");
        }

    }

    public void Alterar(String pID, String pDescricao, String pQtde, String pValor) {

        try {

            String sql = "update PRODUTO set DESCRICAO = '" + pDescricao + "', QTDE = " + pQtde + ",VALOR = " + pValor + " WHERE ID = " + pID;
            PreparedStatement ps = ConexaoBanco.prepareStatement(sql);
            ps.execute();

        } catch (SQLException ex) {
            System.out.println("Erro ao Alterar os produtos.");
        }

    }

    public void Deletar(String pID) {

        try {

            String sql = "Delete from PRODUTO where id = " + pID;
            PreparedStatement ps = ConexaoBanco.prepareStatement(sql);
            ps.execute();

        } catch (SQLException ex) {
            System.out.println("Erro ao Deletar os produtos.");
        }

    }

    public void Listar(JTable pTabela) {

        try {
            ResultSet rs = null;
            String sql = "SELECT * FROM PRODUTO";
            PreparedStatement ps = ConexaoBanco.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();

            DefaultTableModel dtm = (DefaultTableModel) pTabela.getModel();
            dtm.setNumRows(0);

            while (rs.next()) {
                dtm.addRow(new Object[]{
                    //retorna os dados da tabela do BD, cada campo em uma coluna.
                    rs.getString("ID"),
                    rs.getString("DESCRICAO"),
                    rs.getString("QTDE"),
                    rs.getString("VALOR"),}
                );
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao Listar os produtos.");
        }

    }

}
