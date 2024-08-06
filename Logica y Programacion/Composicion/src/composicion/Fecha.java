package composicion;

public class Fecha {

    private int ano;
    private int mes;
    private int dia;

    public Fecha(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = comprobarMes(mes);
        this.dia = comprobarDia(dia); 
    }

    private int comprobarMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            return mes;
        } else {
            return 1;
        }
    }

    private int comprobarDia(int dia) {
        int diasMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (dia >= 1 && dia <= diasMes[mes]) {
            return dia;
        }
        if (mes == 2 && dia == 29 && 
                (ano % 400 == 0 || ano % 4 == 0 && ano % 100!=0 )){
            return dia;
        }
     return 1;
    }
    

    @Override
    public String toString() {
        return String.format("%04d/%02d/%02d", ano, mes, dia);
    }

}
