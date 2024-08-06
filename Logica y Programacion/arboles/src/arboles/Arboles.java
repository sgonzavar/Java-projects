//recuerden no hay validaciones de datos
package arboles;

import javax.swing.JOptionPane;


public class Arboles {

    
    public static void main(String[] args) {
        Nodoarbol Objarbol=new Nodoarbol();
                Objarbol.CrearRaiz();
                Objarbol.Crear(Objarbol.q);
                Object d;
                int op;
                do{
                    op=Integer.parseInt(JOptionPane.showInputDialog("MENU DE ARBOLES\n"
                            + "1. Inorden\n"
                            + "2. PostOrden\n"
                            + "3. PreOrden\n"
                            + "4. Contar Nodos\n"
                            + "5. Eliminar Hoja\n"
                            + "6. Buscar Nodo\n"
                            + "7. Insertar Hoja\n"
                            + "8. Insertar Rama\n"
                            + "9. Eliminar Rama\n"
                            + "10. Arbol Completo\n"
                            + "11. Hijos Izquierdos\n"
                            + "12. Peso del arbol\n"
                            + "13. talla\n"
                            + "14. Salir"));
                   switch(op)
                   {
                       case 1: Objarbol.Inicializar();
                               JOptionPane.showMessageDialog(null,"RECORRIDO EN INORDEN\n"+Objarbol.inorden(Objarbol.ObtenerRaiz()));
                               break;
                       case 2: Objarbol.Inicializar();
                               JOptionPane.showMessageDialog(null,"RECORRIDO EN POSTORDEN\n"+Objarbol.postorden(Objarbol.ObtenerRaiz()));
                               break;
                       case 3: Objarbol.Inicializar();
                               JOptionPane.showMessageDialog(null,"RECORRIDO EN PREORDEN\n"+Objarbol.preorden(Objarbol.ObtenerRaiz()));
                               break;
                       case 4: Objarbol.Inicializar();
                                
                               break;
                       case 5:d=JOptionPane.showInputDialog("Digite dato a buscar: ");
                              Objarbol.BorrarHoja(Objarbol.ObtenerRaiz(), d);
                              break;
                       case 6:d=JOptionPane.showInputDialog("Digite dato: "); 
                              Objarbol.BuscarDato(d);
                              break;
                       case 7:
                              break;    
                       case 8:
                              break;
                       case 9:
                              break;
                       case 10:
                              break;
                       case 11:
                               break;    
                       case 12:
                               break;        
                       case 13:
                               break;        
                   }//fin caso
                }while(op<14);//fin mientras
  
    }//fin principal
  
}//fin clase
