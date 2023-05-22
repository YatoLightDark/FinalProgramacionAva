abstract class ProductoElectronico {
    private String nombre;
    private double precio;
    private String garantia;

    public ProductoElectronico(String nombre, double precio, String garantia) {
        this.nombre = nombre;
        this.precio = precio;
        this.garantia = garantia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getGarantia() {
        return garantia;
    }

    public abstract void cargar(int cargaInicial);
    public abstract void encender();
    public abstract void apagar();
}
