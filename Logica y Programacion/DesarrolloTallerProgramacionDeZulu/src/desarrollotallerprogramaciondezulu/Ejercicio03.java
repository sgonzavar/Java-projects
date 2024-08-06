package desarrollotallerprogramaciondezulu;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String args[]) {
        Scanner TH = new Scanner(System.in); //pido datos de entrada

        System.out.print("Ingrese numero 1:    ");
        int a = TH.nextInt();
        System.out.print("Ingrese numero 2:    ");
        int b = TH.nextInt();
        System.out.print("Ingrese numero 3:    ");
        int c = TH.nextInt();
        
        // REalizmaos las comparaciones 
        if (a > b && a > c) {
            System.out.println("El numero Mayor es:  " + a);
        } else {
            if (a < b && a < c) {
                System.out.println("El numero Menor es:  " + a);
            } else {
                System.out.println("El numero De el medio :  " + a);
            }
        }

        if (b > a && b > c) {
            System.out.println("El numero Mayor es:  " + b);
        } else {
            if (b < a && b < c) {
                System.out.println("El numero Menor es:  " + b);
            } else {
                System.out.println("El numero De el medio :  " + b);
            }
        }

        if (c > a && c > b) {
            System.out.println("El numero Mayor es:  " + c);
        } else {
            if (c < a && c < b) {
                System.out.println("El numero Menor es:  " + c);
            } else {
                System.out.println("El numero De el medio :  " + c);
            }
        }
    }
}
