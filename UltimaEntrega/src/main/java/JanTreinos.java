
import javax.swing.JOptionPane;

// Nome: Luiz Gustavo Farabello Martins   RA: 2267942

public class JanTreinos extends javax.swing.JFrame {

    private static JanTreinos janTrei;
    private Aluno aluno;
    
    public JanTreinos() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    public static JanTreinos getJanTrei(){
        if(janTrei == null){
            janTrei = new JanTreinos();
        }
        return janTrei;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TextReps = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextDuracao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ComboEquip = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        TextCodMat = new javax.swing.JTextField();
        TextSerie = new javax.swing.JTextField();
        TextTreino = new javax.swing.JTextField();
        TextMuscTrab = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSalvar2 = new javax.swing.JButton();
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
                .addContainerGap(656, Short.MAX_VALUE))
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
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Repetições");

        TextReps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextRepsActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Duração");

        TextDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDuracaoActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Series");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Equipamento");

        ComboEquip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puxar", "Empurrar", "Pernas" }));
        ComboEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboEquipActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Código");

        TextCodMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCodMatActionPerformed(evt);
            }
        });

        TextSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSerieActionPerformed(evt);
            }
        });

        TextTreino.setEditable(false);
        TextTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTreinoActionPerformed(evt);
            }
        });

        TextMuscTrab.setEditable(false);
        TextMuscTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMuscTrabActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Músculos");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de treino");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Montar treino");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nome");

        TextNome.setEditable(false);
        TextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TextReps, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ComboEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TextMuscTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TextTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
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
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextCodMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextReps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextMuscTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(31, Short.MAX_VALUE))
        );

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

        btnSalvar2.setText("Salvar");
        btnSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Principal.getJanIni().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void mnuVoltarIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVoltarIniActionPerformed
        Principal.getJanIni().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuVoltarIniActionPerformed

    private void mnuCadAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadAlActionPerformed
        JanCadAluno.getJanCadAluno().setVisible(true);
        JanTreinos.getJanTrei().setVisible(false);
    }//GEN-LAST:event_mnuCadAlActionPerformed

    private void mnuCadTreiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadTreiActionPerformed
       JanCadTreinador.getJanCadTrei().setVisible(true);
        JanTreinos.getJanTrei().setVisible(false);
    }//GEN-LAST:event_mnuCadTreiActionPerformed

    private void mnuTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTreinosActionPerformed
        
    }//GEN-LAST:event_mnuTreinosActionPerformed

    private void mnuMostrarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMostrarAlActionPerformed
        JanMostrarCadAlunos.getJanMostrarCadAlunos().setVisible(true);
        JanTreinos.getJanTrei().setVisible(false);
    }//GEN-LAST:event_mnuMostrarAlActionPerformed

    private void TextRepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextRepsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextRepsActionPerformed

    private void TextDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDuracaoActionPerformed

    private void TextCodMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCodMatActionPerformed

    }//GEN-LAST:event_TextCodMatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(TextCodMat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite um código para achar um aluno.", "Erro", 0);
        }
           
        JOptionPane.showMessageDialog(null, "Ao achar um aluno, altere os campos abaixo e clique no botão salvar, para criar um treino!", "Message", 1);
        
        int cod = Integer.parseInt(TextCodMat.getText());
        aluno = new Aluno();
        aluno = BdAluno.acharAluno(cod);

        if(aluno != null){
            TextNome.setText(aluno.getNome());
            TextSerie.setText(String.valueOf(aluno.getTre().getSeries()));
            TextReps.setText(String.valueOf(aluno.getTre().getReps()));
            TextDuracao.setText(String.valueOf(aluno.getTre().getDuracao()));            
            ComboEquip.setSelectedItem(aluno.getTre().getTipoEquipa());
            TextMuscTrab.setText(aluno.getTre().getMuscTrab());
            TextTreino.setText(aluno.getTre().getTipoTreino());
        }else{
            JOptionPane.showMessageDialog(null, "Não há niguem com esse código!", "Erro", 0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar(); // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar2ActionPerformed
        if(TextCodMat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite um código para achar um aluno.", "Erro", 0);
        }

        int cod = Integer.parseInt(TextCodMat.getText());
        aluno = BdAluno.acharAluno(cod);
        
        if(aluno != null){
            try{
                aluno.getTre().setSeries(Integer.parseInt(TextSerie.getText()));
                aluno.getTre().setReps(Integer.parseInt(TextReps.getText()));
                aluno.getTre().setDuracao(Integer.parseInt(TextDuracao.getText()));            
                aluno.getTre().setTipoEquipa(String.valueOf(ComboEquip.getSelectedItem()));
                aluno.getTre().setMuscTrab(aluno.getTre().defMuscTrab(String.valueOf(ComboEquip.getSelectedItem())));
                aluno.getTre().setTipoTreino(aluno.getTre().defTipoTrei(Integer.parseInt(TextReps.getText()), Integer.parseInt(TextSerie.getText())));
                JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso", "Status", 1);
                limpar();
            } catch(NegativoException ne){
                JOptionPane.showMessageDialog(null, "Digite a idade corretamente!", "ERRO DE CADASTRO", 0);
                limpar();
            }       
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível achar um aluno com esse código.", "Erro", 0);
        }
        
    }//GEN-LAST:event_btnSalvar2ActionPerformed

    private void TextSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSerieActionPerformed

    private void ComboEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEquipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboEquipActionPerformed

    private void TextTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTreinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTreinoActionPerformed

    private void TextMuscTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextMuscTrabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextMuscTrabActionPerformed

    private void TextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomeActionPerformed
    
    public void limpar(){
        TextCodMat.setText("");
        TextDuracao.setText("");
        TextSerie.setText("");
        TextReps.setText("");
        ComboEquip.setSelectedItem("Puxar");
        TextMuscTrab.setText("");
        TextTreino.setText("");
        TextCodMat.requestFocus();
    }
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                getJanTrei().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEquip;
    private javax.swing.JPanel LabelTitulo;
    private javax.swing.JTextField TextCodMat;
    private javax.swing.JTextField TextDuracao;
    private javax.swing.JTextField TextMuscTrab;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextReps;
    private javax.swing.JTextField TextSerie;
    private javax.swing.JTextField TextTreino;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar2;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
