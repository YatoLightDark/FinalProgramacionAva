public abstract class ConjuntoDeDatos {
    // Atributos
    protected String nombre;
    protected int tamaño;

    // Constructor
    public ConjuntoDeDatos(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    // Método abstracto
    public abstract String describir();
}

