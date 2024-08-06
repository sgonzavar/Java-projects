//UNA PERSONA TIENE X AÑOS, MUESTRE CUANTA EDAD TIENE EN MESES Y DIAS 


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto009 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
         
        System.out.print("** DIGITE SUE EDAD................:");
        int edad = leer.nextInt();
        int mes = edad*12;
        int dias = edad*365;
        System.out.println("** TUS DIAS SON LOS SIGUIENTES....:"+ dias);
        System.out.println("** TUS MESES SON LOS SIGUIENTES...:"+ mes);       
    }   
}
