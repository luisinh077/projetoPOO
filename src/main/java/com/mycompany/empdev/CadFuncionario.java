//Nome: Luís Henrique de Jesus Lima - RA: 2313642
package com.mycompany.empdev;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadFuncionario extends javax.swing.JFrame {

    private static CadFuncionario unicoCadFunc;
    private Funcionario funcionario = new Funcionario();
    private FuncGer gf = new FuncGer();

    CadFuncionario() {
        initComponents();
    }

    public static CadFuncionario getCadFunc() {

        if (unicoCadFunc == null) {
            unicoCadFunc = new CadFuncionario();
        }
        return unicoCadFunc;
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
        btCadFunc = new javax.swing.JButton();
        btConsFuncCpf = new javax.swing.JButton();
        btAltFuncCpf = new javax.swing.JButton();
        btExcluiFuncCpf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabFunc = new javax.swing.JTable();
        btRelGerFunc = new javax.swing.JButton();
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
        rotFuncao = new javax.swing.JLabel();
        cxFuncao = new javax.swing.JTextField();
        rotSalario = new javax.swing.JLabel();
        cxSalario = new javax.swing.JTextField();
        rotAtualizaNome = new javax.swing.JLabel();
        cxAtualizaNome = new javax.swing.JTextField();
        rotExcluiFunc = new javax.swing.JLabel();
        cxExcluiFunc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionários");

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

        btCadFunc.setText("Cadastrar");
        btCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadFuncActionPerformed(evt);
            }
        });

        btConsFuncCpf.setText("Consultar");
        btConsFuncCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsFuncCpfActionPerformed(evt);
            }
        });

        btAltFuncCpf.setText("Alterar");
        btAltFuncCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltFuncCpfActionPerformed(evt);
            }
        });

        btExcluiFuncCpf.setText("Remover");
        btExcluiFuncCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluiFuncCpfActionPerformed(evt);
            }
        });

        tabFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "NOME", "IDADE", "ESTADO", "CIDADE", "RUA", "NÚMERO", "FUNÇÃO", "SALÁRIO"
            }
        ));
        tabFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabFuncMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabFunc);

        btRelGerFunc.setText("Relatório Geral de Pessoas...");
        btRelGerFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelGerFuncActionPerformed(evt);
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

        rotFuncao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotFuncao.setText("FUNÇÃO:");

        rotSalario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotSalario.setText("SALÁRIO:");

        rotAtualizaNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotAtualizaNome.setText("CPF(Para Alterar Nome):");

        cxAtualizaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAtualizaNomeActionPerformed(evt);
            }
        });

        rotExcluiFunc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotExcluiFunc.setText("CPF(Para Excluir Funcionário):");

        cxExcluiFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxExcluiFuncActionPerformed(evt);
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
                        .addComponent(btRelGerFunc)
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
                                                .addComponent(rotFuncao)
                                                .addGap(12, 12, 12)
                                                .addComponent(cxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rotSalario)
                                                .addGap(12, 12, 12)
                                                .addComponent(cxSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btCadFunc))
                                        .addGap(56, 56, 56)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rotAtualizaNome)
                                    .addComponent(rotExcluiFunc)
                                    .addComponent(rotCpfConsult))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cxAtualizaNome)
                                    .addComponent(cxCpfConsult, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(cxExcluiFunc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btConsFuncCpf)
                                    .addComponent(btAltFuncCpf)
                                    .addComponent(btExcluiFuncCpf)))
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
                            .addComponent(btConsFuncCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxAtualizaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotAtualizaNome)
                            .addComponent(btAltFuncCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxExcluiFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotExcluiFunc)
                            .addComponent(btExcluiFuncCpf))))
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
                    .addComponent(cxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCadFunc)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRelGerFunc, javax.swing.GroupLayout.Alignment.TRAILING)
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

    private void btCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadFuncActionPerformed
        cadFunc();
        listaTab();
    }//GEN-LAST:event_btCadFuncActionPerformed

    private void btConsFuncCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsFuncCpfActionPerformed
        consFuncCpf();
    }//GEN-LAST:event_btConsFuncCpfActionPerformed

    private void btAltFuncCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltFuncCpfActionPerformed
        altFuncCpf();
        listaTab();
    }//GEN-LAST:event_btAltFuncCpfActionPerformed

    private void btExcluiFuncCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluiFuncCpfActionPerformed
        excluiFuncCpf();
        listaTab();
    }//GEN-LAST:event_btExcluiFuncCpfActionPerformed

    private void tabFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabFuncMouseClicked
        selectTabFunc();
    }//GEN-LAST:event_tabFuncMouseClicked

    private void btRelGerFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelGerFuncActionPerformed
        abreRelGerFunc();
    }//GEN-LAST:event_btRelGerFuncActionPerformed

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

    private void cxExcluiFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxExcluiFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxExcluiFuncActionPerformed

    public void abreRelGerFunc() {
        RelGerFunc.getRelGerFunc(gf).setVisible(true);
    }

    public void selectTabFunc() {
        String valLinTab = "";
        int posLin = tabFunc.getSelectedRow();

        for (int coluna = 0; coluna < tabFunc.getColumnCount(); coluna++) {
            valLinTab += tabFunc.getModel().getValueAt(posLin, coluna).toString();

            if (coluna + 1 < tabFunc.getRowCount()) {
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
        DefaultTableModel modelo = (DefaultTableModel) tabFunc.getModel();

        int posLin = 0;
        modelo.setRowCount(posLin);

        for (Funcionario funcionario : gf.getBdFunc()) {
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

    public void excluiFuncCpf() {
        funcionario = new Funcionario();

        try {
            funcionario.setCpf(Integer.parseInt(cxExcluiFunc.getText()));
        } catch (NumNegatCpf nnc) {
            nnc.impCpfNeg();
        }

        funcionario = gf.removeFuncCod(funcionario);

        if (funcionario == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Funcionário EXCLUÍDO com sucesso!",
                    "Exclusão OK",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe um funcionario com este CPF",
                    "Erro de Excluasão",
                    0
            );

        }
        limpar();
    }

    public void altFuncCpf() {
        funcionario = new Funcionario();

        try {
            funcionario.setCpf(Integer.parseInt(cxAtualizaNome.getText()));
        } catch (NumNegatCpf nnc) {
            nnc.impCpfNeg();
        }

        funcionario = gf.atualizaFuncCod(funcionario);

        if (funcionario != null) {
            cxAtualizaNome.setText(funcionario.getName());
            cxAtualizaNome.setText("");
            JOptionPane.showMessageDialog(
                    null,
                    "Funcionario atualizado com sucesso!",
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

    public void consFuncCpf() {
        funcionario = new Funcionario();

        try {
            funcionario.setCpf(Integer.parseInt(cxCpfConsult.getText()));
        } catch (NumNegatCpf nnc) {
            nnc.impCpfNeg();
        }

        funcionario = gf.consFuncCod(funcionario);

        if (funcionario != null) {
            cxCpf.setText(String.valueOf(funcionario.getCpf()));
            cxNome.setText(funcionario.getName());
            cxIdade.setText(String.valueOf(funcionario.getAge()));
            cxEstado.setText(funcionario.getAddress().getReg().getEstado());
            cxCidade.setText(funcionario.getAddress().getReg().getCidade());
            cxRua.setText(funcionario.getAddress().getStreet());
            cxNumero.setText(String.valueOf(funcionario.getAddress().getNumber()));
            cxFuncao.setText(funcionario.getFuncao());
            cxSalario.setText(String.valueOf(funcionario.getSalario()));
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

    public void cadFunc() {
        funcionario = new Funcionario();

        try {
            funcionario.setCpf(Integer.parseInt(cxCpf.getText()));
        } catch (NumNegatCpf nnc) {
            nnc.impCpfNeg();
        }
        funcionario.setName(cxNome.getText());
        funcionario.setAge(Integer.parseInt(cxIdade.getText()));
        funcionario.getAddress().getReg().setEstado(cxEstado.getText());
        funcionario.getAddress().getReg().setCidade(cxCidade.getText());
        funcionario.getAddress().setStreet(cxRua.getText());
        funcionario.getAddress().setNumber(Integer.parseInt(cxNumero.getText()));
        funcionario.setFuncao(cxFuncao.getText());
        funcionario.setSalario(Float.parseFloat(cxSalario.getText()));

        funcionario = gf.cadFunc(funcionario);

        if (funcionario != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Funcionário cadastrado com sucesso!",
                    "Cadastro Ok",
                    1
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Já existe um funcionário com este CPF",
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
        cxFuncao.setText("");
        cxSalario.setText("");
        cxAtualizaNome.setText("");
        cxCpfConsult.setText("");
        cxExcluiFunc.setText("");
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
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltFuncCpf;
    private javax.swing.JButton btCadFunc;
    private javax.swing.JButton btConsFuncCpf;
    private javax.swing.JButton btExcluiFuncCpf;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelGerFunc;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxAtualizaNome;
    private javax.swing.JTextField cxCidade;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxCpfConsult;
    private javax.swing.JTextField cxEstado;
    private javax.swing.JTextField cxExcluiFunc;
    private javax.swing.JTextField cxFuncao;
    private javax.swing.JTextField cxIdade;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNumero;
    private javax.swing.JTextField cxRua;
    private javax.swing.JTextField cxSalario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotAtualizaNome;
    private javax.swing.JLabel rotCidade;
    private javax.swing.JLabel rotCpf;
    private javax.swing.JLabel rotCpfConsult;
    private javax.swing.JLabel rotEstado;
    private javax.swing.JLabel rotExcluiFunc;
    private javax.swing.JLabel rotFuncao;
    private javax.swing.JLabel rotIdade;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotNumero;
    private javax.swing.JLabel rotRua;
    private javax.swing.JLabel rotSalario;
    private javax.swing.JTable tabFunc;
    // End of variables declaration//GEN-END:variables
}
