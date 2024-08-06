package pruebarecursividad;

public class Recursivo {

    public static double factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
     public static double fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
       
    }
     
     public static void hanoi(int n, char o, char a, char d) {
         if(n > 0){
             hanoi(n-1, o, d, a);
             System.out.println(o + " => " + d);
             hanoi(n-1, a, o, d);
             
         }
     }

}
