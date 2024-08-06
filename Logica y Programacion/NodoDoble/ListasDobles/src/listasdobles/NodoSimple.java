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
            Fin.siguiente = new NodoSimple(d);
            Fin = Fin.siguiente;

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

    public void insertarcabeza(Object d) {
        if (VerificarLista() == false) {
            Inicio(d);
        }
    }//fin de insertarcabeza

    public void Ubicarultimo() {
        if (VerificarLista() == false) {
            q = cabeza;
            while (q.siguiente != null) {
                p = q;
                q = q.siguiente;
            }//fin mientras
        }//fin si
    }//fin ubicarultimo

    public void insertarultimo(Object d) {
        if (VerificarLista() == false) {
            Ubicarultimo();
            q.siguiente = new NodoSimple(d);
        }
    }//fin insertarultimo

    public Object liberarcabeza() {
        Object d = "";
        if (VerificarLista() == false) {
            q = cabeza;
            d = q.dato;
            cabeza = cabeza.siguiente;
            q = null;
        }//fin si
        return d;
    }//fin de liberar cabeza

    public Object liberarultimo() {
        Object d = "";
        if (VerificarLista() == false) {
            q = cabeza;
            if (cabeza.siguiente == null) {
                cabeza = cabeza.siguiente;
            } else {
                Ubicarultimo();
                p.siguiente = null;
            }
            d = q.dato;
            q = null;
        }
        return d;
    }//fin de liberar ultimo

    public boolean buscar(Object d) {
        if (VerificarLista() == false) {
            q = cabeza;
            while (q != null && (!q.dato.equals(d))) {
                p = q;
                q = q.siguiente;
            }//fin mientras
        }//fin si
        if (q == null) {
            return false;
        } else {
            return true;
        }
    }//fin buscar

    public void liberardato(Object d) {
        if (VerificarLista() == false) {
            if (buscar(d) == true) {
                if (q == cabeza) {
                    JOptionPane.showMessageDialog(null, "el dato eliminado fue: " + liberarcabeza());
                } else {
                    p.siguiente = q.siguiente;
                    q = null;
                }//fin si
            } else {
                JOptionPane.showMessageDialog(null, "el dato no fue encontrado!!");
            }//fin si
        }//fin si

    }//fin de liberardato

    public void insertarAntes(Object info, Object datoRef) {
        Object d = info, datoref = datoRef;
        if (VerificarLista() == false) {
            if (buscar(datoref) == true) {
                if (q == cabeza) {
                    insertarcabeza(datoref);
                } else {
                    p.siguiente = new NodoSimple(d, p.siguiente);
                }
            }
        }
    }
 
    public void insertarDespues(Object info, Object datoRef) {
        Object d = info, datoref = datoRef;
        if (VerificarLista() == false) {
            if (buscar(datoref) == true) {
                p.siguiente = new NodoSimple(dato, p.siguiente);
            }
        }      
    } 
}//fin nodosimple