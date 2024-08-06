//UN ESTUDIANTE TIENE LA NOTA DEL 60% DE LOGICA, REALIZA UN ALGORITMO QUE
//MUESTRE LA NOTA MINIMA QUE EL ESTUDAINTE DEBE SACAR EN EL 40% PARA PODER
//SACAR UN MINIM DE 3.0 EN LA DEFINITIVA.


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto021 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
       
        System.out.print("** DIGITAR NOTA...:");
        float nota = leer.nextFloat();
        float a =  (float) (nota * 0.6);
        float b = 3 - a;
        float notadefinitiva = (float) (b/0.4);
        System.out.println("  EL RESULTADO ES: " + notadefinitiva);        
    }   
}
