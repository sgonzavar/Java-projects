package listasdobles;

import javax.swing.JOptionPane;

public class NodoSimple {

    //atributos propios de la clase

    private Object dato;
    private NodoSimple cabeza, siguiente, Fin, q, p;

    //constructor de condiciones iniciales
    public NodoSimple() {
        cabeza = null;
        Fin = null;
    }
    /*constructor que recibe un parametro y coloca
     en liga, enlace o siguiente null*/

    public NodoSimple(Object d) {
        dato = d;
        siguiente = null;
    }
    /*constructor que recibe los dos parametros
     para la parte de informacion del nodo y para
     la parte de enlace, liga o siguiente*/

    public NodoSimple(Object d, NodoSimple l) {
        dato = d;
        siguiente = l;
    }

    public boolean VerificarLista() {
        if (cabeza == null) {
            JOptionPane.showMessageDialog(null, "Lista Vacia!!");//opcional segun el programador
            return true;
        } else {
            return false;
        }
    }//fin del metodo para lista vacia
    /*este metodo crea un nodo como cabeza o inicio*/

    public void Inicio(Object d) {
        cabeza = new NodoSimple(d, cabeza);
    }//fin del metodo Inicio

    /*este metodo crea un nodo al final de la lista,
     primero valida si existe algun nodo como cabeza,
     si no existe lo crea, de lo contrario crea el
     nodo final*/
    public void Final(Object d) {
        if (VerificarLista()) {
            Fin = cabeza = new NodoSimple(d, cabeza);
        } else {
            q = new NodoSimple(d);
            Fin.siguiente = q;
            Fin = q;
        }
    }//fin de Final

    public String Imprimir() {
        String cadena = "\n";
        if (!VerificarLista()) {

            q = cabeza;
            while (q != null) {
                cadena = cadena + "[ " + q.dato + " ]";
                q = q.siguiente; //adelanta en la lista
            }//fin del mientras

        }
        return cadena;

    }//fin del imprimir

    public void IniciarLista() {
        cabeza = Fin = null;
    }

    public boolean Buscar(Object datobus) {
        q = cabeza;
        while (q != null && !q.dato.equals(datobus)) {
            p = q;
            q = q.siguiente;
        }//fin del mientras
        if (q == null) {
            JOptionPane.showMessageDialog(null,
                    "el dato no esta en la lista!!!");
            return false;//no lo encontro
        } else {
            return true;//si lo encontro
        }

    }//fin del metodo buscar

    public Object liberardato(Object datoElim) {
        Object d = "";
        if (!VerificarLista()) {
            if (Buscar(datoElim)) {
                if (q == cabeza) {
                    d = liberarCabeza();
                } else {
                    d = q.dato;
                    p.siguiente = q.siguiente;
                    q = null;
                }
            }

        }
        return d;
    }  //fin de eliminar

    public void Insertarcabeza(Object datoins) {
        if (!VerificarLista()) {
            Inicio(datoins);
        }
    }//fin de insertar primero

    /*este metodo ubica el puntero q en el ultimo nodo
     y a p antes de q*/
    public void UbicarUltimo() {
        p = null;
        q = cabeza;
        while (q.siguiente != null) {
            p = q;
            q = q.siguiente;
        }//fin de mientras
    }//fin de ubicar

    public void InsertarUltimo(Object datoins) {
        if (!VerificarLista()) {
            UbicarUltimo();
            q.siguiente = new NodoSimple(datoins);
        }
    }//fin de insertar ultimo

    public void InsertarDespues(Object datoRef, Object datoins) {
        if (!VerificarLista()) {
            if (Buscar(datoRef)) {
                q.siguiente = new NodoSimple(datoins, q.siguiente);
            } else {
                JOptionPane.showMessageDialog(null,
                        "el dato no esta en la lista!!!");
            }
        }
    }//fin de insertar despues

    public void InsertarAntes(Object datoRef, Object datoins) {
        if (!VerificarLista()) {
            if (Buscar(datoRef)) {
                if (q == cabeza) {
                    Inicio(datoins);
                } else {
                    p.siguiente = new NodoSimple(datoins, p.siguiente);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "el dato no esta en la lista!!!");
            }
        }
    }//fin de insertar ANTES

    public Object liberarCabeza() {
        Object d = "";
        if (!VerificarLista()) {
            q = cabeza;
            d = q.dato;
            cabeza = cabeza.siguiente;
            q = null;//liberar q
        }
        return d;
    }//fin de eliminar cabeza

    public Object liberarUltimo() {
        Object d = "";
        if (!VerificarLista()) {
            UbicarUltimo();
            if (cabeza.siguiente != null) {
                p.siguiente = null;
                d = q.dato;
                q = null;
            } else {
                JOptionPane.showMessageDialog(null, "Solo existe un dato");
            }

        }
        return d;
    }//fin de eliminar ultimo

    /*este metodo es el mismo que hicimos en clase crear por inicio y crear por final, solo que los junte para no repetirlo dos veces,
     si es crear por inicio en la variable opc se tiene 1 y por final se tiene 0, eso se manda del metodo principal */
    public void Crear(int opc) {
        int resp;
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
    }//fin de crear por el inicio        

}
