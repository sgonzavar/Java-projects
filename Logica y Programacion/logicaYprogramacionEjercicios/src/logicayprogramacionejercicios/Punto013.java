//SE TIENE UN VALOR EN A Y OTRO EN B, REALZA UN ALGORITMO QUE INTERCAMBIE   
//EL VALOR DE A CON EL DE B

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto013 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("* DIGITE A...................: " );
        int A = leer.nextInt();
        System.out.print("* DIGITE B...................: " );
        int B = leer.nextInt();
        System.out.println("* EL VALOR DE  A ES........:" + A);
        System.out.println("* EL VALOR DE  B ES........:" + B);
        int auxiliar = A;
        A = B;
        B = auxiliar;
        System.out.println("* EL NUEVO VALOR DE  A ES..:" + A);
        System.out.println("* EL NUEVO VALOR DE  B ES..:" + B);
        
    }   
}





 