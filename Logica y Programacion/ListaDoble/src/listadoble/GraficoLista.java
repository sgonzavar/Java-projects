package listadoble;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GraficoLista extends JPanel {

    private final int maxX = 1200;
    private final int maxY = 600;
    private NodoExtendido[] arreglo;
    private int contadorNodos;

    public void setArreglo(NodoExtendido[] arreglo) {
        this.arreglo = arreglo;
    }

    public void setContadorNodos(int contadorNodos) {
        this.contadorNodos = contadorNodos;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);

        if (contadorNodos == 0) {
            dibujarVacia(g);
            return;
        }

        int x = 30, y = 60, antX = x, antY = y;
        // Dibujamos el apuntador a primero
        g.setFont(new Font("Serif", Font.PLAIN, 10));
        g.setColor(Color.BLUE);
        g.drawString("P", x + 30, y - 40);
        g.setColor(Color.GREEN);
        dibujarFlechaArribaAbajo(x + 30, y - 38, x + 30, y - 15, g);

        // Dibujamos los nodos
        for (int i = 0; i < contadorNodos; i++) {
            dibujarNodo(x, y, arreglo[i], g);
            // Verificamos si ponemos flecha o conector con la otra línea
            if (i < contadorNodos - 1) {
                g.setColor(Color.GREEN);
                if ((i + 1) % 7 == 0) {
                    dibujarConector(x, y, g);
                } else {
                    dibujarFlechaDoble(x + 131, y + 8, x + 159, y + 8, g);
                }
            }
            antX = x;
            antY = y;
            x += 160;

            // Salta a la otra linea
            if ((i + 1) % 7 == 0) {
                x = 30;
                y += 70;
            }
        }

        // Dibujamos el apuntador a último
        g.setFont(new Font("Serif", Font.PLAIN, 10));
        g.setColor(Color.BLUE);
        g.drawString("U", antX + 28, antY + 53);
        g.setColor(Color.GREEN);
        dibujarFlechaAbajoArriba(antX + 30, antY + 44, antX + 30, antY + 16, g);

        // Pintamos el total de nodos
        g.setFont(new Font("Serif", Font.BOLD, 18));
        g.setColor(Color.BLACK);
        g.drawString("Total nodos: " + contadorNodos, 30, antY + 70);
    }

    private void dibujarVacia(Graphics g) {
        g.setFont(new Font("Serif", Font.BOLD, 14));
        g.drawString("Lista Vacía", 10, 20);
        g.setColor(Color.RED);
        g.drawString("null", 30, 50);
        g.setFont(new Font("Serif", Font.PLAIN, 10));
        g.setColor(Color.BLUE);
        g.drawString("P", 30, 100);
        g.drawString("U", 47, 100);
        g.setColor(Color.GREEN);
        dibujarFlechaAbajoArriba(32, 88, 32, 52, g);
        dibujarFlechaAbajoArriba(50, 88, 50, 52, g);
    }

    private void dibujarFlechaAbajoArriba(int x1, int y1, int x2, int y2, Graphics g) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x2 - 3, y2 + 5);
        g.drawLine(x2, y2, x2 + 3, y2 + 5);
    }

    private void dibujarFlechaArribaAbajo(int x1, int y1, int x2, int y2, Graphics g) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x2 - 3, y2 - 5);
        g.drawLine(x2, y2, x2 + 3, y2 - 5);
    }

    private void dibujarFlechaIzquierdaDerecha(int x1, int y1, int x2, int y2, Graphics g) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x2 - 8, y2 - 3);
        g.drawLine(x2, y2, x2 - 8, y2 + 3);
    }

    private void dibujarFlechaDoble(int x1, int y1, int x2, int y2, Graphics g) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x2 - 8, y2 - 3);
        g.drawLine(x2, y2, x2 - 8, y2 + 3);
        g.drawLine(x1, y1, x1 + 8, y1 - 3);
        g.drawLine(x1, y1, x1 + 8, y1 + 3);
    }

    private void dibujarNodo(int x, int y, NodoExtendido nodo, Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 130, 15);
        g.drawLine(x + 50, y, x + 50, y + 15);
        g.drawLine(x + 80, y, x + 80, y + 15);
        g.setFont(new Font("Serif", Font.PLAIN, 12));

        String direccion = nodo.getDireccion().toString().substring(16);
        g.drawString(direccion, x + 3, y - 3);

        g.setColor(Color.BLUE);
        g.drawString(nodo.getDato().toString(), x + 53, y + 12);
        
        if (nodo.getLi() == null) {
            direccion = "null";
        } else {
            direccion = nodo.getLi().toString().substring(16);
        }
        g.setColor(Color.RED);
        g.drawString(direccion, x + 3, y + 12);
        
        if (nodo.getLd() == null) {
            direccion = "null";
        } else {
            direccion = nodo.getLd().toString().substring(16);
        }
        g.setColor(Color.RED);
        g.drawString(direccion, x + 83, y + 12);
    }

    private void dibujarConector(int x, int y, Graphics g) {
        int x2, y2;
        x = x + 131;
        y = y + 8;
        g.drawLine(x, y, x + 8, y - 3);
        g.drawLine(x, y, x + 8, y + 3);
        x2 = x + 30;
        y2 = y;
        g.drawLine(x, y, x2, y2);
        x = x2;
        y = y2;
        x2 = x;
        y2 = y + 25;
        g.drawLine(x, y, x2, y2);
        x = x2;
        y = y2;
        x2 = x - 1140;
        y2 = y;
        g.drawLine(x, y, x2, y2);
        x = x2;
        y = y2;
        x2 = x;
        y2 = y + 45;
        g.drawLine(x, y, x2, y2);
        dibujarFlechaIzquierdaDerecha(x2, y2, x2 + 18, y2, g);
    }
}
