import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un resorte y un pistón
        Resorte resorte = new Resorte("Resorte1", 2.0, 1.5);
        Piston piston = new Piston("Piston1", 4.0, 0.5, 10.0);
        // Crear un ingeniero
        Ingeniero ingeniero = new Ingeniero();
        // Crear una lista de Componentes y agregar los dos componentes creados
        List<Componente> componentes = new ArrayList<>();
        componentes.add(resorte);
        componentes.add(piston);

        // Calcular y mostrar la fuerza de cada componente
        for (Componente componente : componentes) {
            double fuerza = componente.calcularFuerza();
            System.out.println("El componente " + componente.getNombre() + " tiene una fuerza de " + fuerza);
        }
        // Evaluar la viabilidad de los componentes
        ingeniero.disenarComponente(resorte);
        ingeniero.disenarComponente(piston);
    }
}
