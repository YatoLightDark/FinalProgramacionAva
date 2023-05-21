
import java.time.LocalDate;
import java.util.*;

public class ControlGaleria {
    List<Artista> listaArtista = new ArrayList();   //LISTAS
    List<Compra> listaCompra = new ArrayList();


    public void agregarArtista(List<Artista> listaArtista) {
        Scanner escaner = new Scanner(System.in);
        int seguir = 0;
        do { //entra a un do-while para que pues aingresar varios artistas de una y no tenga que salirse y volver a ingresar
            System.out.println("Desea ingresar artista?:");
            System.out.println("1. para si. 0. para no:");
            seguir = escaner.nextInt(); //se le pide que opcion quiere el usuari
            escaner.nextLine();

            if (seguir == 1) {
                System.out.println("Ingrese el apodo/nombre del artista:");
                String apodo = escaner.nextLine();
                System.out.println("Ingrese la fecha de nacimiento:");
                String fechaNacimiento = escaner.nextLine();
                System.out.println("Ingrese la nacionalidad:");
                String nacionalidad = escaner.nextLine();
                System.out.println("Ingrese la biografia:");
                String biografia = escaner.nextLine();
                //añade los datos ingresados a la lista
                listaArtista.add(new Artista(apodo, fechaNacimiento, nacionalidad, biografia));
                System.out.println("El artista se ha registrado correctamente en el sistema");
            }
        } while (seguir == 1); // se sale del bucle su la opcion es 1

        System.out.println(listaArtista);
    }


    public void eliminarArtista(List<Artista> listaArtista) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el apodo del artista que desea eliminar:");
        String nombreArtista = scanner.nextLine(); //busca el apodo del artista en la lista, busca linea por linea

        boolean encontrado = false;                   //variable para saber si ha sido encontrado o no el artista
        for (Artista artista : listaArtista) {        //Creo objeto artista que recorre la lista
            if (artista.getApodo().equalsIgnoreCase(nombreArtista)) {      //busca el apodo del artista
                encontrado = true;                                         //SI LO ENCUENTRA CAMBIA EL ESTADO DE LA VARIABLE ENCONTRADO
                listaArtista.remove(artista);                               //uso la función remove para eliminar el artista de esa posicion
                System.out.println("El artista ha sido eliminado de la lista.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El artista no se encuentra en la lista."); //SI NO LO ENCUENTRA NO HACE NADA
        }
    }

    public void listarArtista(List<Artista> listaArtista) {
//si al lista esta vacia lo anuncia
        if (listaArtista.isEmpty()) {
            System.out.println("No hay artistas en la lista.");
        } else {
            System.out.println("Artistas:");
            for (Artista artista : listaArtista) { //recorre la lista e imprime los datos
                System.out.println("Nombre/apodo: " + artista.getApodo());
                System.out.println("Nacionalidad: " + artista.getNacionalidad());
                System.out.println("Fecha de Nacimiento: " + artista.getFechaNacimiento());
                System.out.println("------");
            }
        }
    }

    public void listarCompra(List<Compra> listaCompra) {
//si al lista esta vacia lo anuncia
        if (listaCompra.isEmpty()) {
            System.out.println("No se han realizado compras aún.");
        } else {
            System.out.println("Compras realizadas:");
            for (Compra compra : listaCompra) { //recorre la lista e imprime los datos
                System.out.println("Cliente: " + compra.getCliente().getNombre());
                System.out.println("Obra: " + compra.getObra().getTitulo());
                System.out.println("Precio: " + compra.getObra().getPrecio());
                System.out.println("Fecha: " + compra.getDate());
                System.out.println("------");
            }
        }

    }
}




