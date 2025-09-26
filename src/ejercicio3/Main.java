package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jorge Luis Borges", "Argentina");
        Editorial editorial = new Editorial("Planeta", "Madrid, España");
        Libro libro = new Libro("El Aleph", "978-84-08-12345-6", editorial);
        libro.setAutor(autor);
        
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Autor: " + libro.getAutor().getNombre() + " (" + libro.getAutor().getNacionalidad() + ")");
        System.out.println("Editorial: " + libro.getEditorial().getNombre() + ", Dirección: " + libro.getEditorial().getDireccion());
    }
}
