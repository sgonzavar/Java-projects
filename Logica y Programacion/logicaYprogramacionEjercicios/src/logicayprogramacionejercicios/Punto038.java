//CIERTA COMPAÑIA DE FLETES TIENE LAS SIGUIENTES TARIFAS ENTRE BOSTON Y LOS ANGELES 
//75$ POR TONELADAS PARA LA PRIMERAS 10 TONELADAS Y 35$ POR TONELADA PARA CADA
//TONELADA QUE PASE LAS 10. HACER UN ALGORITMO PARA CALCULAR EL COSTO DE UN 
//CARGAMENTO DE N TONELADAS.


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto038 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("** DIGITE NUMERO DE TONELADAS..:");
        int N = leer.nextInt();
        int costo;
        if(N <= 10 ){
            costo = N * 75;
        }else{
            costo = 75 * 10 + (N-10)*35;
        }
        
        System.out.println("** EL COSTO ES.................:" + costo);
      
    }   
}
