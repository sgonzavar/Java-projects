//SE TIENE EL LADO DE UN CUADRADO, MUESTRE SU AREA Y SU PERIMETRO

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto011 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("* DIGITE EL LADO DEL CUADRADO....:  ");
        double lado = leer.nextDouble();
        double area = lado*lado;
        double  perimetro = lado + lado + lado + lado;
        System.out.println("* EL AREA ES...................:  "+ area );
        System.out.println("* EL PERIMETRO ES..............:  "+ perimetro );   
    }   
}
