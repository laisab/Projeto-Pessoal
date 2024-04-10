//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;

public class VisuDir extends javax.swing.JFrame {

    private static VisuDir visDirUnico;
    private Diretor d = new Diretor();
    
    private VisuDir() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static VisuDir getVisDirUnico(){
        if(visDirUnico == null){
            visDirUnico = new VisuDir();
        }
        
        return visDirUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotConsDir = new javax.swing.JLabel();
        cxNomeEsc = new javax.swing.JTextField();
        rotRua = new javax.swing.JLabel();
        cxRuaEsc = new javax.swing.JTextField();
        rotNumId = new javax.swing.JLabel();
        rotNumEsc = new javax.swing.JLabel();
        cxNumId = new javax.swing.JTextField();
        cxNumEsc = new javax.swing.JTextField();
        rotNome = new javax.swing.JLabel();
        rotBairroEsc = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxBairroEsc = new javax.swing.JTextField();
        rotCpf = new javax.swing.JLabel();
        rotCidadeEsc = new javax.swing.JLabel();
        cxCpf = new javax.swing.JTextField();
        cxCidadeEsc = new javax.swing.JTextField();
        rotTel = new javax.swing.JLabel();
        rotCepEsc = new javax.swing.JLabel();
        cxTel = new javax.swing.JTextField();
        rotSal = new javax.swing.JLabel();
        cxCepEsc = new javax.swing.JTextField();
        cxSal = new javax.swing.JTextField();
        rotDataAdm = new javax.swing.JLabel();
        cxDataAdm = new javax.swing.JTextField();
        rotExpAnt = new javax.swing.JLabel();
        cxExpAnt = new javax.swing.JTextField();
        rotIdade = new javax.swing.JLabel();
        cxIdade = new javax.swing.JTextField();
        rotDadosEsc = new javax.swing.JLabel();
        rotNomeEsc = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rotConsDir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotConsDir.setText("CONSULTA DE DIRETOR");

        cxNomeEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxNomeEsc.setEnabled(false);

        rotRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotRua.setText("Rua:");

        cxRuaEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxRuaEsc.setEnabled(false);

        rotNumId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumId.setText("Número de identificação:");

        rotNumEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumEsc.setText("Número:");

        cxNumId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cxNumEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxNumEsc.setEnabled(false);

        rotNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNome.setText("Nome:");

        rotBairroEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotBairroEsc.setText("Bairro:");

        cxNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxNome.setEnabled(false);

        cxBairroEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxBairroEsc.setEnabled(false);

        rotCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCpf.setText("CPF:");

        rotCidadeEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCidadeEsc.setText("Cidade:");

        cxCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxCpf.setEnabled(false);

        cxCidadeEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxCidadeEsc.setEnabled(false);

        rotTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotTel.setText("Telefone:");

        rotCepEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCepEsc.setText("CEP:");

        cxTel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxTel.setEnabled(false);

        rotSal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotSal.setText("Salário:");

        cxCepEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxCepEsc.setEnabled(false);

        cxSal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxSal.setEnabled(false);

        rotDataAdm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotDataAdm.setText("Data de admissão:");

        cxDataAdm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxDataAdm.setEnabled(false);

        rotExpAnt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotExpAnt.setText("Experiência anterior:");

        cxExpAnt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxExpAnt.setEnabled(false);

        rotIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotIdade.setText("Idade:");

        cxIdade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cxIdade.setEnabled(false);

        rotDadosEsc.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rotDadosEsc.setText("DADOS DA ESCOLA");

        rotNomeEsc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNomeEsc.setText("Nome:");

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rotConsDir)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotNomeEsc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxNomeEsc))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rotNumEsc)
                                            .addComponent(rotCidadeEsc))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cxNumEsc)
                                            .addComponent(cxCidadeEsc)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
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
                                        .addComponent(cxSal, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(cxExpAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(rotDadosEsc)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotConsDir)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btPesquisar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        ConsDir.getConsDirUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        consDir();
    }//GEN-LAST:event_btPesquisarActionPerformed

    public void consDir(){
        try{
            d = new Diretor();
            
            try{
                d.setNumId(Integer.parseInt(cxNumId.getText()));
            }catch(NumIdException nie){
                nie.mostraMsg();
                d = nie.corrNumIdInvalido(d);
            }
            
            d = BDFunc.getBancoFunc().consDir(d);

            if(d != null){
                cxNome.setText(d.getNome());
                cxTel.setText(d.getTelefone());
                cxCpf.setText(Long.toString(d.getCpf()));
                cxSal.setText(Float.toString(d.getSalario()));
                cxDataAdm.setText(d.getDataAdmissao());
                cxExpAnt.setText(d.getExpAnterior());
                cxIdade.setText(Integer.toString(d.getIdade()));
                cxNomeEsc.setText(d.getEscola().getNome());
                cxRuaEsc.setText(d.getEscola().getRua());
                cxNumEsc.setText(Integer.toString(d.getEscola().getNum()));
                cxBairroEsc.setText(d.getEscola().getBairro());
                cxCidadeEsc.setText(d.getEscola().getCidade());
                cxCepEsc.setText(d.getEscola().getCep());
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
    private javax.swing.JLabel rotBairroEsc;
    private javax.swing.JLabel rotCepEsc;
    private javax.swing.JLabel rotCidadeEsc;
    private javax.swing.JLabel rotConsDir;
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