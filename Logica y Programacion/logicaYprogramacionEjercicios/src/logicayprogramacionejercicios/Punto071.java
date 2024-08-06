//realiza un programa q mediante coordenadas muestre el lugar en el q se encuentra 

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto071 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Digite coordenada x : ");
        int x = leer.nextInt();
        System.out.print("Digite coordenada y : ");
        int y = leer.nextInt();
        coordenada(x, y);
    }

    private static void coordenada(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.println("ORIGEN");
        } else {
            if (x > 0 && y > 0) {
                System.out.println("CUADRANTE 1 ");
            } else {
                if (x < 0 && y > 0) {
                    System.out.println("CUADRANTE 2 ");
                } else {
                    if (x < 0 && y < 0) {
                        System.out.println("CUADRANTE 3");
                    } else {
                        if (x > 0 && y < 0) {
                            System.out.println("CUADRANTE 4");
                        } else {
                            if (x != 0 && y != 0) {
                                System.out.println(" eje x " + x);
                                System.out.println(" eje y " + y);
                            }
                        }
                    }
                }
            }
        }

    }
}
