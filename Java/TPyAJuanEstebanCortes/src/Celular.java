class Celular extends ProductoElectronico {
    private String modelo;

    public Celular(String nombre, double precio, String garantia, String modelo) {
        super(nombre, precio, garantia);
        this.modelo = modelo;
    }

    @Override
    public void cargar(int cargaInicial) {
        int tiempoCarga = 2 * cargaInicial;
        System.out.println("El celular " + getNombre() + " se está cargando. Tiempo estimado: " + tiempoCarga + " horas.");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el celular " + getNombre());
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el celular " + getNombre());
    }
}
