//SE TIENE LA CANTIDAD DE HOMBRES Y MUJERES EN UN SALON REALISE UN PROGRAMA
// QUE MUESTRE EL PORCENTAJE DE HOMBRES Y MUJERES 


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto007 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("** DIGITE CANTIDAD DE HOMBRE......:  ");
        double cantidaddehombres = leer.nextDouble();
        System.out.print("** DIGITE CANTIDAD DE MUJERES.....:  ");
        double cantidaddemujeres = leer.nextDouble();
        double total = cantidaddehombres + cantidaddemujeres;
        double porcentajemujeres = cantidaddemujeres*100/total;
        double porcentajehombre = cantidaddehombres*100/total;
        
        System.out.println("LOS PORCENTAKES DE HOMBRESON LOS SIGUIENTES:  " 
                + porcentajehombre);
        System.out.println("LOS PORCENTAKES DE MUJERES LOS SIGUIENTES:  " 
                + porcentajemujeres);
        
        
    }   
}
