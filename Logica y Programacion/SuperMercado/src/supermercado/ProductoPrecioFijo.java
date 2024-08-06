package supermercado;

public  class ProductoPrecioFijo extends Producto  {
    
    private double precio;

    public ProductoPrecioFijo (double precio, int Id, String Descripcion){
        super (Id,Descripcion);
        this.precio = precio;
    }

  public double valor () {
      return precio;  
  }

    @Override
  public String toString(){
      return String.format("%25s $%,10.2f\n", super.toString(), valor());
  }

}
