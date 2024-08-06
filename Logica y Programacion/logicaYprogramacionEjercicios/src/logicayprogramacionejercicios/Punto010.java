//DEACUERDO CON LAS HORAS TRABAJADAS, EL VALOR HORA Y EK PORCENTAJE DE RENETCION 
//EN LA FUENTE, REALICE UN ALGORITMO QUE MUESTRE EL NOMBRE DEL EMPLEADO, SU SALARIO
//BRUTO, EL VALOR DE RETENCION Y SALARIO NETO.


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto010 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
         
        System.out.print("*DIGITE SU NOMBRE........................:");
        String nombre = leer.next();
        System.out.print("*DIGITE SU NUMERO DE HORAS TRABAJADAS....:");
        int horastrabajadas = leer.nextInt();
        System.out.print("DIGITE VALOR DE LA HORA .................:");
        int valordelahora = leer.nextInt();
        System.out.print("*DIGITE PORCENTAJE DE RETENCION..........:");
        int retencion = leer.nextInt();
        
        
        System.out.println("*SU NOMBRE ES EL SIGUIENTE................:"+   nombre);
        int salariobruto = valordelahora * horastrabajadas;
        int valorderetencion = salariobruto * retencion/ 100;
        int salarioneto = salariobruto - valorderetencion;
         System.out.println("*SU SALARIO BRUTO ES EL SIGUIENTE........:"+  salariobruto);
         System.out.println("*EL VALOR DE RETENCION ES EL SIGUIENTE...:"+  retencion);
         System.out.println("*EL SALARIO NETO ES EL SIGUIENTE.........:"+  salarioneto);                      
    }   
}










