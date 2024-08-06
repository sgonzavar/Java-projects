package desarrollotallerprogramaciondezulu;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String args[]) {
        Scanner TH = new Scanner(System.in); //pido datos de entrada

        System.out.print("Ingrese el valor de m:    ");// pido numero de filas
        int m = TH.nextInt();
        System.out.print("Ingrese el valor de n:    ");// pido numero de filas 
        int n = TH.nextInt();
        System.out.print("Ingrese el valor de p:    ");// pido numero de columnas de la segunda matriz 
        int p = TH.nextInt();
       
        
        //declaramos matrises
        int a[][]=new int [m][n];
        int b[][]=new int [n][p];
        int c[][]=new int [m][p];
        
        //llenamos matriz A                      primero son filas luego columnas al momento de crear el vector 
        for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
              a[i][j]= (i+1) * j;
            }
        }
        //llenamos matriz B
        for (int i = 0; i < n; i++) {
             for (int j = 0; j < p; j++) {
              b[i][j]= (j+1) * i;
            }
        }
        // llenamos la matriz C con la multiplicacion de las matrices a y b
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j]+= a[i][k]* b[k][j];
                    
                }
                
            }
        }
        
        
        
        //mostramos las matrises\
       System.out.println("***** A ******");
       show(a, m, n);
       System.out.println("***** B ******");
       show(b, n, p);
       System.out.println("***** c ******");
       show(c, m, p);
    }

    public static void show(int m[][], int f, int c){
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
