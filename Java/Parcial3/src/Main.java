import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione 1. si quiere ejecutar el código o 2. si quiere ver las respuestas de la teoría.  y 3. si quiere salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Ejecutar la función
                    ConjuntoDeDatosTabular conjuntoTabular = new ConjuntoDeDatosTabular("Datos de estudiantes", 1000, 200, 5);
                    ConjuntoDeDatosImagen conjuntoImagen1 = new ConjuntoDeDatosImagen("Imágenes de satélite", 2000, 1080, 720);
                    ConjuntoDeDatosImagen conjuntoImagen2 = new ConjuntoDeDatosImagen("Imágenes de satélite", 2000, 1080, 720);

                    AnalizadorDeDatos analizador = new AnalizadorDeDatos();
                    analizador.añadirConjuntoDeDatos(conjuntoTabular);
                    analizador.añadirConjuntoDeDatos(conjuntoImagen1);
                    analizador.añadirConjuntoDeDatos(conjuntoImagen2);

                    ArrayList<String> descripciones = analizador.describirConjuntosDeDatos();
                    for (String descripcion : descripciones) {
                        System.out.println(descripcion);
                        System.out.println("------------------------------");
                    }
                    break;
                case 2:
                    // Imprimir las respuestas a las preguntas
                    System.out.println("1. a. Verdadero");
                    System.out.println("2. a. Verdadero");
                    System.out.println("3. b. Falso");
                    System.out.println("4. a. Verdadero");
                    System.out.println("5. a. Verdadero");
                    System.out.println("6. A) La capacidad de una clase de heredar propiedades y métodos de otra clase.");
                    System.out.println("7. D) La capacidad de un objeto de ser tratado como uno de varios tipos posibles.");
                    System.out.println("8. D) Se utilizan como plantillas para crear subclases concretas.");
                    System.out.println("9. A) La capacidad de una subclase de proporcionar una implementación diferente para un método heredado de la clase padre.");
                    System.out.println("10. D) Se utilizan para definir un contrato que una clase debe cumplir.");
                    break;
                case 3:
                    System.out.println("Haz salido exitosamente");
                    break;
                default:
                    System.out.println("Caso no reconocido");
                    break;
            }
        }
        while (opcion != 3);
    }
}
