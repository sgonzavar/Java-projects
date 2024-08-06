
package ejercicio2;
import javax.swing.JOptionPane;
public class Ejercicio2 {

    public static void main(String[] args) {
   
           int n1,n2,n3,cont=0,conta=0;

          n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
          n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
          n3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer numero"));
          
          
          if(n1<0)
          {conta=conta+1;
          }else if(n1==0)
          {
          }else
          {cont=cont+1;}
          
          if(n2<0)
          {conta=conta+1;
          }else if(n2==0)
          {
          }else
          {cont=cont+1;}
          
          if(n3<0)
          {conta=conta+1;
          }else if(n3==0)
          {
          }else
          {cont=cont+1;
          }
          
          JOptionPane.showMessageDialog(null,"la cantidad de numeros negativos es "+conta+" y de positivos es"+cont);
    }
    
}
          
    
