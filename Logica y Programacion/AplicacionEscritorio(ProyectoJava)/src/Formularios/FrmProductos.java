package Formularios;

import Clases.Datos;
import Clases.Producto;
import Clases.Usuario;
import Clases.Utilidades;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmProductos extends javax.swing.JInternalFrame {

    private Datos misDatos;
    private int productoActual = 0;
    private boolean nuevo = false;
    private DefaultTableModel mitabla;

    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }

    public FrmProductos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
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
        cmbIva = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Productos");
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

        jLabel1.setText("ID Producto *:");

        txtIdProducto.setEnabled(false);

        jLabel2.setText("Descripción *:");

        txtDescripcion.setEnabled(false);

        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPrecio.setEnabled(false);

        jLabel3.setText("Precio *:");

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

        jLabel8.setText("IVA*:");

        cmbIva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0%", "10%", "16%", " ", " " }));
        cmbIva.setEnabled(false);
        cmbIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIvaActionPerformed(evt);
            }
        });

        jLabel4.setText("Nota:");

        txtNota.setColumns(20);
        txtNota.setRows(5);
        txtNota.setEnabled(false);
        jScrollPane2.setViewportView(txtNota);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
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
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbIva, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cmbIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
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
        txtIdProducto.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtNota.setEnabled(true);
        cmbIva.setEnabled(true);

        // limpiar campos
        txtIdProducto.setText(null);
        txtDescripcion.setText(null);
        txtPrecio.setText(null);
        txtNota.setText(null);
        cmbIva.setSelectedIndex(0);

        //activamos el flag de registro nuevo
        nuevo = true;

        //Damos Foco al campo ID
        txtIdProducto.requestFocusInWindow();// es para dejar el cursor en ID usuario

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //validaciones 
        if (txtIdProducto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE Digitar un ID.");
            txtIdProducto.requestFocusInWindow();
            return;
        }

        if (txtDescripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE Digitar Una Descripcion.");
            txtDescripcion.requestFocusInWindow();
            return;
        }

        if (txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE Digitar Un Precio.");
            txtIdProducto.requestFocusInWindow();
            return;
        }

        if (!Utilidades.esNumerico(txtPrecio.getText())) {
            JOptionPane.showMessageDialog(this, "DEBE Digitar Un Valor Numerico.");
            txtIdProducto.requestFocusInWindow();
            return;
        }

        int precio = Integer.parseInt(txtPrecio.getText());
        if (precio <= 0) {
            JOptionPane.showMessageDialog(this, "DEBE Digitar Un Valor Mayor Que Cero.");
            txtIdProducto.requestFocusInWindow();
            return;
        }

        // si es nuevo, validamos q no exista
        int posicion = misDatos.posicionProducto(txtIdProducto.getText());
        if (nuevo) {
            if (posicion != -1) {
                JOptionPane.showMessageDialog(this, "Producto Ya Existe");
                txtIdProducto.requestFocusInWindow();
                return;
            }
        } else {
            if (posicion == -1) {
                JOptionPane.showMessageDialog(this, "Producto no Existe");
                txtIdProducto.requestFocusInWindow();
                return;
            }
        }

        // creamos el objeto producto y lo agregamos a datos.
        Producto miProducto = new Producto(
                txtIdProducto.getText(),
                txtDescripcion.getText(),
                precio,
                cmbIva.getSelectedIndex(),
                txtNota.getText());

        String mensage;
        if (nuevo) {
            mensage = misDatos.agregarProducto(miProducto);
        } else {
            mensage = misDatos.modificarProducto(miProducto, posicion);
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
        txtIdProducto.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtNota.setEnabled(false);
        cmbIva.setEnabled(false);
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
        txtIdProducto.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtNota.setEnabled(false);
        cmbIva.setEnabled(false);
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
        txtDescripcion.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtNota.setEnabled(true);
        cmbIva.setEnabled(true);

        //desactivamos el flag de registro nuevo
        nuevo = false;

        //Damos Foco al campo ID
        txtDescripcion.requestFocusInWindow();// es para dejar el cursor en ID usuario

    }//GEN-LAST:event_btnModificarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        mostrarRegistro();
        llenarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        productoActual = 0;
        mostrarRegistro();

    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        productoActual = misDatos.numeroProductos() - 1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        productoActual++;
        if (productoActual == misDatos.numeroProductos()) {
            productoActual = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        productoActual--;
        if (productoActual == -1) {
            productoActual = misDatos.numeroProductos() - 1;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int Respuesta = JOptionPane.showConfirmDialog(this, "Esta  Seguro De Borrar El Resgistro");
        if (Respuesta != 0) {
            return;
        }

        String mensage;
        mensage = misDatos.borrarProducto(productoActual);
        JOptionPane.showMessageDialog(rootPane, mensage);
        productoActual = 0;
        mostrarRegistro();
        //Actualizzamos los Cambios en la tabla
        llenarTabla();

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String producto = JOptionPane.showInputDialog("Ingrese Codigo De Producto");
        if (producto.equals(null)) {
            return;
        }
        int pos = misDatos.posicionProducto(producto);
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Producto No Existe");
            return;
        }
        productoActual = pos;
        mostrarRegistro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIvaActionPerformed

    private void mostrarRegistro() {
        txtIdProducto.setText(misDatos.getProductos()[productoActual].getIdPrducto());
        txtDescripcion.setText(misDatos.getProductos()[productoActual].getDescripcion());
        txtPrecio.setText("" + misDatos.getProductos()[productoActual].getPrecio());
        txtNota.setText(misDatos.getProductos()[productoActual].getNota());
        cmbIva.setSelectedIndex(misDatos.getProductos()[productoActual].getIva());

    }

    private void llenarTabla() {
        String titulos[] = {"ID Producto", "Descripcion", "Precio", "IVA", "Nota"};
        String registro[] = new String[5];
        mitabla = new DefaultTableModel(null, titulos);
        for (int i = 0; i < misDatos.numeroProductos(); i++) {
            registro[0] = misDatos.getProductos()[i].getIdPrducto();
            registro[1] = misDatos.getProductos()[i].getDescripcion();
            registro[2] = ("" + misDatos.getProductos()[i].getPrecio());
            registro[3] = iva(misDatos.getProductos()[i].getIva());
            registro[4] = misDatos.getProductos()[i].getNota();
            mitabla.addRow(registro);
        }
        TBL_Tabla.setModel(mitabla);
    }

    private String iva(int idIva) {
        switch (idIva) {
            case 0:
                return "0%";

            case 1:
                return "10%";

            case 2:
                return "16%";
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
    private javax.swing.JComboBox cmbIva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextArea txtNota;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
