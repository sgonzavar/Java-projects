
package desarrollotallerprogramaciondezulu;

import java.util.Scanner;


public class Ejercicio04 {
    public static void main (String args[]) {
        Scanner TH = new Scanner(System.in); //pido datos de entrada
    
        System.out.print("Ingrese numero 1:    ");
        int Numero1 = TH.nextInt();
        System.out.print("Ingrese numero 2:    ");
        int Numero2 = TH.nextInt();
    
        if (Numero1 % Numero2 == 0){
            System.out.print("El numero: " + Numero2 + " Es Multiplo De " + Numero1);
        } else {   
            System.out.print("El numero: " +  Numero2 + " Es No Es Multiplo De " + Numero1);
            }
   

 
    }    

}
