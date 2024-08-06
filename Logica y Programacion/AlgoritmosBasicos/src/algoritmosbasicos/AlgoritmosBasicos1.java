package algoritmosbasicos;

import java.util.Scanner;

public class AlgoritmosBasicos1 {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
    
        System.out.print("Digite Edad De Paciente.: ");
        int Edad = leer.nextInt();
        if(Edad >= 0 && Edad <= 17){
            System.out.println("ETAPA DE LA VIDA: Menor De Edad");
        }else{
            if(Edad >= 18 && Edad <= 59){
                System.out.println("ETAPA DE LA VIDA: Adulto");
            }else{
                System.out.println("ETAPA DE LA VIDA: Adulto Mayor");
            }
        }
        
    }

}

