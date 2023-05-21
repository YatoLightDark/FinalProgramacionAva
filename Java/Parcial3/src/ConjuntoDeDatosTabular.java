public class ConjuntoDeDatosTabular extends ConjuntoDeDatos {
    // Atributos adicionales
    private int numeroDeColumnas;
    private int numeroDeFilas;

    // Constructor
    public ConjuntoDeDatosTabular(String nombre, int tamaño, int numeroDeColumnas, int numeroDeFilas) {
        super(nombre, tamaño);  // Llamada al constructor de la clase padre
        this.numeroDeColumnas = numeroDeColumnas;
        this.numeroDeFilas = numeroDeFilas;
    }

    // Sobrescribir el método describir()
    @Override
    public String describir() {
        return "Nombre: " + nombre + "\n" +
                "Tamaño: " + tamaño + "\n" +
                "Tipo: Tabular" + "\n" +
                "Filas: " + numeroDeFilas + "\n" +
                "Columnas: " + numeroDeColumnas;
    }
}

