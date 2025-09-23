package ejercicio14;

public class Proyecto {
    private final String nombre;
    private final int duracionMin;

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getTitulo() {
        return nombre;
    }

    public EditorVideo getEditor() {
        return new EditorVideo("Editor1", this);
    }

    public int getDuracionMin() {
        return duracionMin;
    }
}