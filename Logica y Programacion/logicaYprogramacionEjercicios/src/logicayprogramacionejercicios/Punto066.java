//DESARROLA UN ALGORITMO QUE MUESTRE si un numero es primo o no 

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto066 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite Numero : ");
        int numero = leer.nextInt();
        if (primo(numero) == 2 ){
            System.out.print(numero + " ES PRIMO ");
        }else{
            System.out.print(numero + " ES NO ES PRIMO ");
        }

    }

    private static int primo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
           if(numero % i == 0){
               contador = contador + 1;
           }
            
        }
        return contador;
    }


    

}
