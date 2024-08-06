import java.util.*;
public class vector_siete
 {
    public static void main(String[] args) 
   {Scanner leer = new Scanner(System.in);
   int v[],i,j,t; //declara el vector 
   v = new int [10]; //asigna el tamaño al vector 
  
  
   for (i=0;i<=9;i++) 	
       {
          	System.out.println(" digite numero ");
            v[i]= leer.nextInt();//guarda los datos en el vector 
       }
       for (i=9;i<=0;i=i-1)
       { for (j=1;j<=i;i++)
             {
              if (v[j-1] > v[j])
              {
               t=v[j-1];
               v[j-1]=v[j];
               v[j]=t;
              }

             }

       }
       
       for (i=0;i<=9;i++)
        {
          System.out.println(" vector inverso "  + v[i] );
        }   

    }
}
          