package supermercado;

import java.util.Scanner;

public class SuperMercado {

    private static Venta Venta = new Venta();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    AsignarCliente();
                    break;
                case 2:
                    AgregarProducto();
                    break;
                case 3:
                    PagarEIniciarNuevaCuenta();
                    break;

            }
        } while (opc != 0);
    }

    private static int menu() {
        System.out.println("\n\n**** MENU  PRINCIPAL ****");
        System.out.println("1. Asignar Cliente");
        System.out.println("2. Asignar Producto");
        System.out.println("3. Pagar e iniciar nueva cuenta");
        System.out.println("0. Salir");
        System.out.print("Su opcion es: ");
        return sc.nextInt();

    }

    private static void AsignarCliente() {
        System.out.println("\n\nAsignar Cliente =>");
        System.out.print("ID.........................: ");
        int Id = sc.nextInt();
        System.out.print("Nombres....................: ");
        String Nombres = sc.next();
        Cliente Cliente = new Cliente(Id, Nombres);
        Venta.AsignarCliente(Cliente);

    }

    private static void AgregarProducto() {
        System.out.println("\n\nAsignar Cliente =>");
        System.out.print("ID.........................: ");
        int Id = sc.nextInt();
        System.out.print("Descripcion................: ");
        String Descripcion = sc.next();
        System.out.print("Tipo, 1.  Fijo, 2. Variable: ");
        int tipo = sc.nextInt();
        if (tipo == 1) {
            System.out.print("Precio....................: ");
            double precio = sc.nextDouble();
            ProductoPrecioFijo Producto = new ProductoPrecioFijo(precio, Id, Descripcion);
            Venta.AgregarProducto(Producto);

        } else {
            System.out.print("Unidad de medida............: ");
            String Unidad = sc.next();
            System.out.print("precio por unidad de medida.: ");
            double Precio = sc.nextDouble();
            System.out.print("Cantidad....................: ");
            float Cantidad = sc.nextFloat();
            ProductoPrecioVariable Producto = new ProductoPrecioVariable(Unidad, Precio, Cantidad, Id, Descripcion);
            Venta.AgregarProducto(Producto);

        }
    }

    private static void PagarEIniciarNuevaCuenta() {
        System.out.println("\n\nTOTAL =>");
        System.out.printf("El Total A PAgar Es.............: $%,.2f\n", Venta.total());
        System.out.print("Confirmar el pago <S>i, <N>o?...: ");
        String Respuesta = sc.next();
        if (Respuesta.equalsIgnoreCase("s")) {
            System.out.println("\n\nRECIVO =>");
            System.out.println(Venta);
            Venta = new Venta();
        }

    }
}
