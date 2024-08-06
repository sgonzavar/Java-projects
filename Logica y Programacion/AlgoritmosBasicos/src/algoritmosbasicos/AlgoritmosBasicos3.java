package algoritmosbasicos;

import java.util.Scanner;

public class AlgoritmosBasicos3 {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
    
        System.out.print("Digite 1 Estado civil: Casado , 2 Estado civil: Soltero.: ");
        int Estado= leer.nextInt();
        System.out.print("Digite Precio Del Plan ");
        double Plan = leer.nextDouble();
        double total;
        if(Estado == 1){
           total = Plan - (Plan*0.20);
            System.out.println("Estado civil CASADO, Total A Pagar: " + total);
        }else{
            total = Plan - (Plan*0.10);
            System.out.println("Estado civil SOLTERO, Total A Pagar: " + total);
        }  
    }
}
