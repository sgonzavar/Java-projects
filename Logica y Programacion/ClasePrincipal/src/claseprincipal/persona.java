package claseprincipal;

import java.util.Scanner;

public class persona {

    private String Nombre, apellido, sexo;
    private int estadoCivil, añoNacimineto;
    private Scanner leer = new Scanner(System.in);

    public persona(String Nombre, String apellido, String sexo, int estadoCivil, int añoNacimineto) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.añoNacimineto = añoNacimineto;
    }
    
    public void IngresarDatos() {
        System.out.print(" Digite nombre : ");
        Nombre = leer.nextLine();
        System.out.print(" Digite primer apellido : ");
        apellido = leer.nextLine();
        System.out.print(" Digite f = femenino, m = masculino ");
        sexo = leer.next();
        System.out.print(" Digite 1 soltero, 2 casado, 3 separado, 4 viudo, 5 union libre, 6 otro ");
        estadoCivil = leer.nextInt();
         System.out.print(" Digite año de nacimiento ");
        añoNacimineto = leer.nextInt();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getAñoNacimineto() {
        return añoNacimineto;
    }

    public void setAñoNacimineto(int añoNacimineto) {
        this.añoNacimineto = añoNacimineto;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    
}
