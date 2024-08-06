import java.util.*;
 
public class Arreglo03{
  public static void main(String arg[])
   {
 
     double x[],temp;
 
     int n,i,j;
     Scanner in = new Scanner(System.in);
     do{
        System.out.print("Cantidad de elementos del arreglo : ");
        n=in.nextInt();
     }while(n<=0 || n>100);
 
     x=new double[n];
 
     for(i=0; i<n;i++)
     {
       System.out.print("x["+i+"]: ");
       x[i]=in.nextDouble();
     }
 
     System.out.println("Arreglo Ingresado");
     for(i=0; i<n;i++)
        System.out.println("x["+i+"]: "+x[i]);
 
     for(i=0,j=n-1;i<n/2;i++,j--)
       {
         temp=x[i];
         x[i]=x[j];
         x[j]=temp;
       }
     System.out.println("Arreglo Invertido");
     for(i=0; i<n;i++)
        System.out.println("x["+i+"]: "+x[i]);
 
   }
}