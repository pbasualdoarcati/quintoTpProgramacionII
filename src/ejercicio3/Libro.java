package ejercicio3;

public class Libro {
    private final String titulo;
    private final String isbn;
    private final Autor autor;       
    private Editorial editorial;      

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo; this.isbn = isbn;
        this.autor = autor; this.editorial = editorial;
    }

    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }
    public void setEditorial(Editorial editorial) { this.editorial = editorial; }

}