package desarrollotallerprogramaciondezulu;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String args[]) {
        Scanner TH = new Scanner(System.in); //pido datos de entrada

        System.out.print("Ingrese El Año A Calcular:    ");
        int ano = TH.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    System.out.println("El Ano"+ " " + ano + " " + "Es Biciesto");
                } else {
                    System.out.println("El Ano"+ " " + ano + " " + "No Es Biciesto");
                }
            } else {
                System.out.println("El Ano"+ " " + ano + " " + "Es Biciesto");
            }
        } else {
            System.out.println("El Ano"+ " " + ano + " " + "No Es Biciesto");
        }
    }
}
