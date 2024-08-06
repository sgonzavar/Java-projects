import java.util.*;
public class metodos 
{
    
    public static void main(String[] args) 
    {
     suma ();	

    }


 public static void suma ()
 {
  Scanner dato=new Scanner (System.in);
  int n1,n2,resultado;
  System.out.println(" digite numero 1 ");
  n1=dato.nextInt();
  System.out.println(" digite numero 2 ");
  n2=dato.nextInt();
  resultado = n1 + n2; 
  	 System.out.println(" la suma es " + resultado);

 }
 
}	