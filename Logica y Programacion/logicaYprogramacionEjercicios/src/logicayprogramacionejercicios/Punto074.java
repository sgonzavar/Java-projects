//se tiene un vector con 20 numeros enteros, realiza un algoritmo que intercambie el primer 
//elemento con el ultimo 
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto074 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n = 0;
        int num[] = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite numero : ");
            num[i] = leer.nextInt();

        }
         n = num[19];
        num[19] = num[0];
        num[0] = n;

        for (int i = 0; i < 20; i++) {
            System.out.println("Los numero son los siguientes  : " + num[i]);

        }

    }
}
