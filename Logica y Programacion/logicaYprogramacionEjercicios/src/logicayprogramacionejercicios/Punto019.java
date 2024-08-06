// DE UN EMPLEADO SE CONOCE EL NOMBRE, EL SALARIO DE HORAS TRABAJADAS Y EL VALOR DE LA HORA.
//SE LE HACE UNA DEDUCCION DE SALUD DE EL 2% Y UNA DEDUCCION DE PENSION DE 3% 
//REALIZA UN ALGOTIRMO QUE MUESTRE EL SALARIO BRUTO, LA DEDICCION DE SALUD Y PENSION,
// Y EL SALARIO NETO
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto019 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("** DIGITE SU NOMBRE..................: ");
        String nombre = leer.next();
        System.out.print("** DIGITE NNUMERO DE HORAS TRABAJADAS:  ");
        int numerodehoras =  leer.nextInt();        
        System.out.print("** DIGITE VALOR DE LA HORA TRABAJADA.:  ");
        double valordehora =  leer.nextDouble();
        double salariobruto = numerodehoras * valordehora; 
        double deduccionsalud = salariobruto*0.03;
        double deduccionpension = salariobruto*0.02;
        double salarioneto = (salariobruto - deduccionpension)-deduccionsalud;
        System.out.println("** EL SALARIO BRUTO ES....: " + salariobruto);
        System.out.println("** LA DEDUCCION DE SALUD..: " + deduccionsalud);
        System.out.println("** LA DEDUCCION DE PENSION: " + deduccionpension);
        System.out.println("** EL SALARIO NETO ES.....: " + salarioneto);
    }
}
