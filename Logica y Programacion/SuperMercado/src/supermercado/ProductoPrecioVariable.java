package supermercado;

public class ProductoPrecioVariable extends Producto {
    
    private String UnidadMedida;
    private double PrecioUnidad;
    private float  Cantidad;      

public ProductoPrecioVariable (String UnidadMedida, double PrecioUnidad, float Cantidad, int Id, String Descripcion){
    super(Id, Descripcion);
    this.UnidadMedida = UnidadMedida;
    this.PrecioUnidad = PrecioUnidad;
    this.Cantidad = Cantidad;
 
}

public double valor(){
    return PrecioUnidad * Cantidad;   
}

public String toString(){
    return String.format("%25s $%,10.2f\n", super.toString(), valor());
}

}
