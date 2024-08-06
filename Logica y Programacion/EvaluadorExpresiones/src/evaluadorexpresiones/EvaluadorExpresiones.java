package evaluadorexpresiones;

import java.util.Scanner;

public class EvaluadorExpresiones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        System.out.print("Digite Expresion Que Desea Evaluar: "); 
        String infija = sc.nextLine();
        System.out.println();
        System.out.println("El Resultado Es: " + Evaluador.evaluar(infija));
  
    }
    
}
