package ejercicio11;

public class Cancion {
    private final String titulo;
    private final Artista artista;

    public Cancion(String titulo, Artista artista) { this.titulo = titulo; this.artista = artista; }
    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }
}