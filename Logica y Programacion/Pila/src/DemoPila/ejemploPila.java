package DemoPila;

public class ejemploPila {

    public static void main(String[] args) {

        Pila pila = new Pila(5);

        if (pila.apilar(10)) {
            System.out.println("pudo apilar el 10");
        } else {
            System.out.println("no pudo apilar el 10");
        }

        if (pila.apilar(20)) {
            System.out.println("pudo apilar el 20");
        } else {
            System.out.println("no pudo apilar el 20");
        }

        if (pila.apilar(30)) {
            System.out.println("pudo apilar el 30");
        } else {
            System.out.println("no pudo apilar el 30");
        }
        if (pila.apilar(40)) {
            System.out.println("pudo apilar el 40");
        } else {
            System.out.println("no pudo apilar el 40");
        }
        if (pila.apilar(50)) {
            System.out.println("pudo apilar el 50");
        } else {
            System.out.println("no pudo apilar el 50");
        }
        if (pila.apilar(60)) {
            System.out.println("pudo apilar el 60");
        } else {
            System.out.println("no pudo apilar el 60");
        }

        if (pila.apilar(70)) {
            System.out.println("pudo apilar el 70");
        } else {
            System.out.println("no pudo apilar el 70");
        }

        Object dato;
        dato = pila.desApilar();
        if (dato != null) {
            System.out.println("desapilo " + dato);
        } else {
            System.out.println("no pudo desapilar");
        }

        dato = pila.desApilar();
        if (dato != null) {
            System.out.println("desapilo " + dato);
        } else {
            System.out.println("no pudo desapilar");
        }

        dato = pila.desApilar();
        if (dato != null) {
            System.out.println("desapilo " + dato);
        } else {
            System.out.println("no pudo desapilar");
        }

        dato = pila.desApilar();
        if (dato != null) {
            System.out.println("desapilo " + dato);
        } else {
            System.out.println("no pudo desapilar");
        }

        dato = pila.desApilar();
        if (dato != null) {
            System.out.println("desapilo " + dato);
        } else {
            System.out.println("no pudo desapilar");
        }

        dato = pila.desApilar();
        if (dato != null) {
            System.out.println("desapilo " + dato);
        } else {
            System.out.println("no pudo desapilar");
        }

        dato = pila.desApilar();
        if (dato != null) {
            System.out.println("desapilo " + dato);
        } else {
            System.out.println("no pudo desapilar");
        }

        dato = pila.desApilar();
        if (dato != null) {
            System.out.println("desapilo " + dato);
        } else {
            System.out.println("no pudo desapilar");
        }

    }

}
