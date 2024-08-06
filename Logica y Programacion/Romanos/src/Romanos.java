import javax.swing.JOptionPane;  
public class Romanos {  
  
    /** 
     * @param args 
     */  
    public static void main (String[] args) {  
        //ingreso de total de arreglos  
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Total De Numeros",1));  
        //declaramos el Arreglo  
        int numeros[] = new int[num];  
        //ingresar numeros  
        for (int i=0;i<numeros.length;i++){  
            numeros[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingreso Nº " + (i+1) + " : ",1 ));  
        }  
        //mostrar y convertir  
        String Str ="";  
        for (int i=0;i<numeros.length;i++){  
            Str = Str + "Numero " + numeros[i] + " = " + Romanos(numeros[i])+"\n";  
        }  
        JOptionPane.showMessageDialog(null, Str);  
  
         
    }  
    //Metodo Para Convertir Numeros Enteros A romanos. Devuelve Una Cadena.  
    public static String Romanos(int num){  
         int x;  
         int mil,cent,dece,unid;  
        mil=(num/1000);  
        x=num%1000;  
        cent=x/100;  
        x=num%100;  
        dece=x/10;  
        unid=num%10;  
        String ERDN="";  
        switch(mil){  
            case 1:  
                ERDN = ERDN +"M";  
                break;  
            case 2:  
                ERDN = ERDN +"MM";  
                break;  
            case 3:  
                ERDN = ERDN +"MMM";  
                break;  
                 }  
        switch(cent){  
            case 1:  
                ERDN = ERDN +"C";  
                break;  
            case 2:  
                ERDN = ERDN +"CC";  
                break;  
            case 3:  
                ERDN = ERDN +"CCC";  
                break;  
            case 4:  
                ERDN = ERDN +"CD";  
                break;  
            case 5:  
                ERDN = ERDN +"D";  
                break;  
            case 6:  
                ERDN = ERDN +"DC";  
                break;  
            case 7:  
                ERDN = ERDN +"DCC";  
                break;  
            case 8:  
                ERDN = ERDN +"DCCC";  
                break;  
            case 9:  
                ERDN = ERDN +"CM";  
                break;  
        }  
        switch(dece){  
            case 1:  
                ERDN = ERDN +"X";  
                break;  
            case 2:  
                ERDN = ERDN +"XX";  
                break;  
            case 3:  
                ERDN = ERDN +"XXX";  
                break;  
            case 4:  
                ERDN = ERDN +"XL";  
                break;  
            case 5:  
                ERDN = ERDN +"L";  
                break;  
            case 6:  
                ERDN = ERDN +"LX";  
                break;  
            case 7:  
                ERDN = ERDN +"LXX";  
                break;  
            case 8:  
                ERDN = ERDN +"LXXX";  
            case 9:  
                ERDN = ERDN +"XC";  
                break;  
                }  
        switch(unid){  
            case 1:  
                ERDN = ERDN +"I";  
                break;  
            case 2:  
                ERDN = ERDN +"II";  
                break;  
            case 3:  
                ERDN = ERDN +"III";  
                break;  
            case 4:  
                ERDN = ERDN +"IV";  
                break;  
            case 5:  
                ERDN = ERDN +"V";  
                break;  
            case 6:  
                ERDN = ERDN +"VI";  
                break;  
            case 7:  
                ERDN = ERDN +"VII";  
                break;  
            case 8:  
                ERDN = ERDN +"VIII";  
                break;  
            case 9:  
                ERDN = ERDN +"IX";  
                break;  
  
        }  
        return ERDN;  
    }  
}