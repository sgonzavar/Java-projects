import java.util.*;
public class vector_ocho
 {
    public static void main(String[] args) 
   {Scanner leer = new Scanner(System.in);
   int v[],i,j,n,t;//declara el vector 
   v = new int [10];//asigna el tamaño al vector 
  
  
   for (i=0;i<=9;i++) 	
       {
          	System.out.println(" digite numero ");
            v[i]= leer.nextInt();//guarda los datos en el vector 
       }
  
  System.out.println("Digitar numero para el vector");
  n = leer.nextInt();
  
  v = new int [10+1];
      
      for (i=10;i<=0;i=i-1)
      {   for (j=1;j<=i;i=j++)
          { if (n > v[j-1]);
               {t = v[j-1];
                v[j-1]=n;
                	n = t;
               }
          }

      }
  
 for (i=0;i<=10;i++) 	
       {
          	System.out.println(" los numeros son  "+v[i]);
             
       }

    }
}
