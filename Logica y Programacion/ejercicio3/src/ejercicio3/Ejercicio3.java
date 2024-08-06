
package ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
    double edad;
     String nom;
     nom=JOptionPane.showInputDialog("ingrese su nombre porfavor");
     
     edad=Double.parseDouble(JOptionPane.showInputDialog("ingrese su edad porfavor"));
     
     if(edad>18)
     {JOptionPane.showMessageDialog(null,"felicidades señor "+nom+" usted a sido aceptado en el ejercito❤");
     }else
     { JOptionPane.showMessageDialog(null,"lo sentimos mucho señor "+nom+" usted no a sido aceptado en el ejercito✎");
     }
        
     
    
    }
}
