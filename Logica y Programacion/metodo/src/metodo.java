import java.util.*;
public class metodo {
      public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     String cadena;
     System.out.print("introduce cadena de texto");
     cadena = sc.nextLine();//lee toda la cadena de texto 
     cajaTexto(cadena);	
    } 		
    
     public static void cajaTexto(String str){
     int n = str.length();
     for (int i = 0;i<n+4;i++){
         System.out.println("#"); 
     }
    
     System.out.println();
     System.out.println("# " + str + " #");
     for (int i = 0;i<n+4;i++){
         System.out.println("#"); 
     }
    
    System.out.println();

     }
	
    
}
