//se tiene un vector con el salario de 10 empleados realiza un algoritmo que muestre la suma y el 
//promedio de los salarios
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto073 {

    private static int salario[] = new int[10];
    private static float acomulador = 0, promedio;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite salario : ");
            salario[i] = leer.nextInt();
            
        }

        suma();
        promedio();
    }

    private static void suma() {
         for (int i = 0; i < 10; i++) {
             acomulador = acomulador + salario[i];     
         }
        System.out.println("la suma es " + acomulador);
    }

    private static void promedio() {
         promedio = acomulador / 10;
        System.out.println("el promeido es " + promedio);
    }
}
