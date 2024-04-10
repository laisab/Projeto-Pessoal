//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsProf extends javax.swing.JFrame {

    private static ConsProf consProfUnico;
    private Funcionario f = new Funcionario();
    private Professor p = new Professor();
    
    private ConsProf() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static ConsProf getConsProfUnico(){
        if(consProfUnico == null){
            consProfUnico = new ConsProf();
        }
        
        return consProfUnico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotConsProf = new javax.swing.JLabel();
        rotNumId = new javax.swing.JLabel();
        cxNumId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabProf = new javax.swing.JTable();
        btAlt = new javax.swing.JButton();
        btExc = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCons = new javax.swing.JButton();
        bmPrincipal = new javax.swing.JMenuBar();
        mnCad = new javax.swing.JMenu();
        mnItCadDir = new javax.swing.JMenuItem();
        mnItCadProf = new javax.swing.JMenuItem();
        mnItCadTerc = new javax.swing.JMenuItem();
        mnItCadEsc = new javax.swing.JMenuItem();
        mnCons = new javax.swing.JMenu();
        mnItConsDir = new javax.swing.JMenuItem();
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

        rotConsProf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotConsProf.setText("CONSULTA GERAL DE PROFESSOR");

        rotNumId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumId.setText("Número de identificação:");

        cxNumId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tabProf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "N° de identificação", "Nome", "Telefone", "Disciplina", "Titulação", "Qtde aulas semanais", "Nome escola"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabProf.setToolTipText("Dados principais");
        jScrollPane1.setViewportView(tabProf);

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
        btSair.setToolTipText("");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCons.setBackground(new java.awt.Color(204, 255, 255));
        btCons.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCons.setText("Consultar");
        btCons.setToolTipText("Consulta de todos os dados");
        btCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(rotConsProf))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rotNumId)
                        .addGap(18, 18, 18)
                        .addComponent(cxNumId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btCons, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExc, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotConsProf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNumId)
                    .addComponent(cxNumId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExc)
                    .addComponent(btAlt)
                    .addComponent(btSair)
                    .addComponent(btCons))
                .addContainerGap(14, Short.MAX_VALUE))
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

    private void mnItConsDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItConsDirActionPerformed
        ConsDir.getConsDirUnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnItConsDirActionPerformed

    private void btAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltActionPerformed
        altProf();
    }//GEN-LAST:event_btAltActionPerformed

    private void btExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcActionPerformed
        excProf();
        excFunc();
    }//GEN-LAST:event_btExcActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsActionPerformed
        VisuProf.getVisProfUnico().setVisible(true);
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
        DefaultTableModel tabModel = (DefaultTableModel) tabProf.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Professor p : BDFunc.getBancoFunc().getBdProf()){
            tabModel.insertRow(posLin, new Object[]{p.getNumId(), p.getNome(), p.getTelefone(), p.getDiscLeciona(), p.getTitulacao(), p.getQtdeAulasSemanais(), p.getEscola().getNome()});
            posLin++;
        }
    }
    
    public void altProf(){
        try{
            p = new Professor();
            
            try{
                p.setNumId(Integer.parseInt(cxNumId.getText()));
            }catch(NumIdException nie){
                nie.mostraMsg();
                p = nie.corrNumIdInvalido(p);
            }
            
            p = BDFunc.getBancoFunc().altProf(p);
            
            if(p != null){
                p.mostraDadosMae();
                p.mostraDados();
            }else{
                JOptionPane.showMessageDialog(null, "Número de identificação não cadastrado!", "ATENÇÃO", 0);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite um número!", "ATENÇÃO", 0);
        }
    }
    
    public void excProf(){
        try{
            p = new Professor();
            
            try{
                p.setNumId(Integer.parseInt(cxNumId.getText()));
            }catch(NumIdException nie){
                nie.mostraMsg();
                p = nie.corrNumIdInvalido(p);
            }
            
            p = BDFunc.getBancoFunc().excProf(p);
            
            if(p == null){
                JOptionPane.showMessageDialog(null, "Professor excluído com sucesso!", "EXCLUSÃO DE PROFESSOR", 1);
                cxNumId.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Professor não cadastrado!", "ATENÇÃO", 0);
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
                p = nie.corrNumIdInvalido(p);
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
    private javax.swing.JMenuItem mnItConsDir;
    private javax.swing.JMenuItem mnItConsFunc;
    private javax.swing.JMenuItem mnItConsTerc;
    private javax.swing.JMenuItem mnItVoltar;
    private javax.swing.JMenu mnVoltar;
    private javax.swing.JLabel rotConsProf;
    private javax.swing.JLabel rotNumId;
    private javax.swing.JTable tabProf;
    // End of variables declaration//GEN-END:variables
}