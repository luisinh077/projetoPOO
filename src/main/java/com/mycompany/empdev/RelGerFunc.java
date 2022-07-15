//Nome: Luís Henrique de Jesus Lima - RA: 2313642

package com.mycompany.empdev;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RelGerFunc extends javax.swing.JFrame {

        private Funcionario funcionario = new Funcionario();
        private static RelGerFunc unicoRGF;
        private static FuncGer gp;
  
    private RelGerFunc() {
        initComponents();
    }
    
    public static RelGerFunc getRelGerFunc(FuncGer gp1){
        gp = gp1;
        if(unicoRGF == null){
            unicoRGF = new RelGerFunc();
        }
        return unicoRGF;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabFunc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        tabFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "NOME", "IDADE", "ESTADO", "CIDADE", "RUA", "NÚMERO", "FUNÇÃO", "SALÁRIO"
            }
        ));
        tabFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabFuncMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabFunc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabFuncMouseClicked
        selectTabFunc();
    }//GEN-LAST:event_tabFuncMouseClicked

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
       listaTab();
    }//GEN-LAST:event_formPropertyChange

    /**
     * @param args the command line arguments
     */
      public void selectTabFunc(){
        String valLinTab = "";
        int posLin = tabFunc.getSelectedRow();
          
        
        for(int coluna = 0;coluna < tabFunc.getColumnCount(); coluna++ ){
            valLinTab += tabFunc.getModel().getValueAt(posLin,coluna).toString();
            
            if(coluna+1 < tabFunc.getRowCount()){
               valLinTab += " - ";
            }
            
        }
        JOptionPane.showMessageDialog(
                null,
                "Valor escolhido: "+valLinTab,
                "Seleção na tabela",
                1
        );
    }
    public void listaTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabFunc.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Funcionario funcionario : gp.getBdFunc() ){
            modelo.insertRow(
                posLin, 
                new Object[]{
                    funcionario.getCpf(), 
                    funcionario.getName(), 
                    funcionario.getAge(), 
                    funcionario.getAddress().getReg().getEstado(), 
                    funcionario.getAddress().getReg().getCidade(),
                    funcionario.getAddress().getStreet(), 
                    funcionario.getAddress().getNumber(),
                    funcionario.getFuncao(),
                    funcionario.getSalario()
                }
            );
            posLin++;
        }
    }
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
            java.util.logging.Logger.getLogger(RelGerFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelGerFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelGerFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelGerFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelGerFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabFunc;
    // End of variables declaration//GEN-END:variables
}
