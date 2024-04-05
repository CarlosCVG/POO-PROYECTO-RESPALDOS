import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CodigoHerencia extends javax.swing.JInternalFrame {

    public CodigoHerencia() {
        initComponents();
        
        Icon imgLbl = new ImageIcon(new ImageIcon(getClass()
                .getResource("/Imagenes/HerenciaPadre2.png"))
                .getImage().getScaledInstance(500, 270, 0));
        
        lblImgCodigoHerencia1.setIcon(imgLbl);
        
        imgLbl = new ImageIcon(new ImageIcon(getClass()
                .getResource("/Imagenes/HerenciaHijo2.png"))
                .getImage().getScaledInstance(500, 284, 0));
        lblImgCodigoHerencia2.setIcon(imgLbl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImgCodigoHerencia1 = new javax.swing.JLabel();
        lblImgCodigoHerencia2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Codigo");
        setMaximumSize(new java.awt.Dimension(1050, 525));
        setMinimumSize(new java.awt.Dimension(1050, 525));

        jPanel1.setBackground(new java.awt.Color(21, 27, 59));

        lblImgCodigoHerencia1.setBackground(new java.awt.Color(42, 54, 94));
        lblImgCodigoHerencia1.setMaximumSize(new java.awt.Dimension(500, 470));
        lblImgCodigoHerencia1.setMinimumSize(new java.awt.Dimension(500, 470));
        lblImgCodigoHerencia1.setOpaque(true);
        lblImgCodigoHerencia1.setPreferredSize(new java.awt.Dimension(500, 470));

        lblImgCodigoHerencia2.setBackground(new java.awt.Color(42, 54, 94));
        lblImgCodigoHerencia2.setMaximumSize(new java.awt.Dimension(500, 470));
        lblImgCodigoHerencia2.setMinimumSize(new java.awt.Dimension(500, 470));
        lblImgCodigoHerencia2.setOpaque(true);
        lblImgCodigoHerencia2.setPreferredSize(new java.awt.Dimension(500, 470));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblImgCodigoHerencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImgCodigoHerencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgCodigoHerencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImgCodigoHerencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImgCodigoHerencia1;
    private javax.swing.JLabel lblImgCodigoHerencia2;
    // End of variables declaration//GEN-END:variables
}
