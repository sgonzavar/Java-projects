package Formularios;

import Clases.Datos;
import Clases.DesktopConFondo;

public class FrmPrincipal extends javax.swing.JFrame {

    private int perfil;
    private String clave;
    private String Usuario;
    private Datos misDatos;

    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }

    public void setUsuario(String usuario) {
        this.Usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public FrmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnEscritorio = new DesktopConFondo ();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuArchivoClientes = new javax.swing.JMenuItem();
        mnuArchivoProductos = new javax.swing.JMenuItem();
        mnuArchivoUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArchivoCambioClave = new javax.swing.JMenuItem();
        mnuArchivoCambioUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuArchivoSalir = new javax.swing.JMenuItem();
        mnuMovimientos = new javax.swing.JMenu();
        mnuMovimientosNuevaFactura = new javax.swing.JMenuItem();
        mnuMovimientosReporteFactura = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAyudaAcercaDe = new javax.swing.JMenuItem();
        mnuAyudaAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Facturación");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout dpnEscritorioLayout = new javax.swing.GroupLayout(dpnEscritorio);
        dpnEscritorio.setLayout(dpnEscritorioLayout);
        dpnEscritorioLayout.setHorizontalGroup(
            dpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        dpnEscritorioLayout.setVerticalGroup(
            dpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        mnuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442216833_archive.png"))); // NOI18N
        mnuArchivo.setText("Archivo");

        mnuArchivoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442218326_User.png"))); // NOI18N
        mnuArchivoClientes.setText("Clientes");
        mnuArchivoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoClientesActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoClientes);

        mnuArchivoProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442218451_file-roller.png"))); // NOI18N
        mnuArchivoProductos.setText("Productos");
        mnuArchivoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoProductosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoProductos);

        mnuArchivoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442260999_administrator.png"))); // NOI18N
        mnuArchivoUsuarios.setText("Usuarios");
        mnuArchivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoUsuariosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoUsuarios);
        mnuArchivo.add(jSeparator1);

        mnuArchivoCambioClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442261111_gnome-keyring-manager.png"))); // NOI18N
        mnuArchivoCambioClave.setText("Cambio Clave");
        mnuArchivoCambioClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoCambioClaveActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoCambioClave);

        mnuArchivoCambioUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnuArchivoCambioUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442261190_Refresh.png"))); // NOI18N
        mnuArchivoCambioUsuario.setText("Cambio de usuario");
        mnuArchivoCambioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoCambioUsuarioActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoCambioUsuario);
        mnuArchivo.add(jSeparator2);

        mnuArchivoSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuArchivoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442260779_exit.png"))); // NOI18N
        mnuArchivoSalir.setText("Salir");
        mnuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoSalir);

        jMenuBar1.add(mnuArchivo);

        mnuMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442217370_Money-Graph.png"))); // NOI18N
        mnuMovimientos.setText("Movimietos");

        mnuMovimientosNuevaFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442261318_invoice.png"))); // NOI18N
        mnuMovimientosNuevaFactura.setText("Nueva Factura");
        mnuMovimientosNuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMovimientosNuevaFacturaActionPerformed(evt);
            }
        });
        mnuMovimientos.add(mnuMovimientosNuevaFactura);

        mnuMovimientosReporteFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442261410_sales-report.png"))); // NOI18N
        mnuMovimientosReporteFactura.setText("Reporte De Factura");
        mnuMovimientos.add(mnuMovimientosReporteFactura);

        jMenuBar1.add(mnuMovimientos);

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442217642_Help.png"))); // NOI18N
        mnuAyuda.setText("Ayuda");

        mnuAyudaAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442261686_info-b.png"))); // NOI18N
        mnuAyudaAcercaDe.setText("Acerca de ");
        mnuAyudaAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAyudaAcercaDeActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAyudaAcercaDe);

        mnuAyudaAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442261678_help_forum-lb.png"))); // NOI18N
        mnuAyudaAyuda.setText("Ayuda");
        mnuAyudaAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAyudaAyudaActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAyudaAyuda);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArchivoCambioClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoCambioClaveActionPerformed

        FrmCambioClave miCambio = new FrmCambioClave(this, rootPaneCheckingEnabled);
        miCambio.setClave(clave);
        miCambio.setUsuario(Usuario);
        miCambio.setDatos(misDatos);
        miCambio.setLocationRelativeTo(this);
        miCambio.setVisible(rootPaneCheckingEnabled);
        

    }//GEN-LAST:event_mnuArchivoCambioClaveActionPerformed

    private void mnuArchivoCambioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoCambioUsuarioActionPerformed
        this.setVisible(false);
        FrmLogin milogin = new FrmLogin();

        milogin.setDatos(misDatos);
        milogin.setLocationRelativeTo(null);
        milogin.setVisible(true);
    }//GEN-LAST:event_mnuArchivoCambioUsuarioActionPerformed

    private void mnuArchivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoUsuariosActionPerformed
        FrmUsuarios misUsuarios = new FrmUsuarios();
        misUsuarios.setDatos(misDatos);
        dpnEscritorio.add(misUsuarios);//se agrega al menu de usuarios
        misUsuarios.show();// se muestra en el menu de usuarios

    }//GEN-LAST:event_mnuArchivoUsuariosActionPerformed

    private void mnuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoSalirActionPerformed
        misDatos.grabarTodo();
        System.exit(0);
    }//GEN-LAST:event_mnuArchivoSalirActionPerformed

    private void mnuArchivoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoProductosActionPerformed
        FrmProductos misProductos = new FrmProductos();
        misProductos.setDatos(misDatos);
        dpnEscritorio.add(misProductos);//se agrega al menu de productos
        misProductos.show();// se muestra en el menu de productos
    }//GEN-LAST:event_mnuArchivoProductosActionPerformed

    private void mnuArchivoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoClientesActionPerformed
        FrmClientes misClientes = new FrmClientes();
        misClientes.setDatos(misDatos);
        dpnEscritorio.add(misClientes);
        misClientes.show();
    }//GEN-LAST:event_mnuArchivoClientesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // establece una imagen de fonfo
        ((DesktopConFondo) dpnEscritorio).setImagen("/Imagen/nueva_york.jpg");

        // establece permisos 
        if (perfil == 2) {  // si es empleado, eliminamos permisos
            mnuArchivoClientes.setEnabled(false);
            mnuArchivoProductos.setEnabled(false);
            mnuArchivoUsuarios.setEnabled(false);
            mnuMovimientosReporteFactura.setEnabled(false);

        }


    }//GEN-LAST:event_formWindowOpened

    private void mnuAyudaAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAyudaAcercaDeActionPerformed
        frmAcercaDe miAcerca = new frmAcercaDe(this, rootPaneCheckingEnabled);
        miAcerca.setLocationRelativeTo(this);
        miAcerca.setVisible(true);
    }//GEN-LAST:event_mnuAyudaAcercaDeActionPerformed

    private void mnuAyudaAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAyudaAyudaActionPerformed
       FrmAyuda miAyuda = new FrmAyuda(this, rootPaneCheckingEnabled);
       miAyuda.setLocationRelativeTo(this);
       miAyuda.setVisible(true);
    }//GEN-LAST:event_mnuAyudaAyudaActionPerformed

    private void mnuMovimientosNuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMovimientosNuevaFacturaActionPerformed
        FrmFactura miFactura = new FrmFactura();
        miFactura.setDatos(misDatos);
        dpnEscritorio.add(miFactura);
        miFactura.show();
    }//GEN-LAST:event_mnuMovimientosNuevaFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuItem mnuArchivoCambioClave;
    private javax.swing.JMenuItem mnuArchivoCambioUsuario;
    private javax.swing.JMenuItem mnuArchivoClientes;
    private javax.swing.JMenuItem mnuArchivoProductos;
    private javax.swing.JMenuItem mnuArchivoSalir;
    private javax.swing.JMenuItem mnuArchivoUsuarios;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuAyudaAcercaDe;
    private javax.swing.JMenuItem mnuAyudaAyuda;
    private javax.swing.JMenu mnuMovimientos;
    private javax.swing.JMenuItem mnuMovimientosNuevaFactura;
    private javax.swing.JMenuItem mnuMovimientosReporteFactura;
    // End of variables declaration//GEN-END:variables
}
/*hgjhwmjrefhw4,kgtje5myhnj cftgtty
*/
