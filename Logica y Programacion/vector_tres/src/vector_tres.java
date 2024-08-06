import java.util.*;
public class vector_tres 
{
    
    public static void main(String[] args) 
   {Scanner leer = new Scanner(System.in);
   int a[],i,j,ricostilla=0;//declara el vector 
   a = new int [10];//asigna el tamaño al vector 
   
  
   for (i=0;i<=9;i++) 	
       {
          	System.out.println(" digite numero del primer arreglo ");
            a[i]= leer.nextInt();//guarda los datos en el vector 
            
       }
          for (i=0;i<=9;i++)
          {
             for (j=0;i<=9;i++)
                 {
             
             if ((a[i])<(a[j]))
                {  
             	ricostilla=ricostilla+1;
                }
                 }
          }
          
          if ((ricostilla)>=(1))
          {
            System.out.println(" si ");
          
          }
             else 
            {
              System.out.println(" no ");
            }	
          
         
   }
}       