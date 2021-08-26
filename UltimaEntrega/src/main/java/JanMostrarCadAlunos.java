// Nome: Luiz Gustavo Farabello Martins   RA: 2267942

import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanMostrarCadAlunos extends javax.swing.JFrame {

    private static JanMostrarCadAlunos janMostrarAl;
    
    private Aluno aluno = new Aluno();
    //private BdAluno bdAl = new BdAluno();
    
    public JanMostrarCadAlunos() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        //setLayout(new FlowLayout());;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAluno = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextIdade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ComboTurno = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ComboPlano = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        TextCodMat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuIncício = new javax.swing.JMenu();
        mnuVoltarIni = new javax.swing.JMenuItem();
        mnuCadastro = new javax.swing.JMenu();
        mnuCadAl = new javax.swing.JMenuItem();
        mnuCadTrei = new javax.swing.JMenuItem();
        mnuMostrar = new javax.swing.JMenu();
        mnuMostrarAl = new javax.swing.JMenuItem();
        mnuMostrarTrei = new javax.swing.JMenuItem();
        mnuTreinos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelTitulo.setBackground(new java.awt.Color(0, 0, 102));
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Palester FitBox");

        javax.swing.GroupLayout LabelTituloLayout = new javax.swing.GroupLayout(LabelTitulo);
        LabelTitulo.setLayout(LabelTituloLayout);
        LabelTituloLayout.setHorizontalGroup(
            LabelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LabelTituloLayout.setVerticalGroup(
            LabelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        TableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Idade", "Turno", "Plano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableAluno.setSelectionBackground(new java.awt.Color(153, 153, 153));
        TableAluno.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(TableAluno);

        jButton2.setText("Carregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alunos cadastrados", jPanel5);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setText("Procurar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar alterações");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");

        TextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Idade");

        TextIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdadeActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Turno");

        ComboTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));
        ComboTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTurnoActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Plano");

        ComboPlano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensal", "Semestral", "Anual" }));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Código");

        TextCodMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCodMatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite o código para achar um aluno");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TextCodMat, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ComboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ComboPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextCodMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Buscar alunos", jPanel2);

        mnuIncício.setText("Início");

        mnuVoltarIni.setText("Voltar");
        mnuVoltarIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVoltarIniActionPerformed(evt);
            }
        });
        mnuIncício.add(mnuVoltarIni);

        jMenuBar1.add(mnuIncício);

        mnuCadastro.setText("Cadastrar");

        mnuCadAl.setText("Cadastrar aluno");
        mnuCadAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadAlActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadAl);

        mnuCadTrei.setText("Cadastrar treinador");
        mnuCadTrei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadTreiActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadTrei);

        jMenuBar1.add(mnuCadastro);

        mnuMostrar.setText("Mostrar");

        mnuMostrarAl.setText("Mostrar alunos");
        mnuMostrarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMostrarAlActionPerformed(evt);
            }
        });
        mnuMostrar.add(mnuMostrarAl);

        mnuMostrarTrei.setText("Mostrar treinadores");
        mnuMostrarTrei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMostrarTreiActionPerformed(evt);
            }
        });
        mnuMostrar.add(mnuMostrarTrei);

        mnuTreinos.setText("Analisar treinos");
        mnuTreinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTreinosActionPerformed(evt);
            }
        });
        mnuMostrar.add(mnuTreinos);

        jMenuBar1.add(mnuMostrar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static JanMostrarCadAlunos getJanMostrarCadAlunos(){
        if(janMostrarAl == null){
            janMostrarAl = new JanMostrarCadAlunos();
        }
        return janMostrarAl;
    }
    
    
    private void mnuVoltarIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVoltarIniActionPerformed
        Principal.getJanIni().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuVoltarIniActionPerformed

    private void mnuCadAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadAlActionPerformed
        JanCadAluno.getJanCadAluno().setVisible(true);
        JanMostrarCadAlunos.getJanMostrarCadAlunos().setVisible(false);
    }//GEN-LAST:event_mnuCadAlActionPerformed

    private void mnuCadTreiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadTreiActionPerformed
        JanCadTreinador.getJanCadTrei().setVisible(true);
        dispose();
