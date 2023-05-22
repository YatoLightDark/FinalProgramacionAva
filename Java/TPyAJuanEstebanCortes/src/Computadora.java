class Computadora extends ProductoElectronico {
    private String procesador;

    public Computadora(String nombre, double precio, String garantia, String procesador) {
        super(nombre, precio, garantia);
        this.procesador = procesador;
    }

    @Override
    public void cargar(int cargaInicial) {
        int tiempoCarga = cargaInicial / 2;
        System.out.println("La computadora " + getNombre() + " se está cargando. Tiempo estimado: " + tiempoCarga + " horas.");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo la computadora " + getNombre());
    }

    @Override
    public void apagar() {
        System.out.println("Apagando la computadora " + getNombre());
    }
}
