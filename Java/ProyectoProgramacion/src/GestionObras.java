import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionObras {

    private List<Obra> listaObras;   //Lista donde se van a guardar las obras

    public void agregarObra(List<Artista> listaArtista, List<Obra> listaObras) {
        Scanner scanner = new Scanner(System.in);

        // comprobar primero si el artista existe, después si se puede crear la obra

        scanner = new Scanner(System.in);
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


    public void eliminarObra(List<Obra> listaObras) {
        Scanner scanner = new Scanner(System.in);//un objeto que lee los datos ingresados por el usuario
        System.out.println("Ingrese el titulo de la obra que desea eliminar:");
        String titulo = scanner.nextLine(); // Se pide el titulo

        boolean encontrado = false;      //variable para saber si ha sido encontrado o no el artista
        for (Obra obra : listaObras) {     //Creo objeto obra que recorre la lista
            if (obra.getTitulo().equals(titulo)) {   //busca el titulo de la obra a eliminar
                encontrado = true;   //cambia le estado de la variable
                listaObras.remove(obra);   //remueve la obra encontrada en la lista
                System.out.println("La obra ha sido eliminada correctamente de la lista.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("La obra no se encuentra en la lista."); //anauncia que no se encontro si la variable encontrado sigue false
        }
    }


    public void listarObra(List<Obra> listaObras ) {
        //si al lista esta vacia lo anuncia
        if (listaObras.isEmpty()) {
            System.out.println("La lista de obras está vacía.");
        } else {
            System.out.println("Listado de obras:");

            for (Obra obra : listaObras) {//recorre la lista e imprime los datos
                System.out.println("Tecnica: " + obra.getTecnica());
                System.out.println("Título: " + obra.getTitulo());
                System.out.println("Fecha de produccion: " + obra.getAno());
                System.out.println("Precio: " + obra.getPrecio());
                System.out.println("Artista: " + obra.getArtista().getApodo());
            }
        }
    }
}