import java.util.*;
 
public class proyect 
{
    
    public static void main(String[] args) 
    {Scanner leer = new Scanner (System.in);
    int n,i,cont=0,cont2=0,numero[],pares[],impares[];
    
    System.out.println(" Digita tamaño para el vector ");
    n = leer.nextInt();
    numero = new int [n];
    
    for (i=0;i<=n-1;i++)
    {
      System.out.println(" Digita numeros para el vector ");
      numero[i]=leer.nextInt();
    }
    
    
    for (i=0;i<=n-1;i++)	
    {
     if ((numero[i]) % (2) == 0) 
     {  
         cont=cont+1; 
     }
    }	
     pares = new int [cont];
     cont=0;
     
     for (i=0;i<=n-1;i++)	
    {
     if ((numero[i]) % (2) == 0) 
     {   pares[cont]=numero[i];
         cont=cont+1; 
     }
    }
    
    
    
     for (i=0;i<=cont-1;i++)
     {
       System.out.println(" numeros pares de el vector original " + pares[i]);
     }	
     
   
    for (i=0;i<=n-1;i++)
    { if ((i) % (2) == 1) 
         { 
          cont2 = cont2+1;
         }
    }  
   impares = new int [cont2];
   cont2=0;
   for (i=0;i<=n-1;i++)
    { if ((i) % (2) == 1) 
         { 
          impares[cont2]=numero[i];
          cont2 = cont2+1;
         }
    }
  
  
  
   for (i=0;i<=cont2 -1;i++)
    {
      System.out.println("numeros en las posiciones impares  de el vector original " + impares[i]);
    }
  

  
    }
}