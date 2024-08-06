//UN ESTUDIANTE POSE 4 NOTAS Y SE DEBE MOSTRAR LA NOTA DEFINITIVA SABIENDO QUE 
//LA PRIMERA VALE 20%, LA SEGUNDA 10%, LA TERCERA 40% Y LA CUARTA 30%.

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto015 {

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
        double notadefinitiva;
        notadefinitiva = (nota1*0.20 + nota2*0.10 + nota3*0.40 + nota4*0.30);

        System.out.println("LA NOTA DEFINITIVA ES LA SIGUIENTE :  " + notadefinitiva);
    }
}
