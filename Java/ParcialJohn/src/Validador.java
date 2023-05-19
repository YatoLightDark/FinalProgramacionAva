public class Validador {
    public void validarModelo(Modelo modelo) {
        // Ejecutar el método entrenar
        modelo.entrenar();

        // Validar el modelo e imprimir el resultado
        if (modelo.validar()) {
            System.out.println("El modelo '" + modelo.getNombre() + "' es válido.");
        } else {
            System.out.println("El modelo '" + modelo.getNombre() + "' no es válido.");
        }
    }
}

