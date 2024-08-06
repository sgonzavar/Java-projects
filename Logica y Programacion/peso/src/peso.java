import java.util.*;
public class peso 
{
    
    public static void main(String[] args) 
   {Scanner leer = new Scanner (System.in);
    double esf_a,esf_b,esf_c;
    
    	System.out.println("Digite peso esfera A ");
    	esf_a = leer.nextDouble();
    	System.out.println("Digite peso esfera B ");
        esf_b = leer.nextDouble();
        System.out.println("Digite peso esfera C ");
        esf_c = leer.nextDouble();
          if ((esf_a > esf_b)&& (esf_a > esf_c) )    
           {  System.out.println(" esfera A pesa mas que B y C ");
           
                  if ((esf_b > esf_a)&& (esf_b > esf_c) )    
                  {  System.out.println(" esfera b pesa mas que A y C ");
                
    
                        if ((esf_c > esf_a)&& (esf_c > esf_b) )    
                        {   System.out.println(" esfera c pesa mas que A y B ");
                     
                        }  
                  }
           }
    }
}
