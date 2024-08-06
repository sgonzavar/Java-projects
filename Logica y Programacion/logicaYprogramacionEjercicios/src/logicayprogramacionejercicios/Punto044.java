//SE TIENE EL NOMBRE, EL NUMERO DE HORAS TRABAJADAS Y EL VALOR DE LA HORA DE UN 
//EMPLEADO. REALIZA UN ALGORITMO QUE MUESTRE EL TOTAL DEL SALARIO, SABIENDO QUE
//LAS PRIMERAS 40 HORAS SON NORMALES Y EL RESTO SON HORAS EXTRAS, LAS CUALES SE
//PAGAN AL DOBLE DE LA NORMAL
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto044 {

    private static int numerohora;
    private static float valorhora;
    private static String nombre;
    private static String apellido;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("DIGITE SU NOMBRE..........: ");
        nombre = leer.next();
        System.out.print("DIGITE SU APELLIDO........: ");
        apellido = leer.next();
        System.out.print("DIGITE HORAS TRABAJADAS...: ");
        numerohora = leer.nextInt();
        System.out.print("DIGITE EL VALOR DE LA HORA: ");
        valorhora = leer.nextFloat();

        totalsalario();

    }

    private static void totalsalario() {
        if (numerohora > 40) {
            int horasextras = numerohora - 40;
            float salario = (int) (40 * valorhora) + (horasextras * valorhora * 2);
            System.out.println(" " + nombre + " " + apellido);

            System.out.println("EL SALARIO ES EL SIGUIENTE.: " + salario);
        } else {
            float salario = (int) (40 * valorhora);
            System.out.print(" " + nombre + " " + apellido);

            System.out.println("EL SALARIO ES EL SIGUIENTE.: " + salario);

        }

    }
}
