//REALIZA UN ALGORITMO QUE LEA 2 NUMEROS Y EL PRIMERO LO ELEVE AL SEGUNDO NUMERO.


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto014 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        
        System.out.print("* DIGITE A...................: " );
        int A = leer.nextInt();
        System.out.print("* DIGITE B...................: " );
        int B = leer.nextInt();
        int total = (int) Math.pow(A, B);
        System.out.println("* EL TOTAL ES...............: " + total );
  
    }   
}
