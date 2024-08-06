package algoritmosbasicos;

import java.util.Scanner;

public class AlgoritmosBasicos {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

      double Salario;
        System.out.print("Digite Cantidad De Horas.: ");
        int Cantidad = leer.nextInt();
        System.out.print("Digite 1: Técnico, 2: Técnologo, 3:Profesional, 4:Especialista.: ");
        int n = leer.nextInt();
        if (n == 1) {
            Salario = (Cantidad * 9000) + (Cantidad * 9000 * 0.25);
            Salario = Salario - (Salario*0.08);
            System.out.println("NIVEL ACADEMICO: Técnico , Su Salario Es: " + Salario);
        } else {
            if (n == 2) {
                Salario = (Cantidad * 14000) + (Cantidad * 14000) * 0.15;
                Salario = Salario - (Salario*0.08);
                System.out.println("NIVEL ACADEMICO: Técnologo , Su Salario Es: " + Salario);
            } else {
                if (n == 3) {
                    Salario = (Cantidad * 25000) + (Cantidad * 25000) * 0.10;
                    Salario = Salario - (Salario*0.08);
                    System.out.println("NIVEL ACADEMICO: Profesional , Su Salario Es: " + Salario);
                } else {
                    if (n == 4) {
                        Salario = (Cantidad * 35000) + (Cantidad * 35000) * 0.05;
                        Salario = Salario - (Salario*0.08);
                        System.out.println("NIVEL ACADEMICO: Especialista , Su Salario Es: " + Salario);
                    }
                }
            }
        }
    }

}
