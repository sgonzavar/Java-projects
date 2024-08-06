//REALIZA UN SUBPROGRAMA QUE HALLE EL NUMERO MAYOR ENTRE TRES NUMEROS DISTINTOS


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto061 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        System.out.print("Digite Primero Numero : ");
        int a =leer.nextInt();
        System.out.print("Digite Segundo Numero : ");
        int b =leer.nextInt();
        System.out.print("Digite Tercer Numero : ");
        int c =leer.nextInt();
        int numeromayor = hallarMayor(a,b,c);
        System.out.println("El Numero Mayor Es " + numeromayor);
        
    }   

    private static int hallarMayor(int a, int b, int c) {
        int w=0;
        if(a > b && a > c){
             w = a;
        }else{
            if(b > a && b > c){
                  w = b;
            }else{
                 w = c;
            }
        }
        
        return w;     
    }
}
