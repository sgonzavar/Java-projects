package pruebaarbolbinariobusqueda;

public class ArbolBinario {

    private Nodo p;

    public ArbolBinario() {
        p = null;        
    }
    
    public void insercion(int dato){
       insercion(p , dato);
    }
    
     private void insercion(Nodo nodo, int dato) {
        if(nodo == null){
          Nodo otro = new Nodo(dato);
          p = otro;
          return;
        }
        
        if(dato < (int)nodo.getDato()){
            if(nodo.getLi() == null){
                Nodo otro = new Nodo(dato);
                nodo.setLi(otro);
            }else{
                insercion(nodo.getLi(), dato);
            }
        }
        
        if(dato > (int)nodo.getDato()){
            if(nodo.getLd() == null){
                Nodo otro = new Nodo(dato);
                nodo.setLd(otro);
            }else{
                insercion(nodo.getLd(), dato);
            }
        }
    }

     public void Busqueda(int dato){
         Busqueda(p, dato);
     }
     
     public void Busqueda(Nodo nodo, int dato){
         if(nodo != null){
             if(dato < (int )nodo.getDato()){
                 Busqueda(nodo.getLi(), dato);
             } else if(dato > (int)nodo.getDato()){
                 Busqueda(nodo.getLd(), dato);
             }else{
                 System.out.print(" El " + dato +  " Si Se Encuentra En El Arbol " );
             }
         }else{
             System.out.print(" El " + dato +  " No Se Encuentra En El Arbol " );
         }
     }
 
    public void preOrden() {
        preOrden(p);
    }
    
    public void preOrden(Nodo nodo){
           if(nodo != null){
               System.out.print(nodo.getDato() + "\t");
               preOrden(nodo.getLi());
               preOrden(nodo.getLd());
           }
    }
    
    public void inOrden() {
        inOrden(p);
    }
    
    public void inOrden(Nodo nodo){
           if(nodo != null){            
               inOrden(nodo.getLi());
               System.out.print(nodo.getDato() + "\t");
               inOrden(nodo.getLd());
           }
    }
    
    public void PostOrden() {
        PostOrden(p);
    }
    
    public void PostOrden(Nodo nodo){
           if(nodo != null){            
               PostOrden(nodo.getLi());
               PostOrden(nodo.getLd());
               System.out.print(nodo.getDato() + "\t");
               
           }
    }

   
        
}
