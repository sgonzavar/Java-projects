
package ejercicio1;
import javax.swing.JOptionPane;
public class Ejercicio1 {


    public static void main(String[] args) {
        
           String marca,model,color;
           double km,dias,pr=0;



          marca = JOptionPane.showInputDialog("ingrese la marca porfavor");
          model  = JOptionPane.showInputDialog("ingrese el modelo porfavor");
          color = JOptionPane.showInputDialog("ingrese el color porfavor");
          km = Double.parseDouble(JOptionPane.showInputDialog("ingrese los kilometros recorridos porfavor"));
          dias = Double.parseDouble(JOptionPane.showInputDialog("ingrese lo dias que lo alquilara porfavor"));
          
          if(km<=0)
          { JOptionPane.showMessageDialog(null,"esa cantidad no es valida !error!");
          }else if(km>0&&km<50000)
          {pr=150000;
          }else if(km==50000)
          {pr=80000;
          }else 
          {pr=50000;}
          
          JOptionPane.showMessageDialog(null,"el valor del alquiler es de "+(dias*pr));
    }
    
}
