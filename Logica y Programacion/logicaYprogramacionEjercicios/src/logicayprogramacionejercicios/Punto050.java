//A UN TRABAJADOR LE PAGAN SEGUN SUS HORAS UNA Y UNA TARIFA DE PAGO POR HORA, CUANDO LAS HORAS TRABAJADAS 
//SON MAYORES A 80 LA TARIFA DE PAGO SE INCREMENTA UN 20% PARA EL RESTO DE LAS HORAS. 
//HAGA UN ALGORITMO QUE IMPRIMA EL NOMBRE DEL TRABAJADOR Y EL VALOR TOTAL A PAGAR

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto050 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
       
        System.out.print("DIGITE SU NOMBRE : ");
        String nombre = leer.next();
        System.out.print("DIGITE EL TOTAL DE HORAS TRABAJADAS : ");
        int horas = leer.nextInt();
        System.out.print("DIGITE EL VALOR DE LA HORA ");
        int valorbruto = leer.nextInt();
        salario(horas,valorbruto,nombre);
    }   

    private static void salario(int horas, int valorbruto, String nombre) {
        int aumento = 0;
        if(horas > 80){
           aumento = (int) (valorbruto * 0.2);
       }else{
           System.out.println("NO TIENE DESCUENTO");
       }
       int salario = (horas*valorbruto)+aumento;
        System.out.print("" + nombre + " ");
        System.out.println("SU SALARIO ES EL SIGUIENTE : " +salario );
    }
}
