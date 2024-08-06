//SE TIENE EL NOMBRE, EDAD Y GENERO DE 10 PERSONAS. REALIZA UN ALGORTIMO QUE MUESTRE
//EL PROMEDIO DE LA EDAD DE LAS MUJERES

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto057 {    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i = 1, contador =0, acomulador = 0;
        while (i < 11){
            System.out.print("DIGITA EDAD  : " );
            int edad = leer.nextInt();
            System.out.print("DIGITA 1 MUJER    2 HOMBRE  : " );
            int genero = leer.nextInt();
            System.out.print("DIGITA TU  NOMBRE : ");
            String nombre = leer.next();
            System.out.println();
            if(genero == 1){
                 contador = contador + 1;
                 acomulador = acomulador + edad;
            }
            i = i + 1;
        }
        promedio(acomulador,contador);
    }   

    private static void promedio(int acomulador, int contador) {
        if(contador == 0){
            System.out.println(" NO HAY MUJERES");
        }else{
            float promedio = acomulador / contador;
            System.out.println("EL PROMEDIO ES EL SIGUIENTE  " + promedio);
        } 

    }   
}   
