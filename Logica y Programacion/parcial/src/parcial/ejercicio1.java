
package parcial;

import javax.swing.JOptionPane;

public class ejercicio1 
{

    public static void main(String[] args) 
    {
        String name,ape;
        double compra,des,comtotal;
        
         name= JOptionPane.showInputDialog("diga su nombre porfavor");
          ape = JOptionPane.showInputDialog("diga su apellido porfavor "+name);
          compra=Double.parseDouble(JOptionPane.showInputDialog("diga el valor de su compra porfavor"));
          des=compra*0.3;
          comtotal=compra-des;
          JOptionPane.showMessageDialog(null,"el cliente "+name+" "+ape+" tuvo una compra por valor de "+compra+"con un descuento del 30% para un total de compra de "+comtotal);
    }
    
}
