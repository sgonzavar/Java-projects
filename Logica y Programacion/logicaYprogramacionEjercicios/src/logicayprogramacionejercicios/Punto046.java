//SE TIENE 4 NUMEROS ENTEROS DISTINTOS, REALIZA UN ALGORITMO QUE MUESTRE EL MAYOR
//Y EL MENOR
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto046 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("DIGITE NUMERO 1 :");
        int a = leer.nextInt();
        System.out.print("DIGITE NUMERO 2 :");
        int b = leer.nextInt();
        System.out.print("DIGITE NUMERO 3 :");
        int c = leer.nextInt();
        System.out.print("DIGITE NUMERO 4 :");
        int d = leer.nextInt();

        int numeromayor = mayor(a, b, c, d);
        System.out.println("EL NUMERO MAYOR ES " + numeromayor);
        int numeromenor = menor(a, b, c, d);
        System.out.println("EL NUMERO MENOR ES " + numeromenor);
    }

    private static int mayor(int a, int b, int c, int d) {
        int mayor = 0;
        if (a > b && a > c && a > d) {
            mayor = a;
        } else {
            if (b > a && b > c && b > d) {
                mayor = b;
            } else {
                if (c > a && c > b && c > d) {
                    mayor = c;
                } else {
                    if (d > a && d > b && d > c) {
                        mayor = d;
                    }
                }
            }
        }
        return mayor;
    }

    private static int menor(int a, int b, int c, int d) {
        int menor = 0;
        if (a < b && a < c && a < d) {
            menor = a;
        } else {
            if (b < a && b < c && b < d) {
                menor = b;
            } else {
                if (c < a && c < b && c < d) {
                    menor = c;
                } else {
                    if (d < a && d < b && d < c) {
                        menor = d;
                    }
                }
            }
        }
        return menor;
    }

}
