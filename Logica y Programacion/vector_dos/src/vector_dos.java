import java.util.*;
public class vector_dos 
{
    
    public static void main(String[] args) 
   {Scanner leer = new Scanner(System.in);
   int n[],m[],i,yuca=0,platano=0;//declara el vector 
   n = new int [10];//asigna el tamaño al vector 
   m = new int [10];//asigna el tamaño al vector
  
   for (i=0;i<=9;i++) 	
       {
          	System.out.println(" digite numero del primer arreglo ");
            n[i]= leer.nextInt();//guarda los datos en el vector 
            System.out.println(" digite numero del segundo arreglo ");
            m[i]= leer.nextInt();//guarda los datos en el vector
       }
 
  for (i=0;i<=9;i++)
       {   
       	    if ((m[i])==(n[i]))
            { 
            	yuca=yuca+1;
            }
               else
               	{
                  platano=platano+1;
                }
       }
   
 
 if ((yuca)==(10)); 
   {
     System.out.println(" iguales  ");
   }
          if((yuca) <=(10));
          {
           System.out.println(" diferentes ") ;          
          }


    }
}
