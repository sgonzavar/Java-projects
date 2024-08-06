//DE CADA UNO DE 10 ESTUDIANTES SE TIENE = NOMBRE, IDENTIFICACION Y 10 NOTAS
//REALIZA UN AALGORITMO QUE 
//A)MUESTRE EL NOMBRE Y LA NOTA DEFINITIVA DE CADA ESTUDIANTE 
//B)MUESTRE EL PROMEDIO DE LAS NOTAS DEFINITIVAS
//C)MUESTRE EL NOMBRE Y LA NOTA DEFINITIVA DEL ESTUDIANTE CON MAYOR NOTA DEFINITIVA 
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto060 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre, nombremayor = " ";
        int cc, i, k;
        float nota, notadefinitiva, promedio, notamayor = -1, acumularnota, acomuladortotal = 0;

        for (i = 1; i <= 10; i++) {
            System.out.print("INGRESE SU NOMBRE........: ");
            nombre = leer.next();
            System.out.print("INGRESE SU IDENTIFICACION: ");
            cc = leer.nextInt();
            acumularnota = 0;
            for (k = 1; k <= 10; k++) {
                System.out.print("INGRESE NOTA.: ");
                nota = leer.nextFloat();
                acumularnota = acumularnota + nota;
            }

            notadefinitiva = acumularnota / 10;
            System.out.println();
            System.out.println("" + nombre);
            System.out.println("" + cc);
            System.out.println("" + notadefinitiva);
            System.out.println();
            acomuladortotal = acomuladortotal + notadefinitiva;
            if (notadefinitiva > notamayor) {
                notamayor = notadefinitiva;
                nombremayor = nombre;
            }
        }

        promedio = acomuladortotal / 10;
        System.out.println();
        System.out.println("EL PROMEDIO ES " + promedio);
        System.out.println("LA NOTA MAYOR ES " + notamayor);
        System.out.println("EL NOMBRE DEL ESTUDAINTE DE LA NOTA MAYOR " + nombremayor);

    }
}
