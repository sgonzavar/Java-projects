import java.util.*;
public class edad {
    
    public static void main(String[] args) 
    { Scanner leer = new Scanner (System.in);
    int edad;
    	
     System.out.println(" Digite edad ");
     edad = leer.nextInt( );
     if ( edad >= 18)		
     {
       System.out.println(" Es mayor de edad ");  
     }
     
     else 
     {
       System.out.println(" No es mayor de edad ");
     }
   
    }
}
