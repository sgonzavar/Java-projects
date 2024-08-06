package listadoble;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;

public class PruebaListaDoble {

    private static final Scanner sc = new Scanner(System.in);
    private static final Random rd = new Random();
    private static final ListaDoble lista = new ListaDoble();

    public static void main(String[] args) {
        int opc, dato, pos;
        do {
            opc = menu();
            switch (opc) {
                case 1: // Listar
                    System.out.println(lista);
                    break;
                case 2: // Adición manual
                    System.out.print("Ingrese número: ");
                    dato = sc.nextInt();
                    lista.adicionar(dato);
                    break;
                case 3: // Insertar
                    System.out.print("Ingrese Dato : ");
                    dato = sc.nextInt();
                    System.out.print("Ingrese Posicion : ");
                    pos = sc.nextInt();
                    lista.insertar(dato, pos);
                    break;
                case 4: // Adición automática de 10 datos
                    for (int i = 0; i < 10; i++) {
                        lista.adicionar(rd.nextInt(100));
                    }
                    break;
                case 5: // Borrar por posición
                    System.out.print(" Digite Posicion : ");
                    pos = sc.nextInt();
                    lista.borrarPos(pos);
                    break;
                case 6: // Borrar por número
                    System.out.println("FALTA POR DESARROLLAR");
                    break;
                case 7: // Borrar repetidos
                    System.out.println("FALTA POR DESARROLLAR");
                    break;
                case 8: // Borrar todo
                    lista.borrarTodo();
                    break;
                case 9: // Ordenar lista
                    lista.ordenar();
                    break;
                case 10: // Graficar lista
                    graficar();
                    break;
            }
        } while (opc != 0);
    }

    private static int menu() {
        System.out.println("*** MENÚ ****");
        System.out.println("1. Listar");
        System.out.println("2. Adición manual");
        System.out.println("3. Insertar");
        System.out.println("4. Adición automática de 10 datos");
        System.out.println("5. Borrar por posición");
        System.out.println("6. Borrar por número");
        System.out.println("7. Borrar repetidos");
        System.out.println("8. Borrar todo");
        System.out.println("9. Ordenar lista");
        System.out.println("10. Graficar lista");
        System.out.println("0. Salir");
        System.out.print("Su opción es: ");
        return sc.nextInt();
    }

    private static void graficar() {
        JFrame grafico = new JFrame("Lista Doblemente Ligada");
        GraficoLista graficoLista = new GraficoLista();

        graficoLista.setArreglo(lista.toArray());
        graficoLista.setContadorNodos(lista.getContadorNodos());
        grafico.add(graficoLista);
        grafico.setSize(1205, 630);
        grafico.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        grafico.setLocationRelativeTo(null);
        grafico.setResizable(false);
        grafico.setVisible(true);
    }
}
