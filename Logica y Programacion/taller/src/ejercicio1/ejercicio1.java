

package ejercicio1;

import javax.swing.JOptionPane;
public class ejercicio1 
{

    public static void main(String[] args) 
    { double i;
        
        i=Double.parseDouble(JOptionPane.showInputDialog("ingrese un numero para verificar si es par o inpar porfavor"));
        i=i%2;
        if(i==0)
        {JOptionPane.showMessageDialog(null,"el numero es par");           
        }else{JOptionPane.showMessageDialog(null,"el numero es inpar");
        }
    
    
    }
    
}
