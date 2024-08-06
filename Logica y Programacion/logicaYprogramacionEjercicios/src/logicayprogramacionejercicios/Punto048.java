//EL ITM DESEA HACER UN PLAN DE DESCUENTO PARA LOS ESTUDIANTES DE SISTEMAS, GESTION ADMINISTRATIVA
//Y ELECTRONICA. SI ES DE SISTEMAS Y EL ESTRATO ES MENOR A 3 Y ES MENOR DE EDAD, SE LE HACE UN DESCUENTO
//DEL 10%, SI ES ESTUDIANTE DE GESTION ADMINISTRATIVA Y EL PATRIMONIO ES MENOR A 50000000 SE LE HACE UN
//DESCUENTO DEL 7%, SI ES ESTUDIANTE DE ELECTRONICA Y TIENE MAS DE UN HIJO TIENE UN DESCUENTO DEL 11%
//REALIZA UN ALGORITMO QUE MUIESTRE EL TOTAL A PAGAR DE LA MATRICULA. NOTA=EL VALOR DE CADA CREDITO ES DE 
//$40.000

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto048 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
       
        System.out.println("DIGITE 1 SI ES ESTUDIANTE DE SISTEMAS");
        System.out.println("DIGITE 2 SI ES ESTUDIANTE DE GESTION ADMINISTRATIVA ");
        System.out.print("DIGITE 3 SI ES ESTUDIANTE DE ELECTRONICA : ");
        int opcion = leer.nextInt();
        switch (opcion){
            case 1:
                System.out.print("DIGITE ESTRATO SOCIAL : ");
                int estrato = leer.nextInt();
                System.out.print("DIGITE EDAD DEL ESTUDIANTE : ");
                int edad = leer.nextInt();
                if (edad < 18 && estrato < 3){
                    matriculasistemas();
                }else{
                    int matricula = 16 * 40000;
                    System.out.println("EL TOTAL A PAGAR ES " + matricula);
                }
                break;
            case 2:
                System.out.print("DIGITE EL TOTAL DE SU PATRIMONIO : ");
                float patrimonio = leer.nextFloat();
                if(patrimonio < 50000000){
                    matriculagestion();
                }else{
                    int matricula = 16 * 40000;
                    System.out.println("EL TOTAL A PAGAR ES " + matricula);
                }
                break;
            case 3:
                System.out.print("DIGITE CANTIDAD DE HIJOS ");
                int cantidadhijos = leer.nextInt();
                if(cantidadhijos > 1){
                    matriculaelectronica();
                }else{
                   int matricula = 16 * 40000;
                    System.out.println("EL TOTAL A PAGAR ES " + matricula);
                }
                break;  
        }
        
    }   

    private static void matriculasistemas() {
        int matricula = (int) ((16 * 40000)-(16 * 40000 * 0.1));
        System.out.println("EL TOTAL DE PAGO ES " + matricula);
    }

    private static void matriculagestion() {
         int matricula = (int) ((16 * 40000)-(16 * 40000 * 0.07));
         System.out.println("EL TOTAL DE PAGO ES " + matricula);        
    }

    private static void matriculaelectronica() {
          int matricula = (int) ((16 * 40000)-(16 * 40000 * 0.11));
         System.out.println("EL TOTAL DE PAGO ES " + matricula);
    }
}
