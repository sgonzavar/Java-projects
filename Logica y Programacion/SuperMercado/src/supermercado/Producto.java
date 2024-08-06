package supermercado;

import java.io.Serializable;

public abstract class Producto implements Serializable {
    
  protected int Id;
  protected String Descripcion;
  
 public Producto(int Id, String Descripcion){
     this.Id = Id;
     this.Descripcion = Descripcion;        
 } 

  public abstract double valor();
  

  @Override
  public String toString(){
      return String.format("%5d %-20s", Id, Descripcion);
  }
}
