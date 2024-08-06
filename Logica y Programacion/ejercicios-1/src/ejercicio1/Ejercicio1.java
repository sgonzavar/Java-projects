
package ejercicio1;
import javax.swing.*;
public class Ejercicio1 {
  
    public static void main(String[] args) 
    {int sueldo,cont=0,cont2=0;
      for(int i=0;i<5;i++)
      {sueldo=Integer.parseInt(JOptionPane.showInputDialog("ingrese su sueldo porfavor"));
          if(sueldo>=100&&sueldo<=500)
          {cont=cont+1;}else{cont2=cont2+1;}
          
      }
        JOptionPane.showMessageDialog(null,"estas son las personas que cobraron su sueldo "+cont+" y estas personas no cobraron "+cont2);
    }
}