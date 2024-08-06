//REALIZA UN ALGORITMO PARA SABER SI UN NUMERO ES PAR O IMPAR


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto032 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("** DIGITE NUMERO QUE DESEA CALCULAR......:  ");
        int numero = leer.nextInt();
        if(numero % 2 == 0 ){
            System.out.println("** EL NUMERO ES PAR " + numero);
        }else{
            System.out.println("** EL NUMERO ES IMPAR " + numero);
        }           
    }   
}
