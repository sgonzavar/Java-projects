package Formularios;

import Clases.Clientes;
import Clases.Datos;
import Clases.Producto;
import Clases.Usuario;
import Clases.Utilidades;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmClientes extends javax.swing.JInternalFrame {

    private Datos misDatos;
    private int clienteActual = 0;
    private boolean nuevo = false;
    private DefaultTableModel mitabla;

    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }

    public FrmClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
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
        jLabel8 = new javax.swing.JLabel();
        cmbTpoId = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbCuidad = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dchFechaNacimiento = new com.toedter.calendar.JDateChooser();
        dchFechaIngreso = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cliente");
        setToolTipText("");
        setEnabled(false);
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

        jLabel1.setText("ID Cliente *:");

        txtIdCliente.setEnabled(false);

        jLabel2.setText("Nombres *:");

        txtNombres.setEnabled(false);

        txtApellidos.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidos.setEnabled(false);

        jLabel3.setText("Apellidos *:");

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

        jLabel8.setText("Tipo De Identificacion*:");

        cmbTpoId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Tipo", "Cédula Ciudadania ", "NIT", "Tarjeta De Identidad", "Registro Civil", "Cédula Extrangería", "Pasaporte", " " }));
        cmbTpoId.setEnabled(false);
        cmbTpoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTpoIdActionPerformed(evt);
            }
        });

        jLabel4.setText("Direccion");

        txtDireccion.setEnabled(false);

        txtTelefono.setEnabled(false);

        jLabel5.setText("Teléfono:");

        jLabel9.setText("Ciudad:");

        cmbCuidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Una Cuidad", "Medellin", "Bogotá", "Cali", "Barranquilla", "Bucaramanga", "Cucuta", "Santa Marta", "Popayan", " " }));
        cmbCuidad.setEnabled(false);
        cmbCuidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuidadActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha De  Nacimiento:");

        jLabel10.setText("Fecha De  Ingreso:");

        dchFechaNacimiento.setEnabled(false);

        dchFechaIngreso.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTpoId, 0, 133, Short.MAX_VALUE))
                            .addComponent(txtNombres)
                            .addComponent(txtApellidos)
                            .addComponent(txtDireccion)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefono)
                                    .addComponent(dchFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dchFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCuidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
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
                                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTpoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
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
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cmbCuidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dchFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dchFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(11, 11, 11)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
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
        txtIdCliente.setEnabled(true);
        cmbTpoId.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
        cmbCuidad.setEnabled(true);
        dchFechaNacimiento.setEnabled(true);

        // limpiar campos
        txtIdCliente.setText(null);
        cmbTpoId.setSelectedIndex(0);
        txtNombres.setText(null);
        txtApellidos.setText(null);
        txtDireccion.setText(null);
        txtTelefono.setText(null);
        cmbCuidad.setSelectedIndex(0);
        dchFechaNacimiento.setDate(new Date());
        dchFechaIngreso.setDate(new Date());

        //activamos el flag de registro nuevo
        nuevo = true;

        //Damos Foco al campo ID
        txtIdCliente.requestFocusInWindow();// es para dejar el cursor en ID Cliente

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //validaciones 
        if (txtIdCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE Digitar un ID.");
            txtIdCliente.requestFocusInWindow();
            return;
        }
        
        if (cmbTpoId.getSelectedIndex() == 0 ) {
            JOptionPane.showMessageDialog(this, "DEBE Seleccionar Un Tipo De Identificacion.");
            cmbTpoId.requestFocusInWindow();
            return;
        }

        if (txtNombres.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE Digitar Un Nombre/s.");
            txtNombres.requestFocusInWindow();
            return;
        }

        if (txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE Digitar Un Apellido/s.");
            txtApellidos.requestFocusInWindow();
            return;
        }

        if (dchFechaNacimiento.getDate().after(new Date())) {
            JOptionPane.showMessageDialog(this, "DEBE Seleccionar Una Fecha De "
                    + "Nacimiento Antes Que La Actual.");
            dchFechaNacimiento.requestFocusInWindow();
            return;
        }

        
        // si es nuevo, validamos q no exista
        int posicion = misDatos.posicionCliente(txtIdCliente.getText());
        if (nuevo) {
            if (posicion != -1) {
                JOptionPane.showMessageDialog(this, "Cliente Ya Existe");
                txtIdCliente.requestFocusInWindow();
                return;
            }
        } else {
            if (posicion == -1) {
                JOptionPane.showMessageDialog(this, "Cliente no Existe");
                txtIdCliente.requestFocusInWindow();
                return;
            }
        }

        // creamos el objeto Cliente y lo agregamos a datos.
        Clientes miCliente = new Clientes(txtIdCliente.getText(),
                cmbTpoId.getSelectedIndex(), txtNombres.getText(),
                txtApellidos.getText(), txtDireccion.getText(),
                txtTelefono.getText(), cmbCuidad.getSelectedIndex(),
                dchFechaNacimiento.getDate(), dchFechaIngreso.getDate());
        String mensage;
        if (nuevo) {
            mensage = misDatos.agregarCliente(miCliente);
        } else {
            mensage = misDatos.modificarCliente(miCliente, posicion);
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
         txtIdCliente.setEnabled(false);
        cmbTpoId.setEnabled(false);
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTelefono.setEnabled(false);
        cmbCuidad.setEnabled(false);
        dchFechaNacimiento.setEnabled(false);
        dchFechaIngreso.setEnabled(false);
        
        //Actualizamos los Cambios en la tabla
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
        txtIdCliente.setEnabled(false);
        cmbTpoId.setEnabled(false);
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTelefono.setEnabled(false);
        cmbCuidad.setEnabled(false);
        dchFechaNacimiento.setEnabled(false);
        dchFechaIngreso.setEnabled(false);
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
        cmbTpoId.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
        cmbCuidad.setEnabled(true);
        dchFechaNacimiento.setEnabled(true);

        //desactivamos el flag de registro nuevo
        nuevo = false;

        //Damos Foco al campo ID
        cmbTpoId.requestFocusInWindow();// es para dejar el cursor en ID usuario

    }//GEN-LAST:event_btnModificarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        mostrarRegistro();
        llenarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        clienteActual = 0;
        mostrarRegistro();

    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        clienteActual = misDatos.numeroClientes()- 1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        clienteActual++;
        if (clienteActual == misDatos.numeroClientes()) {
            clienteActual = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        clienteActual--;
        if (clienteActual == -1) {
            clienteActual = misDatos.numeroClientes() - 1;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int Respuesta = JOptionPane.showConfirmDialog(this, "Esta  Seguro De Borrar El Resgistro");
        if (Respuesta != 0) {
            return;
        }

        String mensage;
        mensage = misDatos.borrarCliente(clienteActual);
        JOptionPane.showMessageDialog(rootPane, mensage);
        clienteActual = 0;
        mostrarRegistro();
        //Actualizzamos los Cambios en la tabla
        llenarTabla();

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String Cliente = JOptionPane.showInputDialog("Ingrese Codigo De Cliente");
        if (Cliente.equals(null)) {
            return;
        }
        int pos = misDatos.posicionCliente(Cliente);
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Cliente No Existe");
            return;
        }
        clienteActual = pos;
        mostrarRegistro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbTpoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTpoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTpoIdActionPerformed
 
    private void cmbCuidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCuidadActionPerformed

    private void mostrarRegistro() {
        txtIdCliente.setText(misDatos.getClientes()[clienteActual].getIdCliente());
        cmbTpoId.setSelectedIndex(misDatos.getClientes()[clienteActual].getTipoIdentificacion());   
        txtNombres.setText(misDatos.getClientes()[clienteActual].getNombres());
        txtApellidos.setText(misDatos.getClientes()[clienteActual].getApellidos());
        txtDireccion.setText(misDatos.getClientes()[clienteActual].getDireccion());
        txtTelefono.setText(misDatos.getClientes()[clienteActual].getTelefono());
        cmbCuidad.setSelectedIndex(misDatos.getClientes()[clienteActual].getIdCiudad());
        dchFechaNacimiento.setDate(misDatos.getClientes()[clienteActual].getFechaNacimiento());
        dchFechaIngreso.setDate(misDatos.getClientes()[clienteActual].getFechaIngreso());
        
    }

      private void llenarTabla() {
        String titulos[] = {"ID Cliente","Tipo Id", "Nombre", "Apellido", 
            "Direccion", "Telefono","Cuidad", "F. Nacimiento", "F. Ingreso"};
        String registro[] = new String[9];
        mitabla = new DefaultTableModel(null, titulos);
        for (int i = 0; i < misDatos.numeroClientes(); i++) {
            registro[0] = misDatos.getClientes()[i].getIdCliente();
            registro[1] = tipoIdentificacion(misDatos.getClientes()[i].getTipoIdentificacion());
            registro[2] = misDatos.getClientes()[i].getNombres();
            registro[3] = misDatos.getClientes()[i].getApellidos();
            registro[4] = misDatos.getClientes()[i].getDireccion();
            registro[5] = misDatos.getClientes()[i].getTelefono();
            registro[6] = tipoCiudad(misDatos.getClientes()[i].getIdCiudad());
            registro[7] = "" + misDatos.getClientes()[i].getFechaNacimiento();
            registro[8] = "" + misDatos.getClientes()[i].getFechaIngreso();
            
            mitabla.addRow(registro);
        }
        TBL_Tabla.setModel(mitabla);
    }

    private String tipoCiudad(int Ciudad) {
        switch (Ciudad) {
            case 0:
                return "";
            case 1:
                return "Medellin";
            case 2:
                return "Bogotá";
            case 3:
                return "Cali";
            case 4:
                return "Barranquilla";
            case 5:
                return "Bucaraganga";
            case 6:
                return "Cúcuta";
            case 7:
                return "Santa Marta";
            case 8:
                return "Popayan";
            default:
                return "No Definido";
        }
    }
    
    
   private String tipoIdentificacion(int idTipo) {
        switch (idTipo) {
            case 0:
                return "";
            case 1:
                return "Cédula De Ciudadania";
            case 2:
                return "NIT";
            case 3:
                return "Tarjeta De Identidad";
            case 4:
                return "Registro Civil";
            case 5:
                return "Cédula De Ciudadania";
            case 6:
                return "Pasaporte";
            default:
                return "No Definido";
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
    private javax.swing.JComboBox cmbCuidad;
    private javax.swing.JComboBox cmbTpoId;
    private com.toedter.calendar.JDateChooser dchFechaIngreso;
    private com.toedter.calendar.JDateChooser dchFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
