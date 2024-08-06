//SE TIENE 3 NUMERO REALES, REALIZA UN ALGORITMO QUE DETERMINE SI DICHOS VALORES
//SE PUEDE HACER UN TRIANGULO, DE SER CIERTO, MOSTRAR SI ES EQUILATERO, ESCALENO
//O ISOSELES.


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto045 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("** DIGITE NUMERO 1......:  ");
        float numero1 = leer.nextFloat();
        System.out.print("** DIGITE NUMERO 2......:  ");
        float numero2 = leer.nextFloat();
        System.out.print("** DIGITE NUMERO 3......:  ");
        float numero3 = leer.nextFloat();
        if (numero1 > 0 && numero2 > 0 && numero3 > 0){
            triangulos(numero1, numero2, numero3);
        }else{
            System.out.println("DIGITE NUMERO MAYORES QUE CERO");
        }
        
    }   

    private static void triangulos(float numero1, float numero2, float numero3) {
       if (numero1 == numero2 && numero1 == numero3){
           System.out.println("EL TRIANGULO ES EQUILATERO ");
       }else{
           if (numero1 != numero2 && numero1 != numero3){
               System.out.println("EL TREINGULO ES ESCALENO");
           }else{
               if(numero1 == numero2 || numero1 == numero3){
                   System.out.println("EL TRIANGULO ES ISOSELES");
               }
           }
       }
    }
}
