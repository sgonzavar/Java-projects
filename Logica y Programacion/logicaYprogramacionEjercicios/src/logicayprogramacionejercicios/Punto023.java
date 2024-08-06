//SI UN AUTO RECORRE UNA VELOCIDAD X EN METROS POR SEGUNDO, HACER UN ALGORITMO QUE 
// EXPRESE ESTA VELOCIDAD EN KM POR HORA.


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto023 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
       
        System.out.print("** DIGITE METROS QUE DESEA CALCULAR......:  ");
        double metros = leer.nextDouble();
        double kilometroshora = (metros * 3600)/1000;         
        System.out.println("LOS KILOMETROS POR HORA SON LOS SIGUIENTES...:   " + kilometroshora);
    }   
}
