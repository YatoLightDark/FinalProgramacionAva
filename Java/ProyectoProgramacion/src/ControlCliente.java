import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlCliente extends ControlGaleria {

    List<Cliente> listaClientes = new ArrayList<Cliente>();
    public void realizarCompra(List<Obra> listaObras, List<Compra> listaCompras) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el titulo de la obra que desea comprar:"); //se busca por titulo la obra
        String titulo = scanner.nextLine();

        Obra obra = null;
        for (Obra o : listaObras) {
            if (o.getTitulo().equals(titulo)) {
                obra = o;
                break; //BUSCA LA OBRA EN LA LISTA
            }
        }
        if (obra == null) {
            System.out.println("La obra no se encuentra en la lista."); //si la obra no esta saca "error"
            return;
        }

        float precio = obra.getPrecio(); //nose pq va aqui

        System.out.println("Ingrese el nombre del cliente que va a comprar la obra :");
        String cliente = scanner.nextLine();

        Compra nuevaCompra = new Compra(precio,obra,new Cliente(), LocalDate.now());

        System.out.println("Ingrese el codigo:"); //NOSEEEEEEEEEEEEEEEEEEEEEE AHHHHHHHH
        Long code = scanner.nextLong();

        System.out.println("Ingrese el id:");
        Long id = scanner.nextLong();

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese una direccion:");
        String direccion= scanner.nextLine();

        System.out.println("Ingrese una email:");
        String email= scanner.nextLine();

        listaCompras.add(nuevaCompra);
        System.out.println("La compra se ha realizado correctamente."); //ESTA RARO AQUI LAS LISTAS ESTAN MAL PUESTAS
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
