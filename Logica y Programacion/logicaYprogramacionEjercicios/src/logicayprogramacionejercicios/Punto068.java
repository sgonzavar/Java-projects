// realiza un algoritmo que lea la edad de N personas y muestre cuantas
//son mayores de edad y cuantos menores de edad, ademas mostrar el promedio de edad de
//los menores de edad y mostrar el productor de edad de los mayores de edad
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto068 {

    private static float acomuladormayores = 0, acomuladormenores = 0;
    private static int edad, contadormayores = 0, contadormenores = 0;
    private static float promediomenores, promediomayores;

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.print("Digite Cantidad de personas..: ");
        int  n = leer.nextInt();
        verificarEdad(n);
        verificarMayores();
        verificarMenores();

    }

    private static void verificarEdad(int n) {
        Scanner leer = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite Edad : ");
            edad = leer.nextInt();
            if (edad >= 18) {
                acomuladormayores = acomuladormayores + edad;
                contadormayores += 1;
            } else {
                acomuladormenores += edad;
                contadormenores += 1;
            }
        }
    }

    private static void verificarMayores() {
        if (contadormayores == 0) {
            System.out.println("NO HAY MAYORES DE EDAD");
        } else { 
            promediomayores = acomuladormayores / contadormayores;
            System.out.println("Hay " + contadormayores + " Mayores de edad ");

        }
    }

    private static void verificarMenores() {
     if (contadormenores == 0) {
            System.out.println("NO HAY MENORES DE EDAD");
        } else { 
            promediomenores = acomuladormenores / contadormenores;
            System.out.println("Hay " + contadormenores + " Menores de edad ");

        }
    }

}
