//DESARROLA UN ALGORITMO QUE MUESTRE EL FACTORIAL DE UN NUMERO.
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto064 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite Numero : ");
        int numero = leer.nextInt();
        factorial(numero);

    }

    private static void factorial(int numero) {
        int ac = 1;
        for (int i = 1; i <= numero; i++) {
            ac = ac * i;

        }
        System.out.println("El Factorial Es " + ac);
    }

}
