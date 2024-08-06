
package desarrollotallerprogramaciondezulu;

import java.util.Scanner;


public class Ejercicio30 {
    public static void main (String args[]) {
        Scanner TH = new Scanner(System.in); //pido datos de entrada
    
        System.out.print("Ingrese orden de la matriz :    ");
        int n = TH.nextInt();
    
        //prosesos
        int mat[][] = new int [n][n];
        int sumatoria = 0;
        int mayor = mat[0][0];
        int menor= mat[0][0];
        for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 mat[i][j]= (i+1)-j;   
                 System.out.print(mat[i][j] + "\t");
                 sumatoria += mat[i][j];
                if (mat[i][j]> mayor) {
                    mayor = mat[i][j];
                }
                if (mat[i][j]< menor) {
                    menor = mat[i][j];
                }
             }
            System.out.println();
        }
        System.err.println("La Sumatoria Es....: " + sumatoria);
        System.err.println("El valor maxino....: " + mayor);
        System.err.println("El valor minimo....: " + menor);
    
    
    
    
    
    
    
    }  
}
