

public class Artista {
    private String apodo;
    private String fechaNacimiento;
    private String nacionalidad;
    private String biografia;

    public Artista(String apodo, String fechaNacimiento, String nacionalidad, String biografia) {
        this.apodo = apodo;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String toString() {

        return "Nombre del artista: " + this.apodo + "Fecha de nacimiento: " + this.fechaNacimiento + "Nacionalidad: " + this.nacionalidad + "Biografia: " + this.biografia;
    }
}





