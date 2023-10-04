
package GUI;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author jefry
 */
public class Calculadora extends javax.swing.JFrame {

    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
private void limpiarCampos() {
        txtOperador.setText("");
        txtOperando.setText("");
        txtResultado.setText("");
    }
    
    private void calcular() {
        String operacionSeleccionada = (String) cbxOperaciones.getSelectedItem();
        double operador = Double.parseDouble(txtOperador.getText());
        double operando = Double.parseDouble(txtOperando.getText());
        double resultado = 0;

        switch (operacionSeleccionada) {
            case "Sumar":
                lblFuncion.setText("+");
                resultado = operador + operando;
                break;
            case "Restar":
                resultado = operador - operando;
                lblFuncion.setText("-");
                break;
            case "Multiplicar":
                resultado = operador * operando;
                lblFuncion.setText("*");
                break;
            case "Dividir":
                if (operando != 0) {
                    resultado = operador / operando;
                    lblFuncion.setText("/");
                } else {
                    JOptionPane.showMessageDialog(this, "No se puede dividir por cero.");
                }
                break;
        }

        // Mostrar el resultado en el JTextField txtResultado
        txtResultado.setText(Double.toString(resultado));
    }
    
    private void actualizarFuncion() {
        String operacionSeleccionada = (String) cbxOperaciones.getSelectedItem();
        switch (operacionSeleccionada) {
            case "Sumar":
                lblFuncion.setText("+");
                break;
            case "Restar":
                lblFuncion.setText("-");
                break;
            case "Multiplicar":
                lblFuncion.setText("*");
                break;
            case "Dividir":
                lblFuncion.setText("/");
                break;
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Main = new javax.swing.JPanel();
        Bar = new javax.swing.JPanel();
        lblPrograma = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblTipoOperacion = new javax.swing.JLabel();
        cbxOperaciones = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtOperador = new javax.swing.JTextField();
        txtOperando = new javax.swing.JTextField();
        lblFuncion = new javax.swing.JLabel();
        lblFuncion1 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        btnResultado = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setBackground(new java.awt.Color(204, 204, 204));

        Bar.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout BarLayout = new javax.swing.GroupLayout(Bar);
        Bar.setLayout(BarLayout);
        BarLayout.setHorizontalGroup(
            BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BarLayout.setVerticalGroup(
            BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        lblPrograma.setBackground(new java.awt.Color(204, 204, 204));
        lblPrograma.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblPrograma.setForeground(new java.awt.Color(0, 0, 0));
        lblPrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrograma.setText("Programa");

        lblSalir.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(0, 51, 51));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("Salir");

        lblTipoOperacion.setBackground(new java.awt.Color(204, 204, 204));
        lblTipoOperacion.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblTipoOperacion.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoOperacion.setText("Tipo de operacion a realizar: ");

        cbxOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una operacion", "Sumar", "Restar", "Multiplicar", "Dividir" }));
        cbxOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOperacionesActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Escriba el operador y el operando para realizar la operacion.");

        txtOperador.setBackground(new java.awt.Color(255, 255, 255));
        txtOperador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtOperador.setForeground(new java.awt.Color(0, 0, 0));
        txtOperador.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtOperando.setBackground(new java.awt.Color(255, 255, 255));
        txtOperando.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtOperando.setForeground(new java.awt.Color(0, 0, 0));
        txtOperando.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblFuncion.setBackground(new java.awt.Color(204, 204, 204));
        lblFuncion.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblFuncion.setForeground(new java.awt.Color(0, 0, 0));
        lblFuncion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuncion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFuncion1.setBackground(new java.awt.Color(204, 204, 204));
        lblFuncion1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblFuncion1.setForeground(new java.awt.Color(0, 0, 0));
        lblFuncion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuncion1.setText("=");
        lblFuncion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(0, 0, 0));
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnResultado.setBackground(new java.awt.Color(204, 204, 204));
        btnResultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResultado.setForeground(new java.awt.Color(0, 0, 0));
        btnResultado.setText("Realizar Operacion");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(MainLayout.createSequentialGroup()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTipoOperacion)
                        .addGap(18, 18, 18)
                        .addComponent(cbxOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOperando, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFuncion1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addComponent(Bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOperando, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFuncion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        this.calcular();
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void cbxOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOperacionesActionPerformed
        actualizarFuncion();
        limpiarCampos();
    }//GEN-LAST:event_cbxOperacionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bar;
    private javax.swing.JPanel Main;
    private javax.swing.JButton btnResultado;
    private javax.swing.JComboBox<String> cbxOperaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblFuncion;
    private javax.swing.JLabel lblFuncion1;
    private javax.swing.JLabel lblPrograma;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTipoOperacion;
    private javax.swing.JTextField txtOperador;
    private javax.swing.JTextField txtOperando;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
