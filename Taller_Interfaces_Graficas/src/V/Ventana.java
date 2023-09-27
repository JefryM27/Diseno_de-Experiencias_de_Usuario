
package V;

/**
 *
 * @author jefry
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        miRadioButton = new javax.swing.JMenu();
        miCheckBox = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        JList = new javax.swing.JMenuItem();
        JTree = new javax.swing.JMenuItem();
        JTable = new javax.swing.JMenuItem();
        JProcessBar = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        miRadioButton.setText("Opciones");

        miCheckBox.setText("CheckBox");
        miCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCheckBoxActionPerformed(evt);
            }
        });
        miRadioButton.add(miCheckBox);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("RadioButton");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        miRadioButton.add(jRadioButtonMenuItem1);

        JList.setText("JList");
        JList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JListActionPerformed(evt);
            }
        });
        miRadioButton.add(JList);

        JTree.setText("Tree");
        JTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTreeActionPerformed(evt);
            }
        });
        miRadioButton.add(JTree);

        JTable.setText("Tabla");
        JTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTableActionPerformed(evt);
            }
        });
        miRadioButton.add(JTable);

        JProcessBar.setText("Barra");
        JProcessBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JProcessBarActionPerformed(evt);
            }
        });
        miRadioButton.add(JProcessBar);

        jMenuBar1.add(miRadioButton);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void miCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCheckBoxActionPerformed
        CheckBox ventanaSecundaria;
        ventanaSecundaria = new CheckBox(this, true);
        ventanaSecundaria.pack();
        ventanaSecundaria.setVisible(true);
    }//GEN-LAST:event_miCheckBoxActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        Colores ventana3;
        ventana3 = new Colores(this, true);
        ventana3.pack();
        ventana3.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void JListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JListActionPerformed
        Lista lista;
        lista = new Lista(this, true);
        lista.pack();
        lista.setVisible(true);
    }//GEN-LAST:event_JListActionPerformed

    private void JTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTreeActionPerformed
        Tree arbol;
        arbol = new Tree(this, true);
        arbol.pack();
        arbol.setVisible(true);
    }//GEN-LAST:event_JTreeActionPerformed

    private void JTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTableActionPerformed
        Tabla tabla;
        tabla = new Tabla(this, true);
        tabla.pack();
        tabla.setVisible(true);
    }//GEN-LAST:event_JTableActionPerformed

    private void JProcessBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JProcessBarActionPerformed
        Barra barra;
        barra = new Barra(this, true);
        barra.pack();
        barra.setVisible(true);
    }//GEN-LAST:event_JProcessBarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JList;
    private javax.swing.JMenuItem JProcessBar;
    private javax.swing.JMenuItem JTable;
    private javax.swing.JMenuItem JTree;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenuItem miCheckBox;
    private javax.swing.JMenu miRadioButton;
    // End of variables declaration//GEN-END:variables
}
