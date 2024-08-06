import java.util.*;
public class almacen_escritorio {
    
    public static void main(String[] args)
   {Scanner leer = new Scanner (System.in);
   
   double unidad,precio,descuento,valor_u,total;
   
   System.out.println("Digitar unidad ");
   unidad = leer.nextDouble();
   System.out.println("Digitar precio ");
   precio = leer.nextDouble();
   valor_u = unidad * precio;
   if (unidad < 5)
   {
    descuento = valor_u * 0.10;
    total = valor_u - descuento;
    System.out.println(" total a pagar " + total);
   } 	
  
       else
      {	
        if (unidad >= 5)&&(unidad < 10);
        {   descuento = valor_u * 0.20;
            total = valor_u - descuento;
             System.out.println(" total a pagar " + total);
        }
       
       
        
        if (unidad >= 10);
         {
           descuento = valor_u * 0.40;
           total = valor_u - descuento;
           System.out.println(" total a pagar " + total);
         }
       }
  
     }
}
