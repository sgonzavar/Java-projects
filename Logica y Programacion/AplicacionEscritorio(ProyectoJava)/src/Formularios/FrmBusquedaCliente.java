package Formularios;

import Clases.Datos;
import Clases.Utilidades;
import javax.swing.table.DefaultTableModel;

public class FrmBusquedaCliente extends javax.swing.JDialog {

    private Datos misDatos;
    private DefaultTableModel mitabla;
    private String Respuesta;

    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }

    public String getRespuesta() {
        return Respuesta;
    }

    private void llenarTabla() {
        String titulos[] = {"ID Cliente", "Nombres", "Apellidos"};
        String registro[] = new String[3];
        mitabla = new DefaultTableModel(null, titulos);

        if (txtCriterio.getText().equals("")) {
            for (int i = 0; i < misDatos.numeroClientes(); i++) {
                registro[0] = misDatos.getClientes()[i].getIdCliente();
                registro[1] = misDatos.getClientes()[i].getNombres();
                registro[2] = misDatos.getClientes()[i].getApellidos();
                mitabla.addRow(registro);
            }
            tblTabla.setModel(mitabla);
            return;
        }

        if (rbtNOMBRE.isSelected()) {
            for (int i = 0; i < misDatos.numeroClientes(); i++) {
                if (misDatos.getClientes()[i].getNombres().startsWith(txtCriterio.getText())) {
                    registro[0] = misDatos.getClientes()[i].getIdCliente();
                    registro[1] = misDatos.getClientes()[i].getNombres();
                    registro[2] = misDatos.getClientes()[i].getApellidos();
                    mitabla.addRow(registro);
                }
            }
            tblTabla.setModel(mitabla);
            return;
        }

        if (rbtApellido.isSelected()) {
            for (int i = 0; i < misDatos.numeroClientes(); i++) {
                if (misDatos.getClientes()[i].getApellidos().startsWith(txtCriterio.getText())) {
                    registro[0] = misDatos.getClientes()[i].getIdCliente();
                    registro[1] = misDatos.getClientes()[i].getNombres();
                    registro[2] = misDatos.getClientes()[i].getApellidos();
                    mitabla.addRow(registro);
                }
            }
            tblTabla.setModel(mitabla);
            return;
        }

        if (rbtID.isSelected()) {
            for (int i = 0; i < misDatos.numeroClientes(); i++) {
                if (misDatos.getClientes()[i].getIdCliente().startsWith(txtCriterio.getText())) {
                    registro[0] = misDatos.getClientes()[i].getIdCliente();
                    registro[1] = misDatos.getClientes()[i].getNombres();
                    registro[2] = misDatos.getClientes()[i].getApellidos();
                    mitabla.addRow(registro);
                }
            }
            tblTabla.setModel(mitabla);
        }
    }

    public FrmBusquedaCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        bgrTipoBusqueda.add(rbtID);
        bgrTipoBusqueda.add(rbtNOMBRE);
        bgrTipoBusqueda.add(rbtApellido);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrTipoBusqueda = new javax.swing.ButtonGroup();
        rbtID = new javax.swing.JRadioButton();
        rbtNOMBRE = new javax.swing.JRadioButton();
        rbtApellido = new javax.swing.JRadioButton();
        txtCriterio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        rbtID.setText("ID");
        rbtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtIDActionPerformed(evt);
            }
        });

        rbtNOMBRE.setText("Nombres");
        rbtNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNOMBREActionPerformed(evt);
            }
        });

        rbtApellido.setText("Apellidos");
        rbtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtApellidoActionPerformed(evt);
            }
        });

        txtCriterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCriterioActionPerformed(evt);
            }
        });
        txtCriterio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCriterioKeyTyped(evt);
            }
        });

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442209770_Delete.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442209744_Check.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(rbtID)
                        .addGap(20, 20, 20)
                        .addComponent(rbtNOMBRE)
                        .addGap(18, 18, 18)
                        .addComponent(rbtApellido)
                        .addGap(0, 167, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtCriterio))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtID)
                    .addComponent(rbtNOMBRE)
                    .addComponent(rbtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtApellidoActionPerformed
        txtCriterio.setText("");
        txtCriterio.requestFocusInWindow();
        llenarTabla();
    }//GEN-LAST:event_rbtApellidoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        llenarTabla();
        txtCriterio.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void rbtNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNOMBREActionPerformed
        txtCriterio.setText("");
        txtCriterio.requestFocusInWindow();
        llenarTabla();
    }//GEN-LAST:event_rbtNOMBREActionPerformed

    private void rbtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtIDActionPerformed
        txtCriterio.setText("");
        txtCriterio.requestFocusInWindow();
        llenarTabla();
    }//GEN-LAST:event_rbtIDActionPerformed

    private void txtCriterioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCriterioKeyTyped
       // llenarTabla();
    }//GEN-LAST:event_txtCriterioKeyTyped

    private void txtCriterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCriterioActionPerformed
        llenarTabla();
    }//GEN-LAST:event_txtCriterioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Respuesta = "";
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int num = tblTabla.getRowCount();
        if (num == 0) {
            Respuesta = "";
            dispose();
            return;
        }

        for (int i = 0; i < num; i++) {
            if (tblTabla.isRowSelected(i)) {
                Respuesta = Utilidades.objectToString(tblTabla.getValueAt(i, 0));
                dispose();
                return;
            }
        }
        Respuesta = Utilidades.objectToString(tblTabla.getValueAt(0, 0));
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmBusquedaCliente dialog = new FrmBusquedaCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrTipoBusqueda;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtApellido;
    private javax.swing.JRadioButton rbtID;
    private javax.swing.JRadioButton rbtNOMBRE;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtCriterio;
    // End of variables declaration//GEN-END:variables
}
