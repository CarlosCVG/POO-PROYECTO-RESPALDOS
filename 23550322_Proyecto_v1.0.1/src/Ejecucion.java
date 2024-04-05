import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Ejecucion extends javax.swing.JInternalFrame {

    private String texto = "Superclase: Persona / Subclase: Alumno ------->"
            + " La clase Alumno hereda los atributos \"nombre\" y \"apellidop\" "
            + "de la clase Persona, asi como el metodo mostrarDatos()"
            + ". Lo que hace el metodo mostrarDatos() en la clase Persona, es concatenar "
            + "el nombre de la persona con el apellido, mientras que al ser referenciado mediante"
            + "la clase Alumnos, lo que hacemos es ingresar y concatenar tambien la \"matricula\", "
            + "siendo esta un atributo propio de la clase Alumno. "
            + "Al hacer esto, usamos la herencia para reutilizar atributos (nombre y apellidop) que podrian "
            + "ser usados no solo en alumnos, si no en clase como profesores, trabajadores etc. y metodos "
            + "que tambien pueden"
            + "ser un comun denominador en diversas clases. El metodo mostrarDatos() ya sirve para concatenar en "
            + "Persona, sin embargo, se hereda y vuelve a usar en Alumno para expandir su uso segun las necesidades "
            + "de la clase."
            + " Enseguida se muestra el ejemplo corriendo en Consola (Vease la imagen) y en este mismo JFrame, "
            + "pudiendo ser comparados los resultados y verificando que efectivamente se concreto el uso de la herencia"
            + "para la reutilizacion del codigo en ambas tipos de salidas, dando un resultado igual.";
    
    
    
    public String convertirTextoMultiLinea(String texto){
        return "<html><p style=\"padding: 15px;\">" + texto + "</p></html>";
    }
    
    public class Persona {
        private String nombre;
        private String apellidop;
        private String nombreCompleto;
        public Persona(String nombre, String apellidop) {
            this.nombre = nombre;
            this.apellidop = apellidop;
        }
        public String mostrarDatos(String nombre, String apellidop){
            nombreCompleto = "El alumno " + nombre + " " + apellidop;
            return nombreCompleto;
        }
        
        public class Alumno extends Persona{
            private String matricula;
            private String datos;
            public Alumno (String nombre, String apellidop, String matricula){
                super(nombre, apellidop);
                this.matricula = matricula;
            }
            public String mostrarDatos(String nombre, String apellidop) {
                datos = super.mostrarDatos(nombre, apellidop) + " tiene matricula con el numero: " + matricula;
                return datos;
            }
        }
    }
    
    public Ejecucion() {
        initComponents();
        lblExplicacion.setText(convertirTextoMultiLinea(texto));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloEjecucion = new javax.swing.JLabel();
        lblExplicacion = new javax.swing.JLabel();
        lblImgConsola = new javax.swing.JLabel();
        pnlEjecucion = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtApellidop = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        btnEjecutar = new javax.swing.JButton();
        lblREjecutar = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ejecucion del codigo");
        setMaximumSize(new java.awt.Dimension(1050, 525));
        setMinimumSize(new java.awt.Dimension(1050, 525));

        jPanel1.setBackground(new java.awt.Color(21, 27, 59));

        lblTituloEjecucion.setBackground(new java.awt.Color(42, 54, 94));
        lblTituloEjecucion.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTituloEjecucion.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloEjecucion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloEjecucion.setText("Ejecucion del codigo - Herencia");
        lblTituloEjecucion.setOpaque(true);

        lblExplicacion.setBackground(new java.awt.Color(42, 54, 94));
        lblExplicacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblExplicacion.setForeground(new java.awt.Color(255, 255, 255));
        lblExplicacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblExplicacion.setOpaque(true);

        lblImgConsola.setBackground(new java.awt.Color(42, 54, 94));
        lblImgConsola.setMaximumSize(new java.awt.Dimension(567, 200));
        lblImgConsola.setMinimumSize(new java.awt.Dimension(567, 200));
        lblImgConsola.setOpaque(true);
        lblImgConsola.setPreferredSize(new java.awt.Dimension(567, 200));

        pnlEjecucion.setBackground(new java.awt.Color(42, 54, 94));
        pnlEjecucion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresa: Nombre, Apellidos y Matricula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlEjecucion.setMaximumSize(new java.awt.Dimension(257, 431));
        pnlEjecucion.setMinimumSize(new java.awt.Dimension(257, 431));

        txtNombre.setBackground(new java.awt.Color(84, 109, 164));
        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Nombre", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 8), new java.awt.Color(255, 255, 255))); // NOI18N

        txtApellidop.setBackground(new java.awt.Color(84, 109, 164));
        txtApellidop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtApellidop.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidop.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidop.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Apellidos", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 8), new java.awt.Color(255, 255, 255))); // NOI18N
        txtApellidop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidopActionPerformed(evt);
            }
        });

        txtMatricula.setBackground(new java.awt.Color(84, 109, 164));
        txtMatricula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(255, 255, 255));
        txtMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatricula.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Matricula", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 8), new java.awt.Color(255, 255, 255))); // NOI18N
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyPressed(evt);
            }
        });

        btnEjecutar.setBackground(new java.awt.Color(63, 82, 129));
        btnEjecutar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnEjecutar.setForeground(new java.awt.Color(255, 255, 255));
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnEjecutar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnEjecutarFocusGained(evt);
            }
        });
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        lblREjecutar.setBackground(new java.awt.Color(84, 109, 164));
        lblREjecutar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblREjecutar.setForeground(new java.awt.Color(255, 255, 255));
        lblREjecutar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblREjecutar.setMaximumSize(new java.awt.Dimension(235, 210));
        lblREjecutar.setMinimumSize(new java.awt.Dimension(235, 210));
        lblREjecutar.setOpaque(true);
        lblREjecutar.setPreferredSize(new java.awt.Dimension(235, 210));

        javax.swing.GroupLayout pnlEjecucionLayout = new javax.swing.GroupLayout(pnlEjecucion);
        pnlEjecucion.setLayout(pnlEjecucionLayout);
        pnlEjecucionLayout.setHorizontalGroup(
            pnlEjecucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEjecucionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEjecucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblREjecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidop, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEjecutar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlEjecucionLayout.setVerticalGroup(
            pnlEjecucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEjecucionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEjecutar)
                .addGap(18, 18, 18)
                .addComponent(lblREjecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloEjecucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(lblImgConsola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 90, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlEjecucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblExplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImgConsola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidopActionPerformed
        
    }//GEN-LAST:event_txtApellidopActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        String nombre = txtNombre.getText();
        String apellidop = txtApellidop.getText();
        String matricula = txtMatricula.getText();

        Persona persona = new Persona(nombre, apellidop);
        Persona.Alumno alumno = persona.new Alumno(nombre, apellidop, matricula);
        lblREjecutar.setText(convertirTextoMultiLinea(alumno.mostrarDatos(nombre, apellidop)));
        
        Icon imgLbl = new ImageIcon(new ImageIcon(getClass()
                .getResource("/Imagenes/ConsolaHerencia3.png"))
                .getImage().getScaledInstance(lblImgConsola.getWidth(), lblImgConsola.getHeight(), 0));
        
        lblImgConsola.setIcon(imgLbl);
        
        txtNombre.setText("");
        txtApellidop.setText("");
        txtMatricula.setText("");
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void txtMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==evt.VK_ENTER){
            btnEjecutarActionPerformed(null);
            txtNombre.requestFocus();
        }
    }//GEN-LAST:event_txtMatriculaKeyPressed

    private void btnEjecutarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnEjecutarFocusGained
        // TODO add your handling code here:
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnEjecutarFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblExplicacion;
    private javax.swing.JLabel lblImgConsola;
    private javax.swing.JLabel lblREjecutar;
    private javax.swing.JLabel lblTituloEjecucion;
    private javax.swing.JPanel pnlEjecucion;
    private javax.swing.JTextField txtApellidop;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
