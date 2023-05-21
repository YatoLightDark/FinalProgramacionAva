import java.util.ArrayList;
import java.util.Iterator;

public class AnalizadorDeDatos {
    // Atributo
    private ArrayList<ConjuntoDeDatos> conjuntosDeDatos;

    // Constructor
    public AnalizadorDeDatos() {
        this.conjuntosDeDatos = new ArrayList<>();
    }

    // Método para añadir un conjunto de datos
    public void añadirConjuntoDeDatos(ConjuntoDeDatos conjuntoDeDatos) {
        this.conjuntosDeDatos.add(conjuntoDeDatos);
    }

    // Método para eliminar un conjunto de datos basado en su nombre
    public void eliminarConjuntoDeDatos(String nombre) {
        Iterator<ConjuntoDeDatos> iterator = this.conjuntosDeDatos.iterator();
        while(iterator.hasNext()) {
            ConjuntoDeDatos conjuntoDeDatos = iterator.next();
            if(conjuntoDeDatos.nombre.equals(nombre)) {
                iterator.remove();
                break;
            }
        }
    }

    // Método para describir todos los conjuntos de datos
    public ArrayList<String> describirConjuntosDeDatos() {
        ArrayList<String> descripciones = new ArrayList<>();
        for(ConjuntoDeDatos conjuntoDeDatos : this.conjuntosDeDatos) {
            descripciones.add(conjuntoDeDatos.describir());
        }
        return descripciones;
    }
}
