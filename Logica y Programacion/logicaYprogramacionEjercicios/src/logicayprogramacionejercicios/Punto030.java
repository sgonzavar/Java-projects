//DE UNA PERSONA SE CONOCE EL NOMBRE, SALARIO Y ESTRATO. REALIZA UN ALGORITMO QUE 
//PERMITA UN AUMENTO DE SALARIO DE ACUERDO A LA SIGUIENTE TABLA. MUESTRE EL NOMBRE Y EL AUMENTO
//ESTRATO   AUMENTO
//   0        10%
//   1         8%
//   2         7%
//   3         6%
//   4         4%
//   5         2%
//   6         1%
package logicayprogramacionejercicios;

import java.util.Scanner;

public class Punto030 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("** DIGITE SU NOMBRE..:  ");
        String nombre = leer.next();
        System.out.print("** DIGITE SU SALARIO.:  ");
        float salario = leer.nextFloat();
        System.out.print("** DIGITE SU ESTRATO.:  ");
        int estrato = leer.nextInt();
        float aumento = 0;
        if (estrato == 0) {
            aumento = (float) (salario * 0.10);
        } else {
            if (estrato == 1) {
                aumento = (float) (salario * 0.08);
            } else {
                if (estrato == 2) {
                    aumento = (float) (salario * 0.07);
                } else {
                    if (estrato == 3) {
                        aumento = (float) (salario * 0.06);
                    } else {
                        if (estrato == 4) {
                            aumento = (float) (salario * 0.04);
                        } else {
                            if (estrato == 5) {
                                aumento = (float) (salario * 0.02);
                            } else {
                                if (estrato == 6) {
                                    aumento = (float) (salario * 0.01);
                                }
                            }
                        }
                    }
                }
            }
        }
    float nuevosalario = (int) salario + aumento;
        System.out.println("  SU NOMBRE ES....:" + nombre);
        System.out.println("  SU NUEVO SALARIO ES: " + nuevosalario);   
    }
}
