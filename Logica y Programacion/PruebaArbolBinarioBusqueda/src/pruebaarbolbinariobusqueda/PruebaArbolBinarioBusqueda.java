package pruebaarbolbinariobusqueda;

import java.util.Random;
import java.util.Scanner;

public class PruebaArbolBinarioBusqueda {

    public static void main(String[] args) {
        Random rd = new Random();
        ArbolBinario arbol = new ArbolBinario();

        for (int i = 0; i < 20; i++) {
            int num = rd.nextInt(100);
            System.out.print(num + "   ");
            arbol.insercion(num);
        }

        System.out.println("\nPRE-ORDEN");
        arbol.preOrden();
        System.out.println("\nPOST-ORDEN");
        arbol.PostOrden();
        System.out.println("\nIN-ORDEN");
        arbol.inOrden();
        Scanner sc = new Scanner(System.in);
        int dato;
        do {
            System.out.println();       
            System.out.println();
            System.out.print(" Digite dato a buscar o -1 para terminar : ");
            dato = sc.nextInt();
            if (dato == -1) {
                break;
            }
            arbol.Busqueda(dato);
        } while (true);
    }
}