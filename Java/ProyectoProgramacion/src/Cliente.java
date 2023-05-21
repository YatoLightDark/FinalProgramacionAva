//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Cliente  {
    //Atributos
    private String nombre;
    private String direccion;
    private String email;

    //Constructor
    public Cliente(String nombre, String direccion, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }
   //Getter y Setters
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



    public String toString() {
        return "Nombre: " + this.nombre +  "Dirección de envío: " + this.direccion + ", Email: "+ this.email+ "\n";
    }
}
