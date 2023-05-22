import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<ProductoElectronico> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Seleccione el tipo de producto a introducir:");
            System.out.println("1. Celular");
            System.out.println("2. Computadora");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la información del celular:");
                    System.out.print("Nombre: ");
                    String nombreCelular = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precioCelular = scanner.nextDouble();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Garantía: ");
                    String garantiaCelular = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modeloCelular = scanner.nextLine();

                    Celular celular = new Celular(nombreCelular, precioCelular, garantiaCelular, modeloCelular);
                    productos.add(celular);
                    System.out.println("Celular agregado correctamente.");
                    break;
                case 2:
                    System.out.println("Ingrese la información de la computadora:");
                    System.out.print("Nombre: ");
                    String nombreComputadora = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precioComputadora = scanner.nextDouble();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Garantía: ");
                    String garantiaComputadora = scanner.nextLine();
                    System.out.print("Procesador: ");
                    String procesadorComputadora = scanner.nextLine();

                    Computadora computadora = new Computadora(nombreComputadora, precioComputadora, garantiaComputadora, procesadorComputadora);
                    productos.add(computadora);
                    System.out.println("Computadora agregada correctamente.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);



        // Recorrer y mostrar los productos
        for (ProductoElectronico producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("Garantía: " + producto.getGarantia());

            producto.cargar(4);
            producto.encender();
            producto.apagar();

            System.out.println();
        }
    }
}
