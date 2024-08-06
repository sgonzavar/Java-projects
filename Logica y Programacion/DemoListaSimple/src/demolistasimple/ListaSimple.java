package demolistasimple;

public class ListaSimple {

    private int n;
    private Nodo p;
    private Nodo u;

    public ListaSimple() {
        n = 0;
        p = null;
        u = null;
    }

    public boolean estaVacia() {
        return p == null;
    }

    public void add(Object dato) {
        Nodo nodo = new Nodo(dato);
        n++;
        if (estaVacia()) {
            p = nodo;
        } else {
            u.setLiga(nodo);
        }
        u = nodo;
    }

    @Override
    public String toString() {
        String aux = "";
        Nodo i = p;
        while(i != null){
            aux += i.getDato() + "\t";
            i = i.getLiga();
        }
        return aux;
    }

}
