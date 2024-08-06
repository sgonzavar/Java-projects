package listasdobles;

import javax.swing.JOptionPane;

class NodoDoble {

    private int c;
    private Object dato;
    private NodoDoble cabeza, fin, siguiente, anterior;
    private NodoDoble q, z;

    public NodoDoble() {
        cabeza = fin = null;
    }

    public NodoDoble(NodoDoble li, Object info, NodoDoble ld) {
        anterior = li;
        dato = info;
        siguiente = ld;
    }

    public void InicializarLista() {
        cabeza = null;
    }//fin de inicializar lista

    private boolean verificarLista() {
        if (cabeza == null) {
            JOptionPane.showMessageDialog(null, "Lista Vacia!!");
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

    public String Imprimirdesdeultimo() {
        String cadena = "\n";

        if (verificarLista() == false) {
            ubicarUltimo();
            while (q != null) {
                cadena = cadena + "[ " + q.dato + " ]";
                q = q.anterior; //atraza en la lista
            }//fin del mientras
        }
        return cadena;
    }//fin de imprimir desde ultimo

    public void Inicio(Object info) {
        if (verificarLista()) {
            cabeza = new NodoDoble(null, info, cabeza);
        } else {
            cabeza = cabeza.anterior = new NodoDoble(null, info, cabeza);
        }
    } //fin de inicio   

    public void Final(Object dato) {
        if (verificarLista() == true) {
            fin = cabeza = new NodoDoble(null, dato, null);
        } else {
            fin = fin.siguiente = new NodoDoble(fin, dato, null);
        }
    }

    public void Crear(int opc) {
        int resp, f;
        Object info;
        resp = JOptionPane.showConfirmDialog(null, "Ingresar datos a la lista?", ".......INGRESO DE DATOS.......", JOptionPane.YES_NO_OPTION);
        while (resp == JOptionPane.YES_OPTION) {
            info = JOptionPane.showInputDialog("Digite dato para la lista: ");
            if (opc == 1) {
                Inicio(info);
            } else {
                Final(info);
            }
            resp = JOptionPane.showConfirmDialog(null, "Ingresar mas datos a la lista?", ".......INGRESO DE DATOS.......", JOptionPane.YES_NO_OPTION);
        }//fin mientras
    }//fin de crear 

    public boolean Buscar(Object datobus) {
        boolean sw = true;
        if (!verificarLista()) {
            q = cabeza;
            while ((!q.dato.equals(datobus)) && (sw == true)) {
                if (q.siguiente != null) {
                    q = q.siguiente;
                } else {
                    sw = false;
                }
            }
        }
        return sw;
    }

    public void ubicarUltimo() {
        q = cabeza;
        while (q.siguiente != null) {
            q = q.siguiente;
        }
    }

    public void insertarUltimo(Object datoins) {
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
        if (!verificarLista()) {
            if (cabeza.siguiente == null)//si existe un solo nodo
            {
                d = cabeza.dato;
                cabeza = null;
            } else {
                q = cabeza;
                d = q.dato;
                cabeza = cabeza.siguiente;
                cabeza.anterior = q = null;
            }
        }
        return d;
    }

    public Object liberarUltimo() {
        Object d = "";
        if (!verificarLista()) {
            if (cabeza.siguiente == null) {
                d = cabeza.dato;
                cabeza = null;
            } else {
                ubicarUltimo();
                q.anterior.siguiente = null;
                d = q.dato;
                q = null;
            }
        }
        return d;
    }

    public void InsertarDespues(Object datoRef, Object datoIns) {
        if (!verificarLista()) {
            if (Buscar(datoRef) == true) {
                if (q.siguiente == null) {
                    insertarUltimo(datoIns);
                } else {
                    q.siguiente = q.siguiente.anterior = new NodoDoble(q, datoIns, q.siguiente);
                }
            } else {
                JOptionPane.showMessageDialog(null, "el dato REFERENCIA no esta en la lista!!!");
            }
        }

    }

    public void InsertarAntes(Object datoRef, Object datoIns) {
        if (!verificarLista()) {
            if (Buscar(datoRef) == true) {
                if (q.siguiente == null) {
                    insertarCabeza(datoIns);
                } else {
                    q.anterior = q.anterior.siguiente = new NodoDoble(q.anterior, datoIns, q);
                }
            } else {
                JOptionPane.showMessageDialog(null, "el dato REFERENCIA no esta en la lista!!!");
            }
        }

    }//fin de insertar despues

    public void liberardato(Object datolib) {
        Object d = "";
        if (!verificarLista()) {
            if (Buscar(datolib) == true) {
                if (q == cabeza)//si esta de primero
                {
                    JOptionPane.showMessageDialog(null, " El Dato No Se Puede Eliminar "
                            + " El Dato Es Cabeza ");
                } else {
                    if (q.siguiente == null)//si esta de ultimo
                    {
                        liberarUltimo();
                    } else {
                        q.anterior.siguiente = q.siguiente;
                        q.siguiente.anterior = q.anterior;
                        q = null;//liberar q
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "el dato no esta en la lista!!!");
            }
        }
    }//fin de liberardato

    public void ordenarLista() {
        Object aux;
        if (verificarLista() == false) {
            q = cabeza;
            while (q != null) {
                z = q.siguiente;
                while (z != null) {
                    aux = q.dato;
                    q.dato = z.dato;
                    z.dato = aux;

                    z = z.siguiente;
                }
                q = q.siguiente;
            }
        }
    }

    public int numeroNodos() {
        q = cabeza;
        int contar = 0;
        if (verificarLista() == true) {
            while (q != null) {
                contar = contador();
                q = q.siguiente;
            }
        }
        return contar;
    }

    private int contador() {
        c = c + 1;
        return c;
    }
} //fin de la clase nodo doble
 
// if ((int)q.dato > (int)z.dato) {
