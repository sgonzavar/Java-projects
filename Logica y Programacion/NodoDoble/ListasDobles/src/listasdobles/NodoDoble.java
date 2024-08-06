package listasdobles;;

import javax.swing.JOptionPane;

class NodoDoble
{
    private Object dato;
    private NodoDoble cabeza, fin, siguiente, anterior;
    private NodoDoble q;
    
    public NodoDoble()
    {
        cabeza=fin=null;
    }

    public NodoDoble(NodoDoble li, Object info, NodoDoble ld)
    {
         anterior=li; 
         dato=info;
         siguiente=ld;
    }

    


}//fin de la clase nodo doble