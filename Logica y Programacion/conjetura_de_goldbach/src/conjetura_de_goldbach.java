import java.util.*;
public class conjetura_de_goldbach
{
  public static void main(String[] args)
    { Scanner leer = new Scanner (System.in);
    
     int n,i,j,sw;
                System.out.println("digite numero par: ");
        n = leer.nextInt( );
        if ((n % 2)==0)         
           for (i=1;i<=(n/2);i=i+1)          
           {
            sw = 0;
                //Se evalúa si i es número primo
                for (j=2; j<=(i-1); j=j+1)
                {
                if  ((i % j)==0)
                {             
                               j = i;
                               sw = 1; 
                }
                }
               
                 if (sw == 0)
                //Se evalúa si n-i es número primo
                 {
                 for (j=2; j<=(n-i)-1; j=j+1)
                                 {
                                  if (((n-i)%j)==0)
                                  {   
                                                    j = n-i;
                                                sw = 1;
                                  }
                    }
               
                if (sw == 0)
                                System.out.println(i+ " y "+(n-i)+"  cumplen conjetura de goldbach para "+n);
                   }
                } 
          else
          System.out.println("Por favor digite solo numero par");
       }
     }