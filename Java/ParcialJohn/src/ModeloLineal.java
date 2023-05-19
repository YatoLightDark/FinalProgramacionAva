public class ModeloLineal extends Modelo {
    // Atributos adicionales
    private double coeficienteDeCorrelacion;
    private double errorCuadraticoMedio;

    // Constructor
    public ModeloLineal(String nombre, int numeroDeParametros, double coeficienteDeCorrelacion, double errorCuadraticoMedio) {
        super(nombre, numeroDeParametros);
        this.coeficienteDeCorrelacion = coeficienteDeCorrelacion;
        this.errorCuadraticoMedio = errorCuadraticoMedio;
    }

    // Sobreescribir el método entrenar
    @Override
    public void entrenar() {
        System.out.println("Entrenando el modelo lineal '" + this.getNombre() + "' con " + this.getNumeroDeParametros() + " parámetros...");
        System.out.println("Coeficiente de correlación: " + this.coeficienteDeCorrelacion);
        System.out.println("Error cuadrático medio: " + this.errorCuadraticoMedio);
        System.out.println("Entrenamiento completado.");
    }

    // Implementación del método de validación con sobreescribir
    @Override
    public boolean validar() {
        return coeficienteDeCorrelacion > 0.8 && errorCuadraticoMedio < 0.2;
    }
    // Getters y Setters
    public double getCoeficienteDeCorrelacion() {
        return this.coeficienteDeCorrelacion;
    }

    public void setCoeficienteDeCorrelacion(double coeficienteDeCorrelacion) {
        this.coeficienteDeCorrelacion = coeficienteDeCorrelacion;
    }

    public double getErrorCuadraticoMedio() {
        return this.errorCuadraticoMedio;
    }

    public void setErrorCuadraticoMedio(double errorCuadraticoMedio) {
        this.errorCuadraticoMedio = errorCuadraticoMedio;
    }
}

