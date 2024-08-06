//se tiene un vector con N notas definitivas de logica , realiza un algoritmo que muestre
//la nota mayor y su posicion, si hay varias mayores, mostrar el primer mayor.

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto076 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Digite cantidad de notas : ");
        int n = leer.nextInt();
        float notaslogica[] = new float [n];
        int posicion = 0 ;
        float notamayor = notaslogica[0];
        for (int i = 0; i < n; i++) {
          
            System.out.print("Digite las notas ");
            notaslogica[i] = leer.nextFloat();
            if(notaslogica[i] > notamayor){
                notamayor = notaslogica[i];
                posicion = i;
            }
        }
        
        System.out.println("la nota mayor es " + notamayor + " en la posicion "
        + posicion );
    }

}
