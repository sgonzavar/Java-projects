//SE TIENE EL NOMBRE,LA EDAD Y EL GENERO DE UNA PERSONA. REALIZA UN ALGORITMO QUE 
//MUESTRE EL MENSAJE 50 PESOS SI ES HOMBRE MENOR DE EDAD, 500 PESOS SI ES MUJER 
//MAYOR DE EDAD, NINGUN MENSAJE EN OTRO CASO.


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto028 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
       
        System.out.println("** DIGITE 1 SI ES MUJER ");
        System.out.print("** DIGITE 0 SI ES HOMBRE:");
        int genero = leer.nextInt();
        System.out.print("** DIGITE EDAD..........: ");
        int edad = leer.nextInt();
        if (edad >= 18 && genero == 1){
            System.out.println(" 500 PESOS");
        }else{
            if (edad  < 18 && genero == 0){
                System.out.println(" 50 PESOS");
            }
        }                                 
    }   
}
