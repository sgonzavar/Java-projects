package listadoble;

public class ListaDoble {

    private Nodo p, u, centinela, x;
    private int contadorNodos, c = 1;
    private Object Aux,n;

    public ListaDoble() {
        p = null;
        u = null;
        contadorNodos = 0;
    }

    public int getContadorNodos() {
        return contadorNodos;
    }

    private boolean estaVacia() {
        return p == null;
    }

    public void adicionar(Object dato) {
        Nodo nodo = new Nodo(dato);
        if (estaVacia()) {
            p = nodo;
        } else {
            u.setLd(nodo);
            nodo.setLi(u);
        }
        u = nodo;
        contadorNodos++;
    }

    public void insertar(Object dato, int pos) {
        if(estaVacia() || pos > contadorNodos){
            adicionar(dato);
            return;
        }
        Nodo nodo = new Nodo(dato);
        if(pos == 1){
            nodo.setLd(p);
            p = nodo;
        }else{
            Nodo i = p;
            int j = 1;
            while(j < pos -1){
                i = i.getLd();
                j++;
            }
            nodo.setLd(i.getLd());
            i.setLd(nodo);
        }
        contadorNodos ++;
    }

    public void borrarPos(int pos) {
        if(estaVacia() || pos > contadorNodos || pos < 1){
            return;
        }
        if(pos == 1) {
            x = p;
            p = p.getLd();
            x = null;
        }else{
            centinela = p;
            int j = 1;
            while(j < pos -1){
                centinela = centinela.getLd();
                j++;
            }
            x = centinela.getLd();
            centinela.setLd(x.getLd());
            if(pos == contadorNodos){
                u = centinela;
            }
            x = null;
        }
        contadorNodos--;
    }

    public void borrarDato(Object dato) {
        if (estaVacia() == false) {
            if (Buscar(dato) == true) {
                if (centinela == p) {
                    LiberarPrimero();
                } else {
                    n =  x.getLd();
                    x.getLd() = centinela.getLd();
                    centinela = null;
                }
                System.out.print(" DAto no esta en lista ");              
            }
        }
    }

    public void borrarTodo() {
        p = null;
        u = null;
    }

    public void ordenar() {
        System.out.println(" Lista Ordenada ");
        if (estaVacia() == false) {
            centinela = p;
            while (centinela != null) {
                x = centinela.getLd();
                while (x != null) {
                    if ((float)centinela.getDato() > (float)x.getDato()) {
                        Aux = centinela.getDato();
                        centinela.setDato(x.getDato());
                        x.setDato(Aux);
                    }
                    x = x.getLd();
                }
                centinela.getLd();
            }
        }
    }

    public void borrarRepetidos() {
        
    }

    

    @Override
    public String toString() {
        String aux = "";
        Nodo i = p;
        int j = 0;
        while (i != null) {
            aux += i.getDato().toString() + "\t";
            i = i.getLd();
            j++;
            if (j % 10 == 0) {
                aux += "\n";
            }
        }
        return aux + "\nNúmero nodos: " + j;
    }

    public NodoExtendido[] toArray() {
        NodoExtendido arreglo[] = new NodoExtendido[contadorNodos];
        Nodo i = p;
        int j = 0;
        while (i != null) {
            NodoExtendido nodo = new NodoExtendido(i.getDato(), i.getLi(), i.getLd(), i);
            arreglo[j] = nodo;
            i = i.getLd();
            j++;
        }
        return arreglo;
    }

    private boolean Buscar(Object dato) {
        if (estaVacia() == false) {
            centinela = p;
            while (centinela != null && centinela.getDato() != dato) {
                x = centinela;
                centinela = centinela.getLd();
            }
        }
        if (centinela == null) {
            return false;
        } else {
            return true;
        }
    }

    private Object LiberarPrimero() {
        Object D = "";
        x = p;
        if (estaVacia() == false) {
            if (p.getLd() == null) {
                D = D + (String) p.getDato();
                p = p.getLd();
                x = null;
            } else {
                centinela = x;
                x = x.getLd().getLi();
                D = x.getDato();
                x = null;
            }
        }
        return D;
    }
}
