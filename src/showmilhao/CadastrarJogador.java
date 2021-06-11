/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showmilhao;

import Classes.Jogador;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel_PC
 */
public class CadastrarJogador extends javax.swing.JFrame {
    Jogador qtdJogador[];
    /**
     * Creates new form CadastrarJogador
     */
    public CadastrarJogador(Jogador qtdJogador[]) {
        initComponents();
        this.qtdJogador = qtdJogador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nometxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nicktxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 350));
        setMinimumSize(new java.awt.Dimension(400, 350));
        getContentPane().setLayout(null);

        titulo.setBackground(new java.awt.Color(255, 0, 51));
        titulo.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Entre com as informa��es de jogador");
        titulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        titulo.setOpaque(true);
        getContentPane().add(titulo);
        titulo.setBounds(60, 20, 290, 40);

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OK");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhao/13115545492078.jpg")));
        getContentPane().add(jButton1);
        jButton1.setBounds(133, 220, 130, 40);

        nometxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nometxtActionPerformed(evt);
            }
        });
        getContentPane().add(nometxt);
        nometxt.setBounds(110, 100, 230, 20);

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 90, 290, 40);
        getContentPane().add(nicktxt);
        nicktxt.setBounds(140, 170, 200, 20);

        jLabel2.setBackground(new java.awt.Color(255, 0, 51));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("nickName");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 160, 290, 40);


        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nometxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nometxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nometxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(nometxt.getText().equals("") || nicktxt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Valores faltando");
        }else{
            Jogador novo = new Jogador();
            novo.setNome(nometxt.getText());
            novo.setNickName(nicktxt.getText());
            
            novo.adicionarJogador(qtdJogador, novo);
            JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso");
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nicktxt;
    private javax.swing.JTextField nometxt;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}