public class ModeloArbolDecision extends Modelo {
    // Atributos adicionales
    private int profundidadDelArbol;
    private int cantidadDeNodosHoja;

    // Constructor
    public ModeloArbolDecision(String nombre, int numeroDeParametros, int profundidadDelArbol, int cantidadDeNodosHoja) {
        super(nombre, numeroDeParametros);
        this.profundidadDelArbol = profundidadDelArbol;
        this.cantidadDeNodosHoja = cantidadDeNodosHoja;
    }

    // Sobreescribir el método entrenar
    @Override
    public void entrenar() {
        System.out.println("Entrenando el modelo de árbol de decisión '" + this.getNombre() + "' con " + this.getNumeroDeParametros() + " parámetros...");
        System.out.println("Profundidad del árbol: " + this.profundidadDelArbol);
        System.out.println("Cantidad de nodos hoja: " + this.cantidadDeNodosHoja);
        System.out.println("Entrenamiento completado.");
    }
    // Implementación del método de validación
    @Override
    public boolean validar() {
        return profundidadDelArbol < 10 && cantidadDeNodosHoja > 5;
    }

    // Getters y Setters
    public int getProfundidadDelArbol() {
        return this.profundidadDelArbol;
    }

    public void setProfundidadDelArbol(int profundidadDelArbol) {
        this.profundidadDelArbol = profundidadDelArbol;
    }

    public int getCantidadDeNodosHoja() {
        return this.cantidadDeNodosHoja;
    }

    public void setCantidadDeNodosHoja(int cantidadDeNodosHoja) {
        this.cantidadDeNodosHoja = cantidadDeNodosHoja;
    }
}
