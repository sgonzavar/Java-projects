package Clases;

public class Producto {

    private String IdPrducto;
    private String Descripcion;
    private int precio;
    private int iva;  // 0 = 0%, 1 = 10% y 2 = 16%
    private String nota;

    public Producto(String IdPrducto, String Descripcion, int precio, int iva, 
            String nota) {
        this.IdPrducto = IdPrducto;
        this.Descripcion = Descripcion;
        this.precio = precio;
        this.iva = iva;
        this.nota = nota;
    }

    public String getIdPrducto() {
        return IdPrducto;
    }

    public void setIdPrducto(String IdPrducto) {
        this.IdPrducto = IdPrducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    public String toString() {
        return IdPrducto + "|"
               + Descripcion + "|"
               + precio + "|"
               + iva + "|"
               + nota; 
    }
    
    
}
