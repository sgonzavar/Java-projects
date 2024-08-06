
package herencia;


public class PruebaSistemaNomina {

    
    public static void main(String[] args) {
        EmpleadoBaseMasComision e0 = new EmpleadoBaseMasComision("ruben", "blades", "564654", 0.02, 63000000, 413000);
        EmpleadoAsalariado e1 = new EmpleadoAsalariado("bob","Marley", "12345678", 1234540);
        EmpleadoPorHoras e2 = new EmpleadoPorHoras("feddy ", "Mercury", "458665484", 48, 12300);
        EmpleadosPorComision e3 = new EmpleadosPorComision("celia", "cruz", "5446465456", 0.03, 160000000);
        EmpleadoBaseMasComision e4 = new EmpleadoBaseMasComision("paulina", "rubio", "564654", 0.003, 34000000, 380000);
                
        Empleado empleados[] = new Empleado[5];
        empleados[0] = e0;
        empleados[1] = e1;
        empleados[2] = e2;
        empleados[3] = e3;
        empleados[4] = e4;
        
        for (Empleado empleadoActual: empleados){// empleadoactual es una temporal 
            System.out.println(empleadoActual);  // empleadoactual es el objeto del ciclo
            
            if(empleadoActual instanceof EmpleadoBaseMasComision){
               EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision)//casteo 
                       empleadoActual;
               empleado.setSalarioBase(empleado.getSalarioBase() * 1.33);
                System.out.println("****AUMETNO DE SUELTO****");
                System.out.println(empleadoActual);
            }              
        }         
    }
}
