package herencia;


public class EmpleadoBaseMasComision extends EmpleadosPorComision {
   
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellidos, 
            String cedula, double tarifaComision, double ventasBrutas, double salarioBase) {
        super(nombre, apellidos, cedula, tarifaComision, ventasBrutas);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double ingresos() {
        return super.ingresos() + salarioBase; //To change body of generated methods, choose Tools | Templates.
    }


     @Override
    public String toString() {
        return String.format("Empleado Base y :  %s\n\tIngresos: $%,.2f", 
                super.toString(), ingresos());
    }

}
