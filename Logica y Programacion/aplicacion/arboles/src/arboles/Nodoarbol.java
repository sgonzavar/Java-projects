package arboles;

import javax.swing.JOptionPane;

class Nodoarbol
{
	private Object dato;
	private Nodoarbol anterior;
	private Nodoarbol siguiente;
	private Nodoarbol raiz; 
        
	//Constructores
        public Nodoarbol()
        {
            raiz=null;
        }        
        
        public Nodoarbol( Nodoarbol li,Object info, Nodoarbol ld)
	{
	    anterior=li;	
            dato=info;
            siguiente=ld;
	} 
        
        //globales
        public static Nodoarbol q,t,nuevo;	
        static public int contnodos=0,sw=0;
        public static String texto="";
        Object info;
        
        
         public void AsignarRaiz(Nodoarbol r)
         {
  	  raiz=r;
         }
	  
          public Nodoarbol ObtenerRaiz()
        {
            return raiz;
        }
        
        public void CrearRaiz()
        {
         info=JOptionPane.showInputDialog("Dato para la raiz principal: ");
	 raiz=new Nodoarbol(null,info,null);
    	 q=raiz;

        }
        
        public void IngresarHijo(Nodoarbol q)
        {
            dato=JOptionPane.showInputDialog("Nombre del hijo de: "+q.dato);
            nuevo=new Nodoarbol(null,dato,null);
        }
        
	public void InsertarNodos(Nodoarbol q)
	{
		int resp;
		resp=JOptionPane.showConfirmDialog(null,"Ingresar hijo izquierdo??"+"de "+q.dato,"ARBOLES BINARIOS",JOptionPane.YES_NO_OPTION);	
    	        if (resp == JOptionPane.YES_OPTION)//mientras respuesta sea igual a si
                {
		   IngresarHijo(q);
                   q.anterior=nuevo;
		}
		resp=JOptionPane.showConfirmDialog(null,"Ingresar hijo derecho??"+"de "+q.dato,"ARBOLES BINARIOS",JOptionPane.YES_NO_OPTION);	
    	        if (resp == JOptionPane.YES_OPTION)//mientras respuesta sea igual a si
                {
                  IngresarHijo(q);
		   q.siguiente=nuevo;
		}
	}
	        
	public void Crear(Nodoarbol q)
	{
	if (q!=null)
	   {
		InsertarNodos(q);
		Crear(q.anterior);
		Crear(q.siguiente);	
	   }
	}
		
	public String preorden(Nodoarbol q)
	{
  	if (q!=null)
		{
			texto=texto+"[ "+q.dato+" ]";
                      	preorden(q.anterior);
			preorden(q.siguiente);
		}
        return texto;        
	}	
		
	public String postorden(Nodoarbol q)
	{
    	if (q!=null)
		{
			postorden(q.anterior);
			postorden(q.siguiente);
			texto=texto+"[ "+q.dato+" ]";
		}
        return texto;
	}	
	
        public String inorden(Nodoarbol q)
	{
        if (q!=null)
		{
			inorden(q.anterior);
		        texto=texto+"[ "+q.dato+" ]";
			inorden(q.siguiente);

		}
        return texto;
        }	
        
        public void Inicializar()
        {contnodos=0;
         texto="";
        sw=0;
        t=null;}
        
              
        public void BuscarNodo(Nodoarbol q,Object d){
        if(q != null){
            if(d.equals(q.dato)){
                t=q;
            }
            BuscarNodo(q.anterior,d);
            BuscarNodo(q.siguiente,d);
        }
    }
        
        
        
        public void BorrarHoja(Nodoarbol q, Object Idato)
        {
	
            if(q.anterior!=null)
            {
		t=q;
		BorrarHoja(q.anterior,Idato);
	    }
            if(q.siguiente!=null)
            {
		t=q;
		BorrarHoja(q.siguiente,Idato);
	    }
            if(Idato.equals(q.dato))
            {
	        if((q.siguiente==null)&&(q.anterior==null))
                {
                   if(q==raiz)
                   {
                      raiz=null;
                   }
                   else
                   {
                        if (t.siguiente==q)
                        {
                            t.siguiente=null;
                        }
                         else
                        {
                         t.anterior=null;
                        }
                         q=null;
                   }
                }
                else
                     {
                         JOptionPane.showMessageDialog(null,"No es una hoja", "<<Error de entrada>>" ,JOptionPane.WARNING_MESSAGE);
                     }
            }
        }
                   
          
           
        public void BuscarDato(Object d)
        {
            Inicializar();
            BuscarNodo(raiz,d);
            if(t==null)
            {
                JOptionPane.showMessageDialog(null,"El dato "+d+" NO se encontro en el arbol.");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"El dato "+t.dato+" SI se encontro en el arbol.");
            }
        }
        
     
    
    

    
    
    public void MostraHermanos(Nodoarbol q)
	{
        if (q!=null)
	{
                if(q.anterior!=null && q.siguiente!=null){    
		JOptionPane.showMessageDialog(null,"El "+(q.anterior).dato+" y su hermano es "+(q.siguiente).dato);	}
                
                    MostraHermanos(q.anterior);
		    MostraHermanos(q.siguiente);
        }
        }	
    
   
    
   public boolean hoja(Nodoarbol q)
   {
        if(q.anterior == null && q.siguiente == null){
            return true;
        }else{
            return false;
        }
    }  
     
   
     
}
