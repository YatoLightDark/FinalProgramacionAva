public abstract class Componente {
    private String nombre;
    private double peso;

    public Componente(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract double calcularFuerza();
}
