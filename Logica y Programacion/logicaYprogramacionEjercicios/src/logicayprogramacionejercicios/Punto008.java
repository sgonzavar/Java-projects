//UNA PERSONA GANA AL MES CIERTA SUMA DE DINERO Y LA DISTRUBUYE GENERALMENTE EN:
//ARRIENDO 35% SERVIVIOS PUBLICOS25% OTROS GASTOS 40%
//MUESTRE EL NOMBRE DE LA PERSONA Y LA CANTIDAD DE DINERO QUE GASTA EN CADA ITEM.


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto008 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("** DIGITE SU NOMBRE ................:  ");
        String nombre= leer.next();
        System.out.print("** DIGITE SU SALARIO................:  ");
        double salario = leer.nextDouble();
        double arriendo = salario * 0.45;
        double serviciospublicos = salario*0.25;
        double otrosgastos = salario*0.40;
        System.out.println("** SU NOMBRE ES EL SIGUIENTE......:" + nombre);
        System.out.println("** GASTOS POR ARRIENDO............:" + arriendo);
        System.out.println("** GASTOS POR SERVIVIOS PUBLICOS..:" + serviciospublicos);
        System.out.println("** GASTOS EN OTRAS COSAS..........:" + otrosgastos);
                         
    }  
}
