import java.util.*;
public class almacen 
{
    
    public static void main(String[] args) 
   {Scanner leer = new Scanner (System.in);
    double v_bruto,v_descuento=0,total;
    int categoria;
    
       System.out.println("ingrese la categoria que desea 1 carnes y lacteos 2 aseo 3 licores ");
       
    	System.out.println("digite categoria ");
    	categoria = leer.nextInt();
    	System.out.println("valor de la compra ");
        v_bruto = leer.nextDouble();
        
        switch (categoria )
        {
         case 1: v_descuento = v_bruto * 0.30; 
         	    
            if (v_bruto > 500000)
            {	
            	v_descuento = v_bruto * 0.42;
        
            }
             break;
         
         case 2: v_descuento = v_bruto * 0.20;
      
              break;
         
         case 3: v_descuento = v_bruto * 0.10; 
         	  
         	  break;
       
        }
  
        total = v_bruto - v_descuento; 
        System.out.println(" valor a pagar " + total ) ;
        System.out.println(" descuento " + v_descuento ) ;
  
  
    }
}
