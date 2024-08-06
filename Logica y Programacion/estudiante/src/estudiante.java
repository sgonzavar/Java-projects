import java.util.*;
public class estudiante {
    
    public static void main(String[] args) 
   {Scanner leer = new Scanner (System.in);
    double n1,n2,n3,nd;
    String nombre; 
    
    System.out.println("Digite nombre ");
   	nombre = leer.next();
   	System.out.println("Digite nota 1 ");
   	n1 = leer.nextDouble();
   	System.out.println("Digite nota 2 ");
    n2 = leer.nextDouble();
    System.out.println("Digite nota 3 ");
    n3 = leer.nextDouble();
    n1 = n1*0.25;
    n2 = n2*0.40;	
    n3 = n3*0.35;
    nd = n1 + n2 + n3; 	
     System.out.println("Su nombre es  " + nombre);
     System.out.println("Su nota es " + nd);
     if (nd >= 3)
     {
       System.out.println(" GANO " );
     }
   
        else
        { 
        	System.out.println(" perdio ");
      
             if (nd >= 2.5)
             {
                System.out.println(" puede reforzar ");
             } 
               
               else 
               {
                  System.out.println(" no puede reforzar ");
               }  
        }   
   
   
     
    }
}
