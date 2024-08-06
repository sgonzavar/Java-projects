//SE TIENE UNA CANTIDAD DE DINERO Y SE PRETENDE MERCAR DE TAL MANERA QUE LA FACTURA NO SOBREPASE
//LA CANTIDAD DE DINERO, REALIZA UN ALGORITMO QUE MUESTRE LA CANTIDAD DE PRODUCTOS COMPRADOS Y EL TOTAL 
//DE LA FACTURA 

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto067 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador =0;
        float plata, valor = 0, acomulador =0;
        System.out.print("PLATA PA MERCAR : ");
        plata = leer.nextFloat();
        
        while(acomulador <= plata ){
            System.out.print("Digite el valor del producto : ");
            valor = leer.nextFloat();
            acomulador += valor;
            contador += 1;
            
        }
        
        contador = contador - 1;
        acomulador = acomulador - valor;
        System.out.println("el total de productos fueron " + contador);
        System.out.println("la factura es la siguiente " + acomulador);
    }
}
