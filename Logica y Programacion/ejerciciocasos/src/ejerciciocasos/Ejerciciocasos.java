
package ejerciciocasos;

import javax.swing.JOptionPane;
public class Ejerciciocasos 
{
    public static void main(String[] args) 
    {double n1,n2,n4;
    int n3;
     n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 1 porfavor"));
     n2=Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 2 porfavor"));
     
              
          if(n1>0&&n2>0){
     n3=Integer.parseInt(JOptionPane.showInputDialog("digite porfavor:\n 1 si desea sumar\n 2 si desea restar\n 3 si desea multiplicar,\n 4 si desea dividir"));
     
            switch (n3) {

            case 1:
                n4=n1+n2;
                JOptionPane.showMessageDialog(null,"el resultado de la suma es"+n4);
                break;
            
            case 2: 
                n4=n1-n2;
                JOptionPane.showMessageDialog(null,"el resultado de la resta es"+n4);
                break;

            case 3: 
                n4=n1*n2;
                JOptionPane.showMessageDialog(null,"el resultado de la multiplicacion es"+n4);
                break;

            case 4: 
                if(n2==0)
                {JOptionPane.showMessageDialog(null,"el denominador de una division no puede ser cero");}else{
                n4=n1/n2;
                JOptionPane.showMessageDialog(null,"el resultado de la division es"+n4);
                }break;
            default :
                JOptionPane.showMessageDialog(null,"la opcion ingresada no es valida");
                break;
            
    }
          }else{JOptionPane.showMessageDialog(null,"ninguno de los dos numeros puede ser negativo");}          
    
}
}
