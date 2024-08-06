import java.util.*;
public class vector_diez
{
    
    public static void main(String[] args) 
   {Scanner leer = new Scanner(System.in);
     int n,i,arturo=0,v[],w[],jairo;
     
     System.out.println( " Digitar tamaño para vectores V  W  ");
      n = leer.nextInt();
      v = new int [n];
      w = new int [n];
  
    for (i=0;i<=n-1;i++) 
    {
      System.out.println(" digite numero para vector v ");
      v[i]= leer.nextInt();
       System.out.println(" digite numero para vector w ");
      w[i]= leer.nextInt();
    }
  
   for (i=0;i<=n-1;i++)
   {
    jairo=v[i]*w[i];
    arturo=arturo+jairo;
   }
  
  System.out.println(" producto escala "+arturo);
  

    }
}

