//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;

public class VisuProf extends javax.swing.JFrame {

    private static VisuProf visProfUnico;
    private Professor p = new Professor();
    
    private VisuProf() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static VisuProf getVisProfUnico(){
        if(visProfUnico == null){
            visProfUnico = new VisuProf();
        }
        
        return visProfUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotConsProf = new javax.swing.JLabel();
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
        rotDiscLec = new javax.swing.JLabel();
        rotSal = new javax.swing.JLabel();
        cxSal = new javax.swing.JTextField();
        cxDiscLec = new javax.swing.JTextField();
        rotTitulacao = new javax.swing.JLabel();
        cxTitulacao = new javax.swing.JTextField();
        rotNumId = new javax.swing.JLabel();
        rotQtdeAulas = new javax.swing.JLabel();
        cxCidadeEsc = new javax.swing.JTextField();
        cxQtdeAulas = new javax.swing.JTextField();
        rotCepEsc = new javax.swing.JLabel();
        cxCepEsc = new javax.swing.JTextField();
        rotDadosEsc = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotConsProf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotConsProf.setText("CONSULTA DE PROFESSOR");

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

        rotDiscLec.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotDiscLec.setText("Disciplina lecionada:");

        rotSal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotSal.setText("Salário:");

        cxSal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxSal.setEnabled(false);

        cxDiscLec.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxDiscLec.setEnabled(false);

        rotTitulacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotTitulacao.setText("Titulação:");

        cxTitulacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxTitulacao.setEnabled(false);

        rotNumId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumId.setText("Número de identificação:");

        rotQtdeAulas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotQtdeAulas.setText("Quantidade de aulas semanais em horas:");

        cxCidadeEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxCidadeEsc.setEnabled(false);

        cxQtdeAulas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxQtdeAulas.setEnabled(false);

        rotCepEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCepEsc.setText("CEP:");

        cxCepEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxCepEsc.setEnabled(false);

        rotDadosEsc.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rotDadosEsc.setText("DADOS DA ESCOLA");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                            .addComponent(cxNumEsc, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(cxCidadeEsc))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotConsProf)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotDiscLec)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxDiscLec))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotQtdeAulas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxQtdeAulas))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addGap(174, 174, 174)
                                    .addComponent(rotDadosEsc))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotTitulacao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(10, 10, 10)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotConsProf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btPesquisar))
                .addGap(25, 25, 25))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
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
                        .addComponent(rotDiscLec)
                        .addComponent(cxDiscLec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rotTitulacao)
                        .addComponent(cxTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rotQtdeAulas)
                        .addComponent(cxQtdeAulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rotDadosEsc)
                    .addGap(210, 210, 210)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        ConsProf.getConsProfUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        consProf();
    }//GEN-LAST:event_btPesquisarActionPerformed

    public void consProf(){
        try{
            p = new Professor();
            
            try{
                p.setNumId(Integer.parseInt(cxNumId.getText()));
            }catch(NumIdException nie){
                nie.mostraMsg();
                p = nie.corrNumIdInvalido(p);
            }
            
            p = BDFunc.getBancoFunc().consProf(p);

            if(p != null){
                cxNome.setText(p.getNome());
                cxTel.setText(p.getTelefone());
                cxCpf.setText(Long.toString(p.getCpf()));
                cxSal.setText(Float.toString(p.getSalario()));
                cxDiscLec.setText(p.getDiscLeciona());
                cxTitulacao.setText(p.getTitulacao());
                cxQtdeAulas.setText(Integer.toString(p.getQtdeAulasSemanais()));
                cxNomeEsc.setText(p.getEscola().getNome());
                cxRuaEsc.setText(p.getEscola().getRua());
                cxNumEsc.setText(Integer.toString(p.getEscola().getNum()));
                cxBairroEsc.setText(p.getEscola().getBairro());
                cxCidadeEsc.setText(p.getEscola().getCidade());
                cxCepEsc.setText(p.getEscola().getCep());
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
    private javax.swing.JTextField cxDiscLec;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNomeEsc;
    private javax.swing.JTextField cxNumEsc;
    private javax.swing.JTextField cxNumId;
    private javax.swing.JTextField cxQtdeAulas;
    private javax.swing.JTextField cxRuaEsc;
    private javax.swing.JTextField cxSal;
    private javax.swing.JTextField cxTel;
    private javax.swing.JTextField cxTitulacao;
    private javax.swing.JLabel rotBairroEsc;
    private javax.swing.JLabel rotCepEsc;
    private javax.swing.JLabel rotCidadeEsc;
    private javax.swing.JLabel rotConsProf;
    private javax.swing.JLabel rotCpf;
    private javax.swing.JLabel rotDadosEsc;
    private javax.swing.JLabel rotDiscLec;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotNomeEsc;
    private javax.swing.JLabel rotNumEsc;
    private javax.swing.JLabel rotNumId;
    private javax.swing.JLabel rotQtdeAulas;
    private javax.swing.JLabel rotRua;
    private javax.swing.JLabel rotSal;
    private javax.swing.JLabel rotTel;
    private javax.swing.JLabel rotTitulacao;
    // End of variables declaration//GEN-END:variables
}