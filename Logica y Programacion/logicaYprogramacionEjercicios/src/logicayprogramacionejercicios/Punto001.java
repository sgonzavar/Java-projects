//hacer una algoritmo que pase metros a pulgadas y centimetros.


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto001 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        int opcion = 0;
        do{
        System.out.print("** DIGITE METROS QUE DESEA CALCULAR......:  ");
        double metros = leer.nextDouble();
        double centimetros = metros * 100;
        double pulgadas = centimetros / 2.54;
        
        System.out.println("** LOS CENTIMETROS SON LOS SIGUIENTES...:   " + centimetros);
        System.out.println("** LAS PULGADAS  SON LAS SIGUIENTES.....:   " + pulgadas);
        System.out.print("** DESEA ANALIZAR MAS METROS...: SI[1] NO[0]  ");
        opcion = leer.nextInt();
        }while (opcion != 0);
        
    }   
}
