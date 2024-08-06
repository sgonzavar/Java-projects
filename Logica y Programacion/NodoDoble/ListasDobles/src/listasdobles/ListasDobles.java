/*no hay validacion de datos...*/
package listasdobles;

import javax.swing.JOptionPane;

public class ListasDobles
{
  
    public static void main(String[] args) 
    {
        NodoDoble ObjDbl=new NodoDoble();
        NodoSimple Objsim=new NodoSimple();
        int op=0,op1=0,opimprimir=0;
        Object info,otro,datoRef;
        int opcionlista=0;
        while (opcionlista<3)
        {
           opcionlista=Integer.parseInt(JOptionPane.showInputDialog("*****MENU DE LISTAS *****\n"
                    + "1. Menu de Listas Simples\n"
                    + "2. Menu de Listas Dobles\n"
                    + "3. Terminar\n"));
        switch(opcionlista)
        {  
            
            case 1:{
                
                 while (op1<12)
        {
            op1=Integer.parseInt(JOptionPane.showInputDialog("*****MENU DE LISTAS SIMPLES*****\n"
                    + "1. Crear por el Inicio\n"
                    + "2. Crear por el final\n"
                    + "3. Imprimir\n"
                    + "4. Insertar de Cabeza\n"
                    + "5. Eliminar cabeza\n"
                    + "6. Insertar de Ultimo\n"
                    + "7. Eliminar Ultimo\n"
                    + "8. Eliminar dato\n"
                    + "9. Insertar Antes\n"
                    + "10. Insertar Despues\n"
                    + "11. Organizar Ascendente\n"
                    + "12. Finalizar\n"
                    + "OPCION??"));
            switch(op1)
            {
                case 1:Objsim.IniciarLista();
                       Objsim.Crear(1);
                       break;
                case 2:Objsim.IniciarLista();
                       Objsim.Crear(2);
                       break;
                case 3: JOptionPane.showMessageDialog(null,"La lista es: "+Objsim.Imprimir());
                       break;
                case 4:info=JOptionPane.showInputDialog
        ("Digite dato a insertar como cabeza: "); 
                    Objsim.insertarcabeza(info);
                    break;
                case 5:JOptionPane.showMessageDialog
           (null, "el dato que se eliminó es: "
                   +Objsim.liberarcabeza());
                    break;
                case 6:info=JOptionPane.showInputDialog
        ("Digite dato a insertar de ultimo: ");  
                    Objsim.insertarultimo(info);
                    break;
                case 7:JOptionPane.showMessageDialog
           (null, "el dato que se eliminó es: "
                   +Objsim.liberarultimo());
                    break;
                case 8:   info=JOptionPane.showInputDialog
        ("Digite dato a buscar y eliminar: ");
                    Objsim.liberardato(info);
                    break;
                    
                case 9:  datoRef=JOptionPane.showInputDialog
        ("Digite dato referente para insertar antes  : ");
                    info=JOptionPane.showInputDialog
        ("Digite dato a insertar antes : ");                
                    Objsim.insertarAntes(info,datoRef);
                    break;
                    
                     case 10:  datoRef=JOptionPane.showInputDialog
        ("Digite dato referente para insertar antes  : ");
                    info=JOptionPane.showInputDialog
        ("Digite dato a insertar antes : "); 
                    Objsim.insertarDespues(info,datoRef);
                    break;
            }//fin caso listas simples
        }//fin mientras listas simples
           break; }
                
                
            case 2:{    
        while (op<12)
        {
            op=Integer.parseInt(JOptionPane.showInputDialog("*****MENU DE LISTAS DOBLES*****\n"
                    + "1. Crear por el Inicio\n"
                    + "2. Crear por el final\n"
                    + "3. Imprimir\n"
                    + "4. Insertar de Cabeza\n"
                    + "5. Eliminar cabeza\n"
                    + "6. Insertar de Ultimo\n"
                    + "7. Eliminar Ultimo\n"
                    + "8. Eliminar dato\n"
                    + "9. Insertar Antes\n"
                    + "10. Insertar Despues\n"
                    + "11. Organizar Ascendente\n"
                    + "12. Finalizar\n"
                    + "OPCION??"));
            switch(op)
            {
                case 1: 
                        break;
                case 2: 
                        break;    
                case 3:  
                         break;
                case 4: 
                        break;
                case 5: 
                        break;
                case 6: 
                        break;
                case 7:
                        break;  
                case 8: 
                         break;    
                case 9: 
                         break;
                case 10:
                         break;
                    
            }//fin caso listas dobles
           }//fin mientras listas dobles
            break;
            }//fin caso 2 del menu
        }//fin caso del menu
        }//fin mientras menu principal
    }//fin metodo principal
}//fin de la clase
