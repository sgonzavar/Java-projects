import java.util.*;
public class vector_seis
{
    
     public static void main(String[] args) 
     {Scanner leer = new Scanner(System.in);
      int v[],i,suma=0,cmen=0,cmay=0,promedio;//declara el vector 
       v = new int [10];//asigna el tamaño al vector 
       
       for (i=0;i<=9;i++) 	
       {
          	System.out.println(" digite numero ");
            v[i]= leer.nextInt();//guarda los datos en el vector 
       }
   
       for (i=0;i<=9;i++)
       {
         suma=suma+v[i];
      
       }
       promedio=suma/10;
       int menor[],mayor[];
       
       for (i=0;i<=9;i++)
       {
        if (promedio < v[i])
        {	cmen=cmen+1;
            menor = new int [cmen];
            menor[cmen]=v[i];
          else
            {
             cmay=cmay+1;
             mayor = new int [cmay];
             mayor[cmay]=v[i];
            } 
 
        }
 
       }
  
        
       for (i=0;i<=cmen-1;i++)
        {
          	System.out.println(" vector con numeros menores " + menor[i] );
        }
       
      for (i=0;i<=cmay-1;i++)
        {
          	System.out.println(" vector con numeros mayores " + mayor[i] );
        }

   
    }
}
