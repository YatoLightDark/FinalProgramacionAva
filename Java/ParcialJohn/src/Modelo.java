public abstract class Modelo {
    // Atributos
    private String nombre;
    private int numeroDeParametros;

    // Constructor
    public Modelo(String nombre, int numeroDeParametros) {
        this.nombre = nombre;
        this.numeroDeParametros = numeroDeParametros;
    }

    // Método abstracto
    public abstract void entrenar();
//Metodo abstracto de validar
    public abstract boolean validar();

    // Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeParametros() {
        return this.numeroDeParametros;
    }

    public void setNumeroDeParametros(int numeroDeParametros) {
        this.numeroDeParametros = numeroDeParametros;
    }
}

