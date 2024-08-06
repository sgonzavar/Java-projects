
package algoritmosbasicos;

import java.util.Scanner;

public class AlgoritmosBasicos2 {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
    
        System.out.print("Digite 1 Estudiante Antiguo, 2 Estudiante Nuevo..: ");
        int Estudiante = leer.nextInt();
        System.out.print("Digite Precio De Matricula..: ");
        double Matricula = leer.nextDouble();
        double total;
        if(Estudiante == 1){
           total = Matricula - (Matricula*0.20);
            System.out.println("El Total A Pagar Estudante Antiguo Es...: " + total);
        }else{
            total = Matricula - (Matricula*0.10);
            System.out.println("El Total A Pagar Estudante Nuevo Es...: " + total);
        }  
    }
}