//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsDir extends javax.swing.JFrame {
    
    private static ConsDir consDirUnico;
    private Funcionario f = new Funcionario();
    private Diretor d = new Diretor();
    
    private ConsDir() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static ConsDir getConsDirUnico(){
        if(consDirUnico == null){
            consDirUnico = new ConsDir();
        }
        
        return consDirUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotConsDir = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabDir = new javax.swing.JTable();
        btAlt = new javax.swing.JButton();
        btExc = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        rotNumId = new javax.swing.JLabel();
        btCons = new javax.swing.JButton();
        cxNumId = new javax.swing.JTextField();
        bmPrincipal = new javax.swing.JMenuBar();
        mnCad = new javax.swing.JMenu();
        mnItCadDir = new javax.swing.JMenuItem();
        mnItCadProf = new javax.swing.JMenuItem();
        mnItCadTerc = new javax.swing.JMenuItem();
        mnItCadEsc = new javax.swing.JMenuItem();
        mnCons = new javax.swing.JMenu();
        mnItConsProf = new javax.swing.JMenuItem();
        mnItConsTerc = new javax.swing.JMenuItem();
        mnItConsFunc = new javax.swing.JMenuItem();
        mnVoltar = new javax.swing.JMenu();
        mnItVoltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        rotConsDir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotConsDir.setText("CONSULTA GERAL DE DIRETOR");

        tabDir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabDir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "N° de identificação", "Nome", "Telefone", "Data admissão", "Exp. anterior", "Idade", "Nome escola"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabDir.setToolTipText("Dados principais");
        jScrollPane1.setViewportView(tabDir);

        btAlt.setBackground(new java.awt.Color(204, 255, 255));
        btAlt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAlt.setText("Alterar");
        btAlt.setToolTipText("Alteração de todos os campos");
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

        btSair.setBackground(new java.awt.Color(204, 255, 255));
        btSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        rotNumId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumId.setText("Número de identificação:");

        btCons.setBackground(new java.awt.Color(204, 255, 255));
        btCons.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCons.setText("Consultar");
        btCons.setToolTipText("Consulta de todos os dados");
        btCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsActionPerformed(evt);
            }
        });

        cxNumId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        mnItCadEsc.setText("Escola...");
        mnItCadEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItCadEscActionPerformed(evt);
            }
        });
        mnCad.add(mnItCadEsc);

        bmPrincipal.add(mnCad);

        mnCons.setText("Consultar");

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
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotNumId)
                        .addGap(18, 18, 18)
                        .addComponent(cxNumId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btCons, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExc, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rotConsDir)
                .addGap(221, 221, 221))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotConsDir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNumId)
                    .addComponent(cxNumId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExc)
                    .addComponent(btAlt)
                    .addComponent(btSair)
                    .addComponent(btCons))
                .addGap(21, 21, 21))
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

    private void mnItCadEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItCadEscActionPerformed
        CadEsc.getCadEscUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItCadEscActionPerformed

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

    private void btAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltActionPerformed
        altDir();
    }//GEN-LAST:event_btAltActionPerformed

    private void btExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcActionPerformed
        excDir();
        excFunc();
    }//GEN-LAST:event_btExcActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsActionPerformed
        VisuDir.getVisDirUnico().setVisible(true);
    }//GEN-LAST:event_btConsActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listaTab();
    }//GEN-LAST:event_formWindowActivated

    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saída", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0){
            System.exit(0);
        }
    }

    public void listaTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tabDir.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Diretor d : BDFunc.getBancoFunc().getBdDir()){
            tabModel.insertRow(posLin, new Object[]{d.getNumId(), d.getNome(), d.getTelefone(), d.getDataAdmissao(), d.getExpAnterior(), d.getIdade(), d.getEscola().getNome()});
            posLin++;
        }
    }
    
    public void altDir(){
        try{
            d = new Diretor();
            
            try{
                d.setNumId(Integer.parseInt(cxNumId.getText()));
            }catch(NumIdException nie){
                nie.mostraMsg();
                d = nie.corrNumIdInvalido(d);
            }
            
            d = BDFunc.getBancoFunc().altDir(d);
            
            if(d != null){
                d.mostraDadosMae();
                d.mostraDados();
            }else{
                JOptionPane.showMessageDialog(null, "Número de identificação não cadastrado!", "ATENÇÃO", 0);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite um número!", "ATENÇÃO", 0);
        }
    }
    
    public void excDir(){
        try{
            d = new Diretor();
            
            try{
                d.setNumId(Integer.parseInt(cxNumId.getText()));
            }catch(NumIdException nie){
                nie.mostraMsg();
                d = nie.corrNumIdInvalido(d);
            }
            
            d = BDFunc.getBancoFunc().excDir(d);
            
            if(d == null){
                JOptionPane.showMessageDialog(null, "Diretor excluído com sucesso!", "EXCLUSÃO DE DIRETOR", 1);
                cxNumId.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Diretor não cadastrado!", "ATENÇÃO", 0);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Verifique os campos numéricos!", "ATENÇÃO", 0);
        }
    }
    
    public void excFunc(){
        try{
            f = new Funcionario();
            
            try{
                f.setNumId(Integer.parseInt(cxNumId.getText()));
            }catch(NumIdException nie){
                nie.mostraMsg();
                d = nie.corrNumIdInvalido(d);
                f = (Funcionario) f;
            }
            
            f = BDFunc.getBancoFunc().excFunc(f);
            
            if(f == null){
                JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!", "EXCLUSÃO DE DIRETOR", 1);
                cxNumId.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Diretor não cadastrado!", "ATENÇÃO", 0);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Verifique os campos numéricos!", "ATENÇÃO", 0);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bmPrincipal;
    private javax.swing.JButton btAlt;
    private javax.swing.JButton btCons;
    private javax.swing.JButton btExc;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxNumId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnCad;
    private javax.swing.JMenu mnCons;
    private javax.swing.JMenuItem mnItCadDir;
    private javax.swing.JMenuItem mnItCadEsc;
    private javax.swing.JMenuItem mnItCadProf;
    private javax.swing.JMenuItem mnItCadTerc;
    private javax.swing.JMenuItem mnItConsFunc;
    private javax.swing.JMenuItem mnItConsProf;
    private javax.swing.JMenuItem mnItConsTerc;
    private javax.swing.JMenuItem mnItVoltar;
    private javax.swing.JMenu mnVoltar;
    private javax.swing.JLabel rotConsDir;
    private javax.swing.JLabel rotNumId;
    private javax.swing.JTable tabDir;
    // End of variables declaration//GEN-END:variables
}