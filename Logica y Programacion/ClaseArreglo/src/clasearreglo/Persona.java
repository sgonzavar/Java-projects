
package clasearreglo;
import javax.swing.JOptionPane;
public class Persona 
{
    //atributos propios y privados
    private String nom;
    private int edad;
    private double sal;
    
    //constructores
    public Persona(){}
    
    public Persona(String n,int e,double s)
    {
        nom=n;
        edad=e;
        sal=s;
    }
    //metodos
    public void asignarnombre(String n)
    {
        nom=n;
    }
    public String obtenernombre()
    {
        return nom;
    }
    public void asignaredad(int e)
    {
       edad=e;
    }
    public int obteneredad()
    {
        return edad;
    }
    public void asignarsalario(double s)
    {
        sal=s;
    }
    public double obtenersalario()
    {
        return sal;
    }
    
    public Persona Entrardatos()
    {
        String n;
        int e;
        double s;
        asignarnombre(n=
    JOptionPane.showInputDialog("digite nombre: "));
   
        asignaredad(e=Integer.parseInt
   (JOptionPane.showInputDialog("digite edad: "))); 
    
         asignarsalario(s=Double.parseDouble
   (JOptionPane.showInputDialog("digite salario: "))); 
    Persona objper;
    objper=new Persona(n,e,s);
    return objper;     
    }//fin entrardatos
    public String Mostrardatos()
    {
        String texto="\nNombre:"
                +this.nom+"\nEdad:"
                +this.edad+"\nSalario:"
                +this.sal;
        return texto;
    }        
}
