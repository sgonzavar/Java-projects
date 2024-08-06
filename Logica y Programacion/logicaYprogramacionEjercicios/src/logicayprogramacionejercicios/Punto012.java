//SE TIENE LA CANTIDAD Y EL VALOR UNITARIO DE UN PRODUCTO VENDIDO.
//REALIZA UN ALGORITMO QUE MUESTRE EL TOTAL DE LA VENTA SABIENDO QUE SE HACE
// UN 20% DE DESCUESTO.

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto012 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("* DIGITE CANTIDAD DE PRODUCTOS..........:");
        int cantidad = leer.nextInt();
        System.out.print("* DIGITE PRECIO DEL PRODUCTO............:");
        int valor = leer.nextInt();
        int total = cantidad * valor;
        int descuento = (int) (total * 0.20);
        int totalventa = total - descuento;
        System.out.println("* EL TOTAL ES...........................:"  + totalventa);  
    }   
}





 