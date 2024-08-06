package Listas_Dobles;
import javax.swing.JOptionPane;

/**
 * Luz Andrea Páez Martínez
 * @author luzpaez
 * Mayo 17/2012
 * Lista doblemente enlazadas
 */

public class Main {
    
    public static void main (String args[]){
        NodoDoble L1=new NodoDoble();
        int sw;
        sw=JOptionPane.showConfirmDialog(null,"¿Desea ingresar un dato al inicio?" ,"INGRESANDO AL INICIO",JOptionPane.YES_NO_OPTION);
        while (sw == JOptionPane.YES_OPTION){
            L1.inicio(JOptionPane.showInputDialog("Digite el dato para la lista"));
            sw=JOptionPane.showConfirmDialog(null,"¿Desea ingresar otro dato al inicio?" ,"INGRESANDO AL INICIO",JOptionPane.YES_NO_OPTION);    
        }
        L1.imprimir();
        NodoDoble L2=new NodoDoble();
        sw=JOptionPane.showConfirmDialog(null,"¿Desea ingresar un dato al final?" ,"INGRESANDO AL FINAL",JOptionPane.YES_NO_OPTION);
        while (sw == JOptionPane.YES_OPTION){
            L2.Final(JOptionPane.showInputDialog("Digite el dato para la lista"));
            sw=JOptionPane.showConfirmDialog(null,"¿Desea ingresar otro dato al final?" ,"INGRESANDO AL FINAL",JOptionPane.YES_NO_OPTION);
        }
        L2.imprimir();
    }
}
