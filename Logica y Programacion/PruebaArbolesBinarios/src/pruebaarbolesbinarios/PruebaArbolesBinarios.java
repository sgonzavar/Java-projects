package pruebaarbolesbinarios;

public class PruebaArbolesBinarios {

    public static void main(String[] args) {
      ArbolBinario arbol = new ArbolBinario();
        System.out.println("\nPRE-ORDEN");
        arbol.preOrden();
        System.out.println("\nPOST-ORDEN");
        arbol.PostOrden();
        System.out.println("\nIN-ORDEN");
        arbol.inOrden();
    }
    
}
