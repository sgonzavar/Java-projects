//se tiene un salario de un empleado, calcular se nuevo salario el cual tiene un
// aumento del 8%


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto004 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("DIGITE SALARIO ACTUAL....: ");
        float salarioactual = leer.nextFloat();
        float aumento = (float) (salarioactual * 0.08);
        float nuevosalario = salarioactual + aumento;
        System.out.println("SU NUEVO SALARIO ES.....: " + nuevosalario);
        
    }   
}
