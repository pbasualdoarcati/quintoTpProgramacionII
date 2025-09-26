package ejercicio11;

public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista("Coldplay", "Rock Alternativo");
        Cancion cancion = new Cancion("Yellow", artista);
        Reproductor reproductor = new Reproductor();
        
        System.out.println("Artista: " + cancion.getArtista().getNombre());
        System.out.println("Género: " + cancion.getArtista().getGenero());
        System.out.println("Canción: " + cancion.getTitulo());
        System.out.println();
        reproductor.reproducir(cancion);
    }
}
