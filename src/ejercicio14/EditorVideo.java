package ejercicio14;

public class EditorVideo {
    private  String nombre;
    private  Proyecto proyecto;

    public EditorVideo() {
        this.nombre = "Editor";
        this.proyecto = null;
    }

    public EditorVideo(String nombre, Proyecto proyecto) {
        this.nombre = nombre;
        this.proyecto = proyecto;
    }

    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Exportando proyecto: " + render.getProyecto().getNombre() + " en formato " + render.getFormato());
    }

    public void exportar(String formato) {

        Render r = new Render(formato, proyecto);
        System.out.println("Exportado en formato " + formato + " con " + proyecto.getTitulo());
    }

    public String getNombre() {
        return nombre;
    }
}