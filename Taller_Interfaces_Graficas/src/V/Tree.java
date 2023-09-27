package V;

import javax.swing.JOptionPane;
import javax.swing.tree.*;

/**
 *
 * @author jefry
 */
public class Tree extends javax.swing.JDialog {

    DefaultMutableTreeNode Titulo = null;
    DefaultTreeModel modelo = null;

    public Tree(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jTree1.setModel(cargarArbol());
    }

    public DefaultTreeModel cargarArbol() {
        DefaultMutableTreeNode categorias = null;
        DefaultMutableTreeNode subcategoria = null;
        Titulo = new DefaultMutableTreeNode("Centro de Administración");
        modelo = new DefaultTreeModel(Titulo);
        categorias = new DefaultMutableTreeNode("Adm. Redes");
        subcategoria = new DefaultMutableTreeNode("Dept. de planificación");
        modelo.insertNodeInto(categorias, Titulo, 0);
        modelo.insertNodeInto(subcategoria, categorias, 0);
        categorias = new DefaultMutableTreeNode("Adm. de Laboratorios");
        subcategoria = new DefaultMutableTreeNode("Dept. de Tecnologia");
        modelo.insertNodeInto(categorias, Titulo, 1);
        modelo.insertNodeInto(subcategoria, categorias, 0);
        categorias = new DefaultMutableTreeNode("Dept. de Investigación");
        subcategoria = new DefaultMutableTreeNode("Dept. A");
        modelo.insertNodeInto(categorias, Titulo, 2);
        modelo.insertNodeInto(subcategoria, categorias, 0);
        return modelo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        btnAñadir = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(jTree1);

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnInfo.setText("Informacion");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnAñadir)
                .addGap(18, 18, 18)
                .addComponent(btnRemover)
                .addGap(18, 18, 18)
                .addComponent(btnInfo)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAñadir)
                    .addComponent(btnRemover)
                    .addComponent(btnInfo)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String cadena = JOptionPane.showInputDialog(this, "Ingrese un departamento");
        DefaultMutableTreeNode parentNodo = null;
        TreePath parentPath = jTree1.getSelectionPath();
        if (parentPath == null) {
        } else {
            parentNodo = (DefaultMutableTreeNode) parentPath.getLastPathComponent();
        }
        DefaultMutableTreeNode child = new DefaultMutableTreeNode(cadena);
        modelo.insertNodeInto(child, parentNodo, parentNodo.getChildCount());
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        DefaultMutableTreeNode parentNode = null;
        TreePath currentSelection = jTree1.getSelectionPath();
        if (currentSelection != null) {
            parentNode = (DefaultMutableTreeNode) currentSelection.getLastPathComponent();
            DefaultTreeModel model = ((DefaultTreeModel) jTree1.getModel());
            model.removeNodeFromParent(parentNode);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        if (node == null) //Nothing is selected.
        {
            return;
        }
        Object nodeInfo = node.getUserObject();
        JOptionPane.showMessageDialog(this, nodeInfo.toString());
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        if (node == null) //Nothing is selected.
        {
            return;
        }
        Object nodeInfo = node.getUserObject();
        String cadena = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre", nodeInfo.toString());
        TreePath currentSelection = jTree1.getSelectionPath();
        if (currentSelection != null) {
            node = (DefaultMutableTreeNode) currentSelection.getLastPathComponent();
            node.setUserObject(cadena);
            DefaultTreeModel model = ((DefaultTreeModel) jTree1.getModel());
            model.nodeChanged(node);
        }
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
