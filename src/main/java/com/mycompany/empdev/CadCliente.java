//Nome: Luís Henrique de Jesus Lima - RA: 2313642
package com.mycompany.empdev;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadCliente extends javax.swing.JFrame {

    private static CadCliente unicoCadClie;
    private Cliente cliente = new Cliente();
    private ClieGer gc = new ClieGer();

    CadCliente() {
        initComponents();
    }

    public static CadCliente getCadClie() {

        if (unicoCadClie == null) {
            unicoCadClie = new CadCliente();
        }
        return unicoCadClie;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotCpf = new javax.swing.JLabel();
        cxCpf = new javax.swing.JTextField();
        rotNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadClie = new javax.swing.JButton();
        btConsClieCpf = new javax.swing.JButton();
        btAltClieCpf = new javax.swing.JButton();
        btExcluiClieCpf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabClie = new javax.swing.JTable();
        btRelGerClie = new javax.swing.JButton();
        rotCpfConsult = new javax.swing.JLabel();
        cxCpfConsult = new javax.swing.JTextField();
        rotIdade = new javax.swing.JLabel();
        cxIdade = new javax.swing.JTextField();
        rotEstado = new javax.swing.JLabel();
        cxEstado = new javax.swing.JTextField();
        cxCidade = new javax.swing.JTextField();
        rotCidade = new javax.swing.JLabel();
        cxRua = new javax.swing.JTextField();
        rotRua = new javax.swing.JLabel();
        rotNumero = new javax.swing.JLabel();
        cxNumero = new javax.swing.JTextField();
        rotDate = new javax.swing.JLabel();
        cxDate = new javax.swing.JTextField();
        rotService = new javax.swing.JLabel();
        cxService = new javax.swing.JTextField();
        rotAtualizaNome = new javax.swing.JLabel();
        cxAtualizaNome = new javax.swing.JTextField();
        rotExcluiCliente = new javax.swing.JLabel();
        cxExcluiCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        rotCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotCpf.setText("CPF:");

        cxCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCpfActionPerformed(evt);
            }
        });

        rotNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotNome.setText("NOME:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadClie.setText("Cadastrar");
        btCadClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadClieActionPerformed(evt);
            }
        });

        btConsClieCpf.setText("Consultar");
        btConsClieCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsClieCpfActionPerformed(evt);
            }
        });

        btAltClieCpf.setText("Alterar");
        btAltClieCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltClieCpfActionPerformed(evt);
            }
        });

        btExcluiClieCpf.setText("Remover");
        btExcluiClieCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluiClieCpfActionPerformed(evt);
            }
        });

        tabClie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "NOME", "IDADE", "ESTADO", "CIDADE", "RUA", "NÚMERO", "D. ÚLTIMA COMPRA", "SERVIÇO"
            }
        ));
        tabClie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabClieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabClie);

        btRelGerClie.setText("Relatório Geral de Pessoas...");
        btRelGerClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelGerClieActionPerformed(evt);
            }
        });

        rotCpfConsult.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotCpfConsult.setText("CPF (Para Consultar):");

        cxCpfConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCpfConsultActionPerformed(evt);
            }
        });

        rotIdade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotIdade.setText("IDADE:");

        cxIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxIdadeActionPerformed(evt);
            }
        });

        rotEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotEstado.setText("ESTADO:");

        rotCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotCidade.setText("CIDADE:");

        rotRua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotRua.setText("RUA:");

        rotNumero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotNumero.setText("NÚMERO:");

        rotDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotDate.setText("DATA ÚLTIMA COMPRA:");

        cxDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxDateActionPerformed(evt);
            }
        });

        rotService.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotService.setText("SERVIÇO:");

        rotAtualizaNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotAtualizaNome.setText("CPF(Para Alterar Nome):");

        cxAtualizaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAtualizaNomeActionPerformed(evt);
            }
        });

        rotExcluiCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotExcluiCliente.setText("CPF(Para Excluir Cliente):");

        cxExcluiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxExcluiClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btRelGerClie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair)
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rotIdade)
                                            .addComponent(rotNome)
                                            .addComponent(rotCpf)
                                            .addComponent(rotEstado)
                                            .addComponent(rotCidade))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cxEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(rotRua)
                                                    .addComponent(rotNumero))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rotDate)
                                                .addGap(12, 12, 12)
                                                .addComponent(cxDate, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rotService)
                                                .addGap(12, 12, 12)
                                                .addComponent(cxService, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btCadClie))
                                        .addGap(56, 56, 56)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rotExcluiCliente)
                                    .addComponent(rotCpfConsult)
                                    .addComponent(rotAtualizaNome))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cxAtualizaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(cxCpfConsult, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(cxExcluiCliente))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btConsClieCpf)
                                    .addComponent(btAltClieCpf)
                                    .addComponent(btExcluiClieCpf)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(108, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotCidade)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotCpfConsult)
                            .addComponent(cxCpfConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConsClieCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxAtualizaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotAtualizaNome)
                            .addComponent(btAltClieCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxExcluiCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotExcluiCliente)
                            .addComponent(btExcluiClieCpf))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotDate, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotService, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadClie)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRelGerClie, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btLimpar)
                        .addComponent(btSair)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadClieActionPerformed
        cadClie();
        listaTab();
    }//GEN-LAST:event_btCadClieActionPerformed

    private void btConsClieCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsClieCpfActionPerformed
        consClieCpf();
    }//GEN-LAST:event_btConsClieCpfActionPerformed

    private void btAltClieCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltClieCpfActionPerformed
        altClieCpf();
        listaTab();
    }//GEN-LAST:event_btAltClieCpfActionPerformed

    private void btExcluiClieCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluiClieCpfActionPerformed
        excluiClieCpf();
        listaTab();
    }//GEN-LAST:event_btExcluiClieCpfActionPerformed

    private void tabClieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabClieMouseClicked
        selectTabClie();
    }//GEN-LAST:event_tabClieMouseClicked

    private void btRelGerClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelGerClieActionPerformed
        abreRelGerClie();
    }//GEN-LAST:event_btRelGerClieActionPerformed

    private void cxCpfConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfConsultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfConsultActionPerformed

    private void cxCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfActionPerformed

    private void cxIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxIdadeActionPerformed

    private void cxAtualizaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAtualizaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAtualizaNomeActionPerformed

    private void cxDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxDateActionPerformed

    private void cxExcluiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxExcluiClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxExcluiClienteActionPerformed

    public void abreRelGerClie() {
        RelGerClie.getRelGerClie(gc).setVisible(true);
    }

    public void selectTabClie() {
        String valLinTab = "";
        int posLin = tabClie.getSelectedRow();

        for (int coluna = 0; coluna < tabClie.getColumnCount(); coluna++) {
            valLinTab += tabClie.getModel().getValueAt(posLin, coluna).toString();

            if (coluna + 1 < tabClie.getRowCount()) {
                valLinTab += " - ";
            }

        }
        JOptionPane.showMessageDialog(
                null,
                "Valor escolhido: " + valLinTab,
                "Seleção na tabela",
                1
        );
    }

    public void listaTab() {
        DefaultTableModel modelo = (DefaultTableModel) tabClie.getModel();

        int posLin = 0;
        modelo.setRowCount(posLin);

        for (Cliente cliente : gc.getBdClie()) {
            modelo.insertRow(
                posLin, 
                new Object[]{
                    cliente.getCpf(), 
                    cliente.getName(), 
                    cliente.getAge(), 
                    cliente.getAddress().getReg().getEstado(), 
                    cliente.getAddress().getReg().getCidade(),
                    cliente.getAddress().getStreet(), 
                    cliente.getAddress().getNumber(),
                    cliente.getDataUltimaCompra(),
                    cliente.getServico()
                }
            );
            posLin++;
        }
    }

    public void excluiClieCpf() {
        cliente = new Cliente();

        try {
            cliente.setCpf(Integer.parseInt(cxExcluiCliente.getText()));
        } catch (NumNegatCpf nnc) {
            nnc.impCpfNeg();
        }

        cliente = gc.removeClieCod(cliente);

        if (cliente == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente EXCLUÍDO com sucesso!",
                    "Exclusão OK",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe um cliente com este CPF",
                    "Erro de Excluasão",
                    0
            );

        }
        limpar();
    }

    public void altClieCpf() {
        cliente = new Cliente();

        try {
            cliente.setCpf(Integer.parseInt(cxAtualizaNome.getText()));
        } catch (NumNegatCpf nnc) {
            nnc.impCpfNeg();
        }

        cliente = gc.atualizaClieCod(cliente);

        if (cliente != null) {
            cxAtualizaNome.setText(cliente.getName());
            cxAtualizaNome.setText("");
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente atualizado com sucesso!",
                    "Atualização OK",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe um funcionário com este CPF",
                    "Erro de Alteração",
                    0
            );

        }
        limpar();
    }

    public void consClieCpf() {
        cliente = new Cliente();

        try {
            cliente.setCpf(Integer.parseInt(cxCpfConsult.getText()));
        } catch (NumNegatCpf nnc) {
            nnc.impCpfNeg();
        }

        cliente = gc.consClieCod(cliente);

        if (cliente != null) {
            cxCpf.setText(String.valueOf(cliente.getCpf()));
            cxNome.setText(cliente.getName());
            cxIdade.setText(String.valueOf(cliente.getAge()));
            cxEstado.setText(cliente.getAddress().getReg().getEstado());
            cxCidade.setText(cliente.getAddress().getReg().getCidade());
            cxRua.setText(cliente.getAddress().getStreet());
            cxNumero.setText(String.valueOf(cliente.getAddress().getNumber()));
            cxDate.setText(cliente.getDataUltimaCompra());
            cxService.setText(cliente.getServico());
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe um funcionário com este CPF",
                    "Erro de Consulta",
                    0
            );
            limpar();
        }

    }

    public void cadClie() {
        cliente = new Cliente();

        try {
            cliente.setCpf(Integer.parseInt(cxCpf.getText()));
        } catch (NumNegatCpf nnc) {
            nnc.impCpfNeg();
        }
        cliente.setName(cxNome.getText());
        cliente.setAge(Integer.parseInt(cxIdade.getText()));
        cliente.getAddress().getReg().setEstado(cxEstado.getText());
        cliente.getAddress().getReg().setCidade(cxCidade.getText());
        cliente.getAddress().setStreet(cxRua.getText());
        cliente.getAddress().setNumber(Integer.parseInt(cxNumero.getText()));
        cliente.setDataUltimaCompra(cxDate.getText());
        cliente.setServico(cxService.getText());

        cliente = gc.cadClie(cliente);

        if (cliente != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente cadastrado com sucesso!",
                    "Cadastro Ok",
                    1
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Já existe um cliente com este CPF",
                    "Erro de Cadastro",
                    0
            );
            limpar();
        }
    }

    public void limpar() {
        cxCpf.setText("");
        cxNome.setText("");
        cxIdade.setText("");
        cxEstado.setText("");
        cxCidade.setText("");
        cxRua.setText("");
        cxNumero.setText("");
        cxDate.setText("");
        cxService.setText("");
        cxAtualizaNome.setText("");
        cxCpfConsult.setText("");
        cxExcluiCliente.setText("");
        cxCpf.requestFocus();
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
        } else {
            limpar();
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
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltClieCpf;
    private javax.swing.JButton btCadClie;
    private javax.swing.JButton btConsClieCpf;
    private javax.swing.JButton btExcluiClieCpf;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelGerClie;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxAtualizaNome;
    private javax.swing.JTextField cxCidade;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxCpfConsult;
    private javax.swing.JTextField cxDate;
    private javax.swing.JTextField cxEstado;
    private javax.swing.JTextField cxExcluiCliente;
    private javax.swing.JTextField cxIdade;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNumero;
    private javax.swing.JTextField cxRua;
    private javax.swing.JTextField cxService;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotAtualizaNome;
    private javax.swing.JLabel rotCidade;
    private javax.swing.JLabel rotCpf;
    private javax.swing.JLabel rotCpfConsult;
    private javax.swing.JLabel rotDate;
    private javax.swing.JLabel rotEstado;
    private javax.swing.JLabel rotExcluiCliente;
    private javax.swing.JLabel rotIdade;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotNumero;
    private javax.swing.JLabel rotRua;
    private javax.swing.JLabel rotService;
    private javax.swing.JTable tabClie;
    // End of variables declaration//GEN-END:variables
}
