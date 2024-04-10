//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;

public class VisuTerc extends javax.swing.JFrame {

    private static VisuTerc visTercUnico;
    private Terceirizado t = new Terceirizado();
    
    private VisuTerc() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static VisuTerc getVisTercUnico(){
        if(visTercUnico == null){
            visTercUnico = new VisuTerc();
        }
        
        return visTercUnico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotConsTerc = new javax.swing.JLabel();
        rotDadosEsc = new javax.swing.JLabel();
        rotNomeEsc = new javax.swing.JLabel();
        cxNomeEsc = new javax.swing.JTextField();
        rotRua = new javax.swing.JLabel();
        cxNumId = new javax.swing.JTextField();
        cxRuaEsc = new javax.swing.JTextField();
        rotNome = new javax.swing.JLabel();
        rotNumEsc = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxNumEsc = new javax.swing.JTextField();
        rotCpf = new javax.swing.JLabel();
        rotBairroEsc = new javax.swing.JLabel();
        cxCpf = new javax.swing.JTextField();
        cxBairroEsc = new javax.swing.JTextField();
        rotTel = new javax.swing.JLabel();
        rotCidadeEsc = new javax.swing.JLabel();
        cxTel = new javax.swing.JTextField();
        rotSal = new javax.swing.JLabel();
        rotNomeEmp = new javax.swing.JLabel();
        cxNomeEmp = new javax.swing.JTextField();
        cxSal = new javax.swing.JTextField();
        rotServPrest = new javax.swing.JLabel();
        cxServPrest = new javax.swing.JTextField();
        rotNumId = new javax.swing.JLabel();
        rotIniCont = new javax.swing.JLabel();
        cxCidadeEsc = new javax.swing.JTextField();
        cxIniCont = new javax.swing.JTextField();
        rotCepEsc = new javax.swing.JLabel();
        rotFimCont = new javax.swing.JLabel();
        cxCepEsc = new javax.swing.JTextField();
        cxFimCont = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotConsTerc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotConsTerc.setText("CONSULTA DE TERCEIRIZADO");

        rotDadosEsc.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rotDadosEsc.setText("DADOS DA ESCOLA");

        rotNomeEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNomeEsc.setText("Nome:");

        cxNomeEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxNomeEsc.setEnabled(false);

        rotRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotRua.setText("Rua:");

        cxNumId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cxRuaEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxRuaEsc.setEnabled(false);

        rotNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNome.setText("Nome:");

        rotNumEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumEsc.setText("Número:");

        cxNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxNome.setEnabled(false);

        cxNumEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxNumEsc.setEnabled(false);

        rotCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCpf.setText("CPF:");

        rotBairroEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotBairroEsc.setText("Bairro:");

        cxCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxCpf.setEnabled(false);

        cxBairroEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxBairroEsc.setEnabled(false);

        rotTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotTel.setText("Telefone:");

        rotCidadeEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCidadeEsc.setText("Cidade:");

        cxTel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxTel.setEnabled(false);

        rotSal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotSal.setText("Salário:");

        rotNomeEmp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNomeEmp.setText("Nome da empresa:");

        cxNomeEmp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxNomeEmp.setEnabled(false);

        cxSal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxSal.setEnabled(false);

        rotServPrest.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotServPrest.setText("Serviço prestado:");

        cxServPrest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxServPrest.setEnabled(false);

        rotNumId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumId.setText("Número de identificação:");

        rotIniCont.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotIniCont.setText("Data inicial do contrato:");

        cxCidadeEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxCidadeEsc.setEnabled(false);

        cxIniCont.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxIniCont.setEnabled(false);

        rotCepEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCepEsc.setText("CEP:");

        rotFimCont.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotFimCont.setText("Data final do contrato:");

        cxCepEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxCepEsc.setEnabled(false);

        cxFimCont.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxFimCont.setEnabled(false);

        btVoltar.setBackground(new java.awt.Color(204, 255, 255));
        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btPesquisar.setBackground(new java.awt.Color(204, 255, 255));
        btPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(rotConsTerc))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(193, 193, 193)
                                    .addComponent(rotDadosEsc))
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
                                    .addComponent(cxServPrest, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotIniCont)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxIniCont, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotFimCont)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxFimCont, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(cxCidadeEsc))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotConsTerc)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btPesquisar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        ConsTerc.getConsTercUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        consTerc();
    }//GEN-LAST:event_btPesquisarActionPerformed

    public void consTerc(){
        try{
            t = new Terceirizado();
            
            try{
                t.setNumId(Integer.parseInt(cxNumId.getText()));
            }catch(NumIdException nie){
                nie.mostraMsg();
                t = nie.corrNumIdInvalido(t);
            }
            
            t = BDFunc.getBancoFunc().consTerc(t);
            
            if(t != null){
                cxNome.setText(t.getNome());
                cxTel.setText(t.getTelefone());
                cxCpf.setText(Long.toString(t.getCpf()));
                cxSal.setText(Float.toString(t.getSalario()));
                cxNomeEmp.setText(t.getNomeEmp());
                cxServPrest.setText(t.getTipoServPrest());
                cxIniCont.setText(t.getDataIniContrato());
                cxFimCont.setText(t.getDataTermContrato());
                cxNomeEsc.setText(t.getEscola().getNome());
                cxRuaEsc.setText(t.getEscola().getRua());
                cxNumEsc.setText(Integer.toString(t.getEscola().getNum()));
                cxBairroEsc.setText(t.getEscola().getBairro());
                cxCidadeEsc.setText(t.getEscola().getCidade());
                cxCepEsc.setText(t.getEscola().getCep());
            }else{
                JOptionPane.showMessageDialog(null, "Número de identificação não cadastrado!", "ATENÇÃO", 0);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite um número!", "ATENÇÃO", 0);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btVoltar;
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
    private javax.swing.JLabel rotBairroEsc;
    private javax.swing.JLabel rotCepEsc;
    private javax.swing.JLabel rotCidadeEsc;
    private javax.swing.JLabel rotConsTerc;
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