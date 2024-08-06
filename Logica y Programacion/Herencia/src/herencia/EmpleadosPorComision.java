package herencia;


public class EmpleadosPorComision extends Empleado {
    private double tarifaComision;
    private double ventasBrutas;

    public EmpleadosPorComision(String nombre, String apellidos, String cedula, 
            double tarifaComision, double ventasBrutas) {
        super(nombre, apellidos, cedula);
        this.tarifaComision = tarifaComision;
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    @Override
    public double ingresos() {
        return ventasBrutas * tarifaComision;
    }

    @Override
    public String toString() {
        return String.format("Empleado Por comision:  %s", 
                super.toString());
    }
   
}
