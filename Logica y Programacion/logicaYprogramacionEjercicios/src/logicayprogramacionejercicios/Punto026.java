//REALIZA UN ALGORITMO QUE DETERMINE SI UNA PERSONA ES MAYOR DE EDAD O NO.


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto026 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
       
        System.out.print("** DIGITE EDAD: ");
        int edad = leer.nextInt();
        
        if (edad >= 18){
            System.out.println(" ES MAYOR DE EDAD ");
        }else{
            System.out.println(" ES MENOR DE EDAD ");
        }                                  
    }   
}
