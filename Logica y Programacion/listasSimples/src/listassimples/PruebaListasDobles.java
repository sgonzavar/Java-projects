package listassimples;

import java.util.Scanner;

public class PruebaListasDobles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NodoDoble lista = new NodoDoble();

        System.out.print(" Digite Dato, digite o para salir : ");
        int dato = sc.nextInt();
        
        while (dato != 0) {
            lista.Inicio(dato);
            System.out.print(" Digite Dato, digite o para salir : ");
            dato = sc.nextInt();
        }
        
        System.out.print(" Digite dato : ");
        int dato1 = sc.nextInt();
        System.out.print(" Digite posicion : ");
        int pos = sc.nextInt();
        lista.insertar(dato1, pos);
        
        System.out.print(" Dgite posicion a eliminar : ");
        int p = sc.nextInt();
        lista.borrarPos(p);
        
        System.out.println(" Digite dato a eliminar ");
        dato = sc.nextInt();
        lista.borrarDato(dato);
        
        System.out.print(" La listas es ");
        lista.imprimirDesdeCabeza();
        
        
        
        
        lista.borrarRepetidos();
        
        
        

    }

}
