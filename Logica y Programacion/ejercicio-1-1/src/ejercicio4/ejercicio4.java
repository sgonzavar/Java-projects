
package ejercicio4;

import javax.swing.JOptionPane;

public class ejercicio4 {
    public static void main(String[] args)
    
    {double s=0,q=0,w=0,e=0;
        int i;
        for(i=0;i<10;i++){
         s=Double.parseDouble(JOptionPane.showInputDialog( "ingrese el candidato por el cual quiere votar(1.2 o 3)"));
         if(s==1)
         {q=q+1;}else if(s==2)
         {w=w+1;}else {e=e+1;}       
         }
        if(q>w&&q>e)
         {JOptionPane.showMessageDialog(null,"el ganador es el candidato numero uno");
         }else if(w>q&&w>e){JOptionPane.showMessageDialog(null,"el ganador es el candidato numero dos");}
         else{JOptionPane.showMessageDialog(null,"el ganador es el candidato numero tres");}
  }
}
