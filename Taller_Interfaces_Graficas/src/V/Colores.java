
package V;

/**
 *
 * @author jefry
 */
public class Colores extends javax.swing.JDialog {

    public Colores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        optRojo.setSelected(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoColores = new javax.swing.ButtonGroup();
        pnColores = new javax.swing.JPanel();
        optRojo = new javax.swing.JRadioButton();
        optVerde = new javax.swing.JRadioButton();
        optAzul = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();
        etiResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnColores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Colores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        grupoColores.add(optRojo);
        optRojo.setText("Rojo");

        grupoColores.add(optVerde);
        optVerde.setText("Verde");

        grupoColores.add(optAzul);
        optAzul.setText("Azul");

        javax.swing.GroupLayout pnColoresLayout = new javax.swing.GroupLayout(pnColores);
        pnColores.setLayout(pnColoresLayout);
        pnColoresLayout.setHorizontalGroup(
            pnColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        pnColoresLayout.setVerticalGroup(
            pnColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optRojo)
                .addGap(18, 18, 18)
                .addComponent(optVerde)
                .addGap(18, 18, 18)
                .addComponent(optAzul)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       String mensaje="Color elegido: ";
       if (optRojo.isSelected()) { 
           mensaje=mensaje+"Rojo"; 
       } else if (optVerde.isSelected()) { 
           mensaje=mensaje+"Verde"; 
       } else if (optAzul.isSelected()) {
           mensaje=mensaje+"Azul"; 
       } 
       etiResultado.setText(mensaje);
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JTextField etiResultado;
    private javax.swing.ButtonGroup grupoColores;
    private javax.swing.JRadioButton optAzul;
    private javax.swing.JRadioButton optRojo;
    private javax.swing.JRadioButton optVerde;
    private javax.swing.JPanel pnColores;
    // End of variables declaration//GEN-END:variables
}
