package pruebarecursividad;

public class PruebaRecursividad {

    public static void main(String[] args) {
        
        System.out.println("Factorial de 170 no recursivo: " + NoRecursivo.factorial(170));
        System.out.println("Factorial de 170  recursivo: " + Recursivo.factorial(170));
        System.out.println("fibonacci de 30 no recuersivo " + NoRecursivo.fibonacci(30));
        System.out.println("fibonacci de 30 recuersivo " + Recursivo.fibonacci(30));
        Recursivo.hanoi(2, 'A', 'B', 'C');
        
        
        
        
    }
    
}
