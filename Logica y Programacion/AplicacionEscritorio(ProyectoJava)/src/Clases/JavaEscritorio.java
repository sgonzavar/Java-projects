package Clases;

import Formularios.FrmLogin;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JavaEscritorio {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        // creo el objeto datos
        Datos misDatos = new Datos();
        
        // llamor el formulario de login
        FrmLogin miLogin = new FrmLogin();
        miLogin.setDatos(misDatos);
        miLogin.setLocationRelativeTo(miLogin);
        miLogin.setVisible(true);
        
    }
    
}
