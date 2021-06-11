/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showmilhao;

import java.awt.Dialog;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import showmilh�o.TelaPrincipal;

/**
 *
 * @author Gabriel_PC
 */
public class Cartas extends javax.swing.JFrame {
    int quantidade;
    TelaPrincipal teste;
    
    public Cartas(int qtdCartas) {
        initComponents();
        this.pack();
        quantidade = qtdCartas;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carta1 = new javax.swing.JButton();
        carta2 = new javax.swing.JButton();
        carta3 = new javax.swing.JButton();
        carta4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(230, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        carta1.setBackground(new java.awt.Color(255, 0, 51));
        carta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhão/fundoazul.jpg"))); // NOI18N
        carta1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        carta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta1ActionPerformed(evt);
            }
        });
        getContentPane().add(carta1);
        carta1.setBounds(40, 80, 60, 90);

        carta2.setBackground(new java.awt.Color(255, 0, 51));
        carta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhão/fundovermelho.jpg"))); // NOI18N
        carta2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        carta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta2ActionPerformed(evt);
            }
        });
        getContentPane().add(carta2);
        carta2.setBounds(130, 80, 60, 90);

        carta3.setBackground(new java.awt.Color(255, 0, 51));
        carta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhão/fundovermelho.jpg"))); // NOI18N
        carta3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        carta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta3ActionPerformed(evt);
            }
        });
        getContentPane().add(carta3);
        carta3.setBounds(40, 190, 62, 89);

        carta4.setBackground(new java.awt.Color(255, 0, 51));
        carta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhão/fundoazul.jpg"))); // NOI18N
        carta4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        carta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta4ActionPerformed(evt);
            }
        });
        getContentPane().add(carta4);
        carta4.setBounds(130, 190, 62, 89);

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html>   <p>Escolha uma das cartas <br> para continuar</p></html>");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 200, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhão/13115545492078.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 230, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta1ActionPerformed
        carta2.setEnabled(false);
        carta3.setEnabled(false);
        carta4.setEnabled(false);
        escolheCarta(carta1, 0);
    }//GEN-LAST:event_carta1ActionPerformed

    private void carta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta2ActionPerformed
        carta1.setEnabled(false);
        carta3.setEnabled(false);
        carta4.setEnabled(false);
        escolheCarta(carta2, 1);
    }//GEN-LAST:event_carta2ActionPerformed

    private void carta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta3ActionPerformed
        carta1.setEnabled(false);
        carta2.setEnabled(false);
        carta4.setEnabled(false);
        escolheCarta(carta3, 2);
    }//GEN-LAST:event_carta3ActionPerformed

    private void carta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta4ActionPerformed
        carta1.setEnabled(false);
        carta2.setEnabled(false);
        carta3.setEnabled(false);
        escolheCarta(carta4, 3);
    }//GEN-LAST:event_carta4ActionPerformed

    public int escolheCarta(JButton botaoAlterado, int i)
    {
        JOptionPane.showMessageDialog(null, "q " + quantidade);
        if(quantidade == 1)
        {
            //imagem baralho as
            botaoAlterado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhão/as.jpg")));
            
            return 1;
        }else{
            if(quantidade == 2)
            {
                //imagem baralho 2
                botaoAlterado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showmilhão/dois.jpg")));
                
                return 2;
                
            }
        }
        
        return 0;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carta1;
    private javax.swing.JButton carta2;
    private javax.swing.JButton carta3;
    private javax.swing.JButton carta4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
