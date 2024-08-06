package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class Datos {

    private int MAxUsuario = 50;
    private int MAxProductos = 100;
    private int MaxClientes = 100;
    private Usuario misUsuarios[] = new Usuario[MAxUsuario];
    private Producto misProductos[] = new Producto[MAxProductos];
    private Clientes misClientes[] = new Clientes[MaxClientes];
    private int contadorUsuarios = 0;
    private int contadorProductos = 0;
    private int contadorClientes = 0;
    private int numeroFactura = 0;

    public Datos() {
        //cargamos usuarios
        cargarUsuarios();

        //cargamos productos 
        cargarProductos();

        //cargamos clientes
        cargarClientes();

        //cargamos configuracion
        cargarConfiguracion();

    }
    
    public int getNumeroFactura(){
        return numeroFactura;
    }
    
    public void setNumeroFactura(int numeroFact){
        this.numeroFactura = numeroFact;
    }

    public int numeroUsuarios() {
        return contadorUsuarios;
    }

    public int numeroProductos() {
        return contadorProductos;
    }

    public int numeroClientes() {
        return contadorClientes;
    }

    public Usuario[] getUsuario() {
        return misUsuarios;
    }

    public Producto[] getProductos() {
        return misProductos;
    }

    public Clientes[] getClientes() {
        return misClientes;
    }

    public boolean validarUsuario(String Usuario, String Clave) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(Usuario)
                    && misUsuarios[i].getClave().equals(Clave)) {
                return true;
            }
        }
        return false;
    }

    public int getPerfil(String Usuario) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(Usuario)) {
                return misUsuarios[i].getPerfil();
            }
        }
        return -1;
    }

    public void cambioClave(String Usuario, String clave) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(Usuario)) {
                misUsuarios[i].setClave(clave);
                return;
            }
        }
    }

    public int posicionUsuario(String Usuario) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(Usuario)) {
                return i;
            }
        }
        return -1;
    }

    public int posicionProducto(String Producto) {
        for (int i = 0; i < contadorProductos; i++) {
            if (misProductos[i].getIdPrducto().equals(Producto)) {
                return i;
            }
        }
        return -1;
    }

    public int posicionCliente(String Cliente) {
        for (int i = 0; i < contadorClientes; i++) {
            if (misClientes[i].getIdCliente().equals(Cliente)) {
                return i;
            }
        }
        return -1;
    }

    public String agregarUsuario(Usuario miUsuario) {
        if (contadorUsuarios == MAxUsuario) {
            return "SE HA ALCANZADO EL MAXIMO DE USUARIOS";
        }
        misUsuarios[contadorUsuarios] = miUsuario;
        contadorUsuarios++;
        return "SE HA AGREGADO EL USUARIO CORRECTA MENTE";
    }

    public String agregarProducto(Producto miProducto) {
        if (contadorProductos == MAxProductos) {
            return "SE HA ALCANZADO EL MAXIMO DE PRODUCTOS";
        }
        misProductos[contadorProductos] = miProducto;
        contadorProductos++;
        return "SE HA AGREGADO EL PRODUCTO CORRECTA MENTE";
    }

    public String agregarCliente(Clientes miCliente) {
        if (contadorClientes == MaxClientes) {
            return "SE HA ALCANZADO EL MAXIMO DE CLIENTES";
        }
        misClientes[contadorClientes] = miCliente;
        contadorClientes++;
        return "SE HA AGREGADO EL CLIENTE CORRECTA MENTE";
    }

    public String modificarUsuario(Usuario miUsuario, int pos) {
        misUsuarios[pos].setNombres(miUsuario.getNombres());
        misUsuarios[pos].setApellidos(miUsuario.getApellidos());
        misUsuarios[pos].setClave(miUsuario.getClave());
        misUsuarios[pos].setPerfil(miUsuario.getPerfil());
        return "SE HA MODIFICADO EL USUARIO CORRECTA MENTE";
    }

    public String modificarProducto(Producto miProducto, int pos) {
        misProductos[pos].setDescripcion(miProducto.getDescripcion());
        misProductos[pos].setPrecio(miProducto.getPrecio());
        misProductos[pos].setIva(miProducto.getIva());
        misProductos[pos].setNota(miProducto.getNota());
        return "SE HA MODIFICADO EL PRODUCTO CORRECTA MENTE";
    }

    public String modificarCliente(Clientes miCliente, int pos) {

        misClientes[pos].setTipoIdentificacion(miCliente.getTipoIdentificacion());
        misClientes[pos].setNombres(miCliente.getNombres());
        misClientes[pos].setApellidos(miCliente.getApellidos());
        misClientes[pos].setDireccion(miCliente.getDireccion());
        misClientes[pos].setTelefono(miCliente.getTelefono());
        misClientes[pos].setIdCiudad(miCliente.getIdCiudad());
        misClientes[pos].setFechaNacimiento(miCliente.getFechaNacimiento());
        misClientes[pos].setFechaIngreso(miCliente.getFechaIngreso());
        return "SE HA MODIFICADO EL CLIENTE CORRECTA MENTE";
    }

    public String borrarUsuario(int pos) {
        for (int i = pos; i < contadorUsuarios - 1; i++) {
            misUsuarios[i] = misUsuarios[i + 1];
        }
        contadorUsuarios--;
        return "SE HA BORRADO EL USUARIO CORRECTA MENTE";
    }

    public String borrarProducto(int pos) {
        for (int i = pos; i < contadorProductos - 1; i++) {
            misProductos[i] = misProductos[i + 1];
        }
        contadorProductos--;
        return "SE HA BORRADO EL PRODUCTO CORRECTA MENTE";
    }

    public String borrarCliente(int pos) {
        for (int i = pos; i < contadorClientes - 1; i++) {
            misClientes[i] = misClientes[i + 1];
        }
        contadorClientes--;
        return "SE HA BORRADO EL CLIENTE CORRECTA MENTE";
    }

    public void grabarTodo() {
        grabarUsuarios();
        grabarClientes();
        grabarProductos();
        grabarConfiguracion();
    }

    public void grabarUsuarios() {

        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/Usuarios.txt");
            pw = new PrintWriter(fw);

            for (int i = 0; i < contadorUsuarios; i++) {
                pw.println(misUsuarios[i].toString());
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public void grabarClientes() {

        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/Clientes.txt");
            pw = new PrintWriter(fw);

            for (int i = 0; i < contadorClientes; i++) {
                pw.println(misClientes[i].toString());
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public void grabarProductos() {

        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/Productos.txt");
            pw = new PrintWriter(fw);

            for (int i = 0; i < contadorProductos; i++) {
                pw.println(misProductos[i].toString());
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public void grabarConfiguracion() {

        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/configuracion.ini");
            pw = new PrintWriter(fw);

            
            pw.println("[Generarl]");
            pw.println("FacturaActual =" + numeroFactura);


        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public void cargarUsuarios() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("Data/Usuarios.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            int perfil, posicion;
            String apellidos, clave, auxiliar, nombres, idUsuario, linea;

            while ((linea = br.readLine()) != null) {
                // extraemos id usuario 
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                idUsuario = auxiliar;
                linea = linea.substring(posicion + 1);

                // extraemos Nombres
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                nombres = auxiliar;
                linea = linea.substring(posicion + 1);

                // extraemos Apellidos
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                apellidos = auxiliar;
                linea = linea.substring(posicion + 1);

                //extraemos la Clave y perfil
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                clave = auxiliar;
                linea = linea.substring(posicion + 1);
                perfil = new Integer(linea);

                Usuario miUsuario = new Usuario(idUsuario, nombres,
                        apellidos, clave, perfil);
                misUsuarios[contadorUsuarios] = miUsuario;
                contadorUsuarios++;

            }

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public void cargarProductos() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("Data/Productos.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            int precio, iva, posicion;
            String nota, auxiliar, Descripcion, idPrductos, linea;

            while ((linea = br.readLine()) != null) {
                // extraemos id producto 
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                idPrductos = auxiliar;
                linea = linea.substring(posicion + 1);

                // extraemos Descripcion
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                Descripcion = auxiliar;
                linea = linea.substring(posicion + 1);

                // extraemos Precio
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                precio = new Integer(auxiliar);
                linea = linea.substring(posicion + 1);

                //extraemos iva y nota
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                iva = new Integer(auxiliar);
                linea = linea.substring(posicion + 1);
                nota = linea;

                Producto miProducto = new Producto(idPrductos, Descripcion, precio, iva, nota);
                misProductos[contadorProductos] = miProducto;
                contadorProductos++;
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public void cargarClientes() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("Data/Clientes.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            int TipoIdentificacion, IdCuidad, posicion;
            String Nombres, IdCliente, Apellidos, Direccion, telefono, auxiliar, linea;
            Date fechaNacimiento, fechaIngreso;

            /*
             private Date fechaNacimiento;
             private Date fechaIngreso;*/
            while ((linea = br.readLine()) != null) {

                // extraemos id cliente 
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                IdCliente = auxiliar;
                linea = linea.substring(posicion + 1);

                // extraemos Tipo de identificacion
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                TipoIdentificacion = new Integer(auxiliar);
                linea = linea.substring(posicion + 1);

                // extraemos Nombres
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                Nombres = auxiliar;
                linea = linea.substring(posicion + 1);

                // extraemos Apellidos
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                Apellidos = auxiliar;
                linea = linea.substring(posicion + 1);

                // extraemos Direccion
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                Direccion = auxiliar;
                linea = linea.substring(posicion + 1);

                // extraemos Telefono
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                telefono = auxiliar;
                linea = linea.substring(posicion + 1);

                // extraemos Cuidad
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                IdCuidad = new Integer(auxiliar);
                linea = linea.substring(posicion + 1);

                //extraemos fechanacimiento y fechaIngreso
                posicion = linea.indexOf('|');
                auxiliar = linea.substring(0, posicion);
                fechaNacimiento = Utilidades.StringToDate(auxiliar);
                linea = linea.substring(posicion + 1);
                fechaIngreso = Utilidades.StringToDate(linea);

                Clientes miClientes;
                miClientes = new Clientes(IdCliente, TipoIdentificacion, Nombres, Apellidos,
                        Direccion, telefono, IdCuidad, fechaNacimiento, fechaIngreso);
                misClientes[contadorClientes] = miClientes;
                contadorClientes++;
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    private void cargarConfiguracion() {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("Data/configuracion.ini");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("FacturaActual=")) {
                    numeroFactura = new Integer(linea.substring(14));
                }
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

}
