//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;

public class CadTerc extends javax.swing.JFrame {

    private static CadTerc cadTercUnico;
    private Funcionario f = new Funcionario();
    private Terceirizado t = new Terceirizado();
    
    private CadTerc() {
        initComponents();
        preencheComboEsc();
        this.setLocationRelativeTo(null);
    }
    
    public static CadTerc getCadTercUnico(){
        if(cadTercUnico == null){
            cadTercUnico = new CadTerc();
        }
        
        return cadTercUnico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cxNumId = new javax.swing.JTextField();
        rotNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        rotCpf = new javax.swing.JLabel();
        cxCpf = new javax.swing.JTextField();
        rotTel = new javax.swing.JLabel();
        cxTel = new javax.swing.JTextField();
        rotSal = new javax.swing.JLabel();
        cxSal = new javax.swing.JTextField();
        rotCadDir = new javax.swing.JLabel();
        rotNumId = new javax.swing.JLabel();
        cxCidadeEsc = new javax.swing.JTextField();
        rotCepEsc = new javax.swing.JLabel();
        cxCepEsc = new javax.swing.JTextField();
        btCad = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
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
        rotNomeEmp = new javax.swing.JLabel();
        cxNomeEmp = new javax.swing.JTextField();
        rotServPrest = new javax.swing.JLabel();
        cxServPrest = new javax.swing.JTextField();
        rotIniCont = new javax.swing.JLabel();
        cxIniCont = new javax.swing.JTextField();
        rotFimCont = new javax.swing.JLabel();
        cxFimCont = new javax.swing.JTextField();
        bmPrincipal = new javax.swing.JMenuBar();
        mnCad = new javax.swing.JMenu();
        mnItCadDir = new javax.swing.JMenuItem();
        mnItCadProf = new javax.swing.JMenuItem();
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

        rotCadDir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotCadDir.setText("CADASTRO DE TERCEIRIZADO");

        rotNumId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumId.setText("Número de identificação:");

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

        rotNomeEmp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNomeEmp.setText("Nome da empresa:");

        cxNomeEmp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotServPrest.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotServPrest.setText("Serviço prestado:");

        cxServPrest.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotIniCont.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotIniCont.setText("Data inicial do contrato:");

        cxIniCont.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rotFimCont.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotFimCont.setText("Data final do contrato:");

        cxFimCont.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mnCad.setText("Cadastrar");

        mnItCadDir.setText("Diretor...");
        mnItCadDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItCadDirActionPerformed(evt);
            }
        });
        mnCad.add(mnItCadDir);

        mnItCadProf.setText("Professor...");
        mnItCadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItCadProfActionPerformed(evt);
            }
        });
        mnCad.add(mnItCadProf);

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(btCad)
                            .addGap(18, 18, 18)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(199, 199, 199)
                            .addComponent(rotDadosEsc))
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
                                                .addComponent(cxBairroEsc, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(rotRua)
                                                .addGap(18, 18, 18)
                                                .addComponent(cxRuaEsc, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rotNumEsc)
                                        .addComponent(rotCidadeEsc))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxNumEsc)
                                        .addComponent(cxCidadeEsc)))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbEsc, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rotSal)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cxSal, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rotCpf)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotNomeEmp)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxNomeEmp))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotServPrest)
                                    .addGap(18, 18, 18)
                                    .addComponent(cxServPrest)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotIniCont)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxIniCont, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotFimCont)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxFimCont, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rotCadDir)
                .addGap(110, 110, 110))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNomeEmp)
                    .addComponent(cxNomeEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotServPrest)
                    .addComponent(cxServPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotIniCont)
                    .addComponent(cxIniCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotFimCont)
                    .addComponent(cxFimCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar)
                    .addComponent(btCad))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItCadDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItCadDirActionPerformed
        CadDir.getCadDirUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItCadDirActionPerformed

    private void mnItCadProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItCadProfActionPerformed
        CadProf.getCadProfUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItCadProfActionPerformed

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
        cadTerc();
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
        cxNomeEmp.setText("");
        cxServPrest.setText("");
        cxIniCont.setText("");
        cxFimCont.setText("");
        cxNomeEsc.setText("");
        cxRuaEsc.setText("");
        cxNumEsc.setText("");
        cxBairroEsc.setText("");
        cxCidadeEsc.setText("");
        cxCepEsc.setText("");
        cbEsc.addItem("Escolha uma opção");
    }
    
    public void cadTerc(){
        try{
            t = new Terceirizado();
            
            try{
                t.setNumId(Integer.parseInt(cxNumId.getText()));
            }catch(NumIdException nie){
                nie.mostraMsg();
                t = nie.corrNumIdInvalido(t);
            }
            
            t.setNome(cxNome.getText());
            t.setTelefone(cxTel.getText());
            
            try{
                t.setCpf(Long.parseLong(cxCpf.getText()));
            }catch(CpfInvalidoException cie){
                cie.mostraMsg();
                t = cie.corrCpfInvalido(t);
            }
            
            try{
                t.setSalario(Float.parseFloat(cxSal.getText()));
            }catch(ValorNegativoException vne){
                vne.mostraMsg();
                t = vne.corrSalNegativo(t);
            }
            
            t.setNomeEmp(cxNomeEmp.getText());
            t.setTipoServPrest(cxServPrest.getText());
            t.setDataIniContrato(cxIniCont.getText());
            t.setDataTermContrato(cxFimCont.getText());
            t.getEscola().setNome(cxNomeEsc.getText());
            t.getEscola().setRua(cxRuaEsc.getText());
            
            try{
                t.getEscola().setNum(Integer.parseInt(cxNumEsc.getText()));
            }catch(ValorNegativoException vne){
                vne.mostraMsg();
                t = vne.corrNumEscoNeg(t);
            }
            
            t.getEscola().setBairro(cxBairroEsc.getText());
            t.getEscola().setCidade(cxCidadeEsc.getText());
            t.getEscola().setCep(cxCepEsc.getText());
            
            t = BDFunc.getBancoFunc().cadTerc(t);
            
            if(t != null){
                JOptionPane.showMessageDialog(null, "Terceirizado cadastrado com sucesso!", "CADASTRO DE FUNCIONÁRIO", 1);
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
                t = nie.corrNumIdInvalido(t);
                f = (Funcionario) t;
            }
            
            f.setNome(cxNome.getText());
            f.setTelefone(cxTel.getText());
            
            try{
                f.setCpf(Long.parseLong(cxCpf.getText()));
            }catch(CpfInvalidoException cie){
                cie.mostraMsg();
                t = cie.corrCpfInvalido(t);
                f = (Funcionario) t;
            }
            
            try{
                f.setSalario(Float.parseFloat(cxSal.getText()));
            }catch(ValorNegativoException vne){
                vne.mostraMsg();
                t = vne.corrSalNegativo(t);
                f = (Funcionario) t;
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
    private javax.swing.JTextField cxFimCont;
    private javax.swing.JTextField cxIniCont;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNomeEmp;
    private javax.swing.JTextField cxNomeEsc;
    private javax.swing.JTextField cxNumEsc;
    private javax.swing.JTextField cxNumId;
    private javax.swing.JTextField cxRuaEsc;
    private javax.swing.JTextField cxSal;
    private javax.swing.JTextField cxServPrest;
    private javax.swing.JTextField cxTel;
    private javax.swing.JMenu mnCad;
    private javax.swing.JMenu mnCons;
    private javax.swing.JMenuItem mnItCadDir;
    private javax.swing.JMenuItem mnItCadEsc;
    private javax.swing.JMenuItem mnItCadProf;
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
    private javax.swing.JLabel rotFimCont;
    private javax.swing.JLabel rotIniCont;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotNomeEmp;
    private javax.swing.JLabel rotNomeEsc;
    private javax.swing.JLabel rotNumEsc;
    private javax.swing.JLabel rotNumId;
    private javax.swing.JLabel rotRua;
    private javax.swing.JLabel rotSal;
    private javax.swing.JLabel rotServPrest;
    private javax.swing.JLabel rotTel;
    // End of variables declaration//GEN-END:variables
}