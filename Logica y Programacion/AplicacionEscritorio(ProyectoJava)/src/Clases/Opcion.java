package Clases;

public class Opcion {

    private String valor;
    private String Descripcion;

    public Opcion(String valor, String Descripcion) {
        this.valor = valor;
        this.Descripcion = Descripcion;
    }

    public String getValor() {
        return valor;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    @Override
    public String toString() {
        return Descripcion;
    }
    
    
    
    
    
}
