import java.util.*;
public class vector_cinco_
{
    
    public static void main(String[] args) 
   {Scanner leer = new Scanner(System.in);
     int vn[],vm[],n,m,i,j;
     
     System.out.println( " Digitar numero 1 ");
      n = leer.nextInt();
      vn = new int [n];
     System.out.println( " Digitar numero 2 ");
      m = leer.nextInt();
      vm = new int [m];
   
    for (i=0;i<=n-1;i++)
      {
             System.out.println(" digite numeros de el primer vector ");
             vn[i]= leer.nextInt();//guarda los datos en el vector vn
      
      }
   
    for (i=0;i<=m-1;i++)
      {
             System.out.println(" digite numeros de el segundo vector ");
             vm[i]= leer.nextInt();//guarda los datos en el vector vm
      
      }
   
     int vo[];
     vo = new int [n+m];
     
     for (i=0;i<=n-1;i++)
     {
       vo[i]=vn[i];
       
     }
    for (j=0;j<=m-1;j++)
     {
       vo[i+j]=vm[j];
       
     }
   
    for (i=0;i<=(n+m)-1;i++)
     {
       System.out.println(" resultado " + vo[i] );
       
     }
   
  }


}