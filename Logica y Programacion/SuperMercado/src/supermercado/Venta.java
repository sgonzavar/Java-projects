package supermercado;

import java.util.ArrayList;

public class Venta {
    
    private Cliente Cliente;
    private ArrayList<Producto>Productos;
    
    public Venta(){
        Cliente = new Cliente();
        Productos = new ArrayList<>();
    }
   
    public void AsignarCliente( Cliente Cliente){
        this.Cliente = Cliente;
    }
    
    public void AgregarProducto(Producto Producto){
        Productos.add(Producto);
    }
    
    public double total(){
        double total = 0;
        for (Producto Producto:Productos) {
            total += Producto.valor();
            
        }
        return total;   
    }

    @Override
 public String toString() {
     String aux = "Cliente: " + Cliente.toString();
     aux += "ID      Descripcion        Valor\n";
     aux += "======= ================== =============\n";
     for (Producto Producto:Productos) {
            aux += Producto.valor();
            
        }
     aux += "                           ============\n";
     aux += String.format("%26s $%,10.2f", " ", total());
     return aux ;
     
}
 

}
