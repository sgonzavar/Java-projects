//DE UN TERRENO RESTANGULAR, SE TIENE LA BASE Y ALTURA. SE DEDEA SABAER EL TOTAL
//DEL ALAMBRE NECESARIO, SABIENDO QUE SE VA A CERCAR CON 5 HILOS DE ALAMBRE. 

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto017 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("** DIGITE LA BASE  QUE DESEA CALCULAR......:  ");
        double base = leer.nextDouble();
        System.out.print("** DIGITE LA ALTURA QUE DESEA CALCULAR......:  ");
        double altura = leer.nextDouble();
        double total = (base*2+altura*2)*5;
        System.out.println(" EL TOTAL ES EL SIGUIENTE " + total);
    }   
}
