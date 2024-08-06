//REALIZA UN ALGORITMO QUE LEA UN NUMERO ENTERO Y MUESTRE SI ES MULTIPLO DE 6 Y 9
//A LA VEZ, SI SOLO ES MULTIPLO DE 6 O SI SOLO ES MULTIPLO DE 9 O SI NO ES MULTIPLO
// DE LOS DOS



package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto039 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("**DIGITE NUMERO :  ");
       int numero = leer.nextInt();
       
       if(numero % 6 == 0 && numero % 9 ==0 ) {
           System.out.println("ES MULTIPLO DE 6 Y 9");
       }else{
           if (numero % 6 == 0){
               System.out.println("ES MULTIPLO DE 6 ");
           }else{
               if(numero % 9 == 0){
                   System.out.println("ES MULTIPLO DE 9 ");
               }else{
                   System.out.println(" NO ES MULTIPLO DE 6 Y 9 ");
               }
           }
       }
    }   
}
