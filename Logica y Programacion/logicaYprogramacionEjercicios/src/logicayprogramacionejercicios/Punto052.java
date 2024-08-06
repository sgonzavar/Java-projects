//REALIZA UN ALGORTIMO QUE LEA Y MUESTRE EL NOMBRE DE 10 PERSONAS


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto052 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("DIGITE NOMBRE : ");
             String nombre = leer.next();
            System.out.println("" + nombre);
        }
        
    }   
}
