import java.util.ArrayList;
import java.util.List;

public class Obra extends ControlGaleria  {
    private String titulo;
    private String tecnica;
    private int ano;
    private float precio;
    private Artista artista;

    List<Obra> listaObras = new ArrayList<Obra>();

    public Obra(String titulo, String tecnica, int ano, float precio, Artista artista) {
        this.titulo = titulo;
        this.tecnica = tecnica;
        this.ano = ano;
        this.precio = precio;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
