import java.awt.Color;

public class LogIn extends javax.swing.JFrame {
    private LogIn ventana1;
    private Sistema ventana2;
    String Usuario = "admin";
    String Password = "admin";
    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.black);
        lblTitulo2.setVisible(false);
        lblTituloR.setVisible(false);
        lblTituloNU.setVisible(false);
        lblTituloNP.setVisible(false);
        txtNewUsuario.setVisible(false);
        txtNewPassword.setVisible(false);
        btnTerminarRegistro.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblTituloIS = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JButton();
        lblTituloU = new javax.swing.JLabel();
        lblTituloP = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblNoRegistrado = new javax.swing.JLabel();
        btnIniciarRegistro = new javax.swing.JButton();
        lblIncorrecto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTituloR = new javax.swing.JLabel();
        lblTituloNP = new javax.swing.JLabel();
        lblTituloNU = new javax.swing.JLabel();
        txtNewUsuario = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JPasswordField();
        lblTitulo2 = new javax.swing.JLabel();
        btnTerminarRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogIn");
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1070, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setMaximumSize(new java.awt.Dimension(535, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(535, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(535, 600));

        lblTituloIS.setBackground(new java.awt.Color(17, 21, 31));
        lblTituloIS.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblTituloIS.setForeground(new java.awt.Color(239, 246, 224));
        lblTituloIS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloIS.setText("Inicia Sesión");
        lblTituloIS.setOpaque(true);

        lblTitulo.setBackground(new java.awt.Color(17, 21, 31));
        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("BIENVENIDO AL SISTEMA");
        lblTitulo.setOpaque(true);

        btnAcceder.setBackground(new java.awt.Color(34, 41, 61));
        btnAcceder.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceder.setText("Acceder");
        btnAcceder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnAcceder.setMaximumSize(new java.awt.Dimension(86, 34));
        btnAcceder.setMinimumSize(new java.awt.Dimension(86, 34));
        btnAcceder.setPreferredSize(new java.awt.Dimension(86, 34));
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        lblTituloU.setBackground(new java.awt.Color(17, 21, 31));
        lblTituloU.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTituloU.setForeground(new java.awt.Color(239, 246, 224));
        lblTituloU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloU.setText("Usuario");
        lblTituloU.setOpaque(true);

        lblTituloP.setBackground(new java.awt.Color(17, 21, 31));
        lblTituloP.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTituloP.setForeground(new java.awt.Color(239, 246, 224));
        lblTituloP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloP.setText("Password");
        lblTituloP.setOpaque(true);

        txtUsuario.setBackground(new java.awt.Color(51, 62, 92));
        txtUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Escribe Aqui", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 8), new java.awt.Color(255, 255, 255))); // NOI18N

        txtPassword.setBackground(new java.awt.Color(51, 62, 92));
        txtPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Escribe Aqui", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 8), new java.awt.Color(255, 255, 255))); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        lblNoRegistrado.setBackground(new java.awt.Color(17, 21, 31));
        lblNoRegistrado.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblNoRegistrado.setForeground(new java.awt.Color(239, 246, 224));
        lblNoRegistrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoRegistrado.setText("¿No estas registrado?");
        lblNoRegistrado.setOpaque(true);

        btnIniciarRegistro.setBackground(new java.awt.Color(34, 41, 61));
        btnIniciarRegistro.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnIniciarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarRegistro.setText("Iniciar Registro");
        btnIniciarRegistro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnIniciarRegistro.setMaximumSize(new java.awt.Dimension(242, 34));
        btnIniciarRegistro.setMinimumSize(new java.awt.Dimension(242, 34));
        btnIniciarRegistro.setPreferredSize(new java.awt.Dimension(242, 34));
        btnIniciarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarRegistroActionPerformed(evt);
            }
        });

        lblIncorrecto.setBackground(new java.awt.Color(17, 21, 31));
        lblIncorrecto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblIncorrecto.setForeground(new java.awt.Color(239, 246, 224));
        lblIncorrecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIncorrecto.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIncorrecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword)
                            .addComponent(txtUsuario)
                            .addComponent(lblNoRegistrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTituloU, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTituloP, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTituloIS, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblNoRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIniciarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblTituloIS, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblTituloU, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTituloP, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblIncorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 24));
        jPanel1.setMaximumSize(new java.awt.Dimension(535, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(535, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(535, 600));

        lblTituloR.setBackground(new java.awt.Color(21, 27, 59));
        lblTituloR.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblTituloR.setForeground(new java.awt.Color(242, 233, 228));
        lblTituloR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloR.setText("Registrarse");
        lblTituloR.setOpaque(true);

        lblTituloNP.setBackground(new java.awt.Color(21, 27, 59));
        lblTituloNP.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTituloNP.setForeground(new java.awt.Color(242, 233, 228));
        lblTituloNP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloNP.setText("Password");
        lblTituloNP.setOpaque(true);

        lblTituloNU.setBackground(new java.awt.Color(21, 27, 59));
        lblTituloNU.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTituloNU.setForeground(new java.awt.Color(242, 233, 228));
        lblTituloNU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloNU.setText("Usuario nuevo");
        lblTituloNU.setOpaque(true);

        txtNewUsuario.setBackground(new java.awt.Color(63, 82, 129));
        txtNewUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNewUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtNewUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNewUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Escribe Aqui", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 8), new java.awt.Color(255, 255, 255))); // NOI18N

        txtNewPassword.setBackground(new java.awt.Color(63, 82, 129));
        txtNewPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtNewPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNewPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Escribe Aqui", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 8), new java.awt.Color(255, 255, 255))); // NOI18N
        txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswordActionPerformed(evt);
            }
        });
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyPressed(evt);
            }
        });

        lblTitulo2.setBackground(new java.awt.Color(21, 27, 59));
        lblTitulo2.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("BIENVENIDO AL SISTEMA");
        lblTitulo2.setOpaque(true);

        btnTerminarRegistro.setBackground(new java.awt.Color(42, 54, 94));
        btnTerminarRegistro.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnTerminarRegistro.setForeground(new java.awt.Color(242, 233, 228));
        btnTerminarRegistro.setText("Terminar Registro");
        btnTerminarRegistro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnTerminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTituloNU, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNewUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTituloNP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTituloR, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnTerminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lblTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTituloR, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTituloNU, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTituloNP, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnTerminarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(73, 73, 73))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        // TODO add your handling code here:
        //if (txtUsuario.getText().equals(txtNewUsuario.getText()) && txtPassword.getText().equals(txtNewPassword.getText())){
        if (txtUsuario.getText().equals(Usuario) && txtPassword.getText().equals(Password)){
        ventana2 = new Sistema();
        ventana2.setVisible(true);
        this.dispose();
        } else {
            lblIncorrecto.setText("Datos Incorrectos");
        }
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnIniciarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarRegistroActionPerformed
        // TODO add your handling code here:
        lblTitulo2.setVisible(true);
        lblTituloR.setVisible(true);
        lblTituloNU.setVisible(true);
        lblTituloNP.setVisible(true);
        txtNewUsuario.setVisible(true);
        txtNewPassword.setVisible(true);
        btnTerminarRegistro.setVisible(true);
        lblTitulo.setVisible(false);
        lblNoRegistrado.setVisible(false);
        btnIniciarRegistro.setVisible(false);
        lblTituloIS.setVisible(false);
        lblTituloU.setVisible(false);
        txtUsuario.setVisible(false);
        lblTituloP.setVisible(false);
        txtPassword.setVisible(false);
        lblIncorrecto.setVisible(false);
        btnAcceder.setVisible(false);
    }//GEN-LAST:event_btnIniciarRegistroActionPerformed

    private void btnTerminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarRegistroActionPerformed
        // TODO add your handling code here:
        lblTitulo2.setVisible(false);
        lblTituloR.setVisible(false);
        lblTituloNU.setVisible(false);
        lblTituloNP.setVisible(false);
        txtNewUsuario.setVisible(false);
        txtNewPassword.setVisible(false);
        btnTerminarRegistro.setVisible(false);
        lblTitulo.setVisible(true);
        lblNoRegistrado.setVisible(true);
        btnIniciarRegistro.setVisible(true);
        lblTituloIS.setVisible(true);
        lblTituloU.setVisible(true);
        txtUsuario.setVisible(true);
        lblTituloP.setVisible(true);
        txtPassword.setVisible(true);
        lblIncorrecto.setVisible(true);
        btnAcceder.setVisible(true);
        Usuario = txtNewUsuario.getText();
        Password = txtNewPassword.getText();
    }//GEN-LAST:event_btnTerminarRegistroActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordActionPerformed

    private void txtNewPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==evt.VK_ENTER)
            btnTerminarRegistroActionPerformed(null);
    }//GEN-LAST:event_txtNewPasswordKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==evt.VK_ENTER)
            btnAccederActionPerformed(null);
    }//GEN-LAST:event_txtPasswordKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnIniciarRegistro;
    private javax.swing.JButton btnTerminarRegistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIncorrecto;
    private javax.swing.JLabel lblNoRegistrado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTituloIS;
    private javax.swing.JLabel lblTituloNP;
    private javax.swing.JLabel lblTituloNU;
    private javax.swing.JLabel lblTituloP;
    private javax.swing.JLabel lblTituloR;
    private javax.swing.JLabel lblTituloU;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtNewUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
