//HACER UN ALGORITMO QUE LEA LA EDAD Y LOS NOMBRES DE 2 PERSONA E IMPRIMA CUAL 
//DE ELLAS TIENE MAS EDAD.


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto041 {    
    private static String nombre1;
    private static String nombre2;
    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("** DIGITE NOMBRE : ");
         nombre1 = leer.next();
        System.out.print("** DIGITE EDAD : ");
        int edad1 = leer.nextInt();
        System.out.print("** DIGITE NOMBRE : ");
         nombre2 = leer.next();
        System.out.print("** DIGITE EDAD : ");
        int edad2 = leer.nextInt();
        
        comprobaredad(edad1, edad2);
    
    
    }   

    private static void comprobaredad(int edad1, int edad2) {
        if (edad1 > edad2){
            System.out.println("** EL MAYOR ES " + nombre1 );
            System.out.println(" " + edad1 + " AÑOS ");
        }else{
            if(edad2 > edad1){
               System.out.println("** EL MAYOR ES " + nombre2 );
                System.out.println(" CON  "+ edad2 + " AÑOS " );
            }else
                System.out.println("** SON DE LA MISMA EDAD  ");
        }
    }
    
}
