package listadoble;

public class Nodo {

    private Object dato;
    private Nodo li;
    private Nodo ld;

    public Nodo(Object dato) {
        this.dato = dato;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getLi() {
        return li;
    }

    public void setLi(Nodo li) {
        this.li = li;
    }

    public Nodo getLd() {
        return ld;
    }

    public void setLd(Nodo ld) {
        this.ld = ld;
    }
}
