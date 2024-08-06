package demoarreglos;

import java.util.Scanner;

public class DemoArreglos {

    private static Scanner sc = new Scanner(System.in);
    private static int vec[];
    private static int n;
    private static int k;

    public static void main(String[] args) {
        System.out.print("n? ");
        n = sc.nextInt();
        vec = new int[n];
        llenarArreglo();
        mostrarArreglo();
        String rta;
        do {
            System.out.print("Digite el numero que desea buscar: ");
            int ele = sc.nextInt();
            int pos = buscar(ele);
            if (pos == -1) {
                System.out.println("Elemento no encontrado");
            } else {
                System.out.println("Elemento encontrado en la posicion .[" + pos + "]");
            }
            System.out.print("Desea buscar otro S/N? ");
            rta = sc.next();

        } while (rta.equalsIgnoreCase("s"));

        System.out.print("Desea sumar los Datos....: 1:si, 0:no ");
        int H = sc.nextInt();
        int h = SumarArreglo(H);
        if (H == 1) {
            System.out.println("La Suma Es......:" + h);
        } else {
            System.out.println("No se efectua la Suma ");
        }

        System.out.print("Desea Saber El Promedio De El Vector..:1:si, 0:no  ");
        int X = sc.nextInt();
        int x = (int) PromedioVector(h);
        if (X == 1) {
            System.out.println("El Promedio es ......:" + x);
        } else {
            System.out.println("No se efectua el promedio ");
        }

        System.out.print("Desea Saber El Numero Mayor De El Vector..:1:si, 0:no  ");
        int Z = sc.nextInt();
        int z = BuscarMayor();
        if (Z == 1) {
            System.out.println("El Numero Mayor Es:  " + z);
        } else {
            System.out.println("No se efectua la busqueda  ");
        }

        System.out.print("Desea Saber El Numero Menor De El Vector..:1:si, 0:no  ");
        int M = sc.nextInt();
        int m = BuscarMenor();
        if (M == 1) {
            System.out.println("El Numero Menor Es:  " + m);
        } else {
            System.out.println("No se efectua la busqueda  ");
        }

        System.out.print("Desea Saber Los Numeros Pares..:1:si, 0:no  ");
        int P = sc.nextInt();
        if (P == 1) {
            NumerosPares();
        } else {
            System.out.println("No se efectua la busqueda  ");
        }

        System.out.print("Desea Saber Los Numeros ImPares..:1:si, 0:no  ");
        int L = sc.nextInt();
        if (L == 1) {
            NumerosImpares();
        } else {
            System.out.println("No se efectua la busqueda  ");
        }

        int B, b;
        do {
            System.out.print("Desea Ordenar El Vector..:1:si, 0:no  ");
            B = sc.nextInt();
            if (B == 1) {

                System.out.print(" Desea Ordenar  Ascendentemente : si = 1,Descendentemente : si = 2  :  ");
                b = sc.nextInt();
                OrdenamientoVector(b);
            }
        } while (B != 0);
        NumerosPrimosYcompuestos();
    }

    private static void llenarArreglo() {
        for (int i = 0; i < n; i++) {
            System.out.print("Pos " + i + ": ");
            vec[i] = sc.nextInt();
        }
    }

    private static void mostrarArreglo() {
        for (int i = 0; i < n; i++) {
            System.out.println("Vec[" + i + "] = " + vec[i]);
        }
    }

    private static int buscar(int ele) {
        for (int i = 0; i < n; i++) {
            if (vec[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    private static int SumarArreglo(int H) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma = suma + vec[i];
        }
        return suma;
    }

    private static double PromedioVector(int h) {

        double promedio = (double) h / n;
        return promedio;
    }

    private static int BuscarMayor() {
        int w = - 999999;

        for (int i = 0; i < n; i++) {

            if (vec[i] > w) {
                w = vec[i];
            }
        }
        return w;
    }

    private static int BuscarMenor() {
        int q = 999999999;

        for (int i = 0; i < n; i++) {

            if (vec[i] < q) {
                q = vec[i];
            }
        }
        return q;
    }

    private static void NumerosPares() {
        int a = 0;
        for (k = 0; k < n; k++) {
            if (vec[k] % 2 == 0) {
                a = a + 1;
                System.out.println("Los Numero Pares Son....: [ " + vec[k] + "]");

            }
        }
        if (a == 0) {
            System.out.println("NO HAY NUMEROS PARES");
        }
    }

    private static void NumerosImpares() {
        int a = 0;
        for (k = 0; k < n; k++) {
            if (vec[k] % 2 == 1) {
                a = a + 1;
                System.out.println("Los Numero Impares Son....: [ " + vec[k] + "]");

            }
        }
        if (a == 0) {
            System.out.println("NO HAY NUMEROS IMPARES");
        }
    }

    private static void OrdenamientoVector(int b) {
        int aux;
        if (b == 1) {
            for (k = 0; k < n - 1; k++) {
                for (int j = k + 1; j < n; j++) {

                    if (vec[k] < vec[j]) {
                        aux = vec[k];
                        vec[k] = vec[j];
                        vec[j] = aux;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println("Vec[" + i + "] = " + vec[i]);
            }

        } else {
            if (b == 2) {
                for (k = 0; k < n - 1; k++) {
                    for (int j = k + 1; j < n; j++) {

                        if (vec[k] > vec[j]) {
                            aux = vec[k];
                            vec[k] = vec[j];
                            vec[j] = aux;
                        }
                    }
                }

                for (int i = 0; i < n; i++) {
                    System.out.println("Vec[" + i + "] = " + vec[i]);
                }
            }
        }
    }

    private static void NumerosPrimosYcompuestos() {

        int contador = 0;
        System.out.println(" Los Siguientes Numeros Son O Primos "
                + " O Compuestos......: ");

        for (k = 0; k < n; k++) {
            for (int j = 1; j <= vec[k]; j++) {
                if (vec[k] % j == 0) {
                    contador = contador + 1; 
                }
            }
        }

        if (contador == 1) {
            System.out.print("Vec[" + k + "] = " + vec[k] + " .Es El Numero Uno"
                    + "No Es Primo Ni Compuesto. ");
        } else {
            if (contador == 2) {
                System.out.print("Vec[" + k + "] = " + vec[k] + " .Es Primo. ");
            } else {
                if (contador > 2) {
                    System.out.print("Vec[" + k + "] = " + vec[k] + " .Es Compuesto. ");
                }
            }
         }
    
    }    
}