
package ejercicio3;

import javax.swing.JOptionPane;

public class ejercicio3 {
    public static void main(String[] args)
    
            
    {double s=0;
    int m = 0,n=0;
        
        for(int i=0;i<5;i++){
       s=Double.parseDouble(JOptionPane.showInputDialog( "ingrese su edad porfavor"));
       if(s>=18)
       {m=m+1;
       }else{n=n+1;}
     }JOptionPane.showMessageDialog(null,"hay "+m+" personas mayores y hay "+n+" personas menores");
  }  
}


