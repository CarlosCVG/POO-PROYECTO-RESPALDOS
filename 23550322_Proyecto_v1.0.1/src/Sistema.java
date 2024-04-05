
import java.awt.Color;

public class Sistema extends javax.swing.JFrame {
    private LogIn ventana1;
    private Sistema ventana2;    

    public Sistema() {
        initComponents();
        this.getContentPane().setBackground(Color.black);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFondo = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miInformacion = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        miDiagramas = new javax.swing.JMenuItem();
        miCodigo = new javax.swing.JMenuItem();
        miEjecucion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1070, 600));
        setMinimumSize(new java.awt.Dimension(1070, 600));
        setPreferredSize(new java.awt.Dimension(1070, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pFondo.setBackground(new java.awt.Color(0, 0, 24));
        pFondo.setMaximumSize(new java.awt.Dimension(1070, 560));
        pFondo.setMinimumSize(new java.awt.Dimension(1070, 560));

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(pFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 560));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(1070, 40));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(1070, 40));
        jMenuBar1.setOpaque(true);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(1070, 40));

        jMenu1.setBackground(new java.awt.Color(17, 21, 31));
        jMenu1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Herencia");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setOpaque(true);

        miInformacion.setBackground(new java.awt.Color(34, 41, 61));
        miInformacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        miInformacion.setForeground(new java.awt.Color(255, 255, 255));
        miInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/programacion.png"))); // NOI18N
        miInformacion.setText("Informacion");
        miInformacion.setOpaque(true);
        miInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInformacionActionPerformed(evt);
            }
        });
        jMenu1.add(miInformacion);

        jMenu6.setBackground(new java.awt.Color(34, 41, 61));
        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setText("Ejemplos");
        jMenu6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu6.setOpaque(true);

        miDiagramas.setBackground(new java.awt.Color(51, 62, 92));
        miDiagramas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        miDiagramas.setForeground(new java.awt.Color(255, 255, 255));
        miDiagramas.setText("Diagramas");
        miDiagramas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDiagramasActionPerformed(evt);
            }
        });
        jMenu6.add(miDiagramas);

        miCodigo.setBackground(new java.awt.Color(51, 62, 92));
        miCodigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        miCodigo.setForeground(new java.awt.Color(255, 255, 255));
        miCodigo.setText("Codigo");
        miCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCodigoActionPerformed(evt);
            }
        });
        jMenu6.add(miCodigo);

        miEjecucion.setBackground(new java.awt.Color(51, 62, 92));
        miEjecucion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        miEjecucion.setForeground(new java.awt.Color(255, 255, 255));
        miEjecucion.setText("Ejecucion");
        miEjecucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEjecucionActionPerformed(evt);
            }
        });
        jMenu6.add(miEjecucion);

        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(17, 21, 31));
        jMenu2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Polimorfismo");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jMenu2.setOpaque(true);
        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(17, 21, 31));
        jMenu3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Excepciones");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jMenu3.setOpaque(true);
        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(17, 21, 31));
        jMenu4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Archivos");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jMenu4.setOpaque(true);
        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(17, 21, 31));
        jMenu5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setText("Salir");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jMenu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu5.setOpaque(true);
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked

        ventana1 = new LogIn();
        ventana1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void miInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInformacionActionPerformed
        // TODO add your handling code here:
        
        Herencia herencia = new Herencia();
        pFondo.add(herencia);
        herencia.show();
    }//GEN-LAST:event_miInformacionActionPerformed

    private void miDiagramasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDiagramasActionPerformed
        // TODO add your handling code here:
        Diagramas diagrama = new Diagramas();
        pFondo.add(diagrama);
        diagrama.show();
    }//GEN-LAST:event_miDiagramasActionPerformed

    private void miCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCodigoActionPerformed
        // TODO add your handling code here:
        CodigoHerencia codigo = new CodigoHerencia();
        pFondo.add(codigo);
        codigo.show();
    }//GEN-LAST:event_miCodigoActionPerformed

    private void miEjecucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEjecucionActionPerformed
        // TODO add your handling code here:
        Ejecucion ejecucion = new Ejecucion();
        pFondo.add(ejecucion);
        ejecucion.show();
    }//GEN-LAST:event_miEjecucionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miCodigo;
    private javax.swing.JMenuItem miDiagramas;
    private javax.swing.JMenuItem miEjecucion;
    private javax.swing.JMenuItem miInformacion;
    private javax.swing.JPanel pFondo;
    // End of variables declaration//GEN-END:variables
}
