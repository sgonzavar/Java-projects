//UN CLIENTE COMPRA EN UNA TIENDA UNO O VARIOS UNIDADES DEL MISMO PRODUCTO Y EL 
// ALMACEN OTORGA UN 15% DE DESCUENTO PARA COMPRAS MAYORES A $100.000.
//HAGA UN ALGORITMO QUE IMPRIMA LA FACTURA DEL CLIENTE CON LA SIGUIENTE INFORMACION
//VALOR BRUTO, VALOR IVA(16%) VALOR DESCUANTO Y VALOR NETO.


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto033 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("** DIGITE CANTIDAD DE UNIDADES..:");
        int cantidadunidades = leer.nextInt();
        System.out.print("** DIGITE EL VALOR DE UNIDAD....:");
        float valorunidad = leer.nextFloat();
        float valorbruto = cantidadunidades * valorunidad;
        
        if (valorbruto > 100000){
            float descuento = (int) (valorbruto * 0.15);
            float valoriva = (int) (valorbruto * 0.16);
            float valorneto = (valorbruto - descuento)+ valoriva;
            System.out.println("** EL VALOR BRUTO ES..........:" + valorbruto);
            System.out.println("** EL VALOR IVA ES............:" + valoriva);
            System.out.println("** EL VALOR DE DESCUENTO FUE..:" + descuento);
            System.out.println("** EL VALOR NETO ES...........:" + valorneto);
        }else{
            float valoriva = (int) (valorbruto * 0.16);
            float valorneto = (int) valorbruto + valoriva;
            System.out.println("** EL VALOR BRUTO ES..........:" + valorbruto);
            System.out.println("** EL VALOR IVA ES............:" + valoriva);
            System.out.println("** EL VALOR NETO ES...........:" + valorneto);
        }
        
        
        
        
        
    }   
}
