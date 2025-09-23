package ejercicio14;

public class EditorVideo {
    private final String nombre;
    private final Proyecto proyecto;

    public EditorVideo() {
        this.nombre = "Editor";
        this.proyecto = null;
    }

    public EditorVideo(String nombre, Proyecto proyecto) {
        this.nombre = nombre;
        this.proyecto = proyecto;
    }

    public void exportar(String formato, Proyecto proyecto) {
        Render r = new Render(formato, proyecto);
        System.out.println("Exportado en formato " + formato);
    }

    public void exportar(String formato) {

        Render r = new Render(formato, proyecto);
        System.out.println("Exportado en formato " + formato + " con " + proyecto.getTitulo());
    }

    public String getNombre() {
        return nombre;
    }
}