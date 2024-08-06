package demolistasimple;

public class Nodo {
    //atrivutos
    private Object dato;
    private Nodo liga;
   // contructor
    public Nodo(Object dato) {
        this.dato = dato;
        this.liga = null;
    }
      // get and set 
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

}
