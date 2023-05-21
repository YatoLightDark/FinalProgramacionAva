import java.time.LocalDate;
public class Compra {
   // Atributos
    private Obra obra;
    private Cliente cliente;
    private LocalDate date;
    //Constructor
    public Compra (Obra obra, Cliente cliente, LocalDate date){
        //this.precio=precio;
        this.obra=obra;
        this.cliente=cliente;
        this.date=date;
    }
    //Getters y Setters

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
