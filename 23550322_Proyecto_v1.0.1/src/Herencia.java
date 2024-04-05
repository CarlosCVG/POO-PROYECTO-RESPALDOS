
import java.awt.Color;

public class Herencia extends javax.swing.JInternalFrame {
    
    private String texto = 
            "La herencia es un término que se usa en la programación "
            + "orientada a  objetos, concepto que nos permite definir "
            + "nuevas clases basadas en  unas ya existentes a fin de "
            + "reutilizar el código y espacio de memoria,  generando "
            + "así una jerarquía de clases dentro de una aplicación. "
            + "Si  una clase se deriva de otra, esta hereda sus atributos"
            + " y métodos,  además de poder añadir nuevos atributos y "
            + "nuevos métodos, además  de redefinir los ya heredados. "
            + "En Java, cada clase solo puede derivarse  de otra clase. "
            + "Esa clase se llama superclase, o clase padre. La clase "
            + "derivada se llama subclase o clase secundaria.";

    public String convertirTextoMultiLinea(String texto){
        return "<html><p style=\"padding: 15px;\">" + texto + "</p></html>";
    }

    public Herencia() {
        initComponents();
        this.getContentPane().setBackground(Color.black);
        lblTextoHerencia.setText(convertirTextoMultiLinea(texto));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloHerencia = new javax.swing.JLabel();
        lblTextoHerencia = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Herencia");
        setMaximumSize(new java.awt.Dimension(1050, 525));
        setMinimumSize(new java.awt.Dimension(1050, 525));

        jPanel1.setBackground(new java.awt.Color(21, 27, 59));

        lblTituloHerencia.setBackground(new java.awt.Color(42, 54, 94));
        lblTituloHerencia.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTituloHerencia.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloHerencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloHerencia.setText("HERENCIA");
        lblTituloHerencia.setOpaque(true);

        lblTextoHerencia.setBackground(new java.awt.Color(42, 54, 94));
        lblTextoHerencia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTextoHerencia.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoHerencia.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lblTituloHerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(lblTextoHerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTituloHerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTextoHerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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
    private javax.swing.JLabel lblTextoHerencia;
    private javax.swing.JLabel lblTituloHerencia;
    // End of variables declaration//GEN-END:variables
}
