//REALIZA UN ALGORITMO QUE LEA UNA SERIE DE NUMEROS Y LOS SUME. EL ALGORITMO DEBE PREGUNTAR AL USUARIO
//CUANDO DESEA INGRESAR UN SIGIENTE DATO, SI EL USUARIO DESEA CONTINUAR INGRESANDO DATOS Y SI EL USUARIO
//CONFIRMA SU DECEO DE SALIR, EL ALGORITMO DEBE MOSTRAR LA SUMA DE LOS DATOS LEIDOS Y TERMINAR
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto058 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suiche = 0, acomulador = 0;
        System.out.println("DIGITE 1 SI HAY DATO ");
        System.out.print("DIGITE 2 SI NO HAY DATO : ");
        suiche = leer.nextInt();
        while (suiche == 1) {
            System.out.print("INGRESE NUMERO : ");
            int numero = leer.nextInt();
            acomulador = acomulador + numero;
            System.out.println("DIGITE 1 SI HAY DATO ");
            System.out.print("DIGITE 2 SI NO HAY DATO : ");
            suiche = leer.nextInt();
        }
        System.out.println("LA SUMA ES " + acomulador);

    }

}
