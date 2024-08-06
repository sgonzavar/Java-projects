//ELAVORE UN ALGORITMO QUE LE MUESTRE AL USUARIO EL DINERO QUE AHORO EN UN AÑO.
//EL USUARIO INGRESA SU SALARIO MENSUAL, INGRESO EXTRA MENSUAL Y EL VALOR DE LOS 
//GASTOS MENSUALES.

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto024 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("** DIGITE SU SALARIO MENSUAL.........:  ");
        double salariomensual = leer.nextDouble();
        System.out.print("** DIGITE INGRESO EXTRA MENSUAL......:  ");
        double extramensual = leer.nextDouble();
        System.out.print("** DIGITE GASTOS MENSUALES...........:  ");
        double gastosmensual = leer.nextDouble();
        double ahoro = (salariomensual + extramensual - gastosmensual)*12;
       
        System.out.println("** EL AHORO ES EL SIGUIENTE........:   " + ahoro);      
    }   
}
