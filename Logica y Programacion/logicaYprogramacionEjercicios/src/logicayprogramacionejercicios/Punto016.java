//SE TIENE LA BASE Y LA ALTURA DE UN TRIANGULO RECTANGULO, REALIZA UN ALGORITMO
//QUE  MUESTRE, PERIMETRO, BASE E HIPOTENUSA.
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto016 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("** DIGITE  LA BASE........:  ");
        double a = leer.nextDouble();
        System.out.print("** DIGITE LA ALTURA.......:  ");
        double b = leer.nextDouble();
        double hipotenusa = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)), 0.5);
        double area = (a*b)/2;
        double perimetro = a + b + hipotenusa;
        System.out.println(" LA HIPOTENUSA ES LA SIGUIENTE..:" + hipotenusa);
        System.out.println(" EL AREA ES LA SIGUIENTE........:" + area);
        System.out.println("EL PERIMETRO ES EL SIGUIENTE..:" + perimetro); 
    }
}
