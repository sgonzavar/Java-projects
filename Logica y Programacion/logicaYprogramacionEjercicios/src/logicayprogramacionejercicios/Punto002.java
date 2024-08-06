// ingrese dos numeros y muestre la suma, resta, multiplicacion y division de ambos.
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto002 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("** DIGITE NUMERO 1 QUE DESEA CALCULAR......:  ");
        double numero1 = leer.nextDouble();
        System.out.print("** DIGITE NUMERO  QUE DESEA CALCULAR.......:  ");
        double numero2 = leer.nextDouble();
        double suma = (numero1 + numero2);
        double resta = (numero1 - numero2);
        double multiplicacion = (numero1 * numero2);
        double division = (int) (numero1 / numero2);

        System.out.println("LA SUMA ES LA SIGUENTE....................:     " + " " + suma);
        System.out.println("LA RESTA ES LA SIGUENTE...................:     " + " " + resta);
        System.out.println("LA MULTIPLICACION ES LA SIGUENTE..........:     " + " " + multiplicacion);
        System.out.println("LA DIVISION ES LA SIGUENTE................:     " + " " + division);

    }
}
