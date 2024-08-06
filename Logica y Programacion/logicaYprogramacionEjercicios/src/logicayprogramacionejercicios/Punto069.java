// se tiene una cantidad desconosida de personas, cada una de ellas con una edad
//realize un algoritmo que muestre la suma de las edades

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto069 {

    private static int acomuladoredad =0;

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.print("Digite 1 si hay personas"
                + " 2 si no hay : ");
        int sw = leer.nextInt();
        
        while(sw == 1){
            
            System.out.print("Digite edad : ");
            int edad = leer.nextInt();
            acomuladoredad = acomuladoredad + edad;
             
            System.out.print("Digite 1 si hay personas"
                + "2 si no hay ");
             sw = leer.nextInt();   
        } 
        verificaredad();

    }

    private static void verificaredad() {
        if(acomuladoredad == 0){
            System.out.println("no hay gente");
        } else{
            System.out.println("el acomulado de edad es " + acomuladoredad);
        }
    }

    

    

}
