public class Resorte extends Componente {
    //atributos
    private double constanteElastica;
//contructor
    public Resorte(String nombre, double peso, double constanteElastica) {
        super(nombre, peso);
        this.constanteElastica = constanteElastica;
    }

    // Getters y setters
    public double getConstanteElastica() {
        return constanteElastica;
    }

    public void setConstanteElastica(double constanteElastica) {
        this.constanteElastica = constanteElastica;
    }
// metodo de la clase padre con sobreescribir
    @Override
    public double calcularFuerza() {
        double deformacion = 1.0; // asumida como 1 para este ejercicio
        return constanteElastica * deformacion;
    }
}
