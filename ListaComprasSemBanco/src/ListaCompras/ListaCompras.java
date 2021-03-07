/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCompras;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lubero
 */
public class ListaCompras extends javax.swing.JFrame {

    ArrayList<String> Produto;

    public ListaCompras() {
        initComponents();
        Produto = new ArrayList<>();
    }

    private void Excluir() {

        if (edtExcluir.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Descrição do produto a ser excluido, não pode ser vazio.");
            edtExcluir.requestFocus();
        } else {
            Produto.remove(edtExcluir.getText());
            tListaProduto.setText("");

            for (int i = 0; i < Produto.size(); i++) {
                tListaProduto.append(Produto.get(i) + '\n');
            }
        }
    }

    private void Adicionar() {
        if (edtProduto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Descrição produto não pode ser vazio.");
            edtProduto.requestFocus();
        } else {
            Produto.add(edtProduto.getText());

            tListaProduto.append(edtProduto.getText() + '\n');
            edtProduto.setText("");
        }
        JOptionPane.showMessageDialog(this, "Produto inserido na lista de compras.");
        edtProduto.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTPListaCompras = new javax.swing.JTabbedPane();
        pnlCentralCadastro = new javax.swing.JPanel();
        lblTituloCadastro = new javax.swing.JLabel();
        edtProduto = new javax.swing.JTextField();
        lblProduto = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        pnlCentralConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tListaProduto = new javax.swing.JTextArea();
        edtExcluir = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        lblTituloConsulta = new javax.swing.JLabel();
        lblProduto1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");
        setMinimumSize(new java.awt.Dimension(384, 427));
        setPreferredSize(new java.awt.Dimension(384, 427));
        setSize(new java.awt.Dimension(384, 427));
        getContentPane().setLayout(null);

        jTPListaCompras.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTPListaComprasComponentShown(evt);
            }
        });

        pnlCentralCadastro.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlCentralCadastroComponentShown(evt);
            }
        });
        pnlCentralCadastro.setLayout(null);

        lblTituloCadastro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTituloCadastro.setText("Cadastro Produto");
        pnlCentralCadastro.add(lblTituloCadastro);
        lblTituloCadastro.setBounds(10, 0, 190, 29);
        pnlCentralCadastro.add(edtProduto);
        edtProduto.setBounds(10, 70, 170, 30);

        lblProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblProduto.setText("Produto");
        pnlCentralCadastro.add(lblProduto);
        lblProduto.setBounds(10, 50, 160, 22);

        btnAdicionar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAdicionar.setText("Add Lista");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        pnlCentralCadastro.add(btnAdicionar);
        btnAdicionar.setBounds(190, 70, 100, 30);

        jTPListaCompras.addTab("Cadastra", pnlCentralCadastro);

        pnlCentralConsulta.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlCentralConsultaComponentShown(evt);
            }
        });
        pnlCentralConsulta.setLayout(null);

        tListaProduto.setEditable(false);
        tListaProduto.setColumns(20);
        tListaProduto.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        tListaProduto.setRows(5);
        jScrollPane1.setViewportView(tListaProduto);

        pnlCentralConsulta.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 340, 230);
        pnlCentralConsulta.add(edtExcluir);
        edtExcluir.setBounds(10, 293, 230, 30);

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnlCentralConsulta.add(btnExcluir);
        btnExcluir.setBounds(10, 328, 96, 30);

        lblTituloConsulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTituloConsulta.setText("Lista Compras");
        pnlCentralConsulta.add(lblTituloConsulta);
        lblTituloConsulta.setBounds(10, 0, 180, 29);

        lblProduto1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblProduto1.setText("Produto Excluir");
        pnlCentralConsulta.add(lblProduto1);
        lblProduto1.setBounds(10, 270, 230, 20);

        jTPListaCompras.addTab("Consulta", pnlCentralConsulta);

        getContentPane().add(jTPListaCompras);
        jTPListaCompras.setBounds(0, 0, 370, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        Adicionar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void pnlCentralCadastroComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlCentralCadastroComponentShown
        edtProduto.requestFocus();
    }//GEN-LAST:event_pnlCentralCadastroComponentShown

    private void jTPListaComprasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTPListaComprasComponentShown

    }//GEN-LAST:event_jTPListaComprasComponentShown

    private void pnlCentralConsultaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlCentralConsultaComponentShown
        edtExcluir.requestFocus();
    }//GEN-LAST:event_pnlCentralConsultaComponentShown

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new ListaCompras().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JTextField edtExcluir;
    private javax.swing.JTextField edtProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTPListaCompras;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblProduto1;
    private javax.swing.JLabel lblTituloCadastro;
    private javax.swing.JLabel lblTituloConsulta;
    private javax.swing.JPanel pnlCentralCadastro;
    private javax.swing.JPanel pnlCentralConsulta;
    private javax.swing.JTextArea tListaProduto;
    // End of variables declaration//GEN-END:variables
}
