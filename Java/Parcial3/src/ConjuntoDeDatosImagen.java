public class ConjuntoDeDatosImagen extends ConjuntoDeDatos {
    // Atributos adicionales
    private int ancho;
    private int alto;

    // Constructor
    public ConjuntoDeDatosImagen(String nombre, int tamaño, int ancho, int alto) {
        super(nombre, tamaño);  // Llamada al constructor de la clase padre
        this.ancho = ancho;
        this.alto = alto;
    }

    // Sobrescribir el método describir()
    @Override
    public String describir() {
        return "Nombre: " + nombre + "\n" +
                "Tamaño: " + tamaño + "\n" +
                "Tipo: Imagen" + "\n" +
                "Ancho: " + ancho + "\n" +
                "Alto: " + alto;
    }
}

