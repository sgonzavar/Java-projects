package pruebaarbolbinariobusqueda;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Nodo {

    private Object dato;
    private Nodo li, ld;

    public Nodo() {
        this.dato = null;
        this.li = null;
        this.ld = null;

    }

    public Nodo(Object dato) {
        this.dato = dato;
         this.li = null;
        this.ld = null;
    }
    
    @Override
    public void finalize(){
        try {
            super.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(Nodo.class.getName()).log(Level.SEVERE, null, ex);
        }   
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

    @Override
    public String toString() {
        return dato.toString();
    }

    
    
}
