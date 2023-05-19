import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de Modelos
        List<Modelo> modelos = new ArrayList<>();

        // Crear un modelo lineal y añadirlo a la lista
        Modelo modeloLineal = new ModeloLineal("Modelo Lineal 1", 3, 0.9, 1.2);
        modelos.add(modeloLineal);

        // Crear un modelo de árbol de decisión y añadirlo a la lista
        Modelo modeloArbolDecision = new ModeloArbolDecision("Modelo Árbol de Decisión 1", 4, 10, 20);
        modelos.add(modeloArbolDecision);

        // Entrenar todos los modelos
        for (Modelo modelo : modelos) {
            modelo.entrenar();
            System.out.println("-------------------------");
        }
    }
}
