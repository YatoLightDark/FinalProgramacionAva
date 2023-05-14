//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Cliente extends ControlCliente {
    private long code;
    private long id;
    private String nombre;
    private String direccion;
    private String email;

    public Cliente() {
    }

    public Cliente(String email,long code, long id, String nombre, String direccion) {
        this.code = code;
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCode() {
        return this.code;
    }

    public String toString() {
        return "Nombre: " + this.nombre + ", ID: " + this.id + ", Dirección de envío: " + this.direccion + ", Email: "+ this.email+ "\n";
    }
}
