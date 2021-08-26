
import javax.swing.JOptionPane;

// Nome: Luiz Gustavo Farabello Martins   RA: 2267942

public class Principal extends javax.swing.JFrame {

   private static Principal janIni;
   
    public Principal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    public static Principal getJanIni(){
        if(janIni == null){
            janIni = new Principal();
        }
        return janIni;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        LabelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCadAluno1 = new javax.swing.JButton();
        btnCadATreinador = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnTreinos = new javax.swing.JButton();
        btnCadAluno2 = new javax.swing.JButton();
        btnCadAluno3 = new javax.swing.JButton();
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

        jCheckBox1.setText("jCheckBox1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        LabelTitulo.setBackground(new java.awt.Color(0, 0, 102));
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Palester FitBox");

        javax.swing.GroupLayout LabelTituloLayout = new javax.swing.GroupLayout(LabelTitulo);
        LabelTitulo.setLayout(LabelTituloLayout);
        LabelTituloLayout.setHorizontalGroup(
            LabelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelTituloLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(402, Short.MAX_VALUE))
        );
        LabelTituloLayout.setVerticalGroup(
            LabelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelTituloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnCadAluno1.setText("Cadastrar Aluno");
        btnCadAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAluno1ActionPerformed(evt);
            }
        });

        btnCadATreinador.setText("Cadastrar Treinador");
        btnCadATreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadATreinadorActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnTreinos.setText("Analisar treinos");
        btnTreinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinosActionPerformed(evt);
            }
        });

        btnCadAluno2.setText("Mostrar Treinadores Cadastrados");
        btnCadAluno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAluno2ActionPerformed(evt);
            }
        });

        btnCadAluno3.setText("Mostrar Alunos Cadastrados");
        btnCadAluno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAluno3ActionPerformed(evt);
            }
        });

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadAluno1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(btnCadATreinador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTreinos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadAluno2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(btnCadAluno3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnCadAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadATreinador, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadAluno3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadAluno2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadATreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadATreinadorActionPerformed
        JanCadTreinador.getJanCadTrei().setVisible(true);        
        Principal.getJanIni().setVisible(false);
    }//GEN-LAST:event_btnCadATreinadorActionPerformed

    private void btnCadAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAluno1ActionPerformed
        JanCadAluno.getJanCadAluno().setVisible(true); 
        Principal.getJanIni().setVisible(false);
    }//GEN-LAST:event_btnCadAluno1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Aviso", 1);
        if (sair == 0){
            dispose();
        }         
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinosActionPerformed
        JanTreinos.getJanTrei().setVisible(true);  
        Principal.getJanIni().setVisible(false);
    }//GEN-LAST:event_btnTreinosActionPerformed

    private void mnuVoltarIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVoltarIniActionPerformed
        
    }//GEN-LAST:event_mnuVoltarIniActionPerformed

    private void mnuCadAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadAlActionPerformed
        JanCadAluno.getJanCadAluno().setVisible(true);
        Principal.getJanIni().setVisible(false);        
    }//GEN-LAST:event_mnuCadAlActionPerformed

    private void mnuCadTreiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadTreiActionPerformed
        JanCadTreinador.getJanCadTrei().setVisible(true);
        Principal.getJanIni().setVisible(false);
    }//GEN-LAST:event_mnuCadTreiActionPerformed

    private void mnuTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTreinosActionPerformed
        JanTreinos.getJanTrei().setVisible(true);
        Principal.getJanIni().setVisible(false);
    }//GEN-LAST:event_mnuTreinosActionPerformed

    private void mnuMostrarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMostrarAlActionPerformed
        JanMostrarCadAlunos.getJanMostrarCadAlunos().setVisible(true);
        Principal.getJanIni().setVisible(false);
    }//GEN-LAST:event_mnuMostrarAlActionPerformed

    private void btnCadAluno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAluno2ActionPerformed
        JanMostrarCadTreinadores.getJanMostrarCadTreinadores().setVisible(true);
        Principal.getJanIni().setVisible(false);
    }//GEN-LAST:event_btnCadAluno2ActionPerformed

    private void btnCadAluno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAluno3ActionPerformed
        JanMostrarCadAlunos.getJanMostrarCadAlunos().setVisible(true);
        Principal.getJanIni().setVisible(false);
    }//GEN-LAST:event_btnCadAluno3ActionPerformed

    private void mnuMostrarTreiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMostrarTreiActionPerformed
        JanMostrarCadTreinadores.getJanMostrarCadTreinadores().setVisible(true);
        Principal.getJanIni().setVisible(false);
    }//GEN-LAST:event_mnuMostrarTreiActionPerformed

    public static void main(String args[]) {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                getJanIni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LabelTitulo;
    private javax.swing.JButton btnCadATreinador;
    private javax.swing.JButton btnCadAluno1;
    private javax.swing.JButton btnCadAluno2;
    private javax.swing.JButton btnCadAluno3;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnTreinos;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
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
