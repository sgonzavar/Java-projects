package DemoPila;

public class Pila {

    private Object pila[];
    private int tope;
    private int n;

    public Pila(int n) {
        this.n = n;
        tope = 0;
        pila = new Object[n];
    }

    private boolean estVacia() {
        return tope == 0;
    }

    private boolean estaLlena() {
        return tope == n;
    }

    public boolean apilar(Object dato) {
        if (estaLlena()) {
            return false;
        }
        pila[tope] = dato;
        tope++;
        return true;
    }

    public Object desApilar() {
        if (estVacia()) {
            return null;
        }
        tope--;
        return pila[tope];
    }
}
