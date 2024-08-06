//HACER UN ALGORITMO DONDE SE MUESTRE UN MENU AL USUARIO CON LAS SIGUIENTES OPCIONES 
//OPCION 1 = SE LEEN 2 NUMEROS Y SE IMPRIME LA SUMA
//OPCION 2 = SE LEE LA EDAD Y EL NOMBRE DE LA PERSONA Y SE IMPRIME UN MENSAJE SI ES MAYOR DE EDAD 
//OPCION 3 = SE LEE UN NUMERO ENTERO Y SE IMPRIME UN MENSAJE INFORMANDO SI ES MULTIPLO DE 5  



package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto040 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("** DIGITE OPCION: ");
        int opcion = leer.nextInt();
        
        switch (opcion){
            case 1:
                System.out.print("*DIGITE NUMERO 1..: ");
                float numero1 = leer.nextFloat();
                System.out.print("*DIGITE NUMERO 2..: ");
                float numero2 = leer.nextFloat();
                float suma = numero1 + numero2;
                System.out.println("** LA SUMA ES ** :" + suma);
                break;
            case 2:
                System.out.print("*DIGITE NOMBRE..: ");
                String nombre = leer.next();
                System.out.print("*DIGITE EDAD....: ");
                int edad = leer.nextInt();
                if(edad >= 18){
                    System.out.println("** ES MAYOR DE EDAD **");
                }else{
                    System.out.println("** ES MENOR DE EDAD ** ");
                }
                break;
            case 3:
                System.out.print("** DIGITE NUMERO..:");
                float numero = leer.nextFloat();
                if(numero % 5 ==0){
                    System.out.println("** ES MULTIPLO DE 5 EL " + numero);
                }else{
                    System.out.println("** NO ES MULTIPLO DE 5 EL " + numero);
                }
                break;
        }
    }   
}
