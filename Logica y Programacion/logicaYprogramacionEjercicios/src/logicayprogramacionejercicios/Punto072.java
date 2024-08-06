//realiza un algoritmo que permita crear un vector con 20 edades y luego mostrarlas desde la ultima a la 
//primera


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto072 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        int edad[] = new int [20];
        for (int i = 0; i <= 19; i++) {
            System.out.print("Digite edad : ");
            edad[i] = leer.nextInt();
        }
        for (int i = 19; i >= 0 ; i--) {
           System.out.println("Edades " + edad[i]); 
        }
    
    
    }   
}
