
package herencia;


public abstract class Empleado {
    private String nombre;
    private String apellidos;
    private String cedula;

    public Empleado(String nombre, String apellidos, String cedula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public abstract double ingresos(); // Metodo ABSTRACTO

    @Override
    public String toString() {
        return String.format("%s %s\n\tCedula:  %s", nombre, apellidos, cedula);
    }  
}
