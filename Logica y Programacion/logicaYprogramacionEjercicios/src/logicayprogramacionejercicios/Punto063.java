//DESARROLA UN ALGORITMO QUE MUESTRE LA TABLA DE MULTIPLICAR DEL 2 AL 9

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto063 {    
    public static void main(String[] args) {
        
        tablaMultiplicar();
        
    }   

    private static void tablaMultiplicar() {
       int i , k , acomulador = 0;     
        for (i = 2;i  <= 9; i++) {
            System.out.println();
            for (k = 0; k <= 10; k++) {
                acomulador = i * k;
                System.out.println(i + " X " + k + " = " + acomulador);
                
            }
            
        }
    }
   
}
