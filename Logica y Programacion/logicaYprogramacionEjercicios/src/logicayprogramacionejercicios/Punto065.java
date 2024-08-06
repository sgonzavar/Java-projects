//DESARROLA UN ALGORITMO QUE MUESTRE LOS PRIMEROS N TERMINOS DE LA SERIA
//FIBONACCI = 0 1 1 2 3 5 8 13 21 34 
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto065 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite Numero : ");
        int numero = leer.nextInt();
        serieFobonacci(numero);

    }


    private static void serieFobonacci(int numero) {
        int p = 0, s = 1, t;
        for (int i = 0; i <= numero; i++) {
               System.out.print(" " + p );
               t = p + s;
               p = s;
               s = t;
           }
    }

}
