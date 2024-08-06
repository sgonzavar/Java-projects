package Formularios;

import Clases.Datos;
import Clases.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmUsuarios extends javax.swing.JInternalFrame {

    private Datos misDatos;
    private int usuarioActual = 0;
    private boolean nuevo = false;
    private DefaultTableModel mitabla;

    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }

    public FrmUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtConfirmacion = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnPrimero = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_Tabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Usuarios");
        setToolTipText("");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("ID Usuario *:");

        txtIDUsuario.setEnabled(false);

        jLabel2.setText("Nombres *:");

        txtNombres.setEnabled(false);

        txtApellidos.setEnabled(false);

        jLabel3.setText("Apellidos *:");

        jLabel4.setText("Clave *:");

        txtClave.setEnabled(false);

        jLabel5.setText("Confirmacion *:");

        txtConfirmacion.setEnabled(false);

        jLabel6.setText("Perfil *:");

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Perfil", "Administrador ", "Empleado" }));
        cmbPerfil.setEnabled(false);

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/siguiente.png"))); // NOI18N
        btnSiguiente.setToolTipText("va al siguiente registro");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ultimo.png"))); // NOI18N
        btnUltimo.setToolTipText("va al ultimo registro");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/previo.png"))); // NOI18N
        btnAnterior.setToolTipText("va al aterior registro");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/anterior.png"))); // NOI18N
        btnPrimero.setToolTipText("va al primer registro");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442265740_edit_editor_pen_pencil_write.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar el registro actual");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442265718_add_cross_new_plus_create.png"))); // NOI18N
        btnNuevo.setToolTipText("Crea Nuevo Registro");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442265853_Download_save_down.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar cambios");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442265827_bin_cancel_close_cross_delete_empty_exit_garbage_minus_out_recycle_remove_trash.png"))); // NOI18N
        btnBorrar.setToolTipText("Borrar el registro actual");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442265808_find_in_magnifier_magnifying_research_search_view_zoom.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar el registro");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1442266562_close_delete_remove_icon.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar la operacion");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("*Campos Obligatorios");

        TBL_Tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TBL_Tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10)
                                .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAnterior)
                    .addComponent(btnGuardar)
                    .addComponent(btnPrimero)
                    .addComponent(btnBorrar)
                    .addComponent(btnBuscar)
                    .addComponent(btnSiguiente)
                    .addComponent(btnModificar)
                    .addComponent(btnUltimo)
                    .addComponent(btnNuevo)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //habilita los botones 
        btnPrimero.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnSiguiente.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);

        // habilita los campos
        txtIDUsuario.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtClave.setEnabled(true);
        txtConfirmacion.setEnabled(true);
        cmbPerfil.setEnabled(true);

        // limpiar campos
        txtIDUsuario.setText(null);
        txtNombres.setText(null);
        txtApellidos.setText(null);
        txtClave.setText(null);
        txtConfirmacion.setText(null);
        cmbPerfil.setSelectedIndex(0);

        //activamos el flag de registro nuevo
        nuevo = true;

        //Damos Foco al campo ID
        txtIDUsuario.requestFocusInWindow();// es para dejar el cursor en ID usuario

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //validaciones 
        if (txtIDUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE Digitar un ID.");
            txtIDUsuario.requestFocusInWindow();
            return;
        }

        if (cmbPerfil.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "DEBE Seleccionar Un Perfil.");
            cmbPerfil.requestFocusInWindow();
            return;
        }

        if (txtNombres.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE Digitar Un Nombre/s.");
            txtNombres.requestFocusInWindow();
            return;
        }

        if (txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE Digitar Sus Apellidos.");
            txtIDUsuario.requestFocusInWindow();
            return;
        }

        String Clave = new String(txtClave.getPassword());
        String Confirmacion = new String(txtConfirmacion.getPassword());

        if (Clave.equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE Digitar Una Clave");
            txtClave.requestFocusInWindow();
            return;
        }

        if (Confirmacion.equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE Digitar Una Confirmacion.");
            txtConfirmacion.requestFocusInWindow();
            return;
        }

        if (!Clave.equals(Confirmacion)) {
            JOptionPane.showMessageDialog(this, "No Coinciden Los Caracteres. ");
            txtClave.setText(null);
            txtConfirmacion.setText(null);
            txtClave.requestFocusInWindow();
            return;
        }

        // si es nuevo, validamos q no exista
        int posicion = misDatos.posicionUsuario(txtIDUsuario.getText());
        if (nuevo) {
            if (posicion != -1) {
                JOptionPane.showMessageDialog(this, "Usuario Ya Existe");
                txtIDUsuario.requestFocusInWindow();
                return;
            }
        } else {
            if (posicion == -1) {
                JOptionPane.showMessageDialog(this, "Usuario no Existe");
                txtIDUsuario.requestFocusInWindow();
                return;
            }
        }

        // creamos el objeto usuario y lo agregamos a datos.
        Usuario miUsuario = new Usuario(
                txtIDUsuario.getText(),
                txtNombres.getText(),
                txtApellidos.getText(),
                Clave,
                cmbPerfil.getSelectedIndex());

        String mensage;
        if (nuevo) {
            mensage = misDatos.agregarUsuario(miUsuario);
        } else {
            mensage = misDatos.modificarUsuario(miUsuario, posicion);
        }
        JOptionPane.showMessageDialog(rootPane, mensage);

        //deshabilita los botones 
        btnPrimero.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnSiguiente.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnModificar.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);

        // Deshabilita los campos
        txtIDUsuario.setEnabled(false);
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtClave.setEnabled(false);
        txtConfirmacion.setEnabled(false);
        cmbPerfil.setEnabled(false);
        //Actualizzamos los Cambios en la tabla
        llenarTabla();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //deshabilita los botones
        btnPrimero.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnSiguiente.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnModificar.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);

        // Deshabilita los campos
        txtIDUsuario.setEnabled(false);
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtClave.setEnabled(false);
        txtConfirmacion.setEnabled(false);
        cmbPerfil.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //habilita los botones 
        btnPrimero.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnSiguiente.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);

        // habilita los campos
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtClave.setEnabled(true);
        txtConfirmacion.setEnabled(true);
        cmbPerfil.setEnabled(true);

        //desactivamos el flag de registro nuevo
        nuevo = false;

        //Damos Foco al campo ID
        txtNombres.requestFocusInWindow();// es para dejar el cursor en ID usuario

    }//GEN-LAST:event_btnModificarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        mostrarRegistro();
        llenarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        usuarioActual = 0;
        mostrarRegistro();

    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        usuarioActual = misDatos.numeroUsuarios() - 1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        usuarioActual++;
        if (usuarioActual == misDatos.numeroUsuarios()) {
            usuarioActual = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        usuarioActual--;
        if (usuarioActual == -1) {
            usuarioActual = misDatos.numeroUsuarios() - 1;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int Respuesta = JOptionPane.showConfirmDialog(this, "Esta  Seguro De Borrar El Resgistro");
        if (Respuesta != 0) {
            return;
        }

        String mensage;
        mensage = misDatos.borrarUsuario(usuarioActual);
        JOptionPane.showMessageDialog(rootPane, mensage);
        usuarioActual = 0;
        mostrarRegistro();
        //Actualizzamos los Cambios en la tabla
        llenarTabla();

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String usuario = JOptionPane.showInputDialog("Ingrese Codigo De Usuario");
        if (usuario.equals(null)) {
            return;
        }
        int pos=misDatos.posicionUsuario(usuario);
        if(pos == -1) {
            JOptionPane.showMessageDialog(this, "Usuario No Existe");
            return;
        }
        usuarioActual = pos;
        mostrarRegistro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mostrarRegistro() {
        txtIDUsuario.setText(misDatos.getUsuario()[usuarioActual].getIdUsuario());
        txtNombres.setText(misDatos.getUsuario()[usuarioActual].getNombres());
        txtApellidos.setText(misDatos.getUsuario()[usuarioActual].getApellidos());
        txtClave.setText(misDatos.getUsuario()[usuarioActual].getClave());
        txtConfirmacion.setText(misDatos.getUsuario()[usuarioActual].getClave());
        cmbPerfil.setSelectedIndex(misDatos.getUsuario()[usuarioActual].getPerfil());

    }

    private void llenarTabla() {
        String titulos[] = {"ID Usuario", "Nombres", "Apellidos", "Perfil"};
        String registro[] = new String[4];
        mitabla = new DefaultTableModel(null, titulos);
        for (int i = 0; i < misDatos.numeroUsuarios(); i++) {
            registro[0] = misDatos.getUsuario()[i].getIdUsuario();
            registro[1] = misDatos.getUsuario()[i].getNombres();
            registro[2] = misDatos.getUsuario()[i].getApellidos();
            registro[3] = perfil(misDatos.getUsuario()[i].getPerfil());
            mitabla.addRow(registro);
        }
        TBL_Tabla.setModel(mitabla);
    }

    private String perfil(int idPerfil) {
        if (idPerfil == 1) {
            return "Administrador";
        } else {
            return "Empleado";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBL_Tabla;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cmbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JPasswordField txtConfirmacion;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
