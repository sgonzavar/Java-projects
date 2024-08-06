import java.util.*;
public class metodo_3
{
  public static void main(String[] args) 
  { 
  	int respuesta;
    respuesta=suma();
    System.out.println(" la suma es " + respuesta);
  }

  public static int suma()
  {
   Scanner dato=new Scanner (System.in);
   int n1,n2,resp;
   System.out.println("digite numero 1");
   n1=dato.nextInt();
   System.out.println("digite numero 2");
   n2=dato.nextInt();
   resp=n1+n2;
   return resp;

  }	

}
