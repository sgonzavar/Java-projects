// REALIZA UN ALGORITMO QUE LE PERMITA AL USUARIO INGRESAR 5 NUMEROS Y LUEGO LA SUMA
//EL PROMEDIO Y LOS 5 NUMEROS QUE SE DIGITARON DESDE EL ULTIMO HASTA EL PRIMERO.
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto018 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("** DIGITE NNUMERO 1 ......:  ");
        double numero1 =  leer.nextDouble();
        System.out.print("** DIGITE NUMERO 2 ......:  ");
        double numero2 =  leer.nextDouble();
        System.out.print("** DIGITE NUMERO 3 ......:  ");
        double numero3 =  leer.nextDouble();
        System.out.print("** DIGITE NUMERO 4 ......:  ");
        double numero4 =  leer.nextDouble();
        System.out.print("** DIGITE NUMERO 5 ......:  ");
        double numero5 = leer.nextDouble();
        double suma = numero1 + numero2 + numero3 + numero4 + numero5;
        double promedio = suma/5;
        System.out.println(" LA SUMA EL LA SIGUIETE " + suma);
        System.out.println(" EL PROMEDIO ES EL SIGUIENTE " + promedio);
        System.out.println(" EL NUMERO 1 " + numero5);
        System.out.println(" EL NUMERO 2 " + numero4);
        System.out.println(" EL NUMERO 3 " + numero3);
        System.out.println(" EL NUMERO 4 " + numero2);
        System.out.println(" EL NUMERO 5 " + numero1);
    }
}
