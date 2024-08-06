package demoarreglos1;

import java.util.Random;
import java.util.Scanner;

public class DemoArreglos1 {

    private static int vec[];
    private static Scanner sc = new Scanner(System.in);
    private static int n;
    
    public static void main(String[] args) {
        llenarArreglo();
        mostrarArreglo();
        sumarElementos();
        promedio();
        numeroMayor();
        numeroMenor();
        ordenar();
        mostrarArreglo();
        pares();
        impares();
        primos();
        compuestos();
    }

    private static void llenarArreglo() {
        System.out.print("Cuantos elementos desea? ");
        n = sc.nextInt();
        vec = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            vec[i] = rd.nextInt(100);
        }
    }

    private static void mostrarArreglo() {
        for (int i = 0; i < n; i++) {
            System.out.println("vec[" + i + "]=" + vec[i]);
        }
    }

    private static void sumarElementos() {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vec[i];
        }
        System.out.println("La suma es: " + suma);
    }

    private static void promedio() {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vec[i];
        }
        double promedio = (double)suma / n;
        System.out.println("El promedio es: " + promedio);
    }

    private static void numeroMayor() {
        int mayor = 0;
        for (int i = 0; i < n; i++) {
            if(vec[i] > mayor) {
                mayor = vec[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }

    private static void numeroMenor() {
        int menor = 99;
        for (int i = 0; i < n; i++) {
            if(vec[i] < menor) {
                menor = vec[i];
            }
        }
        System.out.println("El menor es: " + menor);
    }

    private static void ordenar() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {        
                if(vec[i] > vec[j]) {
                    int aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                }
            }
        }
    }

    private static void pares() {
        System.out.println("Los pares son: ");
        for (int i = 0; i < n; i++) {
            if(esPar(vec[i])) {
                System.out.println("vec[" + i + "]=" + vec[i]);
            }
        }
    }

    private static boolean esPar(int x) {
        return x % 2 == 0;
    }

    private static void impares() {
        System.out.println("Los impares son: ");
        for (int i = 0; i < n; i++) {
            if(!esPar(vec[i])) {
                System.out.println("vec[" + i + "]=" + vec[i]);
            }
        }
    }

    private static void primos() {
        System.out.println("Los primos son: ");
        for (int i = 0; i < n; i++) {
            if(esPrimo(vec[i])) {
                System.out.println("vec[" + i + "]=" + vec[i]);
            }
        }
    }

    private static boolean esPrimo(int x) {
        if(x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x % i == 0) return false;
        }
        return true;
    }

    private static void compuestos() {
        System.out.println("Los compuestos son: ");
        for (int i = 0; i < n; i++) {
            if(!esPrimo(vec[i])) {
                System.out.println("vec[" + i + "]=" + vec[i]);
            }
        }
    }
    
}
