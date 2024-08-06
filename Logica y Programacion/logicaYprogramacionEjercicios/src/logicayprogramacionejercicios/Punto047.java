//UNA PERSONA SE PRESENTA PARA UNA ENTREVISTA Y LE HACEN UNA PRUEBA QUE COSTA DE
//20 PREGUNTAS LA EMPRESA TIENE COMO POLITICA CONTRATAR A LA PERSONA SIEMPRE Y CUANDO
//SU PORCENTAJE SEA MAYOR O IGUAL A 80%, TENIENDO EN CUENTA QUE: LAS PREGUNTAS 
//ACERTADAS DAN 4 PUNTOS, LAS NO ACERTADAS DAN -1, Y LAS NO CONTESTADAS DAN 0 PUNTOS
//IMPRIMA EL NOBRE Y SI ES CONTRATADA.

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto047 {    
    private static int correctas;
    private static int incorrectas;
    private static String nombre;
    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("DIGITE SU NOMBRE : ");
        nombre = leer.next();
        System.out.print("DIGITE PREGUNTAS CORRECTAS : ");
        correctas = leer.nextInt();
        System.out.print("DIGITE PREGUNTAS INCORRECTAS : ");
        incorrectas = leer.nextInt();
        contratacion(correctas,incorrectas);
    }   

    private static void contratacion(int correctas, int incorrectas) {
        int totalcorrectas = correctas * 4;
        int resultado = totalcorrectas - incorrectas;
        if(resultado >= 64 ){
            System.out.println("  ES CONTRADADO(A)");
            System.out.println("  " + nombre);
        }else{
            System.out.println("  SIGUE INTENTANDO  ");
            System.out.println("  " + nombre);
        }
    }
}
