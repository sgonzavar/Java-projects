//REALIZA UN ALGORITMO QUE LE PERMITE INGRESAR AL USUARIO 2 NUMERO MUESTRE EL 
//MAYOR O EL EMNOR O EN SU DEFECTO SI SON IGUALES.


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto027 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
       
        System.out.print("** DIGITE NUMERO 1: ");
        int numero1 = leer.nextInt();
        System.out.print("** DIGITE NUMERO 2: ");
        int numero2 = leer.nextInt();
        
        if (numero1 > numero2 ){
            System.out.println(" ES MAYOR ES " + numero1);
        }else {
            if (numero2 > numero1){
                System.out.println(" ES MAYOR ES " + numero2);
            }else{
                System.out.println(" SON IGUALES ");
            }           
        }                                  
    }   
}
