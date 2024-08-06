package demodos;

import javax.swing.JOptionPane;

public class Operacion extends javax.swing.JFrame {

    public Operacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        txtnumero1 = new javax.swing.JTextField();
        txtnumero2 = new javax.swing.JTextField();
        btnsumar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtresultado = new javax.swing.JTextField();
        btn_resta = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JToggleButton();
        btn_cerrar = new javax.swing.JButton();
        txt_Basica = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumero1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 34, 140, 29));

        txtnumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumero2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 69, 140, 29));

        btnsumar.setBackground(new java.awt.Color(0, 0, 0));
        btnsumar.setForeground(new java.awt.Color(0, 255, 255));
        btnsumar.setText("Sumar");
        btnsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumarActionPerformed(evt);
            }
        });
        getContentPane().add(btnsumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel1.setText("Numero 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, 88, 29));

        jLabel2.setText("Numero 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 88, 29));

        jLabel3.setText("Resultado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 108, 88, 23));

        txtresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresultadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 104, 140, 30));

        btn_resta.setBackground(new java.awt.Color(0, 0, 0));
        btn_resta.setForeground(new java.awt.Color(0, 255, 255));
        btn_resta.setText("Resta");
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 140, -1, -1));

        btn_multiplicacion.setBackground(new java.awt.Color(0, 0, 0));
        btn_multiplicacion.setForeground(new java.awt.Color(0, 255, 255));
        btn_multiplicacion.setText("multiplicacion");
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 140, -1, -1));

        btn_division.setBackground(new java.awt.Color(0, 0, 0));
        btn_division.setForeground(new java.awt.Color(0, 255, 255));
        btn_division.setText("Division");
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 140, -1, -1));

        btn_actualizar.setBackground(new java.awt.Color(0, 0, 0));
        btn_actualizar.setForeground(new java.awt.Color(0, 255, 255));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 37, -1, -1));

        btn_cerrar.setBackground(new java.awt.Color(0, 0, 0));
        btn_cerrar.setForeground(new java.awt.Color(0, 255, 255));
        btn_cerrar.setText("cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 72, 80, -1));

        txt_Basica.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txt_Basica.setText("Calculadora basica");
        getContentPane().add(txt_Basica, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 0, 158, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2011-graffiti-alphabet-9.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 350, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumero1ActionPerformed

    }//GEN-LAST:event_txtnumero1ActionPerformed

    private void btnsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumarActionPerformed
        // TODO add your handling code here:
         Object suma;
        suma = (Integer.parseInt(txtnumero1.getText()) + Integer.parseInt(txtnumero2.getText()));
        txtresultado.setText(suma.toString());   
    }//GEN-LAST:event_btnsumarActionPerformed
     
    private void txtresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresultadoActionPerformed
             
    }//GEN-LAST:event_txtresultadoActionPerformed

    private void txtnumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumero2ActionPerformed
       
    }//GEN-LAST:event_txtnumero2ActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        txtnumero1.setText(null);
        txtnumero2.setText(null);
        txtresultado.setText(null);
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
       Object resta;
        resta = (Integer.parseInt(txtnumero1.getText()) - Integer.parseInt(txtnumero2.getText()));
        txtresultado.setText(resta.toString());
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        Object multiplica;
        multiplica = (Integer.parseInt(txtnumero1.getText()) * Integer.parseInt(txtnumero2.getText()));
        txtresultado.setText(multiplica.toString());
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
       Object dividir;
        if(Integer.parseInt(txtnumero2.getText()) == 0){
           JOptionPane.showMessageDialog(this, "Division Por Cero No Se Ejecuta");
        }else{
            dividir = (Integer.parseInt(txtnumero1.getText()) / Integer.parseInt(txtnumero2.getText()));
        txtresultado.setText(dividir.toString());
        }
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
         if(JOptionPane.showConfirmDialog(this," ¿Esta Seguro De Cerrar? ", " CERRAR ",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btn_cerrarActionPerformed
       
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Operacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operacion().setVisible(true);
            }
        });   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_actualizar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btnsumar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txt_Basica;
    private javax.swing.JTextField txtnumero1;
    private javax.swing.JTextField txtnumero2;
    private javax.swing.JTextField txtresultado;
    // End of variables declaration//GEN-END:variables
}
