package evaluadorexpresiones;

public class Evaluador {

    public static double evaluar(String infija) {
        String posfija = convertir(infija);
        System.out.println("la expresion posfija es: " + posfija);
        return evaluarPosfija(posfija);
    }

    private static String convertir(String infija) {
       
        String posfija = "", aux = "";
        Pila pila = new Pila(100);
        for (int i = 0; i < infija.length(); i++) {// con lenght() se obtiene el tamaño del string digitado por pantalla
            char letra = infija.charAt(i);
            if (esOperador(letra)) {
                if (pila.estaVacia()) {
                    pila.apilar(letra);
                } else {
                    int pe = prioriodadEnExpresion(letra);
                    int pp = prioriodadEnPila((char) pila.elementoTope());
                    if (pe > pp) {
                        pila.apilar(letra);
                    } else {
                        if (pe <= pp) {
                            while (!pila.estaVacia()) {
                                posfija += pila.desapilar();
                            }
                            pila.apilar(letra);
                        }
                    }
                }
            } else {
                posfija += letra;
            }
        }

        while (!pila.estaVacia()) {
            posfija += pila.desapilar();
        }

        return posfija;
    }

    private static int prioriodadEnExpresion(char operador) {
        if (operador == '^') {
            return 4;
        }
        if (operador == '*' || operador == '/') {
            return 2;
        }
        if (operador == '+' || operador == '-') {
            return 1;
        }
        if (operador == '('){
            return 5;
        }
        return 0;

    }

    private static int prioriodadEnPila(char operador) {
        if (operador == '^') {
            return 3;
        }
        if (operador == '*' || operador == '/') {
            return 2;
        }
        if (operador == '+' || operador == '-') {
            return 1;
        }
        if (operador == '(') {
            return 0;
        }
        return 0;

    }

    private static double evaluarPosfija(String posfija) {
        Pila pila = new Pila(100);
        for (int i = 0; i < posfija.length(); i++) {
            char letra = posfija.charAt(i);
            if (!esOperador(letra)) {
                double numero = new Double(letra + "");
                pila.apilar(numero);
            } else {
                double num2 = (double) pila.desapilar();
                double num1 = (double) pila.desapilar();
                double num3 = operacion(letra, num1, num2);
                pila.apilar(num3);

            }

        }
        return (double) pila.elementoTope();
    }

    private static boolean esOperador(char letra) {
        if (letra == '^' || letra == '*' || letra == '/' || letra == '+'
                || letra == '-' || letra == '(' || letra == ')') {
            return true;
        }
        return false;
    }

    private static double operacion(char letra, double num1, double num2) {
        if (letra == '^') {
            return Math.pow(num1, num2);
        }
        if (letra == '-') {
            return num1 - num2;
        }
        if (letra == '+') {
            return num1 + num2;
        }
        if (letra == '*') {
            return num1 * num2;
        }
        if (letra == '/') {
            return num1 / num2;
        }
        return 0;

    }

}
