package Listas_Dobles;
import javax.swing.JOptionPane;
/**
 * Luz Andrea Páez Martínez
 * @author luzpaez
 * Mayo 17/2012
 * Lista doblemente enlazadas
 */

class NodoDoble{
    Object dato;
    NodoDoble cabeza, fin, siguiente, anterior;
    static NodoDoble q,nuevo;
    
    public NodoDoble(){
        cabeza=fin=null;
    }

    public NodoDoble(NodoDoble li, Object d, NodoDoble ld){
         anterior=li; 
         dato=d;
         siguiente=ld;
    }

    public boolean esVacia(){
        return cabeza==null;
    }   
    
    public void ListaVacia(){
        cabeza=fin=null;
    }

    public void imprimir(){       
        if(!esVacia()){
            String cadena="\n";
            q=cabeza;
            while(q!=null){
                cadena=cadena+"[ "+q.anterior+ " ]"+"[ "+q.dato+" ]" + "[ " +q.siguiente+" ]";
                q=q.siguiente; //adelanta en la lista
            }//fin del mientras
            JOptionPane.showMessageDialog(null,"La lista es: "+cadena);
        }
        else{
          JOptionPane.showMessageDialog(null,"La lista esta vacia!!!");
        }
    }
	
    public void inicio(Object x){
        if(esVacia())
            cabeza=new NodoDoble(null,x,cabeza);
        else
           cabeza=cabeza.anterior=new NodoDoble(null,x,cabeza);
    }    
    
    public void Final(Object x){
        if(esVacia())
            fin=cabeza=new NodoDoble(null,x,null);
        else
            fin=fin.siguiente=new NodoDoble(fin,x,null);
    }
}