package pruebarecursividad;

public class NoRecursivo {

    public static double factorial(int n) {
        double aux = 1;
        for (int i = 2; i <= n; i++) {
            aux *= i;
        }
        return aux;
    }

    public static double fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        double a = 0, b = 1, c = 0, i = 1;
        while (i < n) {
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        return c;
    }
}
