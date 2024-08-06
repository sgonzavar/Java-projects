package pruebaarbolesbinarios;

import java.util.Scanner;

public class ArbolBinario {

    private Nodo p;

    public ArbolBinario() {
        Nodo nodo = new Nodo();
        p = nodo;
        crearArbol(nodo);
    }

    private void crearArbol(Nodo nodo) {
        Scanner sc = new Scanner(System.in);
        String rta;

        System.out.print("Ingrese Dato....................................: ");
        String dato = sc.nextLine();
        nodo.setDato(dato);

        System.out.print("Existe nodo por izquierda de........... " + dato + " <S/N> : ");
        rta = sc.nextLine();
        if (rta.equalsIgnoreCase("S")) {
            Nodo otro = new Nodo();
            nodo.setLi(otro);
            crearArbol(otro);
        }

        System.out.print("Existe nodo por derecha de............. " + dato + " <S/N> : ");
        rta = sc.nextLine();
        if (rta.equalsIgnoreCase("S")) {
            Nodo otro = new Nodo();
            nodo.setLd(otro);
            crearArbol(otro);
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
