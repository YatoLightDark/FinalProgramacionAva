import java.util.List;
import java.util.Scanner;

public class GestionObras extends ControlGaleria{

    public void agregarObra(List<Obra> listaObras, List<Artista> ListaArtistas) {
        Scanner scanner = new Scanner(System.in);

        // comprabar primero si el artista existe, despues si se puede crear la obra

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el artista que hizo la obra :"); //se busca el artista y si no esta no se puede crear la obra
        String apodo = scanner.nextLine();

        Artista artista = null;
        for (Artista a : listaArtista) {
            if (a.getApodo().equals(apodo)) {
                artista = a;
                System.out.println("Ingrese el título de la obra:"); //OBRA TITULO
                String titulo = scanner.nextLine();

                System.out.println("Ingrese la técnica:"); //OBRA TECNICA
                String tecnica = scanner.nextLine();

                System.out.println("Ingrese el año de producción:");//OBRA AÑO
                int ano = scanner.nextInt();

                System.out.println("Ingrese el precio de la obra:"); //OBRA PRECIO
                float precio = scanner.nextFloat();
                scanner.nextLine();

                Obra obra = new Obra(titulo, tecnica, ano, precio, artista);
                listaObras.add(obra);

                System.out.println("La obra ha sido agregada correctamente a la lista.");

                break; //BUSCA LA OBRA EN LA LISTA
            }
        }
        if (artista == null) {
            System.out.println("El artista no esta en la lista ."); //si la obra no esta saca "error"
            return;
        }

    }

}
    public void eliminarObra(List<Obra> listaObras) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código de la obra que desea eliminar:");
        String titulo = scanner.nextLine();

        boolean encontrado = false;
        for (Obra obra : listaObras) {
            if (obra.getTitulo().equals(titulo)) {
                encontrado = true;
                listaObras.remove(obra);
                System.out.println("La obra ha sido eliminada correctamente de la lista.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("La obra no se encuentra en la lista.");
        }
    }


public void listarObra(List<Obra> listaObras) {
        if (listaObras.isEmpty()) {
        System.out.println("La lista de obras está vacía.");
        return;
        }

        System.out.println("Listado de obras:");

        for (Obra obra : listaObras) { //imrpimir la lista
        System.out.println("Código: " + obra.getTecnica());
        System.out.println("Título: " + obra.getTitulo());
        System.out.println("Precio: " + obra.getAno());
        System.out.println("Precio: " + obra.getPrecio());
        System.out.println("Precio: " + obra.getArtista());
        System.out.println("Nombre del artista: " + obra.getArtista().getApodo());
        }
        }
        }
        }