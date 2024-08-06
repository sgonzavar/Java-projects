import java.util.*;
 
public class compras
{
  public static void main(String[] args) 
  	{Scanner leer = new Scanner (System.in);
    double unidad,precio_unidad,compra,valor_bruto,valor_iva,descuento,valor_neto;
      
      System.out.println(" cantidad de unidades " );
  5    unidad=leer.nextDouble ( );
      System.out.println(" precio de unidad" );
      precio_unidad=leer.nextDouble ( );
      compra = unidad*precio_unidad;
      
      if (compra > 100000 )
      { descuento = compra*0.15;   
      }  
      	 else 
      	 { descuento = 0;
         }
     
          valor_bruto = compra-descuento;
          valor_iva = valor_bruto*0.16 ;
          valor_neto = valor_bruto+valor_iva;
   
          System.out.println(" valor bruto " + valor_bruto );
          System.out.println(" valor iva " + valor_iva );
          System.out.println(" valor neto " + valor_neto );
   
   
   
   }
}