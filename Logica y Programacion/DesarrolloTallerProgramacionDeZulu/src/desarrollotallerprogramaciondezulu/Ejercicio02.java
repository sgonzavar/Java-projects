package desarrollotallerprogramaciondezulu;

import java.util.Scanner;

public class Ejercicio02 {

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
            if (b > a && b > c) {
                System.out.println("El numero Mayor es:  " + b);
            } else {
                if (c > a && c > b) {
                    System.out.println("El numero Mayor es:  " + c);
                }
            }

        }

    }    

}
