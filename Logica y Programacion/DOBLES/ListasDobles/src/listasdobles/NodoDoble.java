package listasdobles;

import javax.swing.JOptionPane;

class NodoDoble {

    private Object dato;
    private NodoDoble cabeza, fin, siguiente, anterior;
    private NodoDoble q;

    public NodoDoble() {
        cabeza = fin = null;
    }

    public NodoDoble(NodoDoble li, Object info, NodoDoble ld) {
        anterior = li;
        dato = info;
        siguiente = ld;
    }

    public boolean VerificarLista() {
        if (cabeza == null) {
            JOptionPane.showMessageDialog(null, "LISTA VACIA!!!");//opcional
            return true;
        } else {
            return false;
        }
    }//fin lista vacia   

    public void InicializarLista() {
        cabeza = null;
    }//fin de inicializar lista

    public String Imprimirdesdecabeza() {
        String cadena = "\n";
        if (VerificarLista() == false) {
            q = cabeza;
            while (q != null) {
                cadena = cadena + "[ " + q.dato + " ]";
                q = q.siguiente; //adelanta en la lista
            }//fin del mientras
        }
        return cadena;
    }//fin de imprimirdesde cabeza

    public String Imprimirdesdeultimo() {
        String cadena = "\n";

        if (VerificarLista() == false) {
            UbicarUltimo();
            while (q != null) {
                cadena = cadena + "[ " + q.dato + " ]";
                q = q.anterior; //atraza en la lista
            }//fin del mientras
        }
        return cadena;
    }//fin de imprimir desde ultimo

    public void Inicio(Object info) {
        if (VerificarLista()) {
            cabeza = new NodoDoble(null, info, cabeza);
        } else {
            cabeza = cabeza.anterior = new NodoDoble(null, info, cabeza);
        }
    } //fin de inicio   

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

    public void Final(Object dato) {
        if (VerificarLista()) {
            fin = cabeza = new NodoDoble(null, dato, null);
        } else {
            fin = fin.siguiente = new NodoDoble(fin, dato, null);
        }
    }//fin de final

    public boolean Buscar(Object datobus) {
        boolean sw = true;
        if (!VerificarLista()) {
            q = cabeza;
            while ((!q.dato.equals(datobus)) && (sw == true)) {
                if (q.siguiente != null) {
                    q = q.siguiente;
                } else {
                    sw = false;
                }
            }//fin del mientras
        }
        return sw;
//esta es otra forma de hacer el metodo buscar, pero es hace lo mismo el que elaboramos en clase
    }//fin del metodo buscar

    public void InsertarCabeza(Object datoins) {
        if (!VerificarLista()) {
            cabeza = cabeza.anterior = new NodoDoble(null, datoins, cabeza);
        }

    }//fin de insertar primero

    public void UbicarUltimo() {
        q = cabeza;
        while (q.siguiente != null) {
            q = q.siguiente;
        }//fin de mientras
    }//fin de ubicar

    public void InsertarUltimo(Object datoins) {
        if (!VerificarLista()) {
            UbicarUltimo();
            q.siguiente = new NodoDoble(q, datoins, null);
        }

    }//fin de insertar ultimo

    public Object liberarCabeza() {
        Object d = "";
        if (!VerificarLista()) {
            if (cabeza.siguiente == null)//si existe un solo nodo
            {
                d = cabeza.dato;
                cabeza = null;//liberar cabeza   
            } else {
                q = cabeza;
                d = q.dato;
                cabeza = cabeza.siguiente;
                cabeza.anterior = q = null;//liberar q y colocar liga anterior en null
            }
        }
        return d;

    }//fin de eliminar cabeza  

    public Object liberarUltimo() {
        Object d = "";
        if (!VerificarLista()) {
            if (cabeza.siguiente == null)//si existe un solo nodo
            {
                d = cabeza.dato;
                cabeza = null;//liberar cabeza   
            } else {
                UbicarUltimo();
                q.anterior.siguiente = null;
                d = q.dato;
                q = null;
            }
        }
        return d;
    }//fin de eliminar ultimo

    public void InsertarDespues(Object datoRef, Object datoIns) {
        if (!VerificarLista()) {
            if (Buscar(datoRef) == true) {
                if (q.siguiente == null) {
                    InsertarUltimo(datoIns);
                } else {
                    q.siguiente = q.siguiente.anterior = new NodoDoble(q, datoIns, q.siguiente);
                }
            } else {
                JOptionPane.showMessageDialog(null, "el dato REFERENCIA no esta en la lista!!!");
            }
        }

    }//fin de insertar despues

    public void liberardato(Object datolib) {
        Object d = "";
        if (!VerificarLista()) {
            if (Buscar(datolib) == true) {
                if (q == cabeza)//si esta de primero
                {
                    liberarCabeza();
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

    public void InsertarAntes(Object datoRef, Object datoIns) {
        if (!VerificarLista()) {
            if (Buscar(datoRef) == true) {
                if (q.siguiente == null) {
                    InsertarCabeza(datoIns);
                } else {
                    q.anterior = q.anterior.siguiente = new NodoDoble(q.anterior, datoIns, q);
                }
            } else {
                JOptionPane.showMessageDialog(null, "el dato REFERENCIA no esta en la lista!!!");
            }
        }

    }//fin de insertar despues
}//fin de la clase nodo doble
