import java.util.*;
public class metodo_2 {
    
    public static void main(String[] args) 
    {
     Scanner dato = new Scanner (System.in);
     int n1,n2;	
     System.out.println("digite numero 1");
     n1 = dato.nextInt();
     System.out.println("digite numero 2");
     n2 = dato.nextInt();
     suma (n1,n2);
    }
   
    public static void suma(int num1, int num2)
    {
    int resultado;
    resultado = num1+num2;
    System.out.println("la suma es" + resultado);
    }	

}
