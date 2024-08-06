//REALIZA UN ALGORITMO QUE MUESTRE EL RESULTADO DE LA SIGUIENTE FORMULA
// T=R2 * H + 4X
package logicayprogramacionejercicios;

import java.util.Scanner;


public class Punto020 {
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);    
    
           System.out.print(" DIGITE EL VALOR DE R:");
           double r = leer.nextDouble();
           System.out.print(" DIGITE EL VALOR DE H:");
           double h = leer.nextDouble();
           System.out.print(" DIGITE EL VALOR DE X:");
           double x = leer.nextDouble();
           double t = Math.pow(r, 2) * h + 4 * x;
           System.out.println(" EL VALOR DE T ES:  " + t);
    }  
}
