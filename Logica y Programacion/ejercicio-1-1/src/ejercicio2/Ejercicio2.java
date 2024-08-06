
package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args)
    
    {double sueldo,prom=0;
    int sw=1,i=0;
        while(sw==1)
        { i=i+1;
            sueldo=Double.parseDouble(JOptionPane.showInputDialog( "este es el sueldo "+i));
        sw=Integer.parseInt(JOptionPane.showInputDialog( "ingrese uno si desea ingresar mas sueldos"));
        prom=prom+sueldo;
        }
    JOptionPane.showMessageDialog(null,"este es el promedio de los sueldos "+prom/i);
    }
  }
    

