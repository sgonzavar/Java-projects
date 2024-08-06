package listasdobles;

import javax.swing.JOptionPane;

public class ListasDobles {

    public static void main(String[] args) {
        NodoDoble ObjDbl = new NodoDoble();
        NodoSimple Objsim = new NodoSimple();
        int op = 0, op1 = 0, opimprimir = 0;
        Object info, otro;
        int opcionlista = 0;
        while (opcionlista < 3) {
            opcionlista = Integer.parseInt(JOptionPane.showInputDialog("*****MENU DE LISTAS *****\n"
                    + "1. Menu de Listas Simples\n"
                    + "2. Menu de Listas Dobles\n"
                    + "3. Terminar\n"));
            switch (opcionlista) {
                case 1: {//caso 1 de opcion lista
                    op1 = 0;
                    while (op1 < 12)//mientras de nodosimple
                    {
                        op1 = Integer.parseInt(JOptionPane.showInputDialog("*****MENU DE LISTAS SIMPLES*****\n"
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
                        switch (op1) {//caso de nodosimple
                            case 1:
                                Objsim.IniciarLista();
                                Objsim.Crear(1);
                                break;
                            case 2:
                                Objsim.IniciarLista();
                                Objsim.Crear(2);
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "La lista es: " + Objsim.Imprimir());
                                break;
                            case 4:
                                info = JOptionPane.showInputDialog("Digite dato para insertar de cabeza: ");
                                Objsim.Insertarcabeza(info);
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "el numero eliminado es: " + Objsim.liberarCabeza());
                                break;
                            case 6:
                                info = JOptionPane.showInputDialog("Digite dato para insertar de ultimo: ");
                                Objsim.InsertarUltimo(info);
                                break;
                            case 7:
                                JOptionPane.showMessageDialog(null, "el numero eliminado es: " + Objsim.liberarUltimo());
                                break;
                            case 8:
                                info = JOptionPane.showInputDialog("Digite dato para buscar y eliminar: ");
                                Objsim.liberardato(info);
                                break;
                            case 9:
                                info = JOptionPane.showInputDialog("Digite dato referencia para buscar en la lista: ");
                                otro = JOptionPane.showInputDialog("Digite dato para insertar antes de " + info);
                                Objsim.InsertarAntes(info, otro);
                                break;
                            case 10:
                                info = JOptionPane.showInputDialog("Digite dato referencia para buscar en la lista: ");
                                otro = JOptionPane.showInputDialog("Digite dato para insertar despues de " + info);
                                Objsim.InsertarDespues(info, otro);
                                break;
                        }//fin caso nodosimple
                    }//fin mientras nodosimple
                    break;
                }
                case 2: {//caso 2 de opcion lista    
                    op = 0;
                    while (op < 12)//mientras de nododoble
                    {
                        op = Integer.parseInt(JOptionPane.showInputDialog("*****MENU DE LISTAS DOBLES*****\n"
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
                        switch (op) {//caso de nodosimple
                            case 1:
                                ObjDbl.InicializarLista();
                                ObjDbl.Crear(1);
                                break;
                            case 2:
                                ObjDbl.InicializarLista();
                                ObjDbl.Crear(0);
                                break;
                            case 3:
                                opimprimir = 0;
                                while (opimprimir < 3)//tres opciones para el menu de imprimir en listas dobles
                                {
                                    opimprimir = Integer.parseInt(JOptionPane.showInputDialog("*****IMPRIMIR LISTA*****\n"
                                            + "1. Desde la cabeza\n"
                                            + "2. Desde el ultimo\n"
                                            + "3. Volver al menu principal"));
                                    switch (opimprimir)//caso imprimir en dobles
                                    {
                                        case 1:
                                            JOptionPane.showMessageDialog(null, "La lista es: " + ObjDbl.Imprimirdesdecabeza());
                                            break;
                                        case 2:
                                            JOptionPane.showMessageDialog(null, "La lista es: " + ObjDbl.Imprimirdesdeultimo());
                                            break;
                                    }//fin caso imprimir
                                }//fin de mientras imprimir
                                break;
                            case 4:
                                info = JOptionPane.showInputDialog("Digite dato para insertar de cabeza: ");
                                ObjDbl.InsertarCabeza(info);
                                break;
                            case 5:
                                info = ObjDbl.liberarCabeza();
                                JOptionPane.showMessageDialog(null, "El dato eliminado fue:" + info);
                                break;
                            case 6:
                                info = JOptionPane.showInputDialog("Digite dato para insertar de ultimo: ");
                                ObjDbl.InsertarUltimo(info);
                                break;
                            case 7:
                                info = ObjDbl.liberarUltimo();
                                JOptionPane.showMessageDialog(null, "El dato eliminado fue:" + info);
                                break;
                            case 8:
                                info = JOptionPane.showInputDialog("Digite dato a eliminar: ");
                                ObjDbl.liberardato(info);
                                break;
                            case 9:
                                info = JOptionPane.showInputDialog("Digite dato referencia para busqueda: ");
                                otro = JOptionPane.showInputDialog("Digite dato para insertar antes de: " + info);
                                //ObjDbl.InsertarAntes(info, otro);
                                break;
                            case 10:
                                info = JOptionPane.showInputDialog("Digite dato referencia para busqueda: ");
                                otro = JOptionPane.showInputDialog("Digite dato para insertar despues de: " + info);
                                ObjDbl.InsertarDespues(info, otro);
                                break;

                        }
                    }//fin caso
                    break;
                }
            }//fin caso listas
        }//fin mientras listas
    }//fin metodo principal
}//fin de la clase
