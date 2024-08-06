package calculadora;

public class Calculadora_ extends javax.swing.JFrame {

    String numero_Uno, numero_Dos, signo;

    public Calculadora_() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Pantalla = new javax.swing.JTextField();
        btn_numeroSiete = new javax.swing.JButton();
        btn_numeroCuatro = new javax.swing.JButton();
        btn_numeroUno = new javax.swing.JButton();
        btn_cambiaSignos = new javax.swing.JButton();
        btn_numeroOcho = new javax.swing.JButton();
        btn_numeroCinco = new javax.swing.JButton();
        btn_numeroDos = new javax.swing.JButton();
        btn_numeroCero = new javax.swing.JButton();
        btn_numeroNueve = new javax.swing.JButton();
        btn_numeroSeis = new javax.swing.JButton();
        btn_numeroTres = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        bnt_suma = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_multiplicador = new javax.swing.JButton();
        btn_dividido = new javax.swing.JButton();
        btn_borrarUnCaracter = new javax.swing.JButton();
        btn_borrarTodo = new javax.swing.JButton();
        btn_divisionInversa = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setName("Calculadora"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Pantalla.setBackground(new java.awt.Color(0, 0, 0));
        txt_Pantalla.setForeground(new java.awt.Color(255, 255, 255));
        txt_Pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_Pantalla.setName(""); // NOI18N
        getContentPane().add(txt_Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 343, 29));

