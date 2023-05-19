public class Ingeniero {
    private static final double LIMITE_FUERZA = 1000.0; // Límite de fuerza para la viabilidad del componente

    public void disenarComponente(Componente componente) {
        double fuerza = componente.calcularFuerza();

        if (fuerza < LIMITE_FUERZA) {
            System.out.println("El componente " + componente.getNombre() + " es viable para el diseño.");
        } else {
            System.out.println("El componente " + componente.getNombre() + " no es viable para el diseño.");
        }
    }
}
