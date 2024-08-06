
package ejercicio2;
import javax.swing.*;
public class Ejercicio2 {
  
    public static void main(String[] args) 
    {int pieza,tam,cont=0;
    
    pieza=Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantas pìezas va a ingresar porfavor"));
      for(int i=0;i<pieza;i++)
      {
           tam=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de las piezas porfavor"));
          if(tam>=1&&tam<=10){cont=cont+1;}
      }
        JOptionPane.showMessageDialog(null,"estas son las piezas aptas en el lote "+cont);
    }
}