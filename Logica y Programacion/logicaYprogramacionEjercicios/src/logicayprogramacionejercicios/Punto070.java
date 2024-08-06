//realiza un programa que halle el mayor y el menor de 3 numero distintos


package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto070 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("Digite primer numero : ");
        int a = leer.nextInt();
        System.out.print("Digite segundo numero: ");
        int b = leer.nextInt();
        System.out.print("Digite tercer numero : ");
        int c = leer.nextInt();
        hallarMayorMenor(a,b,c);
        
        
    }   

    private static void hallarMayorMenor(int a, int b, int c) {
       int mayor =0;
       int menor =0;
        
       if (a > b && a > c){
           mayor = a;
       }else{
            if(b > a && b > c ){
                mayor = b;
            }else{
                mayor = c;
            }
        }
    
    if (a < b && a < c){
           menor = a;
       }else{
            if(b < a && b < c ){
                menor = b;
            }else{
                menor = c;
            }
        }
    
        System.out.println("el numero mayor es " + mayor);
        System.out.println("el numero menor es " + menor);
    }
}
