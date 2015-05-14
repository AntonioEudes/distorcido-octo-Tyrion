/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bilbioteca.view.principal;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Usuario
 */
public class JFramePrincipal extends javax.swing.JFrame {

    
    private JFrameCrudAluno crudAluno = new JFrameCrudAluno();
    private JFrameCrudFuncionario crudFuncionario = new JFrameCrudFuncionario();
    private JFrameCrudLivro crudLivro = new JFrameCrudLivro();
    
    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
        setSize(910, 618);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonInicio = new javax.swing.JButton();
        jButtonFuncionario = new javax.swing.JButton();
        jButtonLivro = new javax.swing.JButton();
        jButtonAluno = new javax.swing.JButton();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 0);

        jButtonInicio.setText("Inicío");
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicio);
        jButtonInicio.setBounds(220, 260, 100, 30);

        jButtonFuncionario.setText("Funcionario");
        jButtonFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFuncionario);
        jButtonFuncionario.setBounds(340, 260, 100, 30);

        jButtonLivro.setText("Livro");
        jButtonLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLivroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLivro);
        jButtonLivro.setBounds(580, 260, 100, 30);

        jButtonAluno.setText("Aluno");
        jButtonAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAluno);
        jButtonAluno.setBounds(460, 260, 100, 30);

        jProgressBar2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jProgressBar2.setForeground(new java.awt.Color(102, 255, 102));
        jProgressBar2.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jProgressBar2);
        jProgressBar2.setBounds(210, 250, 480, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Biblioteca\\src\\br\\com\\biblioteca\\incone\\Biblioteca.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 890, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButtonFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncionarioActionPerformed
       crudFuncionario.setVisible(true); 
    }//GEN-LAST:event_jButtonFuncionarioActionPerformed

    private void jButtonAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlunoActionPerformed
       crudAluno.setVisible(true); 
    }//GEN-LAST:event_jButtonAlunoActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        setVisible(true);
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jButtonLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLivroActionPerformed
       crudLivro.setVisible(true);
    }//GEN-LAST:event_jButtonLivroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAluno;
    private javax.swing.JButton jButtonFuncionario;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables
}
