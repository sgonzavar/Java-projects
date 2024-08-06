//REALIZA UN ALGORITMO QUE LE PERMITA AL USUARIO INGRESAR SOLO NUMEROS NEGATIVOS AL FINAL MOSTRAR
//LA SUMA DE ELLOS.

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto059 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        int numero = 0, acomulador = 0;
        System.out.println("DIGITE UN NUMERO ");
        System.out.print("PASA SALIR DIGITE UN NUMERO POSITIVO O 0 : ");
        numero = leer.nextInt();
        while (numero < 0) {
            System.out.print("INGRESE NUMERO : ");
            acomulador = acomulador + numero;
            System.out.println("DIGITE UN NUMERO ");
            System.out.print("PASA SALIR DIGITE UN NUMERO POSITIVO O 0 : ");
            numero = leer.nextInt();
        }
        System.out.println("LA SUMA ES " + acomulador);
    }   
}
