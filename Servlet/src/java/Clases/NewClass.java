package Clases;

public class NewClass {

   private int primerNumero, segundoNumero;

    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
   
   public int suma(){
   
       return  primerNumero + segundoNumero;
   }
   public int dividir(){
   
       return  primerNumero / segundoNumero;
   }
   
 
}
