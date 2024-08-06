package formulario;

public class Clase {

    public Clase() {
    }
 
    public int codigo,comision;
    public String nombres; 
    public double salario;

    public int getCobro() {
        return codigo;
    }

    public void setCobro(int codigo) {
        this.codigo = codigo;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Clase(int codigo, int comision, String nombres, double salario) {
        this.codigo = codigo;
        this.comision = comision;
        this.nombres = nombres;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\tcodigo = " + codigo + "\tcomision = " + comision + "\tnombres = " 
                + nombres + "\t salario = " + salario + "";
    }
    
    /*si la comision es de 10% al salario le van a quitar un 10%, si la comision es del 20% a la comision le quita el 20%
    y si es del 30 le quita el 30%
    */
    
    public void Calcular (){
        switch (this.comision){
            case 0:
                salario = salario - (salario*0.1);
                break;
            case 1:
                salario = salario - (salario*0.2);
                break;
            case 2:
                salario = salario - (salario*0.3);
                break;
            case 3:
                salario = salario - (salario*0.4);
        }
        
    } 
    
    public boolean soloNumeros(char c){
        return ((c < '0' || c > '9'));
    }
    
    public boolean soloLetras(char c){
        return ((c < 'a' || c > 'z')&&(c < 'A' || c > 'Z'));
    }
    
    
         
    
    
    
}
