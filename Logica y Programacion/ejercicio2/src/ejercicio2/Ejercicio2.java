
package ejercicio2;
import javax.swing.JOptionPane;
public class Ejercicio2 
{

    public static void main(String[] args) 
    {double com,des;
     String nom,ape;
     nom=JOptionPane.showInputDialog("ingrese su nombre porfavor");
     ape=JOptionPane.showInputDialog("ingrese su apellido porfavor");     
     com=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de su compra porfavor"));
     
     if(com>200000)
     {des=com*0.3;
     des=com-des;
     }else
     {des=com*0.05;
     des=com-des;
     }
        
     JOptionPane.showMessageDialog(null,"el cliente "+nom+" "+ape+" realizo una compra de "+com+"\n y con el descuento incluido esta quedo en "+des);
    
    }
    
}
