//SE TIENE TRES ESPERAS A,B, Y C DE DIFERENTE PERO, ELABORA UN ALGORITMO QUE
//DETERMINE CUAL ES LA ESFERA DE MAYOR PESO
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto035 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("** DIGITE PESO DE LA ESPERA A ");
        int pesoa = leer.nextInt();
        System.out.print("** DIGITE PESO DE LA ESPERA B ");
        int pesob = leer.nextInt();
        System.out.print("** DIGITE PESO DE LA ESPERA C ");
        int pesoc = leer.nextInt();

        if (pesoa > pesob && pesoa > pesoc) {
            System.out.println("** ESFERA A PESA MAS QUE B Y C");
        } else {
            if (pesob > pesoa && pesob > pesoc) {
                System.out.println("** ESFERA B PESA MAS QUE A Y C");
            } else {
                if (pesoc > pesoa && pesoc > pesob) {
                    System.out.println("** ESFERA C PESA MAS QUE A Y B");
                }
            }
        }

    }
}
