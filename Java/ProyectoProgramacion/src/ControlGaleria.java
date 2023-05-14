
import java.time.LocalDate;
import java.util.*;

public class ControlGaleria {
    List<Artista> listaArtista = new ArrayList<Artista>();
    public List<Artista> agregarArtista() {
        Scanner escaner = new Scanner(System.in); //un objeto que lee los datos ingresados por el usuario
        List<Artista> listaArtista = new ArrayList<Artista>(); // creamos una lista para que tenga todos los datos de los artistas
        int seguir = 0; //para entrar al bucle y salir cuando cambie este valor
        do {
            System.out.println("Desea ingresar artista?:");
            System.out.println("1. para si. 0. para no:"); //cambiar el valor de "seguir" para continuar o salir del bucle
            seguir = escaner.nextInt();
            if (seguir == 1) {
                System.out.println("Ingrese el nombre del artista:");
                String apodo = escaner.next();
                System.out.println("Ingrese la fecha de nacimiento:");
                String fechaNacimiento = escaner.next();
                System.out.println("Ingrese la nacionalidad:");
                String nacionalidad = escaner.next();
                System.out.println("Ingrese la biografia:");
                String biografia = escaner.next();// ingresa todos los datos de los artistas
                listaArtista.add(new Artista(apodo, fechaNacimiento, nacionalidad, biografia));// una vez completados los datos se añade a la lista
                System.out.println("El artista se ha registrado correctamente en el sistema");
            }
        } while (seguir == 1);
        return listaArtista;// muestra toda la lista, con el nuevo usuario
    }

    public void eliminarArtista(List<Artista> listaArtistas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el apodo del artista que desea eliminar:");
        String nombreArtista = scanner.nextLine(); //busca el apodo del artista en la lista, busca linea por linea
        boolean encontrado = false; //variable para saber si ha sido encontrado o no el artista
        for (Artista artista : listaArtistas){ //Creo objeto artista que recorre la lista
            if (artista.getApodo().equalsIgnoreCase(nombreArtista)) {//busca el apodo del artista
                encontrado = true; //SI LO ENCUENTRA CAMBIA EL ESTADO DE LA VARIABLE ENCONTRADO
                listaArtistas.remove(artista);  //uso la función remove para eliminar el artista de esa posicion
                System.out.println("El artista ha sido eliminado de la lista.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El artista no se encuentra en la lista."); //SI NO LO ENCUENTRA NO HACE NADA
        }
    }



    public void listarCompra(List<Compra> listaCompras) {
        if (listaCompras.isEmpty()) {
            System.out.println("La lista de compras está vacía.");
            return;
        }

        System.out.println("Listado de compras:");

        for (Compra compra : listaCompras) {
            System.out.println("Obra: " + compra.getObra().getTitulo());
            System.out.println("Precio: " + compra.getPrecio());
            System.out.println("Nombre del cliente: " + compra.getCliente());
            System.out.println("Dia de compra: " + compra.getDate());
            System.out.println();
        }
    }
}
