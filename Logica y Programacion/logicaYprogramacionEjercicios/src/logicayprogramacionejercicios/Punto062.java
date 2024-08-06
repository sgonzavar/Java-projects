//DESARROLA UN ALGORITMO QUE MUESTRE LA TABLA DE MULTIPLICAR DE UN DETERMINADO NUMERO


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto062 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        System.out.print("Digite  Numero : ");
        int a =leer.nextInt();
        tablaNumero(a);
        
    }   

    private static void tablaNumero(int a) {
        for (int i = 0; i <= 10; i++) {
            int acomulador = a * i;
            System.out.println(a + " X " + i + " = " + acomulador);
        }
    }

   
}
