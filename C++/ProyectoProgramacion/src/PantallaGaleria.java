import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PantallaGaleria {

    public static void main(String[] args) {

        ControlGaleria controlGal = new ControlGaleria();      //Objeto para acceder a control Galería
        ControlCliente controlCli1 = new ControlCliente();
        GestionObras gestObras = new GestionObras();
        List<Artista> listaArtista = new ArrayList<>();
        List<Compra> listaCompra = new ArrayList<>();
        List<Cliente> listaClientes = new ArrayList<>();
        List<Obra> listaObras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;


        do {

            System.out.println("ingrese la opcion que desee");
            System.out.println("1. Agregar obras");
            System.out.println("2. Agregar cliente");
            System.out.println("3. Agregar artista");
            System.out.println("4. Eliminar obras");
            System.out.println("5. Eliminar cliente");
            System.out.println("6. Eliminar artista");
            System.out.println("7. Listar obras");
            System.out.println("8. Listar cliente");
            System.out.println("9. Listar artista");
            System.out.println("10. Realizar compra");
            System.out.println("11. Listar compra");
            System.out.println("12.Salir");
            System.out.println("Opcion: ");
            opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    gestObras.agregarObra(listaArtista, listaObras); //funciona
                    break;

                case 2:
                    controlCli1.agregarCliente(listaClientes); //funciona
                    break;

                case 3:
                    controlGal.agregarArtista(listaArtista); //funciona
                    break;

                case 4:
                    gestObras.eliminarObra(listaObras); //funciona
                    break;

                case 5:
                    controlCli1.eliminarCliente(listaClientes); // funciona
                    break;

                case 6:
                    controlGal.eliminarArtista(listaArtista); //funciona
                    break;

                case 7:
                    gestObras.listarObra(listaObras); //funciona
                    break;

                case 8:
                    controlCli1.listarClientes(listaClientes); //funciona
                    break;

                case 9:
                    controlGal.listarArtista(listaArtista); //funciona
                    break;

                case 10:
                    controlCli1.realizarCompra(listaObras, listaCompra, listaClientes); //funciona
                    break;

                case 11:
                    controlGal.listarCompra(listaCompra); //funciona
                    break;

            }

        }
        while (opcion != 12) ;
    }
}



