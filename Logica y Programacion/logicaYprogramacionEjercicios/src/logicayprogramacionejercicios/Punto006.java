// DESARROLLA UN ALGORITMO QUE CALCULE LA SUPERFICIE DE UN RECTANGULO TENIENDO LA BASE
// Y ALTURA

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto006 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("** DIGITE BASE.........:  ");
        double base = leer.nextDouble();
        System.out.print("** DIGITE ALTURA.......:  ");
        double altura = leer.nextDouble();
        double superficie = base * altura;
        System.out.println(" LA SUPERFICIE ES " + superficie);
    }
}
