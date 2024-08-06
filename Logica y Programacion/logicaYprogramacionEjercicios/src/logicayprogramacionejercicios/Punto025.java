// A LA MAMA DE JUAN LE PREGUNTAN LA EDAD Y CONTESTO:
//TENGO 3 HIJOS, PRGUNTE A JUAN SU EDAD, ALBERTO TIENE 2/3 DE LA DE JUAN, ANA
//TIENE 4/3 DE LA EDAD DE JUAN Y MI EDAD ES LA SUMA DE LOS 3, MUESTRE LA EDAD DE LOS 
//CUANTRO.

package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto025 {    
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        System.out.print("** DIGITE EDAD DE JUAN.....:  ");
        int edadjuan = leer.nextInt();
        int edadalberto = edadjuan* 2/3;
        int edadana = edadjuan* 4/3;
        int edadmama = edadalberto + edadana + edadjuan;
        System.out.println("** LA EDAD DE JUAN ES......:  " + edadjuan);
        System.out.println("** LA EDAD DE ALBERTO ES...:  " + edadalberto);
        System.out.println("** LA EDAD DE ANA ES.......:  " + edadana);
        System.out.println("** LA EDAD DE LA MAMA ES...:  " + edadmama);                     
    }  
}
