import java.util.*;
public class vector_nueve
{
    
    public static void main(String[] args) 
   {Scanner leer = new Scanner(System.in);
     int n,i,aux,v[],cont=0,m;
     
     System.out.println( " tamaño del vector ");
      n = leer.nextInt();
     v = new int [n];
      
      for (i=0;i<=n-1;i++)
      {
             System.out.println(" digite numero ");
             v[i]= leer.nextInt();//guarda los datos en el vector
      
      }
    
     System.out.println( " Digitar numero para eliminar ");
      m = leer.nextInt();
    
    
    for (i=0;i<=n-1;i++)
    { if (m = v[i])
         { aux = v[i];
           v[i] = v[i+1];
           cont = cont+1;
           else
           	{
             System.out.println(" no se elimina  ");
            }
         }
   
    }
     
     for (i=0;i<=n-cont;i++)
         {
           System.out.println(" numeros  en el vector " + v[i] );
         }

    }
}
