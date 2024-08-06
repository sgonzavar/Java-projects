//EN UN CONCESIONARIO SE VENDE UNA VARIEDAD DE MOTOS, EL VALOR COBRADO DEPENDE 
//DEL TIPO DE MOTO QUE SE REFERENCIE A CONTINUACION.
//TIPO 1 = MOTO DE 100CC 2900000 PESOS
//TIPO 2 = MOTO DE 110CC 3650000 PESOS
//TIPO 3 = MOTO DE 125CC 4000000 PESOS
//TIPO 4 = MOTO DE 250CC 6000000 PESOS


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto043 {    
    private static int cantidad;
      
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        System.out.print(" ** DIGITE EL TIPO DE MOTO: ");
        int tipo = leer.nextInt();
        
        switch (tipo){
            case 1:
                System.out.print(" DIGITE CANTIDAD : ");
                cantidad = leer.nextInt();
                tipo1(cantidad);
                break;
            case 2:
                System.out.print(" DIGITE CANTIDAD : ");
                cantidad = leer.nextInt();
                tipo2(cantidad);
                break;
            case 3:
                System.out.print(" DIGITE CANTIDAD : ");
                cantidad = leer.nextInt();
                tipo3(cantidad);
                break;
            case 4:
                System.out.print(" DIGITE CANTIDAD : ");
                cantidad = leer.nextInt();
                tipo4(cantidad);
                break;    
        }
        
    }   

    private static void tipo1(int cantidad) {
        int total = cantidad * 2900000;
        if(cantidad >= 3){
            total = (int) (total - (total * 0.15));
        }
        System.out.println("**  EL TOTAL DE LA COMPRA ES " + total);
    }

    private static void tipo2(int cantidad) {
       int total = cantidad * 3650000;
        if(cantidad >= 3){
            total = (int) (total - (total * 0.15));
        }
        System.out.println("**  EL TOTAL DE LA COMPRA ES " + total); 
    }

    private static void tipo3(int cantidad) {
        int total = cantidad * 4000000;
        if(cantidad >= 3){
            total = (int) (total - (total * 0.15));
        }
        System.out.println("**  EL TOTAL DE LA COMPRA ES " + total); 
    }

    private static void tipo4(int cantidad) {
        int total = cantidad * 6000000;
        if(cantidad >= 3){
            total = (int) (total - (total * 0.15));
        }
        System.out.println("**  EL TOTAL DE LA COMPRA ES " + total);
    }

    
}
