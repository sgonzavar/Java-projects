package demomatriz;

import java.util.Random;
import java.util.Scanner;

public class DemoMatriz {

    private static int n;
    private static int Mat[][];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    crearMatriz();
                    break;
                case 2:
                    mostrarMatriz();
                    break;
                case 3:
                    mostrarDigonalPrincipal();
                    break;
                case 4:
                    mostrarDiagonalSegundaria();
                    break;
                case 5:
                    mostrarDiagonalPrincipalInversa();
                    break;
                case 6:
                    mostrarDiagonalSegundariaInversa();
                    break;
                case 7:
                    mostrarTrianguloraInferio();
                    break;
                case 8:
                    mostrarTriangulorSuperior();
                    break;

            }

        } while (opc != 0);

    }

    private static int menu() {
        System.out.println("..***MENU***..");
        System.out.println("1.  Crear Matriz ");
        System.out.println("2.  Mostrar Matriz");
        System.out.println("3.  Mostrar Diagonal Principal");
        System.out.println("4.  Mostrar Diagonal Segundaria");
        System.out.println("5.  Mostrar Diagonal Principal Inversa");
        System.out.println("6.  Mostrar Diagonal Segundaria Inversa");
        System.out.println("7.  Mostrar triangulora inferio");
        System.out.println("8.  Mostrar triangulor Superior");
        System.out.println("0.  Salir  ");
        System.out.print(" Digita Tu Opcion..: ");
        return sc.nextInt();

    }

    private static void mostrarMatriz() {
        System.out.println("===>  MOSTRAR MATRIZ  <===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", Mat[i][j]);

            }
            System.out.println();
        }

    }

    private static void crearMatriz() {
        System.out.println("===>  CREAR MATRIZ  <===");
        System.out.print("De que orden queres ");
        n = sc.nextInt();
        Mat = new int[n][n]; // instanciar matriz 
        Random Rd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Mat[i][j] = Rd.nextInt(100);

            }

        }
    }

    private static void mostrarDigonalPrincipal() {
        System.out.println("===>  MOSTRAR DIAGONAL PRINCIPAL  <===");
        for (int i = 0; i < n; i++) {

            System.out.printf("%4d", Mat[i][i]);

        }
        System.out.println();
    }

    private static void mostrarDiagonalSegundaria() {
        System.out.println("===>  MOSTRAR DIAGONAL SEGUNDARIA  <===");

        for (int i = 0; i < n; i++) {

            System.out.printf("%4d", Mat[i][n - i - 1]);

        }
        System.out.println();
    }

    private static void mostrarDiagonalPrincipalInversa() {
        System.out.println("===>  MOSTRAR DIAGONAL PRINCIPAL INVERSA  <===");
        for (int i = 0; i < n; i++) {

            System.out.printf("%4d", Mat[n - i - 1][n - i - 1]);

        }
        System.out.println();
    }

    private static void mostrarDiagonalSegundariaInversa() {
        System.out.println("===>  MOSTRAR DIAGONAL SEGUNDARIA INVERSA<===");

        for (int i = 0; i < n; i++) {

            System.out.printf("%4d", Mat[n - i - 1][i]);

        }
        System.out.println();
    }

    private static void mostrarTrianguloraInferio() {
        System.out.println("===>  MOSTRAR TRIANGULAR INFERIOR DE LA MATRIZ  <===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf(Mat[i][j] + "\t");

            }
            System.out.println();
        }
    }

    private static void mostrarTriangulorSuperior() {
        System.out.println("===>  MOSTRAR TRIANGULAR SUPERIOR DE LA MATRIZ  <===");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <=j; i++) {
                System.out.printf(Mat[i][j] + "\t");
    
            }
            System.out.println();
        }
    }
}
