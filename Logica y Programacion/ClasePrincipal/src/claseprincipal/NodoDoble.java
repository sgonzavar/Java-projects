package claseprincipal;

public class NodoDoble {

    private NodoDoble cabeza, fin, siguiente, anterior;
    private NodoDoble q;
    private persona dato;
    private persona ojper;

    public NodoDoble() {
        cabeza = fin = null;
    }

    public NodoDoble(NodoDoble li, Object info, NodoDoble ld) {
        anterior = li;
        dato = info;
        siguiente = ld;
    }
    
    
    public void Inicio() {
     if(VerificarLista() == true){
         cabeza = new NodoDoble(null, objper., q)
     }
    }

    public boolean VerificarLista() {
        if (cabeza == null) {

            return true;
        } else {
            return false;
        }
    }

}
