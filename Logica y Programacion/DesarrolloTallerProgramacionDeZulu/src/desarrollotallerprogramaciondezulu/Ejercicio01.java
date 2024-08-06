
package desarrollotallerprogramaciondezulu;

import java.util.Scanner;


public class Ejercicio01 {
    public static void main (String args[]) {
        Scanner TH = new Scanner(System.in); //pido datos de entrada
    
        System.out.print("Ingrese numero:    ");
        int Num = TH.nextInt();
    
        if (Num % 2 == 0){
            System.out.print("El numero: " + Num + " Es par  ");
        } else {   
            System.out.print("El numero: " + Num + " Es Impar  ");
            }
   

    
    System.out.print("Ingrese N:    ");// cadena de texto 
        int Nu = TH.nextInt();
        String Ndiagonal = "";
        String N = "";             
        for (int i = 0; i < Nu; i++) {

            System.out.print("Texto:    ");
            N = TH.next();
            
          Ndiagonal = Ndiagonal + " " + N;
        
        }   
        
        System.out.println("LOs Datos son " + Ndiagonal);
   
    }    

}
