// Dadas las cinco notas de un esttudiante de logica, mostrar su nota definitiva
//sabiendo que cada uno tiene igual porcentaje .
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto003 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("** DIGITE NOTA 1 ......:  ");
        double nota1 =  leer.nextDouble();
        System.out.print("** DIGITE NOTA 2 ......:  ");
        double nota2 =  leer.nextDouble();
        System.out.print("** DIGITE NOTA 3 ......:  ");
        double nota3 =  leer.nextDouble();
        System.out.print("** DIGITE NOTA 4 ......:  ");
        double nota4 =  leer.nextDouble();
        System.out.print("** DIGITE NOTA 5 ......:  ");
        double nota5 = leer.nextDouble();
        double notadefinitiva;
        notadefinitiva = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        System.out.println("LA NOTA DEFINITIVA ES LA SIGUIENTE :  " + notadefinitiva);
    }
}
