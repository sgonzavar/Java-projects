
package composicion;


public class Empleado {
    
    private String apellido;
    private String nombre;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;

    public Empleado(String apellido, String nombre, Fecha fechaNacimiento, 
            Fecha fechaContratacion) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido 
                + ", F.Nacimiento: " + fechaNacimiento
                + ", F.Contratacion: " + fechaContratacion;
    }
    
    



}


