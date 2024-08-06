//SE TIENE EL CATETO OPUESTO Y ADYACENTE DE UN TRIAGULO RECTANGULO
//CALCULAR Y MOSTRAR SU HIPOTENUSA.
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto005 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("** DIGITE CATETO OPUESTO QUE DESEA CALCULAR......:  ");
        double a = leer.nextDouble();
        System.out.print("** DIGITE CATETO ADYACENTE QUE DESEA CALCULAR.......:  ");
        double b = leer.nextDouble();
        double hipotenusa = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)), 0.5);// con Math.pow(a, b)se hace potencias
        System.out.println(" LA HIPOTENUSA ES " + hipotenusa);
    }
}
