//TENIEDO PRESENTE QUE POR CADA 5.000 KM RECORRIDO SE DEBE HACER UN CAMBIO DE 
//ACEITE, CONSTRUIR UN ALGORITMO QUE DETERMINE CUANTOS CAMBIO DE ACEITE SE LE 
//Q UN VEHICULO CONOCIENDO SUS KM.

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto022 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("** DIGITE KILOMETROS QUE DESEA CALCULAR:  ");
        double kilometros = leer.nextDouble();
        int cambios = (int) (kilometros/5000);
        System.out.println("** LOS CAMBIOS SON LOS SIGUIENTES....:   " + cambios);  
    }   
}
