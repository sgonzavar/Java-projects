package listassimples;

public class NodoDoble {

    private Object dato;
    private NodoDoble cabeza, fin, siguiente, anterior, q, x;
    private int contar = 1;

    public NodoDoble() {
        cabeza = fin = null;
    }

    public NodoDoble(NodoDoble li, Object info, NodoDoble ld) {
        anterior = li;
        dato = info;
        siguiente = ld;
    }

    public void Inicio(Object dato) {
        if (verificarLista() == true) {
            cabeza = new NodoDoble(null, dato, cabeza);
        } else {
            cabeza = new NodoDoble(null, dato, cabeza);
        }
    }

    private boolean verificarLista() {
        if (cabeza == null) {
            System.out.print(" Lista Vacia!! ");
            return true;
        } else {
            return false;
        }
    }

    public String imprimirDesdeCabeza() {
        String cadena = "\n";
        if (verificarLista() == false) {
            q = cabeza;
            while (q != null) {
                cadena = cadena + "[ " + q.dato + " ]";
                q = q.siguiente;
            }
        }
        return cadena;
    }

    public void Final(Object dato) {
        if (verificarLista() == true) {
            fin = cabeza = new NodoDoble(null, dato, null);
        } else {
            fin = fin.siguiente = new NodoDoble(fin, dato, null);
        }
    }

    public void ubicarUltimo() {
        q = cabeza;
        while (q.siguiente != null) {
            q = q.siguiente;
        }
    }

    public void insertarUltimo() {
        if (verificarLista() == false) {
            ubicarUltimo();
            q.siguiente = new NodoDoble(q, dato, null);
        }
    }

    public void insertarCabeza(Object dato) {
        if (verificarLista() == false) {
            cabeza = cabeza.anterior = new NodoDoble(null, dato, cabeza);
        }
    }

    public Object liberarCabeza() {
        Object d = "";
        if (verificarLista() == false) {
            if (cabeza.siguiente == null) {
                d = cabeza.dato;
                cabeza = null;
            } else {
                q = cabeza;
                cabeza = cabeza.siguiente;
                cabeza.anterior = null;
                d = q.dato;
                q = null;
            }
        }
        return d;
    }

    public Object liberarUltimo() {
        Object d = "";
        if (verificarLista() == false) {
            if (cabeza.siguiente == null) {
                d = cabeza.dato;
                cabeza = null;
            } else {
                q = cabeza;
                cabeza = cabeza.siguiente;
                cabeza.anterior = null;
                d = q.dato;
                q = null;
            }
        }
        return d;
    }

    public void insertar(Object dato, int pos) {
        q = cabeza;
        while (q != null) {
            if (contar == pos) {
                q = new NodoDoble(q.anterior, dato, q.siguiente);
            } else {
                contar++;
            }
        }
    }

    public void borrarTodo() {
        cabeza = null;
    }

    public void borrarPos(int pos) {
        contar = 0;
        q = cabeza;
        while (q != null) {
            if (pos == contar) {
                x.anterior = q.anterior;
                x.siguiente = q.siguiente;
                q = null;
            } else {
                contar++;
            }
        }
    }

    public void borrarDato(Object dato) {
        if (verificarLista() == false) {
            if (Buscar(dato) == true) {
                if (q == cabeza) {
                    liberarCabeza();
                } else {
                    x.anterior = q.anterior;
                    x.siguiente = q.siguiente;
                    q = null;
                }
                
                System.out.println(" DAto No Esta En La Lista ");
            }
        }
    }

    private boolean Buscar(Object dato) {
        if (verificarLista() == false) {
            q = cabeza;
            while (q != null && q.dato != dato) {
                x = q;
                q = q.siguiente;
            }
        }
        if (q == null) {
            return false;
        } else {
            return true;
        }
    }
    
    public void borrarRepetidos(){
        
    }

}//fin de la clase nodo doble

