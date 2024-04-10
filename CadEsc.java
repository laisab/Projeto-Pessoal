//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;

public class CadEsc extends javax.swing.JFrame {

    private static CadEsc cadEscUnico;
    private Escola e = new Escola();
    
    private CadEsc() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static CadEsc getCadEscUnico(){
        if(cadEscUnico == null){
            cadEscUnico = new CadEsc();
        }
        
        return cadEscUnico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotCadDir = new javax.swing.JLabel();
        rotCepEsc = new javax.swing.JLabel();
        cxCepEsc = new javax.swing.JTextField();
        btCad = new javax.swing.JButton();
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
        btCons = new javax.swing.JButton();
        btAlt = new javax.swing.JButton();
        btExc = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        bmPrincipal = new javax.swing.JMenuBar();
        mnCad = new javax.swing.JMenu();
        mnItCadDir = new javax.swing.JMenuItem();
        mnItCadProf = new javax.swing.JMenuItem();
        mnItCadTerc = new javax.swing.JMenuItem();
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
        rotCadDir.setText("CADASTRO DE ESCOLA");

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

        btCons.setBackground(new java.awt.Color(204, 255, 255));
        btCons.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCons.setText("Consultar");
        btCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsActionPerformed(evt);
            }
        });

        btAlt.setBackground(new java.awt.Color(204, 255, 255));
        btAlt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAlt.setText("Alterar");
        btAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltActionPerformed(evt);
            }
        });

        btExc.setBackground(new java.awt.Color(204, 255, 255));
        btExc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btExc.setText("Excluir");
        btExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcActionPerformed(evt);
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

        mnItCadTerc.setText("Terceirizado...");
        mnItCadTerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItCadTercActionPerformed(evt);
            }
        });
        mnCad.add(mnItCadTerc);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotNomeEsc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxNomeEsc, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(cxCidadeEsc))))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rotCadDir)
                                .addGap(143, 143, 143))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btExc, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btCad))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btCons, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(79, 79, 79))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rotCadDir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCad)
                    .addComponent(btCons)
                    .addComponent(btAlt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExc)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void mnItCadTercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItCadTercActionPerformed
        CadTerc.getCadTercUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItCadTercActionPerformed

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

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        cadEsc();
        limpar();
    }//GEN-LAST:event_btCadActionPerformed

    private void btConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsActionPerformed
        consEsc();
    }//GEN-LAST:event_btConsActionPerformed

    private void btAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltActionPerformed
        altEsc();
        consEsc();
    }//GEN-LAST:event_btAltActionPerformed

    private void btExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcActionPerformed
        excEsc();
        limpar();
    }//GEN-LAST:event_btExcActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saída", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0){
            System.exit(0);
        }
    }
    
    public void limpar(){
        cxNomeEsc.setText("");
        cxRuaEsc.setText("");
        cxNumEsc.setText("");
        cxBairroEsc.setText("");
        cxCidadeEsc.setText("");
        cxCepEsc.setText("");
    }
    
    public void cadEsc(){
        try{
            e = new Escola();
            
            e.setNome(cxNomeEsc.getText());
            e.setRua(cxRuaEsc.getText());
            
            try{
                e.setNum(Integer.parseInt(cxNumEsc.getText()));
            }catch(ValorNegativoException vne){
                vne.mostraMsg();
                e = vne.corrNumEscoNeg(e);
            }
            
            e.setBairro(cxBairroEsc.getText());
            e.setCidade(cxCidadeEsc.getText());
            e.setCep(cxCepEsc.getText());
            
            e = BDFunc.getBancoFunc().cadEsc(e);
            
            if(e != null){
                JOptionPane.showMessageDialog(null, "Escola cadastrada com sucesso!", "CADASTRO DE ESCOLA", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Nome duplicado!", "CADASTRO DE ESCOLA", 0);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Verifique os campos numéricos!", "ATENÇÃO", 0);
            limpar();
        }
    }
    
    public void consEsc(){
        try{
            e = new Escola();
            e.setNome(cxNomeEsc.getText());
            e = BDFunc.getBancoFunc().consEsc(e);
            
            if(e != null){
                cxNomeEsc.setText(e.getNome());
                cxRuaEsc.setText(e.getRua());
                cxNumEsc.setText(Integer.toString(e.getNum()));
                cxBairroEsc.setText(e.getBairro());
                cxCidadeEsc.setText(e.getCidade());
                cxCepEsc.setText(e.getCep());
            }else{
                JOptionPane.showMessageDialog(null, "Escola não cadastrada!", "ATENÇÃO", 0);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Verifique os campos numéricos!", "ATENÇÃO", 0);
            limpar();
        }
    }
    
    public void altEsc(){
        try{
            e = new Escola();
            e.setNome(cxNomeEsc.getText());
            e = BDFunc.getBancoFunc().altEsc(e);
            
            if(e != null){
                cxNomeEsc.setText(e.getNome());
                cxRuaEsc.setText(e.getRua());
                cxNumEsc.setText(Integer.toString(e.getNum()));
                cxBairroEsc.setText(e.getBairro());
                cxCidadeEsc.setText(e.getCidade());
                cxCepEsc.setText(e.getCep());
            }else{
                JOptionPane.showMessageDialog(null, "Escola não cadastrada!", "ATENÇÃO", 0);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Verifique os campos numéricos!", "ATENÇÃO", 0);
            limpar();
        }
    }
    
    public void excEsc(){
        try{
            e = new Escola();
            e.setNome(cxNomeEsc.getText());
            e = BDFunc.getBancoFunc().excEsc(e);
            
            if(e == null){
                JOptionPane.showMessageDialog(null, "Escola excluída com sucesso!", "CADASTRO DE ESCOLA", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Escola não cadastrada!", "ATENÇÃO", 0);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Verifique os campos numéricos!", "ATENÇÃO", 0);
            limpar();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bmPrincipal;
    private javax.swing.JButton btAlt;
    private javax.swing.JButton btCad;
    private javax.swing.JButton btCons;
    private javax.swing.JButton btExc;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxBairroEsc;
    private javax.swing.JTextField cxCepEsc;
    private javax.swing.JTextField cxCidadeEsc;
    private javax.swing.JTextField cxNomeEsc;
    private javax.swing.JTextField cxNumEsc;
    private javax.swing.JTextField cxRuaEsc;
    private javax.swing.JMenu mnCad;
    private javax.swing.JMenu mnCons;
    private javax.swing.JMenuItem mnItCadDir;
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
    private javax.swing.JLabel rotNomeEsc;
    private javax.swing.JLabel rotNumEsc;
    private javax.swing.JLabel rotRua;
    // End of variables declaration//GEN-END:variables
}