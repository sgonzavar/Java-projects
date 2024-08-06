package ordenacionespecial;

import java.util.Random;
import java.util.Scanner;

public class OrdenacionEspecial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Numero De Posiciones:  ");
        int n = sc.nextInt();
        int vec[] = new int[n];

        // llenar el arreglo
        int contadorPares = 0, contadorImpar = 0;
        Random rd = new Random();
        System.out.println("--ARREGLO ORIGINAL--->");
        for (int i = 0; i < n; i++) {
            int ale;
            do {
                ale = rd.nextInt(100);
            } while (esta(ale, vec, i));
            vec[i] = ale;
            if (esPar(vec[i])) {
                contadorPares++;
            } else {
                contadorImpar++;
            }
            System.out.printf(" %4d", vec[i]);
            if ((i + 1) % 20 == 0) {
                System.out.println(); // salta de linea casa 20 caracteres
            }
        }
        System.out.printf(" \nPares: %d, Impares: %d\n", contadorPares, contadorImpar);

        // Lenar el arreglo de pares  y de impare 
        int pares[] = new int[contadorPares];
        int impares[] = new int[contadorImpar];
        int k = 0, l = 0;
        for (int i = 0; i < n; i++) {
            if (esPar(vec[i])) {
                pares[k] = vec[i];
                k++;
            } else {
                impares[l] = vec[i];
                l++;
            }
        }
        // mostrar arreglos sin ordenar
        System.out.println("ARREGLO DE PARES SIN ORDENAR");
        for (int i = 0; i < contadorPares; i++) {
            System.out.printf(" %4d", pares[i]);
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("ARREGLO DE IMPARES SIN ORDENAR");
        for (int i = 0; i < contadorImpar; i++) {
            System.out.printf(" %4d", impares[i]);
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        // ordenar arreglos 

        int aux;
        for (int i = 0; i < contadorPares - 1; i++) {
            for (int j = i + 1; j < contadorPares; j++) {
                if (pares[i] < pares[j]) { // ordenamiento descendentemente
                    aux = pares[i];
                    pares[i] = pares[j];
                    pares[j] = aux;
                }
            }
        }

        int ax;
        for (int i = 0; i < contadorImpar - 1; i++) {
            for (int j = i + 1; j < contadorImpar; j++) {
                if (impares[i] > impares[j]) { // ordenamiento ascendentemente
                    ax = impares[i];
                    impares[i] = impares[j];
                    impares[j] = ax;
                }
            }
        }

        System.out.println("ARREGLO DE PARES ORDENADOS");
        for (int i = 0; i < contadorPares; i++) {
            System.out.printf(" %4d", pares[i]);
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("ARREGLO DE IMPARES ORDENADOS");
        for (int i = 0; i < contadorImpar; i++) {
            System.out.printf(" %4d", impares[i]);
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        //vaciamos arreglos ordenados al arreglo original
        for (int i = 0; i < contadorPares; i++) {
            vec[i] = pares[i];
        }
        for (int i = 0; i < contadorImpar; i++) {
            vec[i + contadorPares] = impares[i];
        }
        System.out.println();

        System.out.println("El Vector Ordenado Especialmente Queda Asi:  ");
        for (int i = 0; i < n; i++) {
            System.out.printf(" %4d", vec[i]);
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }

    private static boolean esPar(int vec) {
        return vec % 2 == 0;
    }

    private static boolean esta(int ale, int[] vec, int n) {
        for (int i = 0; i < n; i++) {
            if (ale == vec[i]) {
                return true;                                   
            }
        }
        return false;
    }
}
