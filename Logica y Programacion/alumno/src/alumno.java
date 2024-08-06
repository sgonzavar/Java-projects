import java.util.*;
public class alumno 
{
    public static void main(String[] args) 
   {
     Scanner leer = new Scanner (System.in);
     double  n1,n2,n3,n_d ;	
    	
    	System.out.println(" Digite Nota 1 ");
        n1=leer.nextDouble();
        System.out.println(" Digite Nota 2 ");
        n2=leer.nextDouble();
        System.out.println(" Digite Nota 3 ");
        n3=leer.nextDouble();
        n_d=( n1+n2+n3 )/3 ;
        	
        	System.out.println(" Su nota es " + n_d);
        	
        	    if( n_d >= 3 )
        	    {
        	      System.out.println(" GANO ");
        	    }
        	    
        	       else
        	      {
        	       	System.out.print( " perdio " );
        	       	  
        	       	    if(n_d >= 2.5) 
        	       	    {
        	       	      System.out.print( " puede reforzar" );
        	       	    }
        	       	       else
        	       	       {
        	       	       	 System.out.print( " no puede reforzar" );
        	       	       }
        	       	    
        	       }
        	          
 
   }
}