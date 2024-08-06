/*Crea una matriz tipo registro de clase persona, la imprime toda y muestra el promedio de edad, y el nombre del que obtiene el mayor salario, 
 la clase persona tiene:
 nombres, del empleado;
 ident, cedula o identificacion del empleado;
 edad, edad en años del empleado;
 salario, salario basico mensual;
 y toda la información va contenida en cada posicion de fila y columna de la matriz
 */
package clasematriz;

import javax.swing.JOptionPane;

public class ClaseMatriz {

    static int i, j, N, M;
    ClPersona matriz[][];
    static Matriz objmat = new Matriz();

    public static void main(String[] args) {
        N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite numero de filas:"));
        M = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite numero de columnas:"));
        String texto;
//objeto de la matriz
        objmat = new Matriz(N, M);
        //colocamos datos en la matriz
        objmat.LlenarMatriz();
        //imprimir la matriz
        ClaseMatriz objppal = new ClaseMatriz();
        int op = 0;
        while (op < 7) {
            op = Integer.parseInt(JOptionPane.showInputDialog("MENU"
                    + " \n 1.. Salario Mayor" // SALTOS DE LINEA (" \n) 
                    + " \n 2.. Promedio Edad"
                    + " \n 3.. Edad Mayor"
                    + " \n 4.. Total Nomina"
                    + " \n 5.. Nombres De La Diagonal"
                    + " \n 6.. Organizar Filas Edades Ascendente"
                    + " \n 7.. Terminar"));

            switch (op) {

                case 1:
                    texto = objppal.salarioMay();
                    JOptionPane.showMessageDialog(null, "Obtiene EL Mayor Salario  " + texto);
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "El Promedio De Edades Es: " + objppal.PromediarEdad());
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "El DE Mayor Edad : " + objppal.edadMay());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El Acomulado ES : " + objppal.AcomSalario());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Lo Nombres Son : " + objppal.NombreDiagonal());
                    break;

            }// FIN CASOS    
        }//  FIN METODO MIENTRAS      

    }//FIN DEL METODO main

    public double PromediarEdad() {
        double AcumEd = 0, prom;
        matriz = objmat.ObtenerMatriz();
        for (i = 0; i < objmat.ObtenerFilas(); i++) {
            for (j = 0; j < objmat.ObtenerColumnas(); j++) {
                AcumEd = AcumEd + matriz[i][j].ObtenerEdad();
            }//fin para j
        }//fin para i
        prom = AcumEd / (objmat.ObtenerFilas() * objmat.ObtenerColumnas());
        return prom;
    }//fin de promediar edad 

    public String salarioMay() {

        String nommay = "";
        matriz = objmat.ObtenerMatriz();
        double may = matriz[0][0].ObtenerSalario();
        for (i = 0; i < objmat.ObtenerFilas(); i++) {
            for (j = 0; j < objmat.ObtenerColumnas(); j++) {
                if (matriz[i][j].ObtenerSalario() > may) {
                    may = matriz[i][j].ObtenerSalario();
                    nommay = matriz[i][j].ObtenerNombres();
                }
            }//fin para f
        }//fin para c

        return nommay;
    }//fin de mayor salario 

    public String edadMay() {

        String nommay = "";
        matriz = objmat.ObtenerMatriz();
        double may = matriz[0][0].ObtenerEdad();
        for (i = 0; i < objmat.ObtenerFilas(); i++) {
            for (j = 0; j < objmat.ObtenerColumnas(); j++) {
                if (matriz[i][j].ObtenerEdad() > may) {
                    may = matriz[i][j].ObtenerSalario();
                    nommay = matriz[i][j].ObtenerNombres();
                }
            }//fin para f
        }//fin para c

        return nommay;
    }

    public Double AcomSalario() {
        double Acom = 0;
        for (i = 0; i < objmat.ObtenerFilas(); i++) {
            for (j = 0; j < objmat.ObtenerColumnas(); j++) {
                Acom = (Acom + matriz[i][j].ObtenerSalario());
            }
        }//fin para f
        return Acom;
    }

    prublic String NombreDiagonal() {
        String Ndiagonal = "";
        int x = 0, y;
        for (i = 0; i < objmat.ObtenerFilas(); i++) {
            for (j = 0; j < objmat.ObtenerColumnas(); j++) {
                if (i == j) {
                    x = i;
                }
                Ndiagonal = matriz[x][x].ObtenerNombres();
                return Ndiagonal ;
            }
            
        }
        return null ;
    }
   
 }//fin clase principal o claseproyecto
