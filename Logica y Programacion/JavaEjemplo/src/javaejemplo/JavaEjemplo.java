package javaejemplo;

import java.util.Scanner;

public class JavaEjemplo {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print(" Digite Tamaño Para El Vector.: ");
        int N = leer.nextInt();
        int vector[];
        int menu;
        int auxiliar = 0, pares = 0, numero;
        int contador = 0, impares = 0, posicion;

        vector = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print(" Digite Datos Para EL Vector: ");
            vector[i] = leer.nextInt();
        }

        do {
            System.out.println(". .................MENU..................");
            System.out.println("1. Mostrar Datos Vector.");
            System.out.println("2. Mostrar Datos De Vector Si Repite Y Cuantas Veces.");
            System.out.println("3. Mostrar Datos Vector De Mayor A Menor.");
            System.out.println("4. Mostrar Diferencia De Sumas Entre Pares E Impares.");
            System.out.println("5. Mostrar Datos Primos.");
            System.out.print("6. .................SALIR..................: ");
            menu = leer.nextInt();

            if (menu == 1) {

                for (int i = 0; i < N; i++) {
                    System.out.println("  Datos De El Vector:[ " + vector[i] + " ]");
                }
                System.out.println();
            }
            
            if(menu == 2){
                          
                for (int i = 0; i < N; i++) {
                
                    auxiliar = vector[i];                    
                    contador = 0;
                    for (int j = i; j < N; j++){
                    
                        if(auxiliar == vector[j] ){
                            contador ++;                                                      
                        } 
                    }
                    if(contador > 1){
                        
                            System.out.println(" El Dato " +auxiliar+ " Se Repite "
                            +contador+ " Veces. ");
                    }              
                }             
            }
            
            if (menu == 3) {

                int aux;
                for (int k = 0; k < N - 1; k++) {
                    for (int j = k + 1; j < N; j++) {

                        if (vector[k] < vector[j]) {
                            aux = vector[k];
                            vector[k] = vector[j];
                            vector[j] = aux;
                        }
                    }
                }

                for (int i = 0; i < N; i++) {
                    System.out.println("Vector[" + vector[i] + "] ");
                }
            }

            if (menu == 4) {

                for (int i = 0; i < N; i++) {

                    if (vector[i] % 2 == 0) {
                        pares = pares + vector[i];
                    } else {

                        impares = impares + vector[i];
                    }

                }
                System.out.println(" Sumatoria De Pares : " + pares);
                System.out.println(" Sumatoria De Impares : " + impares);

            }

            if (menu == 5) {
               
                for (int i = 0; i < N; i++) {
                    numero = vector[i];
                    contador = 0;

                    for (int j = 1; j <= numero; j++) {

                        if (numero % j == 0) {
                            contador ++;
                        }

                    }
                    if (contador == 2) {
                        System.out.println(numero + " ES PRIMO ");                        
                    } else {
                        System.out.println(numero + " ES NO ES PRIMO ");                       
                    }
                }

            }

        } while (menu < 6);
    }

}
