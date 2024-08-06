//se tiene un vector con N salarios, realiza un algoritmo que muestre.
//A) el total de salaros (nomina)
//B) cuantos salaros hay menores de  2 millones 
//c) el promedio de salario menores a 1 millon
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto075 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Digite cantidad de salarios : ");
        int n = leer.nextInt();
        double salario[];
        salario = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digte salario del empleado : ");
            salario[i] = leer.nextDouble();
        }

        double nomina = 0;
        for (int i = 0; i < n; i++) {
            nomina = nomina + salario[i];

        }
        System.out.println("La nomida de todos los empleados es :" + nomina);

        float contador = 0;
        for (int i = 0; i < n; i++) {
            if (salario[i] > 2000000) {
                contador = contador + 1;
            }
        }

        float contadormenor = 0;
        float salariomenor = 0;
        for (int i = 0; i < n; i++) {
            if (salario[i] < 1000000) {
                contadormenor = contadormenor + 1;
                salariomenor = (float) (salariomenor + salario[i]);
            }
        }

        if (contador == 0) {
            System.out.println("Ningun empleado tiene un salario menor a 1 millon");
        } else {
            float promedio = salariomenor / contadormenor;
            System.out.println("el promedio de los salarios menores a 1 millon"
                    + " es " + promedio);
        }

    }

}
