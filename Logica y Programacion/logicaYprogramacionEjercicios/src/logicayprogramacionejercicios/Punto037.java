//LA NOTA DE UN ESTUDIANTE ES CALCULADA CON BASE A 3 CALIFICACIONES, CON LOS 
//SIGUIENTES PORCENTAJES 25% 40% Y 35% RESPECTIVAMENTE, HAGA UN ALGORITMO QUE 
//IMPRIMA EL NOMBRE DEL ESTUDIANTE, LA NOTA FINAL Y UN MENSAJE QUE DIGA SI PUEDE 
//GANAR, PERDER O HABILITAR
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto037 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("** DIGITE SU NOMBRE......:  ");
        String nombre = leer.next();
        System.out.print("** DIGITE SU APELLIDO....:  ");
        String apellido = leer.next();
        System.out.print("** DIGITE PRIMERA NOTA...:  ");
        float nota1 = leer.nextFloat();
        System.out.print("** DIGITE SEGUNDA NOTA...:  ");
        float nota2 = leer.nextFloat();
        System.out.print("** DIGITE TERCER  NOTA...:  ");
        float nota3 = leer.nextFloat();
        nota1 = (float) (nota1 * 0.25);
        nota2 = (float) (nota2 * 0.40);
        nota3 = (float) (nota3 * 0.35);
        float notadefinitiva = nota1 + nota2 + nota3;

        if (notadefinitiva >= 3.0) {
            System.out.print(" " + nombre);
            System.out.print(" " + apellido);
            System.out.println();
            System.out.println("  ** GANA **  ");
        } else {
            if (notadefinitiva < 3.0) {
                System.out.print(" " + nombre);
                System.out.print(" " + apellido);
                System.out.println();
                System.out.println("  ** PIERDE **  ");
                if (notadefinitiva >= 2.5) {
                    System.out.println("  ** PUERE HABILITAR **  ");   
                }
            }
        }
    }
}
