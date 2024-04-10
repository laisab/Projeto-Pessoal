//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;

public class CadDir extends javax.swing.JFrame {

    private static CadDir cadDirUnico;
    private Funcionario f = new Funcionario();
    private Diretor d = new Diretor();
    
    private CadDir() {
        initComponents();
        preencheComboEsc();
        this.setLocationRelativeTo(null);
    }
    
    public static CadDir getCadDirUnico(){
        if(cadDirUnico == null){
            cadDirUnico = new CadDir();
        }
        
        return cadDirUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotCadDir = new javax.swing.JLabel();
        rotNumId = new javax.swing.JLabel();
        cxNumId = new javax.swing.JTextField();
        rotNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        rotCpf = new javax.swing.JLabel();
        cxCpf = new javax.swing.JTextField();
        rotTel = new javax.swing.JLabel();
        cxTel = new javax.swing.JTextField();
        rotSal = new javax.swing.JLabel();
        cxSal = new javax.swing.JTextField();
        rotDataAdm = new javax.swing.JLabel();
        cxDataAdm = new javax.swing.JTextField();
        rotExpAnt = new javax.swing.JLabel();
        cxExpAnt = new javax.swing.JTextField();
        rotIdade = new javax.swing.JLabel();
        cxIdade = new javax.swing.JTextField();
        rotDadosEsc = new javax.swing.JLabel();
        cbEsc = new javax.swing.JComboBox<>();
        rotNomeEsc = new javax.swing.JLabel();
        cxNomeEsc = new javax.swing.JTextField();
        rotRua = new javax.swing.JLabel();
        cxRuaEsc = new javax.swing.JTextField();
        rotNumEsc = new javax.swing.JLabel();
        cxNumEsc = new javax.swing.JTextField();
        rotBairroEsc = new javax.swing.JLabel();
        cxBairroEsc = new javax.swing.JTextField();
        rotCidadeEsc = new javax.swing.JLabel();
        cxCidadeEsc = new javax.swing.JTextField();
        rotCepEsc = new javax.swing.JLabel();
        cxCepEsc = new javax.swing.JTextField();
        btCad = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        bmPrincipal = new javax.swing.JMenuBar();
        mnCad = new javax.swing.JMenu();
        mnItCadProf = new javax.swing.JMenuItem();
        mnItCadTerc = new javax.swing.JMenuItem();
        mnItCadEsc = new javax.swing.JMenuItem();
        mnCons = new javax.swing.JMenu();
        mnItConsDir = new javax.swing.JMenuItem();
        mnItConsProf = new javax.swing.JMenuItem();
        mnItConsTerc = new javax.swing.JMenuItem();
        mnItConsFunc = new javax.swing.JMenuItem();
        mnVoltar = new javax.swing.JMenu();
        mnItVoltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rotCadDir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotCadDir.setText("CADASTRO DE DIRETOR");

        rotNumId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumId.setText("Número de identificação:");

        cxNumId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNome.setText("Nome:");

        cxNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCpf.setText("CPF:");

        cxCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotTel.setText("Telefone:");

        cxTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotSal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotSal.setText("Salário:");

        cxSal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotDataAdm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotDataAdm.setText("Data de admissão:");

        cxDataAdm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotExpAnt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotExpAnt.setText("Experiência anterior:");

        cxExpAnt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotIdade.setText("Idade:");

        cxIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotDadosEsc.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rotDadosEsc.setText("DADOS DA ESCOLA");

        cbEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEscActionPerformed(evt);
            }
        });

        rotNomeEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNomeEsc.setText("Nome:");

        cxNomeEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotRua.setText("Rua:");

        cxRuaEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotNumEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumEsc.setText("Número:");

        cxNumEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotBairroEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotBairroEsc.setText("Bairro:");

        cxBairroEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotCidadeEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCidadeEsc.setText("Cidade:");

        cxCidadeEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotCepEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCepEsc.setText("CEP:");

        cxCepEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btCad.setBackground(new java.awt.Color(204, 255, 255));
        btCad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCad.setText("Cadastrar");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(204, 255, 255));
        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setBackground(new java.awt.Color(204, 255, 255));
        btSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        mnCad.setText("Cadastrar");

        mnItCadProf.setText("Professor...");
        mnItCadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItCadProfActionPerformed(evt);
            }
        });
        mnCad.add(mnItCadProf);

        mnItCadTerc.setText("Terceirizado...");
        mnItCadTerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItCadTercActionPerformed(evt);
            }
        });
        mnCad.add(mnItCadTerc);

        mnItCadEsc.setText("Escola...");
        mnItCadEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItCadEscActionPerformed(evt);
            }
        });
        mnCad.add(mnItCadEsc);

        bmPrincipal.add(mnCad);

        mnCons.setText("Consultar");

        mnItConsDir.setText("Diretor...");
        mnItConsDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItConsDirActionPerformed(evt);
            }
        });
        mnCons.add(mnItConsDir);

        mnItConsProf.setText("Professor...");
        mnItConsProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItConsProfActionPerformed(evt);
            }
        });
        mnCons.add(mnItConsProf);

        mnItConsTerc.setText("Terceirizado...");
        mnItConsTerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItConsTercActionPerformed(evt);
            }
        });
        mnCons.add(mnItConsTerc);

        mnItConsFunc.setText("Funcionário...");
        mnItConsFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItConsFuncActionPerformed(evt);
            }
        });
        mnCons.add(mnItConsFunc);

        bmPrincipal.add(mnCons);

        mnVoltar.setText("Voltar");

        mnItVoltar.setText("Início...");
        mnItVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItVoltarActionPerformed(evt);
            }
        });
        mnVoltar.add(mnItVoltar);

        bmPrincipal.add(mnVoltar);

        setJMenuBar(bmPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rotCadDir)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(rotDataAdm)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cxDataAdm))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rotTel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cxTel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(rotNome)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(rotNumId)
                                            .addGap(27, 27, 27)
                                            .addComponent(cxNumId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rotSal)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cxSal, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rotCpf)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rotIdade)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cxIdade))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotExpAnt)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxExpAnt))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(rotDadosEsc))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(cbEsc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotNomeEsc)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxNomeEsc))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rotCepEsc)
                                            .addGap(18, 18, 18)
                                            .addComponent(cxCepEsc, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(rotBairroEsc)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cxBairroEsc, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(rotRua)
                                                .addGap(18, 18, 18)
                                                .addComponent(cxRuaEsc))))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rotNumEsc)
                                        .addComponent(rotCidadeEsc))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxCidadeEsc)
                                        .addComponent(cxNumEsc))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btCad)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotCadDir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNumId)
                    .addComponent(cxNumId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotCpf)
                    .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotSal)
                    .addComponent(cxSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotTel)
                    .addComponent(cxTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotDataAdm)
                    .addComponent(cxDataAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotIdade)
                    .addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotExpAnt)
                    .addComponent(cxExpAnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rotDadosEsc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNomeEsc)
                    .addComponent(cxNomeEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotRua)
                    .addComponent(cxRuaEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotNumEsc)
                    .addComponent(cxNumEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotBairroEsc)
                    .addComponent(cxBairroEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotCidadeEsc)
                    .addComponent(cxCidadeEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCepEsc)
                    .addComponent(cxCepEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar)
                    .addComponent(btCad))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItCadProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItCadProfActionPerformed
        CadProf.getCadProfUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItCadProfActionPerformed

    private void mnItCadTercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItCadTercActionPerformed
        CadTerc.getCadTercUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItCadTercActionPerformed

    private void mnItCadEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItCadEscActionPerformed
        CadEsc.getCadEscUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItCadEscActionPerformed

    private void mnItConsDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItConsDirActionPerformed
        ConsDir.getConsDirUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItConsDirActionPerformed

    private void mnItConsProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItConsProfActionPerformed
        ConsProf.getConsProfUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItConsProfActionPerformed

    private void mnItConsTercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItConsTercActionPerformed
        ConsTerc.getConsTercUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItConsTercActionPerformed

    private void mnItConsFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItConsFuncActionPerformed
        ConsFunc.getConsFuncUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItConsFuncActionPerformed

    private void mnItVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItVoltarActionPerformed
        Principal.getPrUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItVoltarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        cadDir();
        cadFunc();
        limpar();
    }//GEN-LAST:event_btCadActionPerformed

    private void cbEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEscActionPerformed
        selectComboEsc();
    }//GEN-LAST:event_cbEscActionPerformed

    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saída", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0){
            System.exit(0);
        }
    }
    
    public void limpar(){
        cxNumId.setText("");
        cxNumId.requestFocus();
        cxNome.setText("");
        cxTel.setText("");
        cxCpf.setText("");
        cxSal.setText("");
        cxDataAdm.setText("");
        cxExpAnt.setText("");
        cxIdade.setText("");
        cxNomeEsc.setText("");
        cxRuaEsc.setText("");
        cxNumEsc.setText("");
        cxBairroEsc.setText("");
        cxCidadeEsc.setText("");
        cxCepEsc.setText("");
    }
    
    public void cadDir(){
        try{
            d = new Diretor();
            
            try{
                d.setNumId(Integer.parseInt(cxNumId.getText()));
            }catch(NumIdException nie){
                nie.mostraMsg();
                d = nie.corrNumIdInvalido(d);
            }
            
            d.setNome(cxNome.getText());
            d.setTelefone(cxTel.getText());
            
            try{
                d.setCpf(Long.parseLong(cxCpf.getText()));
            }catch(CpfInvalidoException cie){
                cie.mostraMsg();
                d = cie.corrCpfInvalido(d);
            }
            
            try{
                d.setSalario(Float.parseFloat(cxSal.getText()));
            }catch(ValorNegativoException vne){
                vne.mostraMsg();
                d = vne.corrSalNegativo(d);
            }
            
            d.setDataAdmissao(cxDataAdm.getText());
            d.setExpAnterior(cxExpAnt.getText());
            
            try{
                d.setIdade(Integer.parseInt(cxIdade.getText()));
            }catch(ValorNegativoException vne){
                vne.mostraMsg();
                d = vne.corrIdadeNegativa(d);
            }
            
            d.getEscola().setNome(cxNomeEsc.getText());
            d.getEscola().setRua(cxRuaEsc.getText());
            
            try{
                d.getEscola().setNum(Integer.parseInt(cxNumEsc.getText()));
            }catch(ValorNegativoException vne){
                vne.mostraMsg();
                d = vne.corrNumEscoNeg(d);
            }
            
            d.getEscola().setBairro(cxBairroEsc.getText());
            d.getEscola().setCidade(cxCidadeEsc.getText());
            d.getEscola().setCep(cxCepEsc.getText());
            
            d = BDFunc.getBancoFunc().cadDir(d);
            
            if(d != null){
                JOptionPane.showMessageDialog(null, "Diretor cadastrado com sucesso!", "CADASTRO DE FUNCIONÁRIO", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Número de identificação duplicado!", "CADASTRO DE FUNCIONÁRIO", 0);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Verifique os campos numéricos!", "ATENÇÃO", 0);
            limpar();
        }
    }
    
    public void cadFunc(){
        try{
            f = new Funcionario();
            
            try{
                f.setNumId(Integer.parseInt(cxNumId.getText()));
            }catch(NumIdException nie){
                nie.mostraMsg();
                d = nie.corrNumIdInvalido(d);
                f = (Funcionario) d;
            }
            
            f.setNome(cxNome.getText());
            f.setTelefone(cxTel.getText());
            
            try{
                f.setCpf(Long.parseLong(cxCpf.getText()));
            }catch(CpfInvalidoException cie){
                cie.mostraMsg();
                d = cie.corrCpfInvalido(d);
                f = (Funcionario) d;
            }
            
            try{
                f.setSalario(Float.parseFloat(cxSal.getText()));
            }catch(ValorNegativoException vne){
                vne.mostraMsg();
                d = vne.corrSalNegativo(d);
                f = (Funcionario) d;
            }
            
            f = BDFunc.getBancoFunc().cadFunc(f);
            
            if(f != null){
                //JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!", "CADASTRO DE FUNCIONÁRIO", 1);
            }else{
                //JOptionPane.showMessageDialog(null, "Número de identificação duplicado!", "CADASTRO DE FUNCIONÁRIO", 0);
            }
        }catch(NumberFormatException ex){}
    }
    
    public void preencheComboEsc(){
        cbEsc.removeAllItems();
        cbEsc.addItem("Escolha uma opção");
        
        for(Escola e : BDFunc.getBancoFunc().getBdEsc()){
            cbEsc.addItem(e.getNome());
        }
    }
    
    public void selectComboEsc(){        
        if(cbEsc.getSelectedIndex() >= 1){
            for(Escola e : BDFunc.getBancoFunc().getBdEsc()){
                cxNomeEsc.setText(e.getNome());
                cxRuaEsc.setText(e.getRua());
                cxNumEsc.setText(Integer.toString(e.getNum()));
                cxBairroEsc.setText(e.getBairro());
                cxCidadeEsc.setText(e.getCidade());
                cxCepEsc.setText(e.getCep());
            }
        }else{}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bmPrincipal;
    private javax.swing.JButton btCad;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbEsc;
    private javax.swing.JTextField cxBairroEsc;
    private javax.swing.JTextField cxCepEsc;
    private javax.swing.JTextField cxCidadeEsc;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxDataAdm;
    private javax.swing.JTextField cxExpAnt;
    private javax.swing.JTextField cxIdade;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNomeEsc;
    private javax.swing.JTextField cxNumEsc;
    private javax.swing.JTextField cxNumId;
    private javax.swing.JTextField cxRuaEsc;
    private javax.swing.JTextField cxSal;
    private javax.swing.JTextField cxTel;
    private javax.swing.JMenu mnCad;
    private javax.swing.JMenu mnCons;
    private javax.swing.JMenuItem mnItCadEsc;
    private javax.swing.JMenuItem mnItCadProf;
    private javax.swing.JMenuItem mnItCadTerc;
    private javax.swing.JMenuItem mnItConsDir;
    private javax.swing.JMenuItem mnItConsFunc;
    private javax.swing.JMenuItem mnItConsProf;
    private javax.swing.JMenuItem mnItConsTerc;
    private javax.swing.JMenuItem mnItVoltar;
    private javax.swing.JMenu mnVoltar;
    private javax.swing.JLabel rotBairroEsc;
    private javax.swing.JLabel rotCadDir;
    private javax.swing.JLabel rotCepEsc;
    private javax.swing.JLabel rotCidadeEsc;
    private javax.swing.JLabel rotCpf;
    private javax.swing.JLabel rotDadosEsc;
    private javax.swing.JLabel rotDataAdm;
    private javax.swing.JLabel rotExpAnt;
    private javax.swing.JLabel rotIdade;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotNomeEsc;
    private javax.swing.JLabel rotNumEsc;
    private javax.swing.JLabel rotNumId;
    private javax.swing.JLabel rotRua;
    private javax.swing.JLabel rotSal;
    private javax.swing.JLabel rotTel;
    // End of variables declaration//GEN-END:variables
}