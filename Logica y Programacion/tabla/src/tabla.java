import java.util.*;
public class tabla {
    
    public static void main(String[] args)
    {Scanner leer = new Scanner(System.in);
    int I,J,Resultado;
    
    for (I=1;I<=10;I=I+1)
    {
      for (J=1;J<=10;J=J+1)
      {
      	Resultado=I*J;
    
    	System.out.println( I + " * " + J + " = " + Resultado);
      }
    }
  }
}


