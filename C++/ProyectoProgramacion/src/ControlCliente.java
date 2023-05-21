import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlCliente  {
    //Atributos / listas que se usan en control cliente
    private List<Cliente> listaClientes;
    private List<Compra> listaCompra;
    //Constructor
    public ControlCliente(){
        listaClientes=new ArrayList<>();
        listaCompra = new ArrayList<>();
    }
    //Funcion agregar cliente
    public void agregarCliente (List<Cliente> listaClientes){

            Scanner scanner = new Scanner(System.in); //se crea un objeto de tipo scanner para ingresar los datos del cliente

            System.out.println("Ingrese el nombre del cliente:");
            String nombre = scanner.nextLine(); // ingresa el nombre

            System.out.println("Ingrese la dirección del cliente:");
            String direccion = scanner.nextLine(); // ingresa la direccion

            System.out.println("Ingrese el email del cliente:");
            String email = scanner.nextLine(); // ingresa el email

            Cliente cliente = new Cliente(nombre, direccion, email); //Crea un cliente con los datos ingresados
            listaClientes.add(cliente); //añade el cliente creado a la lista de clientes

            System.out.println("El cliente ha sido agregado correctamente a la lista.");
        }


    public void eliminarCliente (List <Cliente> listaClientes){
            Scanner scanner = new Scanner(System.in); //se crea un objeto de tipo scanner para ingresar los datos requeridos

            System.out.println("Ingrese el email del cliente que desea eliminar:");
            String email = scanner.nextLine(); //Se ingresa el email del cliente que se desea eliminar

            boolean encontrado = false; //se crea una variable para saber si el cliente existe o no
            for (Cliente cliente : listaClientes) { //se recorre la lista de clientes
                if (cliente.getEmail().equals(email)) { //se busca el cliente por el email
                    encontrado=true; //se cambia el estado de la varible
                    listaClientes.remove(cliente); //se quita el cliente de la lista
                    System.out.println("El cliente ha sido eliminado correctamente de la lista.");
                    break;
                }
            }

            if (!encontrado) { //si no se encuentra la variable seguira false y le dira al operador que no existe el cliente
                System.out.println("No se encontró un cliente con el email proporcionado.");
            }
        }


    public void  listarClientes (List<Cliente> listaClientes) {
        if (listaClientes.isEmpty()) { //se crea un condicional por si la lista esta vacia
            System.out.println("No hay clientes registrados.");
        }
        else {
            System.out.println("Clientes registrados:");
            for (Cliente cliente : listaClientes) { // se recorre e imprime los datos que esten dentro de la lista
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Direccion: " + cliente.getDireccion());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("------");
    }
        }
    }


    public void realizarCompra(List<Obra> listaObras, List<Compra> listaCompra, List<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in); //se crea un objeto de tipo scanner para ingresar los datos necesarios

        System.out.println("Ingrese el email del cliente que realiza la compra:"); //se pide el email del cliente interesado en la compra
        String email = scanner.nextLine();

        Cliente cliente = null; // se crea una variable de tipo cliente inicializada en null para buscar al usuario
        for (Cliente c : listaClientes) { //Se recorre la lista de clientes
            if (c.getEmail().equals(email)) { // se busca si el usuario existe
                cliente = c; // se cambia el estado de la variable
                break;
            }
        }

        if (cliente == null) { //si no se encuentra el cliente se anuncia al operador que no esta
            System.out.println("El cliente no se encuentra en la lista.");
            return;
        }

        System.out.println("Ingrese el título de la obra que desea comprar:"); //se pide el titulo de la obra a comprar
        String titulo = scanner.nextLine();

        Obra obra = null;
        for (Obra o : listaObras) { // se recorre la lista de obras
            if (o.getTitulo().equals(titulo)) { // se busca la obra por titulo
                obra = o; // se cambia el estado de la variable
                break;
            }
        }

        if (obra == null) { // si la obra no se encuentra se anuncia que la obra que quiere comprar lo esta
            System.out.println("La obra no se encuentra en la lista.");
            return;
        }

        // Crear una nueva compra y se agrega a la lista
        Compra compra=new Compra(obra, cliente, LocalDate.now());
        listaCompra.add(compra);

        // Eliminar la obra de la lista de obras
        listaObras.remove(obra);

        System.out.println("La compra se ha realizado con éxito. La obra se ha eliminado de la lista de obras disponibles.");
    }



}
