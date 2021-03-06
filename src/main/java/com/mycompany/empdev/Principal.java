//Nome: Luís Henrique de Jesus Lima - RA: 2313642

package com.mycompany.empdev;

import javax.swing.JOptionPane;

/**
 *
 * @author Luisinho
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form TelaSelecao
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotTitulo = new javax.swing.JLabel();
        btnFunc = new javax.swing.JButton();
        btnClie = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Seleção");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rotTitulo.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        rotTitulo.setText("CADASTRO");

        btnFunc.setBackground(new java.awt.Color(153, 0, 153));
        btnFunc.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnFunc.setText("Funcionário");
        btnFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncActionPerformed(evt);
            }
        });

        btnClie.setBackground(new java.awt.Color(153, 0, 153));
        btnClie.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnClie.setText("Cliente");
        btnClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClieActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(153, 0, 153));
        btnCancel.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(rotTitulo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClie, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(rotTitulo)
                .addGap(44, 44, 44)
                .addComponent(btnFunc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClie)
                .addGap(49, 49, 49)
                .addComponent(btnCancel)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        sair();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncActionPerformed
        abreCadFuncionario();
    }//GEN-LAST:event_btnFuncActionPerformed

    private void btnClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClieActionPerformed
        abreCadCliente();
    }//GEN-LAST:event_btnClieActionPerformed

    public void abreCadFuncionario() {
        new CadFuncionario().setVisible(true);
    }
    
    public void abreCadCliente() {
        new CadCliente().setVisible(true);
    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja sair?",
                "Saida",
                JOptionPane.YES_NO_OPTION
        );
        if (resp == 0) {
            dispose();
        }
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClie;
    private javax.swing.JButton btnFunc;
    private javax.swing.JLabel rotTitulo;
    // End of variables declaration//GEN-END:variables

}