        btn_numeroSiete.setBackground(new java.awt.Color(0, 0, 0));
        btn_numeroSiete.setForeground(new java.awt.Color(1, 252, 236));
        btn_numeroSiete.setText("7");
        btn_numeroSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numeroSieteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_numeroSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 81, 63, 49));

        btn_numeroCuatro.setBackground(new java.awt.Color(0, 0, 0));
        btn_numeroCuatro.setForeground(new java.awt.Color(1, 252, 236));
        btn_numeroCuatro.setText("4");
        btn_numeroCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numeroCuatroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_numeroCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 136, 63, 49));

        btn_numeroUno.setBackground(new java.awt.Color(0, 0, 0));
        btn_numeroUno.setForeground(new java.awt.Color(1, 252, 236));
        btn_numeroUno.setText("1");
        btn_numeroUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numeroUnoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_numeroUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 191, 63, 49));

        btn_cambiaSignos.setBackground(new java.awt.Color(0, 0, 0));
        btn_cambiaSignos.setForeground(new java.awt.Color(1, 252, 236));
        btn_cambiaSignos.setText("+/-");
        getContentPane().add(btn_cambiaSignos, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 251, 63, 49));

        btn_numeroOcho.setBackground(new java.awt.Color(0, 0, 0));
        btn_numeroOcho.setForeground(new java.awt.Color(1, 252, 236));
        btn_numeroOcho.setText("8");
        btn_numeroOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numeroOchoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_numeroOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 81, 63, 49));

        btn_numeroCinco.setBackground(new java.awt.Color(0, 0, 0));
        btn_numeroCinco.setForeground(new java.awt.Color(1, 252, 236));
        btn_numeroCinco.setText("5");
        btn_numeroCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numeroCincoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_numeroCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 136, 63, 49));

        btn_numeroDos.setBackground(new java.awt.Color(0, 0, 0));
        btn_numeroDos.setForeground(new java.awt.Color(1, 252, 236));
        btn_numeroDos.setText("2");
        btn_numeroDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numeroDosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_numeroDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 191, 63, 49));

        btn_numeroCero.setBackground(new java.awt.Color(0, 0, 0));
        btn_numeroCero.setForeground(new java.awt.Color(1, 252, 236));
        btn_numeroCero.setText("0");
        btn_numeroCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numeroCeroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_numeroCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 251, 63, 49));

        btn_numeroNueve.setBackground(new java.awt.Color(0, 0, 0));
        btn_numeroNueve.setForeground(new java.awt.Color(1, 252, 236));
        btn_numeroNueve.setText("9");
        btn_numeroNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numeroNueveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_numeroNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 81, 63, 49));

        btn_numeroSeis.setBackground(new java.awt.Color(0, 0, 0));
        btn_numeroSeis.setForeground(new java.awt.Color(1, 252, 236));
        btn_numeroSeis.setText("6");
        btn_numeroSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numeroSeisActionPerformed(evt);
            }
        });
        getContentPane().add(btn_numeroSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 136, 63, 49));

        btn_numeroTres.setBackground(new java.awt.Color(0, 0, 0));
        btn_numeroTres.setForeground(new java.awt.Color(1, 252, 236));
        btn_numeroTres.setText("3");
        btn_numeroTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numeroTresActionPerformed(evt);
            }
        });
        getContentPane().add(btn_numeroTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 191, 63, 49));

        btn_punto.setBackground(new java.awt.Color(0, 0, 0));
        btn_punto.setForeground(new java.awt.Color(1, 252, 236));
        btn_punto.setText(".");
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 251, 63, 49));

        bnt_suma.setBackground(new java.awt.Color(0, 0, 0));
        bnt_suma.setForeground(new java.awt.Color(1, 252, 236));
        bnt_suma.setText("+");
        getContentPane().add(bnt_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 81, 63, 49));

        btn_resta.setBackground(new java.awt.Color(0, 0, 0));
        btn_resta.setForeground(new java.awt.Color(1, 252, 236));
        btn_resta.setText("-");
        getContentPane().add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 136, 63, 49));

        btn_multiplicador.setBackground(new java.awt.Color(0, 0, 0));
        btn_multiplicador.setForeground(new java.awt.Color(1, 252, 236));
        btn_multiplicador.setText("*");
        getContentPane().add(btn_multiplicador, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 191, 63, 49));

        btn_dividido.setBackground(new java.awt.Color(0, 0, 0));
        btn_dividido.setForeground(new java.awt.Color(1, 252, 236));
        btn_dividido.setText("/");
        getContentPane().add(btn_dividido, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 251, 63, 49));

        btn_borrarUnCaracter.setBackground(new java.awt.Color(0, 0, 0));
        btn_borrarUnCaracter.setForeground(new java.awt.Color(1, 252, 236));
        btn_borrarUnCaracter.setText("C");
        btn_borrarUnCaracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarUnCaracterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_borrarUnCaracter, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 81, 63, 49));

        btn_borrarTodo.setBackground(new java.awt.Color(0, 0, 0));
        btn_borrarTodo.setForeground(new java.awt.Color(1, 252, 236));
        btn_borrarTodo.setText("CE");
        btn_borrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarTodoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_borrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 136, 63, 49));

        btn_divisionInversa.setBackground(new java.awt.Color(0, 0, 0));
        btn_divisionInversa.setForeground(new java.awt.Color(1, 252, 236));
        btn_divisionInversa.setText("1/X");
        btn_divisionInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionInversaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_divisionInversa, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 191, 63, 49));

        btn_igual.setBackground(new java.awt.Color(0, 0, 0));
        btn_igual.setForeground(new java.awt.Color(1, 252, 236));
        btn_igual.setText("=");
        getContentPane().add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 251, 63, 49));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondos-ipad-9058234958723497-730x412.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_numeroCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numeroCuatroActionPerformed
        txt_Pantalla.setText(txt_Pantalla.getText() + " 4 ");
    }//GEN-LAST:event_btn_numeroCuatroActionPerformed

    private void btn_numeroSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numeroSeisActionPerformed
        txt_Pantalla.setText(txt_Pantalla.getText() + " 6 ");
    }//GEN-LAST:event_btn_numeroSeisActionPerformed

    private void btn_numeroUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numeroUnoActionPerformed
        txt_Pantalla.setText(txt_Pantalla.getText() + " 1 ");
    }//GEN-LAST:event_btn_numeroUnoActionPerformed

    private void btn_numeroDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numeroDosActionPerformed
        txt_Pantalla.setText(txt_Pantalla.getText() + " 2 ");
    }//GEN-LAST:event_btn_numeroDosActionPerformed

    private void btn_numeroTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numeroTresActionPerformed
        txt_Pantalla.setText(txt_Pantalla.getText() + " 3 ");
    }//GEN-LAST:event_btn_numeroTresActionPerformed

    private void btn_numeroCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numeroCincoActionPerformed
        txt_Pantalla.setText(txt_Pantalla.getText() + " 5 ");
    }//GEN-LAST:event_btn_numeroCincoActionPerformed

    private void btn_numeroSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numeroSieteActionPerformed
        txt_Pantalla.setText(txt_Pantalla.getText() + " 7 ");
    }//GEN-LAST:event_btn_numeroSieteActionPerformed

    private void btn_numeroOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numeroOchoActionPerformed
        txt_Pantalla.setText(txt_Pantalla.getText() + " 8 ");
    }//GEN-LAST:event_btn_numeroOchoActionPerformed

    private void btn_numeroNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numeroNueveActionPerformed
        txt_Pantalla.setText(txt_Pantalla.getText() + " 9 ");
    }//GEN-LAST:event_btn_numeroNueveActionPerformed

    private void btn_numeroCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numeroCeroActionPerformed
        txt_Pantalla.setText(txt_Pantalla.getText() + " 0 ");
    }//GEN-LAST:event_btn_numeroCeroActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        String cadena;
        cadena = txt_Pantalla.getText();
        if (cadena.length() <= 0) {
            txt_Pantalla.setText("0.");
        } else {
            if (!existePunto(txt_Pantalla.getText())) {
                txt_Pantalla.setText(txt_Pantalla.getText() + " . ");
            }
        }
    }//GEN-LAST:event_btn_puntoActionPerformed
    public boolean existePunto(String cadena) {
        boolean resultado;
        resultado = false;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, 1 + 1).equals(" . ")) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    private void btn_borrarUnCaracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarUnCaracterActionPerformed
        String cadena;
        cadena = txt_Pantalla.getText();
        if (cadena.length() > 0) {
            cadena = cadena.substring(0, cadena.length() - 1);
            txt_Pantalla.setText(cadena);
        }
    }//GEN-LAST:event_btn_borrarUnCaracterActionPerformed

    private void btn_borrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarTodoActionPerformed
        txt_Pantalla.setText(null);
    }//GEN-LAST:event_btn_borrarTodoActionPerformed

    private void btn_divisionInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionInversaActionPerformed
        String cadena;
        Double numero;
        cadena = txt_Pantalla.getText();
        if (cadena.length() > 0) {
            numero = 1 / (Double.parseDouble(cadena));
            txt_Pantalla.setText(numero.toString());
        }
    }//GEN-LAST:event_btn_divisionInversaActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_suma;
    private javax.swing.JButton btn_borrarTodo;
    private javax.swing.JButton btn_borrarUnCaracter;
    private javax.swing.JButton btn_cambiaSignos;
    private javax.swing.JButton btn_dividido;
    private javax.swing.JButton btn_divisionInversa;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicador;
    private javax.swing.JButton btn_numeroCero;
    private javax.swing.JButton btn_numeroCinco;
    private javax.swing.JButton btn_numeroCuatro;
    private javax.swing.JButton btn_numeroDos;
    private javax.swing.JButton btn_numeroNueve;
    private javax.swing.JButton btn_numeroOcho;
    private javax.swing.JButton btn_numeroSeis;
    private javax.swing.JButton btn_numeroSiete;
    private javax.swing.JButton btn_numeroTres;
    private javax.swing.JButton btn_numeroUno;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_Pantalla;
    // End of variables declaration//GEN-END:variables

}
