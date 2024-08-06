//DE ACUERDO CON LA CANTIDAD DE ESCRITORIOS Y EL VALOR UNITARIO, UN ALMACEN DE
//ESCRITORIOS HACE LOS SIGIUENTES DESCUENTOS:
//SI EL CLIENTE COMPRA MENOS DE 5 UNIDADES SE LE DA UN DESCUENTO DEL 10% SOBRE
//LA COMPRA; SI COMPRA 5 O MAS DE 5 PERO MENOS DE 10 SE LE OTORGA EL 20% Y SI
//SON 10 O MAS SE LE DA UN DESCUENTO DEL 40% HAGA UN ALGORITMO QUE DETERMINE CUANTO DEBE 
//PAGAR EL CLIENTE.
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto036 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("** DIGITE CANTIDAD DE ESCRITORIOS.: ");
        int cantidad = leer.nextInt();
        System.out.print("** DIGITE VALOR UNITARIO..........: ");
        float valorunitario = leer.nextFloat();
        int total = (int) (cantidad * valorunitario);
        int descuento = 0;
        if (cantidad < 5) {
            descuento = (int) (total * 0.10);
        } else {
            if (cantidad > 5 && cantidad < 10) {
                descuento = (int) (total * 0.20);
            } else {
                if (cantidad > 10) {
                    descuento = (int) (total * 0.40);
                }
            }
        }
   
        float factura = (int) total - descuento;
        System.out.println("** EL TOTAL A PAGAR ES EL SIGUIENTE:  " + factura);
    }
}
