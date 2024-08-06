package listadoble;

public class NodoExtendido {
    
    private Object dato;
    private Nodo li;
    private Nodo ld;
    private Nodo direccion;

    public NodoExtendido(Object dato, Nodo li, Nodo ld, Nodo direccion) {
        this.dato = dato;
        this.li = li;
        this.ld = ld;
        this.direccion = direccion;
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

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getDireccion() {
        return direccion;
    }

    public void setDireccion(Nodo direccion) {
        this.direccion = direccion;
    }
}
