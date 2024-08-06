
package composicion;


public class PruebaEmpleado {

    
    public static void main(String[] args) {
       Fecha fechaNacimiento = new Fecha(1974, 9, 03);
       Fecha fechaContratacion = new Fecha(2006, 03, 12);
    
       Empleado empleado = new Empleado("juan", "zuluaga", 
               fechaNacimiento, fechaContratacion);
       
       
        System.out.println(empleado);
       

    }  
}
