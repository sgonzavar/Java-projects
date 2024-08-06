//LEER UN NUMERO ENTERO Y DECIR SI DICHO NUMERO ES POSITIVO, NEGATIVO O IGUAL A O.

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto034 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("** DIGITE UN NUMERO..........:");
        int numero = leer.nextInt();
        if(numero >= 1){
            System.out.println("** ES POSITIVO **");
        }else{
            if(numero < 0){
                System.out.println("** ES NEGATIVO  **");
            }else{
                System.out.println("** ES CERO **");
            }
                
        }   
    }   
}
