public class Piston extends Componente {
    // atributos de la clase piston
    private double areaSeccionTransversal;
    private double presionGas;
//constructor de piston
    public Piston(String nombre, double peso, double areaSeccionTransversal, double presionGas) {
        super(nombre, peso);
        this.areaSeccionTransversal = areaSeccionTransversal;
        this.presionGas = presionGas;
    }

    // Getters y setters
    public double getAreaSeccionTransversal() {
        return areaSeccionTransversal;
    }

    public void setAreaSeccionTransversal(double areaSeccionTransversal) {
        this.areaSeccionTransversal = areaSeccionTransversal;
    }

    public double getPresionGas() {
        return presionGas;
    }

    public void setPresionGas(double presionGas) {
        this.presionGas = presionGas;
    }
//metodo heredado de componente que se sobreescribe
    @Override
    public double calcularFuerza() {
        return presionGas * areaSeccionTransversal; // F = P * A
    }
}
