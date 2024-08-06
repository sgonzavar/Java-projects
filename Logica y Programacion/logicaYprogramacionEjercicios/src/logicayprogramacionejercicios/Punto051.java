//REALIZA UN ALGORTIMO QUE LEA EL NOMBRE DE UNA PERSONA Y LO MUESTRE 10 VECES


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto051 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("DIGITE NOMBRE : ");
        String nombre = leer.next();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("" + nombre);
        }
        
    }   
}
