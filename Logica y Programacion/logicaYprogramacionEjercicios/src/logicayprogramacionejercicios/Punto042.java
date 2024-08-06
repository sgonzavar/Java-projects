//DETERMINE SI UN ESTUDIANTE APUEVA O REPRUEBA SABIENDO QUE APROVARA SI SU PROMEDIO
//DE 3 CALIFICACIONES ES MAYOR O IGUAL A 70; REPUEBA EN CASO CONTRARIO
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto042 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print(" DIGITE CALIFICACION 1 : ");
        int calificaion1 = leer.nextInt();
        System.out.print(" DIGITE CALIFICACION 2 : ");
        int calificaion2 = leer.nextInt();
        System.out.print(" DIGITE CALIFICACION 3 : ");
        int calificaion3 = leer.nextInt();

        if (promedio(calificaion1, calificaion2, calificaion3) > 70) {
            System.out.println("**  APRUEBA ** ");
        } else {
            System.out.println("** REPRUEBA ** ");
        }

    }

    private static int promedio(int calificaion1, int calificaion2, int calificaion3) {
        int definitiva = (calificaion1 + calificaion2 + calificaion3) / 3;
        return definitiva;
    }

}