//        JanMostrarCadAlunos.getJanMostrarCadAlunos().setVisible(false);;
    }//GEN-LAST:event_mnuCadTreiActionPerformed

    private void mnuTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTreinosActionPerformed
        JanTreinos.getJanTrei().setVisible(true);
        JanMostrarCadAlunos.getJanMostrarCadAlunos().setVisible(false);
    }//GEN-LAST:event_mnuTreinosActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Principal.getJanIni().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(TextCodMat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite um código para achar um aluno.", "Erro", 0);
        }
        
        int cod = Integer.parseInt(TextCodMat.getText());
        aluno = new Aluno();
        aluno = BdAluno.acharAluno(cod);
        
        if(aluno != null){
            TextNome.setText(aluno.getNome());
            TextIdade.setText(String.valueOf(aluno.getIdade()));
            ComboTurno.setSelectedItem(aluno.turno);
            ComboPlano.setSelectedItem(aluno.getMat().getPlano());             
        }else{
            JOptionPane.showMessageDialog(null, "Não há niguem com esse código!", "Erro", 0);
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar(); // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void TextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomeActionPerformed

    private void TextIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdadeActionPerformed

    private void ComboTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTurnoActionPerformed

    private void TextCodMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCodMatActionPerformed

    }//GEN-LAST:event_TextCodMatActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(TextCodMat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite um código para achar um aluno.", "Erro", 0);
        } 
        
        int cod = Integer.parseInt(TextCodMat.getText());
        aluno = new Aluno();
        try{
            aluno.setNome(TextNome.getText());
            aluno.setIdade(Integer.parseInt(TextIdade.getText()));
            aluno.setTurno(String.valueOf(ComboTurno.getSelectedItem()));
            aluno.getMat().setPlano(String.valueOf(ComboPlano.getSelectedItem()));              
            TextCodMat.setText(String.valueOf(aluno.getMat().getCod_mat()));
            BdAluno.alterarAluno(aluno, cod);
            
            JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso", "Status", 1);
            limpar();
        } catch (NomeException ne) {
                JOptionPane.showMessageDialog(null, "Digite o nome corretamente!", "ERRO DE CADASTRO", 0);
                limpar();
        } catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog(null, "Digite a idade corretamente!", "ERRO DE CADASTRO", 0);
                limpar();
        } catch(NegativoException ne){
                JOptionPane.showMessageDialog(null, "Digite a idade corretamente!", "ERRO DE CADASTRO", 0);
                limpar();
        }       
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(TextCodMat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite um código para achar um aluno.", "Erro", 0);
        }
                
        int cod = Integer.parseInt(TextCodMat.getText());
        aluno = new Aluno();
        aluno = BdAluno.acharAluno(cod);
        
        if(aluno != null){
            BdAluno.excluirAluno(aluno);
            JOptionPane.showMessageDialog(null, "Aluno excluido com sucesso.", "Status", 1);
        }else{
             JOptionPane.showMessageDialog(null, "Não foi possível achar um aluno com esse código.", "Erro", 0);
        }
        limpar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void mnuMostrarTreiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMostrarTreiActionPerformed
        JanMostrarCadTreinadores.getJanMostrarCadTreinadores().setVisible(true);
        dispose();
        //JanMostrarCadAlunos.getJanMostrarCadAlunos().setVisible(false);
    }//GEN-LAST:event_mnuMostrarTreiActionPerformed

    private void mnuMostrarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMostrarAlActionPerformed
        
    }//GEN-LAST:event_mnuMostrarAlActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        carregarTabela();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void carregarTabela(){
        DefaultTableModel tabela = (DefaultTableModel) TableAluno.getModel();
        tabela.setRowCount(0);
        
        int linha = 0;
        
        for(Aluno aluno: BdAluno.getBdAluno()){
            tabela.insertRow(linha,new Object[]{aluno.getMat().getCod_mat(), aluno.getNome(), aluno.getIdade(), aluno.getTurno(), aluno.getMat().getPlano()});
            linha++;
        }
    }    
    
    public void limpar(){
        TextNome.setText("");
        TextIdade.setText("");
        ComboTurno.setSelectedItem("Manhã");
        ComboPlano.setSelectedItem("Mensal");
        TextCodMat.setText("");
        TextNome.requestFocus();
    }
   
    public static void main(String args[]) {      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanMostrarCadAlunos().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboPlano;
    private javax.swing.JComboBox<String> ComboTurno;
    private javax.swing.JPanel LabelTitulo;
    private javax.swing.JTable TableAluno;
    private javax.swing.JTextField TextCodMat;
    private javax.swing.JTextField TextIdade;
    private javax.swing.JTextField TextNome;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem mnuCadAl;
    private javax.swing.JMenuItem mnuCadTrei;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenu mnuIncício;
    private javax.swing.JMenu mnuMostrar;
    private javax.swing.JMenuItem mnuMostrarAl;
    private javax.swing.JMenuItem mnuMostrarTrei;
    private javax.swing.JMenuItem mnuTreinos;
    private javax.swing.JMenuItem mnuVoltarIni;
    // End of variables declaration//GEN-END:variables
}
