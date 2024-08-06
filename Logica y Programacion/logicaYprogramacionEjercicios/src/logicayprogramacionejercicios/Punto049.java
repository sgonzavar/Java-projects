//EN UN PARQUE DE DIVERSIONES EXISTEN 3 TARIFAS: NIÑO, JOVEN, ADULTO.
//NIÑOS DE 1 A 8 AÑOS PAGAN 2.000
//JOVEN DE 9 A 17 AÑOS PAGA 10.000, SI EL JOVEN ESTUDIA SE LE DESCUENTA EL 20%
//ADULTO PAGAN 20.000
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto049 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("DIGITE SU NOMBRE : ");
        String nombre = leer.next();
        System.out.print("DIGITE SU EDAD : ");
        int edad = leer.nextInt();
        int respuesta = 0;
        if (edad > 17 && edad < 19) {
            System.out.print("DIGITE 1 SI ESTUDIA 2 DE LO CONTARIO :");
            respuesta = leer.nextInt();
        }
        tarifa(edad, nombre, respuesta);
    }

    private static void tarifa(int edad, String nombre, int respuesta) {
        if (edad > 1 && edad <= 8) {
            System.out.println("" + nombre);
            System.out.println("EL TOTAL A PAGAR ES $2.000 ");
        } else {
            if (edad > 9 && edad <= 17) {
                if (respuesta == 1) {
                    int tarifa = (int) (10000 - (10000 * 0.2));
                    System.out.println("" + nombre);
                    System.out.println("EL TOTAL A PAGAR ES $" + tarifa);
                } else {
                    System.out.println("" + nombre);
                    System.out.println("EL TOTAL A PAGAR ES $10.000 ");
                }
            } else {
                System.out.println("" + nombre);
                System.out.print("EL TOTAL A PAGAR ES $20.000 ");
            }
        }
    }

}
