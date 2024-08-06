import java.util.*;
public class vector_uno
 {
    public static void main(String[] args) 
   {Scanner leer = new Scanner(System.in);
   int n[],i;//declara el vector 
   n = new int [10];//asigna el tamaño al vector 
  
  
   for (i=0;i<=9;i++) 	
       {
          	System.out.println(" digite numero ");
            n[i]= leer.nextInt();//guarda los datos en el vector 
       }	 
    
  int v[],k=0;
  v = new int [10];
 
  for (i=9;i<=0;i++) 	
       {
         
         	 
         
         v[i] = n[k];
          k=k+1;
       }
  
  for (i=0;i<=9;i++) 	
       {
          	System.out.println(" vector inverso " + v[i] );
             
       }
  
  
  
 
   }
}

