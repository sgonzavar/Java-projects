import java.util.*;
public class uno 
{
   public static void main(String[] args) 
   {
   	Scanner dato= new Scanner (System.in);
   	int a,b,c,may;
   	
    System.out.println(" Digita numero 1");
    a= dato.nextInt();
    System.out.println(" Digita numero 2");
    b= dato.nextInt();
    System.out.println(" Digita numero 3");
    c= dato.nextInt();
    may= mayor(a,b,c);
    System.out.println(" El mayor es " + may); 
   }
 
  public static int mayor (int x, int y, int z)
  {
   int w=0;
  
     
     if ( x > y );    
           { 
           	w=x; 
         
           }
                
                  
                  if (( y > x )&& ( y > z ) );    
                  {  
                  	w=y;
                  }  
                  	   
    
                        
                           
                        if (( z > x )&& ( z > y ) );    
                        {  
                        	 w=z;
                        }
               
                  
           
   
    
    return w;
  }

}
