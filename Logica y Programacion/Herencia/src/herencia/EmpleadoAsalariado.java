package herencia;

public class EmpleadoAsalariado extends Empleado { // hereda de la clase empleado
    
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, 
            String apellidos, String cedula, double salarioSemanal) {
        super(nombre, apellidos, cedula);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ingresos() {
        return salarioSemanal;
    }

    @Override
    public String toString() {
        return String.format("Empleado Asalariado:  %s\n\tIngresos: $%,.2f", 
                super.toString(), ingresos());
    }

    




}
