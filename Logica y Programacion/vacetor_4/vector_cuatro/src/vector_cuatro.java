import java.util.*;
public class vector_4
{
    
    public static void main(String[] args) 
   {Scanner leer = new Scanner(System.in);
     int n,i,marta=0,numero[];
     
     System.out.println( " Digitar numero ");
      n = leer.nextInt();
      numero = new int [n];
      
      for (i=0;i<=n-1;i++)
      {
             System.out.println(" digite numero ");
            numero[i]= leer.nextInt();//guarda los datos en el vector
      
      }
      int primo[];
       
       for (i=0;i<=n-1;i++)
       {
         if(numero[i])%(i)=0;        
         { 
         	marta = marta + 1;
            primo = new int [marta];
            primo[marta] = numero[i];
         }
       }
       
       for (i=0;i<=marta-1;i++)
       {
         System.out.println(" numeros primos en los vectores " + primo[i] );
       }

  
    }
}