import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Diagramas extends javax.swing.JInternalFrame {

    public Diagramas() {
        initComponents();
        Icon imgLbl = new ImageIcon(new ImageIcon(getClass()
                .getResource("/Imagenes/DiagramaHerencia2.png"))
                .getImage().getScaledInstance(531, 480, 0));
        
        lblImgDiagrama.setIcon(imgLbl);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImgDiagrama = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Diagramas");
        setMaximumSize(new java.awt.Dimension(1050, 525));
        setMinimumSize(new java.awt.Dimension(1050, 525));
        setPreferredSize(new java.awt.Dimension(1050, 525));

        jPanel1.setBackground(new java.awt.Color(21, 27, 59));

        lblImgDiagrama.setBackground(new java.awt.Color(42, 54, 94));
        lblImgDiagrama.setMaximumSize(new java.awt.Dimension(531, 480));
        lblImgDiagrama.setMinimumSize(new java.awt.Dimension(531, 480));
        lblImgDiagrama.setOpaque(true);
        lblImgDiagrama.setPreferredSize(new java.awt.Dimension(531, 480));
        lblImgDiagrama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblImgDiagramaFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(lblImgDiagrama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgDiagrama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void lblImgDiagramaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblImgDiagramaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImgDiagramaFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImgDiagrama;
    // End of variables declaration//GEN-END:variables
}
