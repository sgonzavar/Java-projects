package Clases;

import java.util.Date;

public class Clientes {

    private String idCliente;
    private int TipoIdentificacion;
    private String Nombres;
    private String Apellidos;
    private String Direccion;
    private String telefono;
    private int IdCiudad;
    private Date fechaNacimiento;
    private Date fechaIngreso;

    public Clientes(String idCliente, int TipoIdentificacion, String Nombres,
            String Apellidos, String Direccion, String telefono, int IdCiudad,
            Date fechaNacimiento, Date fechaIngreso) {
        this.idCliente = idCliente;
        this.TipoIdentificacion = TipoIdentificacion;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.IdCiudad = IdCiudad;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getTipoIdentificacion() {
        return TipoIdentificacion;
    }

    public void setTipoIdentificacion(int TipoIdentificacion) {
        this.TipoIdentificacion = TipoIdentificacion;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdCiudad() {
        return IdCiudad;
    }

    public void setIdCiudad(int IdCiudad) {
        this.IdCiudad = IdCiudad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    
    @Override
    public String toString() {
        return idCliente + "|"
               + TipoIdentificacion + "|"
               + Nombres + "|"
               + Apellidos + "|"
               + Direccion + "|"
               + telefono + "|"
               + IdCiudad + "|"
               + Utilidades.formatDate(fechaNacimiento) + "|"
               + Utilidades.formatDate(fechaIngreso); 
    }

}
